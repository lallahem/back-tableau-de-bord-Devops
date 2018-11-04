package dashbord.cynapsys.tn.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "authentification")
public class Authentification {
    @Id
    private String mail;
    private String pwd;
    private String role;

    public Authentification(String mail, String pwd, String role) {
        this.mail = mail;
        this.pwd = pwd;
        this.role = role;
    }

    public Authentification() {
    }


    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "Authentification{" +
                "mail='" + mail + '\'' +
                ", pwd='" + pwd + '\'' +
                ", role='" + role + '\'' +
                '}';
    }
}
