package dashbord.cynapsys.tn.repository;

import dashbord.cynapsys.tn.entity.Test;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TestRepository extends MongoRepository<Test, String> {

    /** public Optional<Test> findById(String id);**/


}
