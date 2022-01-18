
package metier.entities;

import java.util.ArrayList;

public class ImplementCommande implements Methods<Commande> {

	ArrayList<Commande> commandes=new ArrayList<>();
	@Override
	public void ajouter(Commande c) {
		commandes.add(c);		
	}

	@Override
	public Commande supprimer(int id) {
    for(int i=0 ; i<commandes.size() ; i++) {
    	if(commandes.get(i).getId()==id) {
    		return commandes.remove(i);
    	}
    }
     return null;
	}

	@Override
	public ArrayList<Commande> rechercher(String motcle) {
		return null;
	}

	@Override
	public Commande update(int id, Commande t) {
		for(int i=0 ; i<commandes.size() ; i++) {
	    	if(commandes.get(i).getId()==id) {
	    		return commandes.set(i,t);
	    	}
	    }
		return null;
	}

	@Override
	public ArrayList<Commande> getlist() {
		// TODO Auto-generated method stub
		return this.commandes;
	}
	
	

}