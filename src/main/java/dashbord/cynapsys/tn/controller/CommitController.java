
package dashbord.cynapsys.tn.controller;

import dashbord.cynapsys.tn.entity.Build;
import dashbord.cynapsys.tn.entity.Commit;
import dashbord.cynapsys.tn.entity.Utilisateur;
import dashbord.cynapsys.tn.repository.BuildRepository;
import dashbord.cynapsys.tn.repository.CommitRepository;
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
public class CommitController {

    @Autowired
    CommitRepository commitRepository;
    @GetMapping("/commit")
    public List<Commit> affiche (){ return commitRepository.findAll(); }






    @PostMapping("/commit")
    public String createCommit(@Valid @RequestBody Commit commit) {

        String msg;
        // Commit commit=commitdRepository.insert(commit);
        if(commitRepository.insert(commit)== null)
        {
            msg="error";
        }
        msg="success";
        return  msg;

    }










   @PutMapping ("/commit/{id}")

   public String modifierCommit(@PathVariable(value = "id") String id, @Valid @RequestBody Commit commit) {

       String msg;

       Optional<Commit> commitOptional=commitRepository.findById(id);
       System.out.println(commitOptional);
       if(commitOptional== null)
       {
           commitRepository.save(commit);
           msg="error";
       }
       commitOptional.get().setDate(commit.getDate());
       commitOptional.get().setDescription(commit.getDescription());
       commitOptional.get().setNbrCommit(commit.getNbrCommit());

       commitRepository.save(commitOptional.get());
       msg="success";
       return  msg;
   }





    @GetMapping("/commit/{id}")
    public  Optional<Commit> getCommit(@PathVariable(value = "id") String id) {


        Optional<Commit> commitOptional=commitRepository.findById(id);

        return(commitOptional);

    }


   @DeleteMapping ("/commit/{id}")
   public void delete(@PathVariable(value = "id") String id)
   {
       Commit commit=  commitRepository.findById(id).get();
       commitRepository.delete(commit);

   }



}
