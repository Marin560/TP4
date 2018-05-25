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
    public static void main(String[] args) {
        // TODO code application logic here
        
        boolean stop = false;
        Scanner sc = new Scanner(System.in);
        
        //Je crÃ©e un instrument
        Portefeuille nv_pf = new Portefeuille();
        
        while(stop == false) {
            //On demande à l'utilisateur les infos du nouveau fond
            System.out.println("Choisir un nom de fond");
            String nom_fond = sc.nextLine();
            System.out.println("Choisir la valeur du fond");
            double amount_fond = sc.nextDouble();
            
            sc.nextLine(); //Vider le scanner
            
            //On crée un nouveau fond avec le bon nom et la bonne valeur   
            Fonds nv = new Fonds(amount_fond);          
            
 //Q1.2     //J'ajoute maintenant mon fond dans la hashmap de l'instrument avec comme clé, le nom du fond
            nv_pf.ajouter_fond(nom_fond, nv);
            
            //Je demande à rechercher un fond
            System.out.println("Quel est le nom du fond à rechercher ?");
            try {
				System.out.println(nv_pf.recherche_fond(sc.nextLine()));
			} catch (FondsInexistant e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
            
        }
        
    }
    
}
