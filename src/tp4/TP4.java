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
        
       
        
        //Variables
    	Scanner sc = new Scanner(System.in);
        Portefeuille nv_pf = new Portefeuille(); //Nouveau portefeuille
        Scanner scanner = new Scanner(System.in); //Nouveau Scanner
        String nom_fond; 
        double amount_fond;
        String nom_instrument;
        
        boolean arret = false;
        {
	System.out.println("--Menu--");
	System.out.println("Ajouter un Fond : tapez 1");
	System.out.println("Rechercher un Fond : tapez 2");
	System.out.println("Afficher les Fonds : tapez 3");
        System.out.println("Quitter : tapez 9");
        
        //Je cr�e un fond fictif 
        Fonds fd = new Fonds(1500);
        try {
			nv_pf.ajouter_fond("oui", fd);
		} catch (FondExistant e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
        
        while (!arret){
        	
	        System.out.println("--Menu--");
			System.out.println("Rechercher un Fond : tapez 1");
			System.out.println("Afficher les Fonds : tapez 2");
			System.out.println("Supprimer un Fond : tapez 3");
			System.out.println("Supprimer un instrument : tapez 4");
		    System.out.println("Question 1.5 : tapez 5");
		    System.out.println("Question 1.6 : tapez 6");
		    System.out.println("Quitter : tapez 9");
	        
	        int choix = 0;
	        
	        choix = scanner.nextInt();
	        
	        switch(choix) {
                    
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
	        	case 3 :
	        		
	        		System.out.println("Nom du fond a supprimer");
	                nom_fond = sc.nextLine();

	                nv_pf.suppression_fond(nom_fond);
	                
	        		break;
	        	case 4 :
	        		
	        		System.out.println("Nom de l'instrument a supprimer");
	                nom_instrument = sc.nextLine();

	                nv_pf.suppression_instrument(nom_instrument);
	                
	        		break;
	        	
	        	case 5 :          
	    	        //On demande � l'utilisateur les infos du nouveau fond
	                System.out.println("Nom du fond");
	                nom_fond = sc.nextLine();
	    	        
	    	        //Je demande � rechercher un fond
	                try {
	    				nv_pf.recherche_fond(nom_fond);
	    				throw new FondExistant();
	    				
	    			}catch (FondsInexistant e) {
	    				//Question 1.5 : on ajouter le fond � la HashMap 
	    				System.out.println("Valeur du fond "+nom_fond+ " ?");
	    	            amount_fond = sc.nextDouble();
	    				
	    	            sc.nextLine();
	    	            
	    				Fonds fond = new Fonds(amount_fond);
	    				try {
	    					nv_pf.ajouter_fond(nom_fond, fond);
	    				} catch (FondExistant e1) {
	    					// TODO Auto-generated catch block
	    					e1.printStackTrace();
	    				}
	    				System.out.println("Le fond "+nom_fond+" a �t� ajout�");
	    				
	    			}catch (FondExistant e) {
	    				// TODO Auto-generated catch block
	    				e.printStackTrace();
	    			}
	                
	                break;
	                
	        	case 6: //Test de la question 1.6
	        		//On demande � l'utilisateur le nom de l'instrument 
	                System.out.println("Nom de l'instrument");
	                nom_instrument = sc.nextLine();
	                
	                //On demande les infos sur le fond
					System.out.println("Nom du fond");
	                nom_fond = sc.nextLine();
	                System.out.println("Valeur du fond");
	                amount_fond = sc.nextDouble();
	          
	                sc.nextLine();
	                //On instancie le fond
	                Fonds fond  = new Fonds(amount_fond);
	                
	                //On recherche cet instrument 
					try {
						nv_pf.recherche_instrument(nom_instrument);
						
					} catch (InstrumentInexistant e) {
						// TODO Auto-generated catch block
						//e.printStackTrace();
						
						//On cr�e le nouvel instrument et on l'ajoute � la HashMap des instruments
						Instrument nv_instru = new Instrument();
						nv_pf.ajouter_instrument(nom_instrument, nv_instru); //Le nouvel instrument est ajout� � la HashMap
						
						System.out.println("L'instrument a �t� cr�e");
					}
					
					//On ajoute le fond � l'instrument.
					nv_pf.getMap_instru().get(nom_instrument).ajouter_fond(fond);					
	                System.out.println("Le fond "+nom_fond+" a �t� ajout� � l'instrument "+nom_instrument);
	                
	                break;
	        		
                        case 9 : arret = true; break;
                        
	        	default :
	        		System.out.println("Entrez un num�ro valable svp");
	                break;
                        
                    
	        }System.out.println("Appuyez sur entr�e pour continuer"); sc.nextLine();
        	
        	
            
            
            
 //Q1.2     //J'ajoute maintenant mon fond dans la hashmap de l'instrument avec comme cl�, le nom du fond
            nv_pf.ajouter_fond(nom_fond, nv);
            
	}
		
                
        }	
                
                arret=true;
        
    }
    }
    
