
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
public class CouvertureController {

    @Autowired
    CouvertureRepository couvertureRepository;
    @GetMapping("/couverture")
    public List<Couverture> affiche (){ return couvertureRepository.findAll(); }






    @PostMapping("/couverture")
    public String createCouverture(@Valid @RequestBody Couverture couverture) {

        String msg;
        // Commit commit=commitdRepository.insert(commit);
        if(couvertureRepository.insert(couverture)== null)
        {
            msg="error";
        }
        msg="success";
        return  msg;

    }








   @PutMapping ("/couverture/{id}")

    public String modifierCouverture(@PathVariable(value = "id") String id, @Valid @RequestBody Couverture couverture) {

        String msg;

        Optional<Couverture> couvertureOptional=couvertureRepository.findById(id);
        System.out.println(couvertureOptional);
        if(couvertureOptional== null)
        {
            couvertureRepository.save(couverture);
            msg="error";
        }
        couvertureOptional.get().setNbrLigne(couverture.getNbrLigne());
        couvertureOptional.get().setNbrLigneExecute(couverture.getNbrLigneExecute());

        couvertureRepository.save(couvertureOptional.get());
        msg="success";
        return  msg;
    }




    @GetMapping("/couverture/{id}")
    public  Optional<Couverture> getCouverture(@PathVariable(value = "id") String id) {


        Optional<Couverture> couvertureOptional=couvertureRepository.findById(id);

        return(couvertureOptional);

    }

    @DeleteMapping ("/couverture/{id}")
    public void delete(@PathVariable(value = "id") String id)
    {
        Couverture couverture=  couvertureRepository.findById(id).get();
        couvertureRepository.delete(couverture);

    }



}
