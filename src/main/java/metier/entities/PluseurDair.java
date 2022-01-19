package metier.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("PluseurDair")
public class PluseurDair extends ComponentChauffage{

}
