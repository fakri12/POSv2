package metier.entities.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import metier.entities.Commande;

public interface CommandeRepository extends JpaRepository<Commande, Long> {

	
	
}
