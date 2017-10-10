package Model;

/**
 * Created by Damien on 10/10/2017.
 */
public class Copie {
    private int idlivre;
    private int numeroCopie;

    public Copie(int idlivre, int numeroCopie) {
        this.idlivre = idlivre;
        this.numeroCopie = numeroCopie;
    }

    public int getIdlivre() {
        return idlivre;
    }

    public void setIdlivre(int idlivre) {
        this.idlivre = idlivre;
    }

    public int getNumeroCopie() {
        return numeroCopie;
    }

    public void setNumeroCopie(int numeroCopie) {
        this.numeroCopie = numeroCopie;
    }
}
