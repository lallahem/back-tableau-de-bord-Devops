
package dashbord.cynapsys.tn.controller;

import dashbord.cynapsys.tn.entity.Build;
import dashbord.cynapsys.tn.entity.Commit;
import dashbord.cynapsys.tn.entity.Projet;
import dashbord.cynapsys.tn.entity.Utilisateur;
import dashbord.cynapsys.tn.repository.BuildRepository;
import dashbord.cynapsys.tn.repository.CommitRepository;
import dashbord.cynapsys.tn.repository.ProjetRepository;
import dashbord.cynapsys.tn.repository.UtilisateurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/dashbord")
public class ProjetController {

    @Autowired
    ProjetRepository projetRepository;
    @GetMapping("/projet")
    public List<Projet> affiche (){ return projetRepository.findAll(); }






    @PostMapping("/projet")
    public String createProjet(@Valid @RequestBody Projet projet) {

        String msg;
        // Commit commit=commitdRepository.insert(commit);
        if(projetRepository.insert(projet)== null)
        {
            msg="error";
        }
        msg="success";
        return  msg;

    }






   /** @PutMapping ("/modifier/projet/{id}")
    public String modifierProjet(@PathVariable(value = "id") String id, @Valid @RequestBody Projet projet) {


        Optional<Projet> projetOptional=projetRepository.findById(id);
        String msg;
        // Commit commit1=commitrepository.insert(commit);
        if(projetOptional== null)
        {
            projetRepository.save(projet);
            msg="error";
        }

        projetRepository.save(projet);
        msg="success";
        return  msg;

    }**/

   @PutMapping ("/projet/{id}")

   public String modifierprojet(@PathVariable(value = "id") String id, @Valid @RequestBody Projet projet) {

       String msg;

       Optional<Projet> projetOptional=projetRepository.findById(id);
       System.out.println(projetOptional);
       if(projetOptional== null)
       {
           projetRepository.save(projet);
           msg="error";
       }
       projetOptional.get().setDescription(projet.getDescription());
       projetOptional.get().setNbEmployees(projet.getNbEmployees());
       projetOptional.get().setDescription(projet.getDescription());
       projetOptional.get().setStatus(projet.getStatus());
       projetOptional.get().setQualiteCode(projet.getNbEmployees());

       projetRepository.save(projetOptional.get());
       msg="success";
       return  msg;
   }






    @GetMapping("/projet/{id}")
    public  Optional<Projet> getProjet(@PathVariable(value = "id") String id) {


        Optional<Projet> projetOptional=projetRepository.findById(id);

        return(projetOptional);

    }


    @DeleteMapping ("/projet/{id}")
    public void delete(@PathVariable(value = "id") String id)
    {
        Projet projet=  projetRepository.findById(id).get();
        projetRepository.delete(projet);

    }

   /** @DeleteMapping ("/delete/test/projet/{id}")
    public void test(@PathVariable(value = "id") String id)
    {

        projetRepository.deleteById(id);

    }**/

}
