package metier.entities.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import metier.entities.ComponentEngine;

public interface ComponentEngineRepository extends JpaRepository<ComponentEngine, Long> {

	Optional<ComponentEngine> findById(Long id);
}
