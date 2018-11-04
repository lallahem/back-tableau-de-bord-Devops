
package dashbord.cynapsys.tn.controller;

import dashbord.cynapsys.tn.entity.*;
import dashbord.cynapsys.tn.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/dashbord")
public class CalendrierController {

    @Autowired
    CalendrierRepository calendrierRepository;
    @GetMapping("/calendrier")
    public List<Calendrier> affiche (){ return calendrierRepository.findAll(); }






    @PostMapping("/calendrier")
    public String createCalendrier(@Valid @RequestBody Calendrier calendrier) {

        String msg;
        if(calendrierRepository.insert(calendrier)== null)
        {
            msg="error";
        }
        msg="success";
        return  msg;

    }






   @PutMapping ("/calendrier/{id}")

   public String modifierCalendrier(@PathVariable(value = "id") String id, @Valid @RequestBody Calendrier calendrier) {

       String msg;

       Optional<Calendrier> calendrierOptional=calendrierRepository.findById(id);
       System.out.println(calendrierOptional);
       if(calendrierOptional== null)
       {
           calendrierRepository.save(calendrier);
           msg="error";
       }
       calendrierOptional.get().setDatedeb(calendrier.getDatedeb());
       calendrierOptional.get().setDatefin(calendrier.getDatefin());

       calendrierRepository.save(calendrierOptional.get());
       msg="success";
       return  msg;
   }




    @GetMapping("/calendrier/{id}")
    public  Optional<Calendrier> getcalendrier(@PathVariable(value = "id") String id) {


        Optional<Calendrier> calendrierOptional=calendrierRepository.findById(id);

        return(calendrierOptional);

    }



   @DeleteMapping ("/calendrier/{id}")
   public void delete(@PathVariable(value = "id") String id)
   {
       Calendrier calendrier=  calendrierRepository.findById(id).get();
       calendrierRepository.delete(calendrier);
       //buildRepository.deleteById(id);

   }

}
