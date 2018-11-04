package dashbord.cynapsys.tn.entity;


public class Projet {

    private String id ;
    private String nomProjet;
    private   String description ;
     private String status;
     private int  nbEmployees;
     private  int qualiteCode;

     
    public Projet(String id, String nomProjet, String description, String status, int nbEmployees, int qualiteCode) {
        this.id = id;
        this.nomProjet = nomProjet;
        this.description = description;
        this.status = status;
        this.nbEmployees = nbEmployees;
        this.qualiteCode = qualiteCode;
    }

    public Projet() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNomProjet() {
        return nomProjet;
    }

    public void setNomProjet(String nomProjet) {
        this.nomProjet = nomProjet;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getNbEmployees() {
        return nbEmployees;
    }

    public void setNbEmployees(int nbEmployees) {
        this.nbEmployees = nbEmployees;
    }

    public int getQualiteCode() {
        return qualiteCode;
    }

    public void setQualiteCode(int qualiteCode) {
        this.qualiteCode = qualiteCode;
    }

    @Override
    public String toString() {
        return "Projet{" +
                "id='" + id + '\'' +
                ", nomProjet='" + nomProjet + '\'' +
                ", description='" + description + '\'' +
                ", status='" + status + '\'' +
                ", nbEmployees=" + nbEmployees +
                ", qualiteCode=" + qualiteCode +
                '}';
    }



}
