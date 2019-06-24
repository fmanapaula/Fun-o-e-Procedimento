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
public class procedimento17 {
    static double tp,vm,comb;
    public static void main (String args[]){
        tp = Double.parseDouble(JOptionPane.showInputDialog("Informe o tempo de percurso:"));
        vm = Double.parseDouble(JOptionPane.showInputDialog("Informe a velocidade média:"));
        Calc_combustivel();
    }
    static void Calc_combustivel(){
       
        comb = (vm*tp)/12;
        System.out.println("A quantidade de litros gastos na viagem é:"+comb);
    }
}
