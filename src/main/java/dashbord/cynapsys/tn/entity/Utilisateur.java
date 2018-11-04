package dashbord.cynapsys.tn.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="utilisateurs")
public class Utilisateur {
  @Id
  private String id ;
    private String nom;
    private  String prenom;
    private  String post ;
    private String mail ;
    private String pwd;
private  String role;

    public Utilisateur(String id, String nom, String prenom, String post, String mail, String pwd, String role) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.post = post;
        this.mail = mail;
        this.pwd = pwd;
        this.role = role;
    }

    public Utilisateur(String id, String nom, String prenom, String post, String mail) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.post = post;
        this.mail = mail;

    }

    public Utilisateur(String id) {
        this.id = id;
    }

    public Utilisateur(String nom, String prenom, String post, String mail, String pwd, String role) {
        this.nom = nom;
        this.prenom = prenom;
        this.post = post;
        this.mail = mail;
        this.pwd = pwd;
        this.role = role;
    }

    public String getPwd() {
        return pwd;
    }

    public Utilisateur() {

    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }



    public String getPrenom() {
        return prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    @Override
    public String toString() {
        return "Utilisateur{" +
                "id='" + id + '\'' +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", post='" + post + '\'' +
                ", mail='" + mail + '\'' +
                ", pwd='" + pwd + '\'' +
                ", role='" + role + '\'' +
                '}';
    }
}
