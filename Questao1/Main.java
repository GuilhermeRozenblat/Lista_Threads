/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questao1;

/**
 *
 * @author Guilherme
 */
public class Main {
    
    public static void main(String[] args){
        
        NumerosPrimos numero = new NumerosPrimos(100);
        VerificarPrimos primos1 = new VerificarPrimos(numero,1);
        VerificarPrimos primos2 = new VerificarPrimos(numero,2);
        
        try{
            primos1.join();
            primos2.join();
        }
        catch(InterruptedException ex){
            
        }
        System.out.println("A quantidade de números primos entre 0 e " + NumerosPrimos.num + " é: "+ NumerosPrimos.qtdPrimos);
    }
}
