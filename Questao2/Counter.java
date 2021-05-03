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
import java.util.Random;
public class Counter {
    
    private int count;
    private Random r;
    
    synchronized void increment(){
        if(count < 3){
            this.count ++;
            System.out.println("Ocorreu um incremento - count: " + this.count);
        }   
        else{
            System.out.println("Esperando, count atingiu o vamor maximo(3)");
            
        }
    }
    
    synchronized void decrement(){
        if(count > 0){
            this.count --;
            System.out.println("Ocorreu um decremento - count: " + this.count);
        }
        else{
            System.out.println("Esperando, count atingiu o valor minimo(0)");
            
        }

    }
    
}
