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
public class função31 {
    static int q;
    public static void main (String args[]){
        System.out.println(FQuadrado(150));
    }
   static String FQuadrado(int i){
       String valores = "";
       for( i = 10; i <=150;i++){
             q = i*i;
             valores = valores+"\n"+q;
             
       }
       return valores;
   } 
}
