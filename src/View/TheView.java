package View;

import Model.Livre;

import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

/**
 * Created by Damien on 09/10/2017.
 */
public class TheView extends JFrame {
    private ViewLivre vueLivre = new ViewLivre();
    private JPanel panneau;
    public TheView() {
        super("Librairie");
        WindowListener l = new WindowAdapter() {
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        };
        addWindowListener(l);
    }

    public void afficheLivre(Livre livre){
        setContentPane(vueLivre.afficheLivre(livre));
        setSize(400,100);
        setVisible(true);
    }
}

