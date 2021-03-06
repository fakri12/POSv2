package metier.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonRawValue;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


@Data @AllArgsConstructor @NoArgsConstructor @ToString
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "Componentname", discriminatorType = DiscriminatorType.STRING, length = 15) 
@JsonTypeInfo(
		  use = JsonTypeInfo.Id.NAME, 
		  include = JsonTypeInfo.As.PROPERTY, 
		  property = "Componentname",visible = true)
		@JsonSubTypes({ 
		  @Type(value = Engine.class, name = "Engine"), 
		  @Type(value = Culasse.class, name = "Culasse") 
		})
public abstract class Composant {
	@Id
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

	@OneToMany(mappedBy="composant")
	private List<LignePanierCommande> lignePanierCommandes;  
	
//	@OneToMany(mappedBy = "composant")
//	private List<ComposantQuantity> composantQuantities;
	
    @ManyToMany
	private List<Category> categories = new ArrayList<Category>();
	
	public int calculRate() {
		return (int) this.numberRate/this.numberPersonRate;
	}

	
}