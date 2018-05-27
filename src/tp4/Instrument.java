/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp4;

import java.util.ArrayList;

/**
 *
 * @author peti_
 */
public class Instrument {
    
    ArrayList<Fonds> liste_fonds;
    
    //Constructeur
    public Instrument(){
        liste_fonds = new ArrayList<Fonds>();
    }
    
    public void ajouter_fond(Fonds fond) {
    	liste_fonds.add(fond);
    }

	public ArrayList getListe_fonds() {
		return liste_fonds;
	}

	public void setListe_fonds(ArrayList<Fonds> liste_fonds) {
		this.liste_fonds = liste_fonds;
	}
    
    
    
}
