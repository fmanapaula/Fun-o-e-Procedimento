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
public class função43 {
    public static void main(String args[]){
        System.out.println("A Ana vai demorar "+ FAnos() +" anos para ser maior que Maria.");
    }
    static double FAnos(){
        double H_Ana = 1.1,H_Maria = 1.5,Anos = 0;
        while  (H_Maria>=H_Ana){
            H_Ana = H_Ana + 0.03;
            H_Maria = H_Maria + 0.02;
            Anos = Anos +1;
    }
        return Anos;
}
}
