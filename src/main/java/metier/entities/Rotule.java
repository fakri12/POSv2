package metier.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Rotule")
public class Rotule extends ComponentTrainRoulant {
	
}
