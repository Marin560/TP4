 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp4;

import java.util.HashMap;
import java.util.Map;

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
    public double recherche_fond(){
     
        return 102;
    }
    
    
}






