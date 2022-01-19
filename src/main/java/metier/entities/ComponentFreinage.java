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

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data @AllArgsConstructor @NoArgsConstructor @ToString
@Entity
@DiscriminatorValue("ComponentFreinage")
public class ComponentFreinage extends Composant { 
    @ManyToMany
    @JoinTable(name = "Freinage_ComponentFreinage",
    joinColumns={@JoinColumn(name="idComponantFreinage", referencedColumnName="id")},
    inverseJoinColumns={@JoinColumn(name="idFreinage", referencedColumnName="id")})
	private List<Freinage> freinages = new ArrayList<Freinage>();
}
