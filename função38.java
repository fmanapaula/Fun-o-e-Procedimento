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
public class função38 {
    static int N=0,Nmaior=0,Nmenor=0;
    public static void main(String args[]){
        N = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor inteiro: "));
        Nmenor = N;
        Nmaior = N;
        for(int i= 1; i<=4; i++){
            N = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor inteiro: ")); 
            Nmaior = FMaior(N,Nmaior);
            Nmenor = FMenor(N,Nmenor);
        }
        System.out.println("O numero maior é: "+Nmaior+".O número menor é: "+ Nmenor);
    }
    
    static int FMaior(int ValA,int ValB){
        if (ValA>ValB){
            return ValA;
        }
        else{
            return ValB;
        }
    }
    static int FMenor(int ValA, int ValB){
        if (ValA<ValB){
            return ValA;
        }
        else{
            return ValB;
    }
    }
}
    
    