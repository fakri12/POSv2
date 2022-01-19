package metier.entities;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Service;

import metier.entities.repositories.ClientRepository;
import metier.entities.repositories.CommandeRepository;
import metier.entities.repositories.ComponentRepository;
import metier.entities.repositories.ReclamationRepository;


@Service
@Transactional
@SpringBootApplication
public class PoSv2Application implements CommandLineRunner {

	@Autowired
	private ComponentRepository componentRepository;
	
	@Autowired
	private ClientRepository clientRepository;
	
	@Autowired
	private ReclamationRepository reclamationRepository;
	
	@Autowired
	private CommandeRepository commandeRepository;
	
	
	public static void main(String[] args) {
		SpringApplication.run(PoSv2Application.class, args);
	

	}
	@Override
	public void run(String... args) throws Exception {

		Composant culasse = new Culasse();
		culasse.setName("culass number 1");
		culasse.setPrice(12);
		culasse.setPicture("Nicee");
		culasse.setQuantity(10);
		culasse.setDescription("nice culasse");
		componentRepository.save(culasse);
		
		Composant turbo = new Turbo();
		componentRepository.save(turbo);
		
		Composant engine = new Engine();
		engine.setName("Complete engine");
		componentRepository.save(engine);
//		
//	    Optional<Engine> engine2 = engineRepository.findById(3L);
//	  
//		
//		engine2.get().getComponentEngines().add((ComponentEngine) culasse);
//		engine2.get().getComponentEngines().add((ComponentEngine) turbo);
//		
//		
		Client client = new Client();
		client.setL_name("Ahmed");
		
		clientRepository.save(client);
		
		Reclamation reclamation = new Reclamation();
		reclamation.setDetailsReclamation("not enough good ");
		
		reclamationRepository.save(reclamation);
		
		Commande commande = new Commande();
		commande.setClient(client);
		commande.setReclamation(reclamation);
		
		commandeRepository.save(commande);
		
	
		
		
		
  }
}
  