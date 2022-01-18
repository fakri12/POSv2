package metier.entities;

import java.util.ArrayList;

public class ImplementClient implements Methods<Client> {
     
	ArrayList<Client> clients= new ArrayList<Client>();
	@Override
	public void ajouter(Client c) {
		clients.add(c);
	}

	@Override
	public Client supprimer(int id) {
		for(int i=0 ; i<clients.size() ; i++) {
	    	if(clients.get(i).getId()==id) {
	    		return clients.remove(i);
	    	}
	    }
		return null;
	}

	@Override
	public ArrayList<Client> rechercher(String motcle) {
		ArrayList<Client> clients2 = new ArrayList<Client>();
		for(int i = 0 ; i < this.clients.size() ; i++) {
			if(this.subString(motcle, clients.get(i).getF_name())){
				clients2.add(clients.get(i));
				}
			}
			return clients2;
	}

	@Override
	public Client update(int id, Client t) {
		
		return clients.set(id, t);
	}

	@Override
	public ArrayList<Client> getlist() {
		// TODO Auto-generated method stub
		return clients;
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
		return "ImplementClient [clients=" + clients + "]";
	}
	
}
