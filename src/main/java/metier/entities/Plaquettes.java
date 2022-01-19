package metier.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Plaquettes")
public class Plaquettes extends ComponentFreinage {

}
