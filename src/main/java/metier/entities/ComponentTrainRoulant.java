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
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data @AllArgsConstructor @NoArgsConstructor @ToString
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
}
