package metier.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Amortisseur")
public class Amortisseur extends ComponentTrainRoulant {
	
}
