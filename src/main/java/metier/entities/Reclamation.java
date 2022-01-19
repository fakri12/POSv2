package metier.entities;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data @AllArgsConstructor @NoArgsConstructor @ToString

public class Reclamation {
	private int id;
	private Commande commande; 
	private String detailsReclamation;
}
