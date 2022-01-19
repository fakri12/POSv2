package metier.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "componntName",length = 15)
@Data @AllArgsConstructor @NoArgsConstructor @ToString
public abstract class Composant implements Serializable {
	
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	private Long id;
	private String name;
	private String description;
	private double price;
	private String type;
	private String picture;
	private double discount = 0;
	private int quantity;
	private int numberPersonRate;
	private int numberRate;

	
	@OneToMany(mappedBy = "composant")
	private List<ComposantQuantity> composantQuantities;
	
	
	public int calculRate() {
		return (int) this.numberRate/this.numberPersonRate;
	}


	
	
	
	
}
