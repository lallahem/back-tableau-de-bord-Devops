
package dashbord.cynapsys.tn.controller;

import dashbord.cynapsys.tn.entity.Build;
import dashbord.cynapsys.tn.entity.Utilisateur;
import dashbord.cynapsys.tn.repository.BuildRepository;
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
public class BuildController {
    @Autowired
    BuildRepository buildRepository;
    @GetMapping("/build")
    public List<Build> affiche (){ return buildRepository.findAll(); }






    @PostMapping("/build")
    public String createBuild(@Valid @RequestBody Build build) {

        String msg;
        // Build build=buildRepository.insert(build);
        if(buildRepository.insert(build)== null)
        {
            msg="error";
        }
        msg="success";
        return  msg;

    }







    @PutMapping ("/build/{id}")

    public String modifierBuild(@PathVariable(value = "id") String id, @Valid @RequestBody Build build) {

        String msg;

        Optional<Build> buildOptional=buildRepository.findById(id);
        System.out.println(buildOptional);
        // Utilisateur utilisateur1=utilisateurRepository.insert(utilisateur);
        if(buildOptional== null)
        {
            buildRepository.save(build);
            msg="error";
        }
        buildOptional.get().setNbrBuild(build.getNbrBuild());
        buildOptional.get().setDate(build.getDate());
        buildOptional.get().setDescription(build.getDescription());

        buildRepository.save(buildOptional.get());
        msg="success";
        return  msg;
    }




    @GetMapping("/build/{id}")
    public  Optional<Build> getBuild(@PathVariable(value = "id") String id) {


        Optional<Build> buildOptional=buildRepository.findById(id);

        return(buildOptional);

    }


    @DeleteMapping ("/build/{id}")
    public void delete(@PathVariable(value = "id") String id)
    {
      Build build=  buildRepository.findById(id).get();
        buildRepository.delete(build);

    }
    @DeleteMapping ("/delete/all/build")
    public void deleteAll()
    {

        buildRepository.deleteAll();

    }

}
