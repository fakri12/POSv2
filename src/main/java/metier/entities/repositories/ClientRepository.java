package metier.entities.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import metier.entities.Client;

public interface ClientRepository extends JpaRepository<Client, Long> {

}
