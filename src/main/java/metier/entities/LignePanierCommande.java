package metier.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data @NoArgsConstructor @ToString
public class LignePanierCommande {
	@Id
	private Long id;
	private int quantity;
	@ManyToOne
	private Composant composant;
	@ManyToOne
	private Panier panier;
	@ManyToOne
	private Commande commande;
	
}
