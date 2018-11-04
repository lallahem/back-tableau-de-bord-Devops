package dashbord.cynapsys.tn.repository;

import dashbord.cynapsys.tn.entity.Couverture;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CouvertureRepository extends MongoRepository<Couverture , String> {
    /** public Optional<Couvertur> findById(String id);**/

}
