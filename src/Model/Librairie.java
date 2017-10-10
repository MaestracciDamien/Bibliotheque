package Model;

import java.util.ArrayList;

/**
 * Created by Damien on 10/10/2017.
 */
public class Librairie {
    private ArrayList<Livre> catalogue;
    private ArrayList<Copie> numeroBis;

    public Librairie() {
        this.catalogue=  new ArrayList<Livre>();
        this.numeroBis = new ArrayList<>();
    }

    public Librairie(ArrayList<Livre> catalogue) {
        this.catalogue = catalogue;
    }

    public void addLivre(Livre livre){
        catalogue.add(livre);
    }

    public Livre removeLivre(int ISBN){
        Livre maLivre = new Livre(ISBN);
        int index = catalogue.indexOf(maLivre);
        Livre retour = catalogue.get(index);
        catalogue.remove(maLivre);
        return retour;
    }

    public ArrayList<Livre> getCatalogue() {
        return catalogue;
    }

    public void setCatalogue(ArrayList<Livre> catalogue) {
        this.catalogue = catalogue;
    }

    @Override
    public String toString() {
        return "Librairie{" +
                "catalogue=" + catalogue +
                '}';
    }
}
