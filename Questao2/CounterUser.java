/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questao2;

/**
 *
 * @author Guilherme
 */
public class CounterUser {
    public static void main(String[] args){
        
        Counter counter = new Counter();

        NovaThread t1 = new NovaThread(counter, 0);
        NovaThread t2 = new NovaThread(counter, 1);

    }
}
