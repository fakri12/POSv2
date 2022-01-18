package metier.entities;

import java.util.ArrayList;

public class Category {
	private Long id;
	private ArrayList<Composant> composants;
	private String marque;
	
	
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public ArrayList<Composant> getComposants() {
		return composants;
	}
	public void setComposants(ArrayList<Composant> composants) {
		this.composants = composants;
	}
	
	public String getMarque() {
		return marque;
	}
	public void setMarque(String marque) {
		this.marque = marque;
	}
	@Override
	public String toString() {
		return "Category [id=" + id + ", composants=" + composants + ", marque=" + marque + "]";
	}
	
	
}
