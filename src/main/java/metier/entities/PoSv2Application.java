package metier.entities;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import metier.entities.repositories.ComponentRepository;



@SpringBootApplication
public class PoSv2Application implements CommandLineRunner {
	@Autowired
	ComponentRepository componentRepository;
	public static void main(String[] args) {
		SpringApplication.run(PoSv2Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Composant plaquette = new Plaquettes();
		componentRepository.save(plaquette);
		
	}

}
  