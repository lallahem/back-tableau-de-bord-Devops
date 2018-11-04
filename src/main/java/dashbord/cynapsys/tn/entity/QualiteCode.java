package dashbord.cynapsys.tn.entity;

import java.util.Date;

public class QualiteCode {
    private String id ;
    private int blocker;
    private int Critical;
    private int Major;
    private int Issues;
    private  Date date ;

    public QualiteCode(String id, int blocker, int critical, int major, int issues, Date date) {
        this.id = id;
        this.blocker = blocker;
        Critical = critical;
        Major = major;
        Issues = issues;
        this.date = date;
    }

    public QualiteCode() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getBlocker() {
        return blocker;
    }

    public void setBlocker(int blocker) {
        this.blocker = blocker;
    }

    public int getCritical() {
        return Critical;
    }

    public void setCritical(int critical) {
        Critical = critical;
    }

    public int getMajor() {
        return Major;
    }

    public void setMajor(int major) {
        Major = major;
    }

    public int getIssues() {
        return Issues;
    }

    public void setIssues(int issues) {
        Issues = issues;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "QualiteCode{" +
                "id='" + id + '\'' +
                ", blocker=" + blocker +
                ", Critical=" + Critical +
                ", Major=" + Major +
                ", Issues=" + Issues +
                ", date=" + date +
                '}';
    }
}
