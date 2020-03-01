/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment1;

/**
 *
 * @author Anindo
 */
public class Main {
    public static void main(String[] args) {
        box b1 = new box(10,20);
        box b2 = new box(10,220);
        
        if(b1.isEqual(b2)){
            System.out.println("same");
        }
        else{
            System.out.println("nope");
        }
    }
}
