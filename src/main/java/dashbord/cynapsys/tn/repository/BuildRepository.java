package dashbord.cynapsys.tn.repository;

import dashbord.cynapsys.tn.entity.Build;

import dashbord.cynapsys.tn.entity.Utilisateur;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
import java.util.Optional;

public interface BuildRepository  extends MongoRepository<Build, String> {

    /**
    public  List<Build> findByProjet(String projet);
     **/
    public Optional<Build> findById(String id);



}
