package Controller;

import Model.Copie;
import Model.Librairie;
import Model.Livre;

import java.sql.*;

/**
 * Created by Damien on 10/10/2017.
 */
public class ControllerLibrairie {
    private Connection conn;
    private Librairie lib;

    public ControllerLibrairie(Connection conn) {

        this.conn = conn;
        this.lib = new Librairie();
    }

    public void getListeLivres() throws SQLException {

        Statement stmt = conn.createStatement();
        ResultSet res = stmt.executeQuery("Select * from Livre;");
        while(res.next()){
            for (int i = 1; i < res.getMetaData().getColumnCount(); i++){
                 lib.addLivre(new Livre(res.getInt(1), res.getString(2), res.getString(3), res.getInt(4)));
            }
        }
        System.out.println(lib.toString());
    }
    public void addCopie(Copie copie) throws SQLException, Exception{
        Livre retour = null;
        PreparedStatement prep = conn.prepareStatement("Select * from Livre where  ISBN = ?");
        prep.setInt(1, copie.getIdlivre());
        ResultSet res = prep.executeQuery();

        while(res.next()){
            for (int i = 1; i < res.getMetaData().getColumnCount(); i++){
                retour = new Livre(res.getInt(1), res.getString(2), res.getString(3), res.getInt(4));
            }
        }
        prep.close();

        if (retour == null)
        {
            throw new Exception("HAHA sous merde");
        }
        else
        {
            Statement stmt = conn.createStatement();
            stmt.executeUpdate("update livre set NCopies = NCopies +1 where ISBN = "+Integer.toString(retour.getISBN())+";");
            prep = conn.prepareStatement("Insert into Copie values (?,?);");
            prep.setInt(1, retour.getISBN());
            prep.setInt(2,copie.getNumeroCopie());
            prep.executeUpdate();

        }
    }
    public Librairie getLib() {
        return lib;
    }
}
