/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

/**
 *
 * @author peti_
 */
public class Instrument implements Comparable {
    
   ArrayList<Fonds> liste_fonds;
    

    //Constructeur
   	
	public Instrument() {
		liste_fonds = new ArrayList<Fonds>();
	}
	
	
   /*
    public Instrument(){
      liste_fonds = new ArrayList<Fonds>();
        
        System.out.println("Avant le tri : ");
        Iterator<Fonds> it = liste_fonds.iterator();
        while(it.hasNext()) 
        	System.out.println(it.next());
        
      Collections.sort(liste_fonds);
      
      System.out.println("Apr�s le tri : ");
      it = liste_fonds.iterator();
      while(it.hasNext())
         System.out.println(it.next());
      
      System.out.println("Après le tri avec notre comparateur");
    
      //nous créons une classe anonyme ici, mais rien ne vous empêche d'en créer une dans un fichier séparé
        compareTo(t);

      it = liste_fonds.iterator();
      while(it.hasNext())
         System.out.println(it.next());
   	}
   */

        
       
    
    
    public void ajouter_fond(Fonds fond) {
    	liste_fonds.add(fond);
    }

	public ArrayList getListe_fonds() {
		return liste_fonds;
	}

	public void setListe_fonds(ArrayList<Fonds> liste_fonds) {
		this.liste_fonds = liste_fonds;
	}

       
    @Override
    public int compareTo(Object t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
       
   }
    
    

