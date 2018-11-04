package dashbord.cynapsys.tn.entity;

public class Calendrier {

private String id ;
private String datedeb;
private String datefin;

    public Calendrier(String id, String datedeb, String datefin) {
        this.id = id;
        this.datedeb = datedeb;
        this.datefin = datefin;
    }

    public Calendrier() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDatedeb() {
        return datedeb;
    }

    public void setDatedeb(String datedeb) {
        this.datedeb = datedeb;
    }

    public String getDatefin() {
        return datefin;
    }

    public void setDatefin(String datefin) {
        this.datefin = datefin;
    }

    @Override
    public String toString() {
        return "Calendrier{" +
                "id='" + id + '\'' +
                ", datedeb='" + datedeb + '\'' +
                ", datefin='" + datefin + '\'' +
                '}';
    }
}