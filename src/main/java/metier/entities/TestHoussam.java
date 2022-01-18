package metier.entities;

import java.util.ArrayList;

public class TestHoussam {

	public static void main(String[] args) {
		
//		***************Testing insertion**********
		Commande commande = new Commande();
		ImplementReclamation implementReclamation = new ImplementReclamation();
		
		Reclamation reclamation = new Reclamation();
		reclamation.setId(0);
		reclamation.setCommande(commande);
		reclamation.setDetailsReclamation("The product Culassa is not good");
		
		Reclamation reclamation1 = new Reclamation();
		reclamation1.setId(1);
		reclamation1.setCommande(commande);
		reclamation1.setDetailsReclamation("The product motor is not good");
		
		implementReclamation.reclamations.add(reclamation);		
		implementReclamation.reclamations.add(reclamation1);
		
		for (Reclamation rec : implementReclamation.reclamations) {
			System.out.println(rec);
		}
		
		
		System.out.println("*********************************");
//      ***************Testing Remove**********
		
		implementReclamation.supprimer(1);
		
		for (Reclamation rec : implementReclamation.reclamations) {
			System.out.println(rec);
		}

		System.out.println("*********************************");
//      ***************Testing Update**********		
		implementReclamation.update(0, reclamation1);
		for (Reclamation rec : implementReclamation.reclamations) {
			System.out.println(rec);
		}
		
		System.out.println("*********************************");
//      ***************Testing search**********	
		System.out.println(implementReclamation.rechercher(1));
		
		System.out.println("*********************************");
//      ***************Testing getList**********	
		ArrayList<Reclamation> arr  = implementReclamation.getlist();
		for (Reclamation rec : arr) {
			System.out.println(rec);
		}
		
		
		
	}

}
