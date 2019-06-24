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
public class funçâo32 {
    static int N;
    public static void main (String args[]){
    N = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor para ser fatorado:"));
    System.out.print(FFatorial());
  }
    static int FFatorial(){
        int Q=1;
        for(int i = N; i > 1 ;i--) {
        
         Q = Q*i;
    }
     return Q;   
}
}
