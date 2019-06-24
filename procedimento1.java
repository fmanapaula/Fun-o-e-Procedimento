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
public class procedimento1 {
    static int l,a;
    static double area;
    public static void main (String args[]){
        l = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor do lado do quadrado:"));
        area();
    }

    static void area(){
     
     int a = l*l;
     System.out.println("A área do quadrado é: "+ a);
}
}

