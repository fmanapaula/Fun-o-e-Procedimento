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
public class procedimento23 {
    static double n1,n2,n3,n4;
    public static void main (String args[]){
        n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite um valor que dê inicio a uma ordem crescente:"));
        n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo valor que acompanhe a ordem crescente:"));
        n3 = Double.parseDouble(JOptionPane.showInputDialog("Digite o terceiro, e último, valor que acompanhe a ordem crescente:"));
        n4 = Double.parseDouble(JOptionPane.showInputDialog("Digite um valor que não necessariamente siga a sequência:"));
        Ordem_crescente();
    }
    static void Ordem_crescente(){
         if (n4>n3){
            System.out.println(n1+" ," + n2 +" , "+ n3+" e "+ n4+".");
        }
        else if (n4<n1){
            System.out.println(n4+" ," + n1 +" , "+ n2+" e "+ n3+".");            
        }
        else if(n4>n1 && n4<n2){
            System.out.println(n1+" ," + n4 +" , "+ n2+" e "+ n3+".");
        }
        else if (n4>n2 && n4<n3){
            System.out.println(n1+" ," + n2 +" , "+ n4+" e "+ n3+".");
        }
    }
    
}
