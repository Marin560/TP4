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
        
        //Je crée un instrument
        Portefeuille nv_pf = new Portefeuille();
        
        while(stop == false){
            
            //On demande à l'utilisateur de créer un nouveau fond
            System.out.println("Choisir un nom de fond");
            String nom_fond = sc.nextLine();
            
            if(nom_fond.equals("stop")) {
            	stop = true;
            }
            
            System.out.println("Choisir la valeur du fond");
            double amount_fond = sc.nextDouble();
            
            sc.nextLine(); //Vider le scanner
            
            //Je crée un nouveau fond avec le bon nom et la bonne valeur   
            Fonds nv = new Fonds(amount_fond);          
            
            //J'ajoute maintenant mon fond dans la hashmap de l'instrument avec comme clé, le nom du fond
            nv_pf.ajouter_fond(nom_fond, nv);
            
        }
        
        
    }
    
}
