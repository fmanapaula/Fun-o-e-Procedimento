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
public class funçâo34 {
    static int N,T;
    public static void main (String args[]){
        N = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor inteiro:"));
        System.out.println(FTabuada());
    }
    static String FTabuada(){
        String Tabuada = "";
     
      for(int i = 0; i<= 10; i++){
           T = i* N;
           Tabuada = Tabuada+"\n"+T;
           
    }
      return Tabuada;
}
}
