package metier.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import java.util.ArrayList;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor @ToString
public class Commande {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne
	private Client client;
	
	@OneToOne
	private Reclamation reclamation;
	
//	@OneToMany(mappedBy = "commande")
//    private List<ComposantQuantity> composantQuantities;
	
    @OneToMany(mappedBy="commande")
    private List<LignePanierCommande> lignePanierCommandes;
}
