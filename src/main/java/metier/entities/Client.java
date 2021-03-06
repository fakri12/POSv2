package metier.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor @ToString
public class Client {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String f_name;
	
    private String verificationCode;
    private boolean enabled;
    
	private String l_name;
	private String mail;
	private String city;
	private String adress;
	private String passowrd;	
	@OneToMany(mappedBy = "client")
	private List<Commande> commandes ;
	
	@OneToOne(mappedBy= "client")
	private Panier panier;
}

