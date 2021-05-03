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
public class NovaThread implements Runnable{
    private Counter counter;
    private int maisOuMenos;
    private Random r = new Random();

    public NovaThread(Counter counter, int maisOuMenos) {
        this.counter = counter;
        this.maisOuMenos = maisOuMenos;
        Thread t = new Thread(this);
        t.start();
    }

    @Override
    public void run() {
        if(maisOuMenos == 0){
            for(int i = 0; i < 20; i++){
                counter.increment();
                try{
                    Thread.sleep(r.nextInt(500));
                }
                catch(InterruptedException exception){
                    
                }
            }           
        }
        if(maisOuMenos == 1){
            for(int i = 0; i < 20; i++){
                counter.decrement();
                try{
                    Thread.sleep(r.nextInt(500));
                }
                catch(InterruptedException exception){
  
                }
            }
        }
    }
}
