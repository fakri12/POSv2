package metier.entities;

public class Reclamation {
	private int id;
	private Commande commande; 
	private String detailsReclamation;
	
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public Commande getCommande() {
		return commande;
	}
	
	public void setCommande(Commande commande) {
		this.commande = commande;
	}
	
	public String getDetailsReclamation() {
		return detailsReclamation;
	}
	
	public void setDetailsReclamation(String detailsReclamation) {
		this.detailsReclamation = detailsReclamation;
	}

	@Override
	public String toString() {
		return "Reclamation [id=" + id + ", commande=" + commande + ", detailsReclamation=" + detailsReclamation + "]";
	}
	
	
	
	
	
	
	
}
