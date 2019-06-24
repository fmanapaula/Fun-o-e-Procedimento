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
public class função39 {
    public static void main (String args[]){
        System.out.println(FTabuleiro());
    }
    static double FTabuleiro(){
        double serie=0;
        int B=2;
        for(int i = 0; i <64; i++){
            serie = serie + (Math.pow(B,i));
    }
    return serie;
}
}
