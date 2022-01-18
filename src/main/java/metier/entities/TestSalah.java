package metier.entities;

public class TestSalah {

	public static void main(String[] args) {
    	//Test implementClient
    	Client cl1= new Client();
    	cl1.setId(1L);
    	cl1.setF_name("salah");
    	cl1.setCity("Casa");
    	cl1.setL_name("khaif");
 		cl1.setMail("salaheddine@khaif.com");
		cl1.setPassowrd("ssqqll");
		cl1.setAdress("oulfa");
		Client cl2= new Client();
		cl2.setId(2L);
		cl2.setF_name("ali");
		cl2.setCity("smara");
		cl2.setL_name("fakri");
		cl2.setMail("Fakri@Ali.com");
		cl2.setPassowrd("ss");
		cl2.setAdress("Mohammedia");
		Client cl3= new Client();
		cl3.setId(3L);
		cl3.setF_name("hossam");
		cl3.setCity("moahmmedia");
		cl3.setL_name("outr");
		cl3.setMail("outr@hossam.com");
		cl3.setPassowrd("ssa");
		cl3.setAdress("media");
		ImplementClient impc = new ImplementClient();
		//l'ajout
		impc.ajouter(cl1);
		impc.ajouter(cl2);
		impc.ajouter(cl3);
		//update
		cl1.setId(1L);
		cl1.setF_name("salaheddine");
		cl1.setCity("Casablanca");
		cl1.setL_name("khaif");
		cl1.setMail("salaheddine1@khaif.com");
		cl1.setPassowrd("ssqqll2");
		cl1.setAdress("Casa,Oulfa");
		impc.update(0, cl1);
		//affichage
		System.out.println(impc.getlist());
		//rechercher
		System.out.println(impc.rechercher("s"));
		//suppression
		System.out.println("vous avez supprim� "+impc.supprimer(1));
		System.out.println(impc.getlist());	
		//Test implementCategories
		Category cat1= new Category();
		cat1.setId(1L);
	    cat1.setMarque("BMW");
		Category cat2= new Category();
		cat2.setId(2L);
		cat2.setMarque("Mercedes");
		Category cat3= new Category();
		cat3.setId(3L);
		cat3.setMarque("Renault");
		ImplementCategory impcat = new ImplementCategory();
		//l'ajout
		impcat.ajouter(cat1);
		impcat.ajouter(cat2);
		impcat.ajouter(cat3);
		//update
		cat1.setMarque("BMW1");
		impcat.update(1,cat1);
		//affichage
		System.out.println(impcat.getlist());
		//rechercher
		System.out.println(impcat.rechercher("s"));
		//suppression
		System.out.println("vous avez supprim� "+impcat.supprimer(0));
		System.out.println(impcat.getlist());	
		
	}

}
