package metier.entities.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import metier.entities.Client;
import metier.entities.Panier;
import metier.entities.exceptions.UserNotFoundException;
import metier.entities.repositories.ClientRepository;
import metier.entities.repositories.PanierRepository;

@Service
@RestController
@RequestMapping("paniers")
@CrossOrigin("*")
public class PanierService {

	@Autowired
	private PanierRepository panierRepository;
	
	@Autowired
	private ClientRepository clientRepository;
	
	
	@GetMapping("paniers/{id}/client")  
	public  Client findClient(@PathVariable Long id)  
	{  
	Optional<Panier> user= panierRepository.findById(id); 
	Panier userv = user.orElse(null);
	System.out.println(userv);
	Client cl= clientRepository.findByPanier(userv);
	System.out.println(cl);
	if(cl==null)  
	//runtime exception  
	throw new UserNotFoundException("id: "+ id);  
	return cl;  
	}  
}
