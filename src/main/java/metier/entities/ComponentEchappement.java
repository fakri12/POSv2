package metier.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data @AllArgsConstructor @NoArgsConstructor @ToString
@Entity
@DiscriminatorValue("ComponentEchappement")
public class ComponentEchappement extends Composant {
	@ManyToMany(mappedBy = "componentEchappements")
	private List<Echappement> echappements = new ArrayList<Echappement>();	
}
