/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp4;

import java.util.Scanner;

/**
 *
 * @author peti_
 */
public class TP4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FondsInexistant {
        // TODO code application logic here
        
       Scanner sc = new Scanner(System.in);
        
        //Je crée un instrument
        Portefeuille nv_pf = new Portefeuille();
        
        
        
        boolean arret = false;
        {
	System.out.println("--Menu--");
	System.out.println("Ajouter un Fond : tapez 1");
	System.out.println("Rechercher un Fond : tapez 2");
	System.out.println("Afficher les Fonds : tapez 3");
        System.out.println("Quitter : tapez 9");
        
        int choix = 0;
        Scanner scanner = new Scanner(System.in);
         choix = scanner.nextInt();
        
	switch(choix)
	{
		case 1 :{
                    //On demande � l'utilisateur les infos du nouveau fond
            System.out.println("Choisir un nom de fond");
            String nom_fond = sc.nextLine();
            System.out.println("Choisir la valeur du fond");
            double amount_fond = sc.nextDouble();
            
            sc.nextLine(); //Vider le scanner
            
            //On cr�e un nouveau fond avec le bon nom et la bonne valeur   
            Fonds nv = new Fonds(amount_fond);          
            
 //Q1.2     //J'ajoute maintenant mon fond dans la hashmap de l'instrument avec comme cl�, le nom du fond
            nv_pf.ajouter_fond(nom_fond, nv);
            
	}break;
		case 2 : {
                    //Je demande � rechercher un fond
            System.out.println("Quel est le nom du fond à rechercher ?");
            try {
				nv_pf.recherche_fond(nom_fond);
				throw new FondExistant();
				
			} catch (FondsInexistant e) {
				//Question 1.5 : on ajouter le fond � la HashMap 
				Fonds fond = new Fonds(amount_fond);
				try {
					nv_pf.ajouter_fond(nom_fond, fond);
					
				} catch (FondExistant e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				System.out.println("Le nouveau fond a �t� ajout�");
				
			} catch (FondExistant e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
                }break;
                
		case 3 : System.out.println("Sous menu 2"); break;
                case 9 : arret = true; break;
		default : System.out.println("entrez un choix entre 1 et 3"); break;
                } 
                }arret=true;
        

        
    }
    
}