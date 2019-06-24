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
public class procedimento25 {
    static int Hinicial,Hfinal,Minicial,Mfinal,Thora,Tmin;
    public static void main (String args[]){
        Hinicial = Integer.parseInt(JOptionPane.showInputDialog("Informe a hora inicial do jogo:"));
        Minicial = Integer.parseInt(JOptionPane.showInputDialog("Informe o minuto inicial do jogo:"));
        Hfinal = Integer.parseInt(JOptionPane.showInputDialog("Informe a hora final do jogo:"));
        Mfinal = Integer.parseInt(JOptionPane.showInputDialog("Informe o minuto final do jogo:"));
        tempo_jogo();
    }
    static void tempo_jogo(){
            if(Hfinal>Hinicial && Mfinal>Minicial){
            Thora = Hfinal - Hinicial;
            Tmin = Mfinal - Minicial;
            
            System.out.println(" O jogo durou "+ Thora +" : "+ Tmin +" horas.");
        }
        
        else if (Hinicial>Hfinal && Minicial>Mfinal){
            Thora = ((24 - Hinicial) + Hfinal);
            Tmin  = Minicial - Mfinal;
            System.out.println(" O jogo durou "+ Thora +" : "+ Tmin +" horas.");
        }
         else if (Hinicial>Hfinal && Mfinal>Minicial){
            Thora = ((24 - Hinicial) + Hfinal);
            Tmin  = Mfinal - Minicial;
            System.out.println(" O jogo durou "+ Thora +" : "+ Tmin +" horas.");
         }
         else if (Hfinal<Hinicial && Minicial<Mfinal){
             Thora = ((24 - Hinicial) + Hfinal);
             Tmin = Mfinal - Minicial;
             System.out.println(" O jogo durou "+ Thora +" : "+ Tmin +" horas.");
             
         }  
         else if (Hinicial<Hfinal && Minicial>Mfinal){
             Thora = Hfinal - Hinicial;
             Tmin = Minicial - Mfinal;
             System.out.println(" O jogo durou "+ Thora +" : "+ Tmin +" horas.");
         }
        
         else if (Hinicial==Hfinal && Minicial==Mfinal){
             System.out.print("Um dia de Jogo.Aff");
        
    }
    }
}
