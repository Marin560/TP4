package tp4;

public class FondExistant extends Exception{
	
		public FondExistant() {
			System.out.println("Erreur - Il existe d�j� un fond du m�me nom. Choisir un autre nom svp");
		}
	
}
