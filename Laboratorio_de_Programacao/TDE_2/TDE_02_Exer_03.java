/* Aula 02. Ex03.: Usando a classe JOptionPane para entrada de dados, elabore uma classe que receba a nota
de duas provas e de um trabalho. Calcule e mostre a média e o resultado final (aprovado ou reprovado).
Para calcular a média utilize a fórmula seguinte: média = (nota da prova 1 + nota da prova 2 + nota do trabalho)
 / 3. Considere que a média mínima para aprovação é 6.  */

package Aula_Lab_Prog;

import javax.swing.JOptionPane;
import java.awt.*;
import java.text.DecimalFormat;

public class TDE_02_Exer_03 {

    public static void main(String[] args) {

        String prova1, prova2, trabalho;
        double notaProva1, notaProva2, notaTrabalho, media;

        prova1 = JOptionPane.showInputDialog("Digite a nota na Prova 1.:");
        prova2 = JOptionPane.showInputDialog("Digite a nota na Prova 2.:");
        trabalho = JOptionPane.showInputDialog("Digite a nota no Trabalho.:");

        notaProva1 = Double.parseDouble(prova1);
        notaProva2 = Double.parseDouble(prova2);
        notaTrabalho = Double.parseDouble(trabalho);
        media = (notaProva1+notaProva2+notaTrabalho)/3;

        if (media >= 6){
            JOptionPane.showMessageDialog(null, "Aprovado! Media foi.: "+media);
        }else {
            JOptionPane.showMessageDialog(null, "Reprovado! Media foi.: " + media);
        }

    }
}