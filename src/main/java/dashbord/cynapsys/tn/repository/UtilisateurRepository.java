package dashbord.cynapsys.tn.repository;

import dashbord.cynapsys.tn.entity.Utilisateur;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;
import java.util.Optional;

public interface UtilisateurRepository extends MongoRepository<Utilisateur, String> {
    public List<Utilisateur> findByNom(String nom);
    public Optional<Utilisateur> findById(String id);
    public Optional<Utilisateur> findByMail(String mail);

    public Optional<Utilisateur> findByMailAndPwd(String mail,String pwd);
//public  Optional<Utilisateur> findByMail(String mail);


}
