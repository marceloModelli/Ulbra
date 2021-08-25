package Aula_Lab_Prog;

import javax.swing.JOptionPane;

public class TDE_02_Exer_08 {

    public static void main(String[] args) {

        String cont;
        int con;
        int resultado = 0;

        cont = JOptionPane.showInputDialog("Digite o número a ter sua tabuada.:");
        con = Integer.parseInt(cont);

        for (int c = 1; c <= 10; ++c) {
            resultado = (c * con);
            JOptionPane.showMessageDialog(null,"O número ( "+con+" ) multiplicado por ( "+c+" ) é --> "+resultado);
        }
    }
}
