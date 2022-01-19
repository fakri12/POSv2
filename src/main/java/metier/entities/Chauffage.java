package metier.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
@DiscriminatorValue("Chauffage")
public class Chauffage extends Composant {
	
	@ManyToMany
	@JoinTable(name = "Chauffage_ComponentChauffage",
    joinColumns=@JoinColumn(name="idChauffage", referencedColumnName="id"),
    inverseJoinColumns=@JoinColumn(name="idComponentChauffage", referencedColumnName="id"))  
	private List<ComponentChauffage> componentChauffages=new ArrayList<ComponentChauffage>();

	public List<ComponentChauffage> getComponentChauffages() {
		return componentChauffages;
	}

	public void setComponentChauffages(List<ComponentChauffage> componentChauffages) {
		this.componentChauffages = componentChauffages;
	}

	
	
	
}
