package dashbord.cynapsys.tn.repository;

import dashbord.cynapsys.tn.entity.Commit;
import dashbord.cynapsys.tn.entity.Projet;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface ProjetRepository extends MongoRepository<Projet , String> {

  /** public Optional<Projet> findById(String id);**/
}
