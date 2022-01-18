package metier.entities;

public class TestMain {
	public static void main(String args[]) {
		
		Composant composant = new Culasse();
		composant.setNumberPersonRate(9);
		composant.setNumberRate(32);
		System.out.println(composant.calculRate());
	}
}
