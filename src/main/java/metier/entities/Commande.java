package metier.entities;

import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data @AllArgsConstructor @NoArgsConstructor @ToString
public class Commande {
	private Long id;
	private Client client;
	private List<ComposantQuantity> composantQuantities = new ArrayList<ComposantQuantity>();
	private Reclamation reclamation;
}
