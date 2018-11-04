package dashbord.cynapsys.tn.entity;

import java.util.Date;

public class Test {
    private String id;
    private String date;
    private String nomEmployee;

    public Test(String id, String date, String nomEmployee) {
        this.id = id;
        this.date = date;
        this.nomEmployee = nomEmployee;
    }

    public Test() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getNomEmployee() {
        return nomEmployee;
    }

    public void setNomEmployee(String nomEmployee) {
        this.nomEmployee = nomEmployee;
    }

    @Override
    public String toString() {
        return "Test{" +
                "id='" + id + '\'' +
                ", date='" + date + '\'' +
                ", nomEmployee='" + nomEmployee + '\'' +
                '}';
    }
}

