package Controller;

import Model.Livre;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by Damien on 09/10/2017.
 */
public class ControllerLivre {
    private Connection conn;

    public ControllerLivre(Connection conn) {
        this.conn = conn;
    }

    public Livre selectLivre(int isbn) throws SQLException{
        Livre retour = null;
        PreparedStatement prep = conn.prepareStatement("Select * from Livre where  ISBN = ?");
        prep.setInt(1, isbn);
        ResultSet res = prep.executeQuery();
        while(res.next()){
            for (int i = 1; i < res.getMetaData().getColumnCount(); i++){
                retour = new Livre(res.getInt(1), res.getString(2), res.getString(3), res.getInt(4));
            }
        }
        prep.close();

    return retour;
    }
}
