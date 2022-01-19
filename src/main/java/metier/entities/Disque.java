package metier.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Disque")
public class Disque extends ComponentFreinage {

}
