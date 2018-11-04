package dashbord.cynapsys.tn.entity;

import java.util.Date;

public class Commit {
    private  String id;
    private int nbrCommit;
    private String date ;
    private  String description ;

    public Commit(String id, int nbrCommit, String date, String description) {
        this.id = id;
        this.nbrCommit = nbrCommit;
        this.date = date;
        this.description = description;
    }

    public Commit() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getNbrCommit() {
        return nbrCommit;
    }

    public void setNbrCommit(int nbrCommit) {
        this.nbrCommit = nbrCommit;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Commit{" +
                "id='" + id + '\'' +
                ", nbrCommit=" + nbrCommit +
                ", date='" + date + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
