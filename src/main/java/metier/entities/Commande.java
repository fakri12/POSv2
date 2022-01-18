package metier.entities;

import java.util.ArrayList;

public class Commande {
	private Long id;
	private Client client;
	private ArrayList<ComposantQuantity> composantQuantities;
	private Reclamation reclamation;
	
	
	public Reclamation getReclamation() {
		return reclamation;
	}
	public void setReclamation(Reclamation reclamation) {
		this.reclamation = reclamation;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	public ArrayList<ComposantQuantity> getComposantQuantities() {
		return composantQuantities;
	}
	public void setComposantQuantities(ArrayList<ComposantQuantity> composantQuantities) {
		this.composantQuantities = composantQuantities;
	}
	
	@Override
	public String toString() {
		return "Commande [id=" + id + ", client=" + client + ", composantQuantities=" + composantQuantities
				+ ", reclamation=" + reclamation + "]";
	}
	
	
	
}
