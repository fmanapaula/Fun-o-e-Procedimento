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
public class procedimento18 {
    static int n1,n2,D;
    public static void main(String args[]){
        n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o 1o. valor:"));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o 2o. valor:"));
        MaiorMenor();
    }
   static void MaiorMenor(){
        if(n1>n2){
                    D = n1 - n2;
                    System.out.println("A diferença é: "+ D);
                    }
           else{
               D = n2-n1;
               System.out.println("A diferença é: "+D);
        }
   } 
}
