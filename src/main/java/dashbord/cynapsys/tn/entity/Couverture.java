package dashbord.cynapsys.tn.entity;

import java.util.Date;

public class Couverture {
    private String id;
    private int nbrLigne ;
    private  int nbrLigneExecute;


    public Couverture(String id, int nbrLigne, int nbrLigneExecute) {
        this.id = id;
        this.nbrLigne = nbrLigne;
        this.nbrLigneExecute = nbrLigneExecute;
    }

    public Couverture() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getNbrLigne() {
        return nbrLigne;
    }

    public void setNbrLigne(int nbrLigne) {
        this.nbrLigne = nbrLigne;
    }

    public int getNbrLigneExecute() {
        return nbrLigneExecute;
    }

    public void setNbrLigneExecute(int nbrLigneExecute) {
        this.nbrLigneExecute = nbrLigneExecute;
    }

    @Override
    public String toString() {
        return "Couverture{" +
                "id='" + id + '\'' +
                ", nbrLigne=" + nbrLigne +
                ", nbrLigneExecute=" + nbrLigneExecute +
                '}';
    }
}
