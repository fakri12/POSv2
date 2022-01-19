package metier.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;


@Entity
@DiscriminatorValue("TrainRoulant")
public class TrainRoulant extends Composant {
	
	@ManyToMany
	@JoinTable(name = "TrainRoulant_ComponentTrainRoulant",
    joinColumns=@JoinColumn(name="idTrainRoulant", referencedColumnName="id"),
    inverseJoinColumns=@JoinColumn(name="idComponentTrainRoulant", referencedColumnName="id"))  
	private List<ComponentTrainRoulant> trainRoulants =new ArrayList<ComponentTrainRoulant>();

	public List<ComponentTrainRoulant> getTrainRoulants() {
		return trainRoulants;
	}

	public void setTrainRoulants(List<ComponentTrainRoulant> trainRoulants) {
		this.trainRoulants = trainRoulants;
	}


	
	}
