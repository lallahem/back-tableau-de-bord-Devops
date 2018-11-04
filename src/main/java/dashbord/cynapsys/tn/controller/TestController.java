
package dashbord.cynapsys.tn.controller;

import dashbord.cynapsys.tn.entity.Build;
import dashbord.cynapsys.tn.entity.Commit;
import dashbord.cynapsys.tn.entity.Test;
import dashbord.cynapsys.tn.entity.Utilisateur;
import dashbord.cynapsys.tn.repository.BuildRepository;
import dashbord.cynapsys.tn.repository.TestRepository;
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
public class TestController {
    @Autowired
    TestRepository testRepository;
    @GetMapping("/test")
    public List<Test> affiche (){ return testRepository.findAll(); }






    @PostMapping("/test")
    public String createtest(@Valid @RequestBody Test test) {

        String msg;
        // Build build=buildRepository.insert(build);
        if(testRepository.insert(test)== null)
        {
            msg="error";
        }
        msg="success";
        return  msg;

    }






   /** @PutMapping ("/modifier/Test/{id}")
    public String modifiertest(@PathVariable(value = "id") String id, @Valid @RequestBody Test test) {


        Optional<Test> testOptional=testRepository.findById(id);

        String msg;
        if(testOptional== null)
        {
            testRepository.save(test);
            msg="error";
        }

        testRepository.save(test);
        msg="success";
        return  msg;

    }**/

   @PutMapping ("/test/{id}")

   public String modifiertest(@PathVariable(value = "id") String id, @Valid @RequestBody Test test) {

       String msg;

       Optional<Test> testOptional=testRepository.findById(id);
       System.out.println(testOptional);
       if(testOptional== null)
       {
           testRepository.save(test);
           msg="error";
       }
       testOptional.get().setDate(test.getDate());
       testOptional.get().setNomEmployee(test.getNomEmployee());

       testRepository.save(testOptional.get());
       msg="success";
       return  msg;
   }



    @GetMapping("/test/{id}")
    public  Optional<Test> getTest(@PathVariable(value = "id") String id) {


        Optional<Test> testOptional=testRepository.findById(id);

        return(testOptional);

    }



    @DeleteMapping ("/test/{id}")
    public void delete(@PathVariable(value = "id") String id)
    {
        Test test=  testRepository.findById(id).get();
        testRepository.delete(test);

    }


}
