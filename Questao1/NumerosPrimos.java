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
public class NumerosPrimos extends Thread {
    public static int qtdPrimos;
    public static int num;

    public NumerosPrimos(int num) {
        NumerosPrimos.num = num;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        NumerosPrimos.num = num;
    }

    
    public  int getQtdPrimos() {
        return qtdPrimos;
    }

    public void setQtdPrimos(int qtdPrimos) {
        NumerosPrimos.qtdPrimos = qtdPrimos;
    }
 
}
