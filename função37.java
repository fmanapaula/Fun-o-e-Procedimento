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
public class função37 {
    public static void main(String args[]){
        System.out.println(FFibonacci());
    }
    static double FFibonacci(){
        double Anterior= -1, Atual = 1;
        double serie=0;
        for (int i = 1; i<=9; i++){
         serie = Atual + Anterior;
         Anterior = Atual;
         Atual = serie;
    }
        return serie;
}
}