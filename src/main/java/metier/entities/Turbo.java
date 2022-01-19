package metier.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data @NoArgsConstructor @ToString
@DiscriminatorValue("Turbo")
public class Turbo extends ComponentEngine {

}
