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
    public void ajouter_fond(String nom_fond, Fonds fond) throws FondExistant {
    	if(map_fonds.get(nom_fond) == null) { //Si le fond n'existe pas, je peux l'ajouter
    		map_fonds.put(nom_fond, fond);
    	}
    	else //Si le fond existe, je dis non et renvoie l'exception
    		throw new FondExistant();
        
    }
    
    public void ajouter_instrument(String nom_instrument, Instrument instru) {
    	if(map_instru.get(nom_instrument) == null) { //Si le fond n'existe pas, je peux l'ajouter
    		map_instru.put(nom_instrument, instru);
    	}
        
    }
    
    public double recherche_fond(String nom_fond) throws FondsInexistant{ //Je re�ois le param�tre du fond
    	//Je recherche mon fond dans ma HashMap
    	Fonds fd = map_fonds.get(nom_fond);
    	
    	//Si l'objet reçu est null, cela signifie que le fond n'existe pas. Exception.
    	
    	if(fd == null) {
    		throw new FondsInexistant();
    	}
    	//Si le fond existe, on renvoie sa valeur
    	else {
    		System.out.println("Ce fond existe");
    		return fd.getAmount();
    	}
        
    }
    
    public ArrayList<Fonds> recherche_instrument(String nom_instrument) throws InstrumentInexistant{ //Je re�ois le param�tre du fond
    	
    	//Je recherche mon fond dans ma HashMap
    	Instrument instru = map_instru.get(nom_instrument); //Je récupère l'instrument qui répond au nom reçu en paramètre
    	if(instru == null) { //Si l'instrument n'existe pas, je revoie l'exception
    		throw new InstrumentInexistant();
    	}
    	else {
    		return instru.getListe_fonds(); //Je renvoie la liste des fonds
    	}
        
    }
    
    public void ajout_fond_a_instrument (String nom_instrument, Fonds fond) {
    	//Grâce à une clé reçue en paramètre, on ajoute le fond reçu à l'instrument
    	map_instru.get(nom_instrument).ajouter_fond(fond);
    	
    }
    
    public void suppression_fond(String nom_fond) {
    	//On vérifie si le fond existe
    	try {
    		recherche_fond(nom_fond);
    		map_fonds.remove(nom_fond);
    		System.out.println("Fond supprimé (de la HashMap du Portefeuille)");
    	} catch (FondsInexistant e) {
    		//e.printStackTrace();
    	}
    }
    
    public void suppression_instrument(String nom_instrument) {
    	//On vérifie si le fond existe
    	try {
    		recherche_instrument(nom_instrument);
    		
    		//Si il existe, alors on vide sa collection d'instrument
    		map_instru.get(nom_instrument).getListe_fonds().clear();
    		
    		//On supprime ensuite cet instrument de la HashMap
    		map_instru.remove(nom_instrument);
    		System.out.println("Instrument supprimé (de la HashMap du Portefeuille)");
    	} catch (InstrumentInexistant e) {
    		//e.printStackTrace();
    	}
    }
    
    //Getters and Setters
	public Map<String, Fonds> getMap_fonds() {
		return map_fonds;
	}

	public void setMap_fonds(Map<String, Fonds> map_fonds) {
		this.map_fonds = map_fonds;
	}

	public Map<String, Instrument> getMap_instru() {
		return map_instru;
	}

	public void setMap_instru(Map<String, Instrument> map_instru) {
		this.map_instru = map_instru;
	}

    
    /*
    Je cr�e une m�thode qui me permet de rechercher un portefeuille en 
    entrant son nom.
    
    Si �a ne marche pas, je cr�e une exception qui s'appelle "FondsInexistant"
    
    
    Je cr�e donc un menu pour pouvoir choisir une option (ajouter, rechercher, etc.)
    */
    
    
}






