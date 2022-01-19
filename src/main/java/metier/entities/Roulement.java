package metier.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Roulement")
public class Roulement extends ComponentTrainRoulant {
	
}
