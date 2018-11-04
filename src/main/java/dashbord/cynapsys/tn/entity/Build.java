package dashbord.cynapsys.tn.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document(collection="build")

public class Build {
    @Id
    private String id ;
    private Integer nbrBuild;
    private String date;
    private  String description ;


    public Build(String id, Integer nbrBuild, String date, String description) {
        this.id = id;
        this.nbrBuild = nbrBuild;
        this.date = date;
        this.description = description;
    }

    public Build() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getNbrBuild() {
        return nbrBuild;
    }

    public void setNbrBuild(Integer nbrBuild) {
        this.nbrBuild = nbrBuild;
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
        return "Build{" +
                "id='" + id + '\'' +
                ", nbrBuild=" + nbrBuild +
                ", date='" + date + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
