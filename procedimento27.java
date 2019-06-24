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
public class procedimento27 {
    static int Nvoltas,Emetros;
    static double Tm,Vm,Th,Ekm;
    public static void main (String args[]){
        Nvoltas = Integer.parseInt(JOptionPane.showInputDialog("Informe o número de voltas:"));
        Emetros = Integer.parseInt(JOptionPane.showInputDialog("Informe a extensão do circuito em metros:"));
        Tm = Double.parseDouble(JOptionPane.showInputDialog("Informe o tempo de duração em minutos:"));
        Calc_vm();
    }
    static void Calc_vm(){
        Ekm = (Nvoltas*Emetros)/1000;
            Th = Tm/60;
            Vm = Ekm/Th;
            System.out.println("A velocidade média é: "+ Vm);
    }
}
