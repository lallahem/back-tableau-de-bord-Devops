package dashbord.cynapsys.tn.repository;

import dashbord.cynapsys.tn.entity.Authentification;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface authentificationrepository extends MongoRepository<Authentification , String> {


}
