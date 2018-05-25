package tp4;

public class FondsInexistant extends Exception {
	
	public FondsInexistant() {
		System.out.println("Erreur - Le fond que vous recherchez n'existe pas");
	};
}
