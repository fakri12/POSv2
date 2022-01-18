package metier.entities;

import java.util.ArrayList;

public class ImplementReclamation implements Methods<Reclamation> {
	
	ArrayList<Reclamation> reclamations = new ArrayList<>();
	@Override
	public void ajouter(Reclamation t) {
		reclamations.add(t);
	}

	@Override
	public Reclamation supprimer(int id) {
		 for(int i=0 ; i<reclamations.size() ; i++) {
		    	if(reclamations.get(i).getId()==id) {
		    		return reclamations.remove(i);
		    	}
		 }
		 return null;
	}

	@Override
	public ArrayList<Reclamation> rechercher(String motcle) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public Reclamation rechercher(int id) {
		
		for(int i=0 ; i<reclamations.size() ; i++) {
	    	if(reclamations.get(i).getId()==id) {
	    		return reclamations.get(i);
	    	}
	    }
		return null;
	}

	@Override
	public Reclamation update(int id, Reclamation t) {
		for(int i=0 ; i<reclamations.size() ; i++) {
	    	if(reclamations.get(i).getId()==id) {
	    		return reclamations.set(i,t);
	    	}
	    }
		return null;
	}

	@Override
	public ArrayList<Reclamation> getlist() {
		
		return reclamations;
	}
	
	
	
}
