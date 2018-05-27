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
        	
        	//On demande un nom de fond et une clé
        	System.out.println("Choisir un nom de fond");
            String nom_fond = sc.nextLine();
            System.out.println("Choisir la valeur du fond");
            double amount_fond = sc.nextDouble();
            
            sc.nextLine(); //Vider le scanner
            
            //On check en appelant la fonction recherche de la question 1.3
            try {
				nv_pf.recherche_fond(nom_fond);
				throw new FondExistant();
				
			} catch (FondsInexistant e) {
				//Question 1.5 : on ajouter le fond à la HashMap 
				Fonds fond = new Fonds(amount_fond);
				try {
					nv_pf.ajouter_fond(nom_fond, fond);
					
				} catch (FondExistant e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				System.out.println("Le nouveau fond a été ajouté");
				
			} catch (FondExistant e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        	
            
        }
        
    }
    
}
