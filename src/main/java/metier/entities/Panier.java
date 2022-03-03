package metier.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data @NoArgsConstructor @ToString
public class Panier {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

    @OneToMany(mappedBy="panier",fetch = FetchType.EAGER)
    private List<LignePanierCommande> lignePanierCommandes;
    
    
    @OneToOne
	private Client client;
}
