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
public class procedimento24 {
    static int N;
    public static void main (String args[]){
        N = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor inteiro:"));
        Dividir();
    }
    static void Dividir(){
        if (N%2== 0 && N%3==0){
            System.out.println("O número "+ N+ " é divisível concomitantemente por 2 e 3.");
        }
        else{
            System.out.println("O número não é divisível concomitantemente por 2 e 3.");
        }
    }
}
