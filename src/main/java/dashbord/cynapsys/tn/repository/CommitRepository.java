package dashbord.cynapsys.tn.repository;

import dashbord.cynapsys.tn.entity.Build;
import dashbord.cynapsys.tn.entity.Commit;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
import java.util.Optional;

public interface CommitRepository extends MongoRepository<Commit , String> {
   /** public List<Commit> findByProjet(String projet);**/
    public Optional<Commit> findById(String id);


}
