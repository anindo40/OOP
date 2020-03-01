/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment2;

/**
 *
 * @author Anindo
 */
public class fibonacci {
    int fibo(int n){
        if(n <=1)
           return n;
        return fibo(n-1) + fibo(n-2);
    }
    
}
