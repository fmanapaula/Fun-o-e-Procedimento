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
public class função42 {
    public static void main (String args[]){
        
        System.out.println(FSerie());
    }
    
    static String FSerie(){
        String Serie = "";
        double  A=0,B=-1,serie=0, C;
        
         C = A/B;
         for( int i = 1; i<=50; i++){
            A = A + 1;
            B = B + 2;
            serie = serie + C;
            Serie = Serie+"\n"+serie;
        
    }
    return Serie;
}
}

