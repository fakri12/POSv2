package metier.entities;

import java.util.ArrayList;

public class ImplementComponent implements Methods<Composant> {
	private ArrayList<Composant> composnts; 

	@Override
	public void ajouter(Composant t) {
		this.composnts.add(t);
		
	}

	@Override
	public Composant supprimer(int id) {
		for(int i=0 ; i<composnts.size() ; i++) {
	    	if(composnts.get(i).getId()==id) {
	    		return composnts.remove(i);
	    	}
	    }
	     return null;
	}

	@Override
	public ArrayList<Composant> rechercher(String motcle) {
		ArrayList<Composant> composnts2 = new ArrayList<Composant>();
		for(int i = 0 ; i < this.composnts.size() ; i++) {
		if(this.subString(motcle, composnts.get(i).getName())){
			composnts2.add(composnts.get(i));
			}
		}
		return composnts2;
	}

	@Override
	public Composant update(int id, Composant t) {
		for(int i=0 ; i<composnts.size() ; i++) {
	    	if(composnts.get(i).getId()==id) {
	    		return composnts.set(i, t);
	    	}
		}
		return null;
	}

	@Override
	public ArrayList<Composant> getlist() {
		return this.composnts;
	}
	
	public boolean subString(String motcle, String ref) {
		int test = 0;
		if(motcle.length() == 0) {
			return true;
		}
		String generate = motcle;
		for(char i: ref.toCharArray()) { 
			if(i != generate.charAt(0)) {
				test = 0;
				generate = motcle;
			}
			else {
				test++;
				if (test == motcle.length())
					return true;
				generate = generate.substring(1);
			}
		}
		return false;
	}
	
}
