package metier.entities.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import metier.entities.Composant;
@CrossOrigin("*")
@RepositoryRestResource
public interface ComponentRepository extends JpaRepository<Composant,Long> {
	
}