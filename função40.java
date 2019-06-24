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
public class função40 {
    static int N1,N2,C=0;
    public static void main (String args[]){
        N1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o 1o. número:"));
        N2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o 2o. número:"));
        System.out.println("Os números primos do intervalo são:"+FPrimos());
    }  
    static String FPrimos(){
        String Primos = "";
    
        if(N2>N1){
            for ( int i = N1+1; i<N2; i++){
                C = 0;
                for( int j = 1; j<=i; j++){
                    if (i%j ==0){
                        C = C + 1;
                    }
                        
                        
                    
                }
                if (C==2){
                    Primos = Primos+"\n"+i;       
                        }
        }
            
            
        
        
        
    }
        else{
            for ( int i = N2+1; i<N1; i++){
                C = 0;
                for(int  j = 1; j<=i; j++){
                    if (i%j ==0){
                        C = C + 1;
                        
                    }
                }
        
                if (C==2){
                    Primos = Primos +"\n"+i;
                }
                            
                        }
                
    }
            return Primos;
    
}
}
