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
        box newB = new box(b2);
        if(b2.isEqual(newB)) {
            System.out.println("new same");
        }
        else
            System.out.println("new no");
    }
}
