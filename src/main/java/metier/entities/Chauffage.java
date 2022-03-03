package metier.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@DiscriminatorValue("Chauffage")
@Data @AllArgsConstructor @NoArgsConstructor @ToString
public class Chauffage extends Composant {
	
	@ManyToMany
	@JoinTable(name = "Chauffage_ComponentChauffage",
    joinColumns=@JoinColumn(name="idChauffage", referencedColumnName="id"),
    inverseJoinColumns=@JoinColumn(name="idComponentChauffage", referencedColumnName="id"))  
	@JsonIgnore
	private List<ComponentChauffage> componentChauffages=new ArrayList<ComponentChauffage>();
}
