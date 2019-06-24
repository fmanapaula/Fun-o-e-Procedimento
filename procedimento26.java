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
public class procedimento26 {
    static int n1,n2;
    public static void main (String args[]){
        n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o 1o. número que seja inteiro:"));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o 2o. número que seja inteiro:"));
        Multiplo();
    }
    static void Multiplo(){
         if(n1>n2 && n1%n2==0){
            System.out.println("O número maior( " +n1+ " )" + " é múltiplo do menor (" +n2+ " ).");
        }
        else if(n2>n1 && n2%n1==0){
            System.out.println("O número maior( " +n2+ " )" + " é múltiplo do menor (" +n1+ " ).");
        }
        else{
            System.out.println("Os números não são multiplos");
        }
    }
}
