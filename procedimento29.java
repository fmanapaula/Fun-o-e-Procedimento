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
public class procedimento29 {
    static double inv,v_inv,v_cor;
    public static void main (String args[]){
        inv = Double.parseDouble(JOptionPane.showInputDialog("Informe o tipo de investimento:1-Pop/2-Renda Fixa"));
        Investimento();
    }
    static void Investimento(){
        if( inv == 2){
            v_inv = Double.parseDouble(JOptionPane.showInputDialog("A Operação escolhida é Renda Fixa. Informe o valor depositado:"));
            v_cor = v_inv +(v_inv*0.05);
            System.out.println("O valor corrigido será de : "+v_cor+" reais.");
        }
        else if (inv ==1){
            v_inv = Double.parseDouble(JOptionPane.showInputDialog("A Operação escolhida:POUPANÇA. Informe o valor depositado:"));
            v_cor = v_inv +(v_inv*0.03);
            System.out.println("O valor corrigido será de : "+v_cor+" reais.");
        } 
        else{
            System.out.println("OPERAÇÃO INVÁLIDA");
        }
    }
}
