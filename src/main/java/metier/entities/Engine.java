package metier.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor @ToString
@DiscriminatorValue("Engine")
public class Engine extends Composant implements Serializable {

	private static final long serialVersionUID = 1L;
	
	
	@ManyToMany(fetch = FetchType.EAGER)
	private List<ComponentEngine> componentEngines =  new ArrayList<ComponentEngine>();

	
	
}
