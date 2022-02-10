package metier.entities;


import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.stereotype.Service;

import metier.entities.repositories.CategoryRepository;
import metier.entities.repositories.ClientRepository;
import metier.entities.repositories.CommandeRepository;
import metier.entities.repositories.ComponentRepository;
import metier.entities.repositories.ReclamationRepository;

@Service
@Transactional
@SpringBootApplication
@EnableAuthorizationServer
public class PoSv2Application implements CommandLineRunner {


	@Autowired
	private ComponentRepository componentRepository;
	@Autowired
	private ClientRepository clientRepository;
	@Autowired
	private ReclamationRepository reclamationRepository;
	@Autowired
	private CategoryRepository categoryRepository;
	@Autowired
	private CommandeRepository commandeRepository;
	@Autowired
	private RepositoryRestConfiguration configuration;
	
	
	public static void main(String[] args) {
		SpringApplication.run(PoSv2Application.class, args);
	

	}
	@Override
	public void run(String... args) throws Exception {
		configuration.exposeIdsFor(Client.class);
		configuration.exposeIdsFor(Category.class);
		configuration.exposeIdsFor(Client.class);
		configuration.exposeIdsFor(Culasse.class);
		configuration.exposeIdsFor(Engine.class);
		configuration.exposeIdsFor(Category.class);
		configuration.exposeIdsFor(Radiateur.class);
		configuration.exposeIdsFor(Disque.class);
//		Client client = new Client();
//		client.setMail("medalifakri@gmail.com");
//		client.setF_name("mohamed");
//		client.setL_name("fakri");
//		client.setPassowrd(passwordEncoder.encode("123456789"));
//		client.setAdress("sakia el hamra"); 
//		client.setCity("smara"); 
//		clientRepository.save(client); 
//		Composant culasse = new Culasse();
//		culasse.setName("culass number 1");
//		culasse.setPrice(12);
//		culasse.setPicture("Nicee");
//		culasse.setQuantity(10);
//		culasse.setDescription("nice culasse");
//		componentRepository.save(culasse);
//		
//		Composant turbo = new Turbo();
//		componentRepository.save(turbo);
//		
//		Composant engine = new Engine();
//		engine.setName("Complete engine");
//		componentRepository.save(engine);
//		
//		
//		Client client = new Client();
//		client.setL_name("Ahmed");
//		
//		clientRepository.save(client);
//		
//		Reclamation reclamation = new Reclamation();
//		reclamation.setDetailsReclamation("not enough good ");
//		
//		reclamationRepository.save(reclamation);
//		
//		Commande commande = new Commande();
//		commande.setClient(client);
//		commande.setReclamation(reclamation);
//		
//		commandeRepository.save(commande);
		
	    Category categorie= new Category();
	    categorie.setMarque("BMW");
	    categoryRepository.save(categorie);
		
		
  }
}