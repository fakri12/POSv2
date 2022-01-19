package metier.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "chaffagename",discriminatorType = DiscriminatorType.STRING,length = 20)
@DiscriminatorValue("ComponentChauff")
public class ComponentChauffage extends Composant {
	
	@ManyToMany
	@JoinTable(name = "Chauffage_ComponentChauffage",
    joinColumns=@JoinColumn(name="idComponentChauffage", referencedColumnName="id"),
    inverseJoinColumns=@JoinColumn(name="idChauffage", referencedColumnName="id")) 
	List<Chauffage> chauffages=new ArrayList<Chauffage>();

	public List<Chauffage> getChauffages() {
		return chauffages;
	}

	public void setChauffages(List<Chauffage> chauffages) {
		this.chauffages = chauffages;
	}

	
	
	
}
