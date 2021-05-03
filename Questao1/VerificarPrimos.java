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
public class VerificarPrimos extends Thread{
    private NumerosPrimos num;
    private int verifica;
   
    
    public VerificarPrimos(NumerosPrimos numero, int verifica) {
        this.num = numero;
        this.verifica = verifica;
        start();
    }
    
    public void calcula(int num1){
        int divisores = 0;
        for(int i = 1; i < num1; i++){
            if((num1 % i) == 0){
                divisores ++;
            }     
        }
        
        if(divisores == 1){
            num.setQtdPrimos(num.getQtdPrimos()+1);
        }
    }
    
    @Override
    public void run(){
        
        try{
            if (verifica == 1){
                for(int i = 1; i < num.getNum()/2;i++ ){
                    calcula(i);
                }    
            }
        
            else{
                for(int i = num.getNum()/2; i <= num.getNum();i++ ){
                    calcula(i);
                }
            }
        }
        
        catch(IllegalArgumentException e){
            
        }
            
    }
    
}
    
