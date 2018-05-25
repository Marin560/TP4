 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author peti_
 */
public class Portefeuille {
    //Attributs
    //1 HashMap pour les fonds. Clé recherche String + Obj Fond
    Map<String, Fonds> map_fonds;
    //1 HashMap pour les instruments. Clé recherche String + Obj Instr
    Map<String, Instrument> map_instru;
    
    //Constructeurs
    public Portefeuille(){
        
       map_fonds = new HashMap<>();
       map_instru = new HashMap<>();
       
    }
    
    //Methodes
    public void ajouter_fond(String nom, Fonds fond){
        //On ajoute le fond à la hashMap fond 
        map_fonds.put(nom, fond);
        
    }
    
    
    public double recherche_fond(String nom_fond) throws FondsInexistant{ //Je re�ois le param�tre du fond
    	
    	//Je recherche mon fond dans ma HashMap
    	Fonds fd = map_fonds.get(nom_fond);
    	if(fd == null) {
    		throw new FondsInexistant();
    	}
    	else {
    		return fd.getAmount();
    	}
        
    }
    
    public ArrayList<Fonds> recherche_instrument(String nom_instrument) throws InstrumentInexistant{ //Je re�ois le param�tre du fond
    	
    	//Je recherche mon fond dans ma HashMap
    	Instrument instru = map_instru.get(nom_instrument);
    	if(instru == null) {
    		throw new InstrumentInexistant();
    	}
    	else {
    		//return instru.getAmount();
    		return instru.getListe_fonds(); //Je renvoie la liste des fonds
    	}
        
    }
    
    /*
    Je cr�e une m�thode qui me permet de rechercher un portefeuille en 
    entrant son nom.
    
    Si �a ne marche pas, je cr�e une exception qui s'appelle "FondsInexistant"
    
    
    Je cr�e donc un menu pour pouvoir choisir une option (ajouter, rechercher, etc.)
    */
    
    
}






