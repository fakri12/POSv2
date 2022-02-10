package metier.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
@DiscriminatorValue("TrainRoulant")
public class TrainRoulant extends Composant {
	
	@ManyToMany
	@JoinTable(name = "TrainRoulant_ComponentTrainRoulant",
    joinColumns=@JoinColumn(name="idTrainRoulant", referencedColumnName="id"),
    inverseJoinColumns=@JoinColumn(name="idComponentTrainRoulant", referencedColumnName="id")) 
	@JsonIgnore
	private List<ComponentTrainRoulant> trainRoulants =new ArrayList<ComponentTrainRoulant>();


	
	}
