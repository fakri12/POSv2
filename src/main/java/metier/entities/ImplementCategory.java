package metier.entities;

import java.util.ArrayList;

public class ImplementCategory implements Methods<Category> {
       
	ArrayList<Category> categories= new ArrayList<>();
	@Override
	public void ajouter(Category t) {
		categories.add(t);
	}

	@Override
	public Category supprimer(int id) {
		return categories.remove(id);
	}

	@Override
	public ArrayList<Category> rechercher(String motcle) {
		ArrayList<Category> categories2 = new ArrayList<Category>();
		for(int i = 0 ; i < this.categories.size() ; i++) {
			if(this.subString(motcle, categories.get(i).getMarque())){
				categories2.add(categories.get(i));
				}
			}
			return categories2;
	}

	@Override
	public Category update(int id, Category t) {
		// TODO Auto-generated method stub
		return categories.set(id,t);
	}

	@Override
	public ArrayList<Category> getlist() {
		// TODO Auto-generated method stub
		return categories;
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

	@Override
	public String toString() {
		return "ImplementCategory [categories=" + categories + "]";
	}
	
}
