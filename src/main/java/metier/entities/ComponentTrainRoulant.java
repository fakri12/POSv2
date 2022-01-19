package metier.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "Trainroulantname",discriminatorType = DiscriminatorType.STRING,length = 20)
@DiscriminatorValue("ComponentTrainR")

public class ComponentTrainRoulant extends Composant {
	
	@ManyToMany
	@JoinTable(name = "TrainRoulant_ComponentTrainRoulant",
    joinColumns=@JoinColumn(name="idComponentTrainRoulant", referencedColumnName="id"),
    inverseJoinColumns=@JoinColumn(name="idTrainRoulant", referencedColumnName="id"))  
	List<TrainRoulant> trainRoulants= new ArrayList<TrainRoulant>();

	public List<TrainRoulant> getTrainRoulants() {
		return trainRoulants;
	}

	public void setTrainRoulants(List<TrainRoulant> trainRoulants) {
		this.trainRoulants = trainRoulants;
	}
 
	public ComponentTrainRoulant() {
		super();
	}

	public ComponentTrainRoulant(List<TrainRoulant> trainRoulants) {
		super();
		this.trainRoulants = trainRoulants;
	}
    
	
	
}
