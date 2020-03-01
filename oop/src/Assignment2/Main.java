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
public class Main {
    public static void main(String[] args) {
        fibonacci fib = new fibonacci();
        int n = 10;
        for(int i = 0; i <= n; i++)
            System.out.println(fib.fibo(i));
    }
    
}
