/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author paulakanae
 */
import javax.swing.JOptionPane;
public class função33 {
    static int N,C=1;
    static double S=0,soma=0;
    public static void main (String args[]){
        N = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor inteiro:"));
        System.out.println(FSerie());
    }
    static double FSerie(){
        
        for (double i =1; i<=N;i++){
            S = C/i;
            soma = soma +S;
    }
        return soma;
}
}
