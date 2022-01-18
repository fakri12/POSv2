package metier.entities;

public class ComposantQuantity {
	private Long id;
	private Commande commande;
	private Composant composant;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Commande getCommande() {
		return commande;
	}
	public void setCommande(Commande commande) {
		this.commande = commande;
	}
	public Composant getComposant() {
		return composant;
	}
	public void setComposant(Composant composant) {
		this.composant = composant;
	}
	
	
}
