package metier.entities;

import java.io.Serializable;
import java.util.ArrayList;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;


@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "Componentname",discriminatorType = DiscriminatorType.STRING,length = 15)
public abstract class Composant implements Serializable {
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
	//private ArrayList<Category> categories;
	//private ArrayList<ComposantQuantity> composantQuantities;
	
	
	public int calculRate() {
		return (int) this.numberRate/this.numberPersonRate;
	}




	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public String getPicture() {
		return picture;
	}


	public void setPicture(String picture) {
		this.picture = picture;
	}


	public double getDiscount() {
		return discount;
	}


	public void setDiscount(double discount) {
		this.discount = discount;
	}


	public int getQuantity() {
		return quantity;
	}


	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}


	public int getNumberPersonRate() {
		return numberPersonRate;
	}


	public void setNumberPersonRate(int numberPersonRate) {
		this.numberPersonRate = numberPersonRate;
	}


	public int getNumberRate() {
		return numberRate;
	}


	public void setNumberRate(int numberRate) {
		this.numberRate = numberRate;
	}
	
	
	public void setPrice() {
		this.price = this.price*this.discount + this.price;
	}


//	public ArrayList<Category> getCategories() {
//		return categories;
//	}
//
//
//	public void setCategories(ArrayList<Category> categories) {
//		this.categories = categories;
//	}
//
//
//	public ArrayList<ComposantQuantity> getComposantQuantities() {
//		return composantQuantities;
//	}
//
//
//	public void setComposantQuantities(ArrayList<ComposantQuantity> composantQuantities) {
//		this.composantQuantities = composantQuantities;
//	}
//
//
//	@Override
//	public String toString() {
//		return "Composant [name=" + name + ", description=" + description + ", price=" + price
//				+ ", type=" + type + ", picture=" + picture + ", discount=" + discount + ", quantity=" + quantity
//				+ ", numberPersonRate=" + numberPersonRate + ", numberRate=" + numberRate + ", categories=" + categories
//				+ ", composantQuantities=" + composantQuantities + "]";
//	}
//	
	
	
	
}
