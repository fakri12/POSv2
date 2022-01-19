package metier.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
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
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "composantEngine",length = 15)
@DiscriminatorValue("ComposantEngine")
@Data @NoArgsConstructor @AllArgsConstructor @ToString
public class ComponentEngine extends Composant implements Serializable {
	

	private static final long serialVersionUID = 1L;

	@ManyToMany(mappedBy = "componentEngines", fetch = FetchType.EAGER)
	List<Engine> engines =  new ArrayList<>();


}
