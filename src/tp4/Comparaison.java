/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp4;

/**
 *
 * @author Roxane
 */
public class Comparaison implements Comparable <Fonds>{
  
 Fonds objet1 = null; 
 double amount1 = objet1.getAmount();
        
   public boolean equals(Fonds objet){
       
       if (amount1 == objet.getAmount()){
           return true;
       }
       
       else {
           return false;
       }
       
   }
    
    @Override
    public int compareTo(Fonds t) {
        
    
        if(this.amount1> t.getAmount()){
            return 1;
        }
        
        if(objet1.equals(t) == true){
            return 0;
        }
            return -1;
        
    }
    


    
}
