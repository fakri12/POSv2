package metier.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Thermostat")
public class Thermostat extends ComponentChauffage{

}
