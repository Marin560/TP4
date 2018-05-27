package tp4;

public class FondExistant extends Exception{
	
		public FondExistant() {
			System.out.println("Erreur - Il existe déjà un fond du même nom. Choisir un autre nom svp");
		}
	
}
