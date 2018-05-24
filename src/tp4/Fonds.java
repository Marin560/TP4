/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp4;

/**
 *
 * @author peti_
 */
public class Fonds {
    double amount;
    
    //Constructeur surchargé
    public Fonds(double amount){
        this.amount = amount ;
    }
    
    //Methodes
    
    //Getters and Setters
    public double getAmount() {
        return amount;
    }
    public void setAmount(double amount) {
        this.amount = amount;
    }
    
}
