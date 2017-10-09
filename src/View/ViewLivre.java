package View;

import Model.Livre;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

/**
 * Created by Damien on 09/10/2017.
 */
public class ViewLivre {
    public ViewLivre() {
    }

    public JPanel afficheLivre(Livre bouquin){
        JPanel panneaux = new JPanel();
        JTextField jisbn = new JTextField(Integer.toString(bouquin.getISBN()));
        JTextArea jDesc = new JTextArea(bouquin.getDesc(),2,2);
        JScrollPane jScroll = new JScrollPane(jDesc);
        JTextField jSujet = new JTextField(bouquin.getSujet());
        JTextField jNbCopie = new JTextField(Integer.toString(bouquin.getNbCopie()));

        panneaux.setLayout(new GridLayout(2,4,10,10));
        panneaux.add(new JLabel("ISBN :"));
        panneaux.add(jisbn);
        panneaux.add(new JLabel("Description :"));
        panneaux.add(jScroll);
        panneaux.add(new JLabel("Sujet + Verbe + COD :"));
        panneaux.add(jSujet);
        panneaux.add(new JLabel("Nombre en Inventaire :"));
        panneaux.add(jNbCopie);
        panneaux.setVisible(true);

        return panneaux;
    }
}
