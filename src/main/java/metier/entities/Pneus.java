package metier.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Pneus")
public class Pneus extends ComponentTrainRoulant {

	public Pneus() {
		super();
		// TODO Auto-generated  stub
	}
	
}
