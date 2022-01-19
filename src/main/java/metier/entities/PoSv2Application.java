package metier.entities;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import metier.entities.repositories.ComposantRepository;


@SpringBootApplication
public class PoSv2Application implements CommandLineRunner  {
	@Autowired
	ComposantRepository componentRepository;
	public static void main(String[] args) {
	   SpringApplication.run(PoSv2Application.class, args);
	}
	
	@Override 
	public void run(String... args) throws Exception {
	ComponentTrainRoulant componenttrainroulant= new ComponentTrainRoulant();
	componenttrainroulant.setName("componenttrainroulant");
	componenttrainroulant.setPrice(40.2);
	componentRepository.save(componenttrainroulant);
	TrainRoulant trainroulant= new TrainRoulant();
	trainroulant.setName("trainroulant");
	trainroulant.setDescription("bon etat");
	componentRepository.save(trainroulant);
	Pneus pneus=new Pneus();
	pneus.setDescription("pneus");
	pneus.setPrice(60.2);
	componentRepository.save(pneus);
	Radiateur p=new Radiateur();
	p.setDescription("radiateur");
	p.setPrice(60.2);
	componentRepository.save(p);
	}
}
