package dashbord.cynapsys.tn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
@Configuration
@EnableSwagger2
@SpringBootApplication
@EnableMongoRepositories ("dashbord.cynapsys.tn.repository")
//@ComponentScan("dashbord.cynapsys.tn")
public class DashbordApplication {
//public class DashbordApplication implements CommandLineRunner {

/**  @Autowired
 UtilisateurRepository utilisateurRepository;

  @Autowired

  BuildRepository buildRepository;
    /**
  @Autowired
    CommitRepository commitRepository;
  **/

	public static void main(String[] args) {
		SpringApplication.run(DashbordApplication.class, args);
	}
	/**@Override
	public void run(String... strings) throws Exception{

        Utilisateur utilisateur = new Utilisateur("lallahem","wissem","dev","wissem@g");

        Build build1 = new Build (1,"14","2018-05-06", "wissem","creation_dashbord","aa");

        Commit commit2 = new Commit("aa", 14,"2018-05-06","dff","dss");

        Utilisateur utilisateur1 = new Utilisateur("lallahem","wissem","dev","wissem@g");


        Utilisateur utilisateur2 = new Utilisateur("lallahem","wissem","dev","wissem@g");


        Utilisateur utilisateur3 = new Utilisateur("lallahem1","wissem","dev","wissem@g");


        Utilisateur utilisateur4 = new Utilisateur("wissem","wissem","dev","wissem@g");

        utilisateurRepository.insert(utilisateur);
        buildRepository.insert(build1);

        /**
        commitRepository.insert(commit2);

        utilisateurRepository.insert(utilisateur2);

        utilisateurRepository.insert(utilisateur3);

        utilisateurRepository.insert(utilisateur4);

        utilisateurRepository.insert(utilisateur1);
      ///  utilisateurRepository.findAll().stream().forEach(System.out::println);

        System.out.println("***************************************************************");
       // utilisateurRepository.findByNom("lallahem").stream().forEach(System.out::println);
        System.out.println("Build*************************s");
       buildRepository.findByProjet("creation_dashbord").stream().forEach(System.out::println);

        System.out.println("tttttttttttttttttttttttttttttttt");
	}
    **/
}
