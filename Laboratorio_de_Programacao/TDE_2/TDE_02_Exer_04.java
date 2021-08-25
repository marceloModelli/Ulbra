/* Aula 02. Ex04.: Considere a seguinte informação a respeito do cálculo da aposentadoria. Para se aposentar
por idade, as mulheres precisam ter atingido 60 anos de idade e os homens, 65. Já na aposentadoria por tempo
de contribuição, o tempo mínimo exigido é de 30 anos para as mulheres e de 35 anos para os homens.
Com base nessas informações, elabore uma classe que receba a idade de uma pessoa, seu sexo e a quantidade
de anos de contribuição. A seguir, calcule a quantidade de anos que falta de contribuição para se aposentar,
ou então emita a mensagem: “você já tem o direito a aposentadoria”. */

package Aula_Lab_Prog;

import javax.swing.JOptionPane;
import java.awt.*;
import java.text.DecimalFormat;

public class TDE_02_Exer_04 {

    public static void main(String[] args) {

        String sex, id, contr, masculino, feminino;
        float idade;
        double tempoContribuicao = 0;
        masculino = "M";
        feminino = "F";
        sex = masculino+feminino;

        while ((!sex.equalsIgnoreCase(feminino)) && (!sex.equalsIgnoreCase(masculino))){
            sex = JOptionPane.showInputDialog("Digite seu sexo (M/F).:");
            if ((!sex.equalsIgnoreCase(feminino)) && (!sex.equalsIgnoreCase(masculino))) {
                JOptionPane.showMessageDialog(null, "Sexo diferente de (M/F) não contemplado no cálculo");
            }
        }
        id = JOptionPane.showInputDialog("Digite a sua idade .:");
        idade = Float.parseFloat(id);
        if (sex.equalsIgnoreCase(masculino)) {
            if (idade < 65) {
                contr = JOptionPane.showInputDialog("Digite o tempo de contribuição 'em anos'.:");
                tempoContribuicao = Double.parseDouble(contr);
                tempoContribuicao = 35 - tempoContribuicao;
                JOptionPane.showMessageDialog(null, "Faltam " + tempoContribuicao + " anos de contribuição para o Sr. se aposentar!");
            } else {
                JOptionPane.showMessageDialog(null, "Você Homem ja tem direito de aposentadoria por idade");
            }
        }
        if (sex.equalsIgnoreCase(feminino)) {
            if (idade < 60) {
                contr = JOptionPane.showInputDialog("Digite o tempo de contribuição 'em anos'.:");
                tempoContribuicao = Double.parseDouble(contr);
                tempoContribuicao = 30 - tempoContribuicao;
                JOptionPane.showMessageDialog(null, "Faltam " + tempoContribuicao + " anos de contribuição para Sra. se aposentar!");
            } else {
                JOptionPane.showMessageDialog(null, "Você Mulher ja tem direito de aposentadoria por idade");
            }
        }

    }
}
