package dashbord.cynapsys.tn.repository;

import dashbord.cynapsys.tn.entity.Calendrier;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CalendrierRepository extends MongoRepository<Calendrier , String> {
}
