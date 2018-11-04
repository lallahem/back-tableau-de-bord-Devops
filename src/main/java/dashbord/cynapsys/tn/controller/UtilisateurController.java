package dashbord.cynapsys.tn.controller;

import dashbord.cynapsys.tn.entity.Build;
import dashbord.cynapsys.tn.entity.Utilisateur;
import dashbord.cynapsys.tn.repository.UtilisateurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/dashbord")
public class UtilisateurController {
     @Autowired
    UtilisateurRepository  utilisateurRepository;

    @GetMapping("/utilisateurs")
    public List<Utilisateur> affiche (){
       return utilisateurRepository.findAll();
    }

   /* @RequestMapping(value = "/list", method=RequestMethod.GET)
    @ResponseBody
    public List<Utilisateur> getAllUtilisateur(){
       return  new ArrayList<>();
       // return utilisateurRepository.findAll();
    }
**/


    @PostMapping("/utilisateur")
    public String createUtilisateur(@Valid @RequestBody Utilisateur utilisateur) {

        String msg;
       // Utilisateur utilisateur1=utilisateurRepository.insert(utilisateur);
       if(utilisateurRepository.insert(utilisateur)== null)
       {
           msg="error";
       }
        msg="success";
        return  msg;

    }


    @PutMapping ("/utilisateur/{id}")
    public String modifierUtilisateur(@PathVariable(value = "id") String id, @Valid @RequestBody Utilisateur utilisateur) {

        String msg;

        Optional<Utilisateur> utilisateurOptional=utilisateurRepository.findById(id);
        System.out.println(utilisateurOptional);
        // Utilisateur utilisateur1=utilisateurRepository.insert(utilisateur);
        if(utilisateurOptional== null)
        {
            utilisateurRepository.save(utilisateur);
            msg="error";
        }
        utilisateurOptional.get().setMail(utilisateur.getMail());
        utilisateurOptional.get().setNom(utilisateur.getNom());
        utilisateurOptional.get().setPrenom(utilisateur.getPrenom());
        utilisateurOptional.get().setPost(utilisateur.getPost());

        utilisateurOptional.get().setPwd(utilisateur.getPwd());
        utilisateurOptional.get().setRole(utilisateur.getRole());

        utilisateurRepository.save(utilisateurOptional.get());
        msg="success";
        return  msg;
    }

    @GetMapping("/utilisateur/{id}")
    public  Optional<Utilisateur> getUtilisateur(@PathVariable(value = "id") String id) {


     Optional<Utilisateur> utilisateurOptional=utilisateurRepository.findById(id);

       return(utilisateurOptional);

    }

    private List<Utilisateur> users = new ArrayList();

   /**
    @DeleteMapping("/utilsateur/{id}")
    public String deleteUtilisateur(@PathVariable(value = "id") String id) {
        String msg;

      Optional<Utilisateur> utilisateurOptional=utilisateurRepository.findById(id);
        if(utilisateurOptional != null) {
          Utilisateur utilsateur2= utilisateurOptional.get();
           utilisateurRepository.delete(utilsateur2);
            msg="delete succes";
        }
        msg="not found";

        return msg;
    }**/


    @DeleteMapping ("/utilisateur/{id}")
    public void delete(@PathVariable(value = "id") String id)
    {
        Utilisateur utilisateur=  utilisateurRepository.findById(id).get();
        utilisateurRepository.delete(utilisateur);

    }

/**
        Utilisateur deleteUtilisateur = this.users.stream().filter(user -> user.getId() == id).findFirst().orElse(null);
        if (deleteUtilisateur != null) {
            this.users.remove(deleteUtilisateur);
            msg="delete succes";

        } else  {
            msg="not found";

        }
        return msg;
    }

**/
@DeleteMapping ("/delete/test/utilisateur/{id}")
public void test(@PathVariable(value = "id") String id)
{

         utilisateurRepository.deleteById(id);

}

}
