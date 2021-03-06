package metier.entities.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import metier.entities.Client;
import metier.entities.Panier;
@CrossOrigin("*")
@RepositoryRestResource
public interface ClientRepository extends JpaRepository<Client, Long> {
	public abstract Client findByMail(String mail);
	public boolean existsByMail(String mail); 
	public Client findByVerificationCode(String code);
	
	 Client findByPanier(Panier panier);
}
