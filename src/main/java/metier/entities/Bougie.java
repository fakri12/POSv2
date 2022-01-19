package metier.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data @NoArgsConstructor @ToString
@DiscriminatorValue("Bougie")
public class Bougie extends ComponentEngine {
	
	
}
