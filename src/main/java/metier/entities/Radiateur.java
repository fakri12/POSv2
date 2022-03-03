package metier.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import lombok.Data;

@Entity
@DiscriminatorValue("Radiateur")
public class Radiateur extends ComponentChauffage{

}
