package metier.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data @AllArgsConstructor @NoArgsConstructor @ToString
public class ComposantQuantity {
	private Long id;
	private Commande commande;
	private Composant composant;
}
