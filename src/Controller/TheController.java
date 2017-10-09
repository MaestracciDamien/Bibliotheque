package Controller;

import Model.Livre;
import View.TheView;

import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by Damien on 09/10/2017.
 */
public class TheController {
    private final String addr = "jdbc:mysql://127.0.0.1:8889/sgbd-tp4";
    private final String name = "root";
    private final String password = "root";

    private Connection conn;

    private ControllerLivre CLivre;
    private TheView view;
    public TheController() throws Exception {
        view = new TheView();

        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex1) {
            System.out.println("Pilote non trouver");
            System.exit(1);
        }

        try {
             conn = DriverManager.getConnection(addr, name, password);

        } catch (SQLException e) {
            e.printStackTrace();
        }
        CLivre = new ControllerLivre(conn);
        try {
            Livre livre = CLivre.selectLivre(1501142976);
            if (livre == null){
                throw new Exception("HAHA");

            }
            else
            {
                view.afficheLivre(livre);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void main(String args[]) {
        try {
            TheController controll = new TheController();
        } catch (Exception e) {
            e.printStackTrace();
        }
        JFrame frame = new TheView();
    }
}
