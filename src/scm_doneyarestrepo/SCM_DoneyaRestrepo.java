/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scm_doneyarestrepo;
import javax.swing.JOptionPane;

/**
 *
 * @author Doneya
 */
public class SCM_DoneyaRestrepo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1, num2, res;
        AritmeticaController ObjAritmetica = new AritmeticaController();
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Escribe el Primer Número"));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Escribe el Segundo Número"));
        
        res=ObjAritmetica.sumarNumeros(num1, num2);
        JOptionPane.showMessageDialog(null, "La Suma es "+res);
        
        
    }
    
}
