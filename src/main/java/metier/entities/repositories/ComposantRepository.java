package metier.entities.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import metier.entities.Composant;

public interface ComposantRepository extends JpaRepository<Composant,Long> {

}
