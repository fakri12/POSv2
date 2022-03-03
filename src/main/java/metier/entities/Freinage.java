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
@Data @AllArgsConstructor @NoArgsConstructor @ToString 
@Entity
@DiscriminatorValue("Freinage")
public class Freinage extends Composant {
    @ManyToMany
    @JoinTable(name = "Freinage_ComponentFreinage",
    joinColumns={@JoinColumn(name="idFreinage", referencedColumnName="id")},
    inverseJoinColumns={@JoinColumn(name="idComponantFreinage", referencedColumnName="id")})
    @JsonIgnore
	private List<ComponentFreinage> componentFreinages = new ArrayList<ComponentFreinage>();
}
