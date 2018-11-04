package dashbord.cynapsys.tn.dashbord;



        import dashbord.cynapsys.tn.controller.UtilisateurController;

        import dashbord.cynapsys.tn.entity.Utilisateur;
        import dashbord.cynapsys.tn.repository.UtilisateurRepository;
        import org.junit.Test;
        import org.junit.runner.RunWith;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.boot.test.context.SpringBootTest;
        import org.springframework.http.ResponseEntity;
        import org.springframework.test.context.junit4.SpringRunner;

        import java.util.List;

        import static org.assertj.core.api.Assertions.*;


@RunWith(SpringRunner.class)
@SpringBootTest
public class UtilisateurControlleurTest {
    /*
     * @Autowired private TestEntityManager entityManager;
     */
    @Autowired
    private UtilisateurRepository utilisateurRepository;

    @Autowired
    private UtilisateurController utilisateurControlleur;

    // Test Create

    @Test
     public void createUtilisateur() {
    // // given
     Utilisateur utilisateur=new Utilisateur("ali555", "ali", "etudient","ali@gmail.com", "pwd", "consultant");


         String  msg =utilisateurControlleur.createUtilisateur(utilisateur);
    //when
    assertThat(msg).isEqualTo("success");


    // //finally delete the record created
   utilisateurRepository.delete(utilisateur);
    //utilisateurControlleur.deleteUtilisateur(utilisateur.getId());
    }

    // Test affiche

    @Test
    public void afficheTest() {
        // // given
       List<Utilisateur> utilisateurList= utilisateurRepository.findAll();
        //when
        assertThat(utilisateurControlleur.affiche().size()).isEqualTo(utilisateurList.size());


        // //finally delete the record created
        //utilisateurRepository.delete(utilisateur);
        //utilisateurControlleur.deleteUtilisateur(utilisateur.getId());
    }

}
