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
public class função44 {
    static int base, exp;
    
    public static void main (String args[]){
        base = Integer.parseInt(JOptionPane.showInputDialog("Informe o número de base:"));
        exp = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor de expoente do número:"));
        System.out.println("O valor é: "+FBaseExp());
        }
    static double FBaseExp(){
        double result;
        
        result = Math.pow(base,exp);
    
        return result;
    }
    
      
}

