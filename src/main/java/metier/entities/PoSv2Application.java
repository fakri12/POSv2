package metier.entities;


import java.awt.Component;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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
import metier.entities.repositories.LignePanierCommandeRepository;
import metier.entities.repositories.PanierRepository;
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
	private PanierRepository panierRepository;
	@Autowired
	private RepositoryRestConfiguration configuration;
	@Autowired
	private LignePanierCommandeRepository lignePanierCommandeRepository;
	
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
		configuration.exposeIdsFor(Panier.class);
		configuration.exposeIdsFor(Composant.class);
		configuration.exposeIdsFor(LignePanierCommande.class);
//		Client client = new Client();
//		client.setMail("medalifakri@gmail.com");
//		client.setF_name("mohamed");
//		client.setL_name("fakri");
//		client.setPassowrd(passwordEncoder.encode("123456789"));
//		client.setAdress("sakia el hamra"); 
//		client.setCity("smara"); 
//		clientRepository.save(client); 
		Composant culasse = new Culasse();
		culasse.setId(4L);
		culasse.setName("culass number 1");
		culasse.setPrice(12);
		culasse.setPicture("https://images4.alphacoders.com/320/thumb-350-32038.jpg");
		culasse.setQuantity(10);
		culasse.setDescription("nice culasse");
		componentRepository.save(culasse);
//		
//		
		Composant engine = new Engine();
		engine.setId(1L);
		engine.setName("Complete engine");
		engine.setPrice(40);
		engine.setQuantity(5);
		engine.setPicture("https://previews.123rf.com/images/gdolgikh/gdolgikh1512/gdolgikh151200190/49637670-radiateur-de-voiture-isol%C3%A9-sur-fond-blanc.jpg");
		engine.setDescription("good Engine");
		componentRepository.save(engine);
//	
		Client client = new Client();
		client.setL_name("Ahmed");
	    clientRepository.save(client);
////		
//		Reclamation reclamation = new Reclamation();
//		reclamation.setDetailsReclamation("not enough good ");
//		
//		reclamationRepository.save(reclamation);
//	
		Panier panier=new Panier();
	    panier.setClient(client);
	    panierRepository.save(panier);
	    LignePanierCommande lignepaniercommande1 = new LignePanierCommande();
	    lignepaniercommande1.setComposant(culasse);
	    lignepaniercommande1.setQuantity(2);
	    lignepaniercommande1.setPanier(panier);
//	    lignePanierCommandeRepository.save(lignepaniercommande1);
	    Commande commande1=new Commande();
	    commande1.setClient(client);
	    commandeRepository.save(commande1);
	    lignepaniercommande1.setCommande(commande1);
//	    lignePanierCommandeRepository.save(lignepaniercommande1);

	    
	    //		commande.setClient(client);
		
	    Category categorie1= new Category();
	    categorie1.setMarque("BMW");
	    categoryRepository.save(categorie1);
	    Category categorie2= new Category();
	    categorie2.setMarque("Mercedes");
	    categoryRepository.save(categorie2);
	    Category categorie3= new Category();
	    categorie3.setMarque("Toyota");
	    categoryRepository.save(categorie3);
	    
//	    Panier panier =new Panier();
//	    panier.setClientpanier(client);
//	    panierRepository.save(panier);		
//	    
//	    LignePanierCommande lignepaniercommande1 = new LignePanierCommande();
//	    lignepaniercommande1.setComposant(culasse);
//	    lignepaniercommande1.setQuantity(2);
////	    lignepaniercommande1.setCommande(commande);
//	    lignePanierCommandeRepository.save(lignepaniercommande1);
//      
//	    List<LignePanierCommande> listPanierCommandes=new ArrayList<>();
//	    listPanierCommandes.add(lignepaniercommande1);
//	    Panier panier1=new Panier();
//	    panier1= panierRepository.findByClientpanier(client);
////	    System.out.println(lignepaniercommande1);
////	    Optional<LignePanierCommande> lignepaniercommande = lignePanierCommandeRepository.findById(1L);
////	    LignePanierCommande lignepanier = lignepaniercommande.orElse(null);
////	    System.out.println(lignepanier);
////	    panier1.getLignePanierCommandes().add(lignepaniercommande1);
////	    panier1.setLignePanierCommandes(listPanierCommandes);
//	    panierRepository.save(panier1);		
		


	    
  }
}