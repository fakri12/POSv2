package metier.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("CableDeFrein")
public class CableDeFrein extends ComponentFreinage {

}
