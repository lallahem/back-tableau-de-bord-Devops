package dashbord.cynapsys.tn.controller;

import dashbord.cynapsys.tn.entity.Authentification;
import dashbord.cynapsys.tn.entity.Utilisateur;
import dashbord.cynapsys.tn.repository.UtilisateurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*")
@RestController
public class AuthentificationController {
    @Autowired
    UtilisateurRepository  utilisateurRepository;

    @RequestMapping(value="/Authentification",method=RequestMethod.POST)
    public ResponseEntity<Utilisateur> Authentification(@RequestBody    Utilisateur utilisateur) {
        System.out.println("*****************" + utilisateur.getMail() + "******" + utilisateur.getPwd());

        Optional<Utilisateur> users = utilisateurRepository.findByMailAndPwd(utilisateur.getMail(), utilisateur.getPwd());

        System.out.println("*******s**********kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk ******"+users );
        if (users!=null&& users.isPresent()) {
            System.out.println("***************** okkkkkkkk" +  ResponseEntity.ok().body(utilisateur) + "******" );
            System.out.println("*****************kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk ******"+users );

            return  ResponseEntity.ok().body(utilisateur);


        }

        System.out.println("*****************kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk ******" );
        System.out.println("*****************" + ResponseEntity.notFound().build() + "******" );


        return ResponseEntity.notFound().build();

    }

}
