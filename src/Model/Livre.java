package Model;

/**
 * Created by Damien on 09/10/2017.
 */
public class Livre {

    private int ISBN;
    private String desc;
    private String sujet;
    private int nbCopie;


    public Livre(int ISBN, String desc, String sujet, int nbCopie) {

        this.ISBN = ISBN;
        this.desc = desc;
        this.sujet = sujet;
        this.nbCopie = nbCopie;
    }


    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getSujet() {
        return sujet;
    }

    public void setSujet(String sujet) {
        this.sujet = sujet;
    }

    public int getNbCopie() {
        return nbCopie;
    }

    public void setNbCopie(int nbCopie) {
        this.nbCopie = nbCopie;
    }

    @Override
    public String toString() {
        return "Livre{" +
                "ISBN=" + ISBN +
                ", desc='" + desc + '\'' +
                ", sujet='" + sujet + '\'' +
                ", nbCopie=" + nbCopie +
                '}';
    }


}
