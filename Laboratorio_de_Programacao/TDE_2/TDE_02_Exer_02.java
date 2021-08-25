/* Aula 02. Ex02.: O Imposto sobre a Transmissão de Bens Móveis (ITBI) é aplicado sobre o valor de um imóvel
a ser negociado. A base de cálculo do ITBI (o valor a ser considerado no cálculo) será o maior valor entre
 o valor de transação (o valor negociado) e o valor venal de referência (fornecido pela Prefeitura).
 Com base nisso, elabore uma classe que receba o valor da transação, o valor venal e o percentual de imposto.
 Após isso, encontre o maior valor e aplique o percentual sobre ele. Ao final, apresente o valor do imposto a
 ser pago. Observação: o valor do imposto a ser pago é calculado por meio da fórmula:
 valor do imposto = maior valor * percentual / 100. Para entrada e saída de dados utilize a classe JOptionPane. */

package Aula_Lab_Prog;

import javax.swing.JOptionPane;
import java.awt.*;

public class TDE_02_Exer_02{

    public static void main(String[] args) {

        String valorNeg, valorPref, percentImpost;
        double valorNegociado, valorPrefa, percentImposto;
        double valorCalculo, valorImposto;
        valorCalculo = 0;

        valorNeg = JOptionPane.showInputDialog("Digite o Valor Negociado.:");
        valorPref = JOptionPane.showInputDialog("Digite o Valor na Prefeitura.:");
        percentImpost = JOptionPane.showInputDialog("Digite o percentual de imposto, em %.:");

        valorNegociado = Double.parseDouble(valorNeg);
        valorPrefa = Double.parseDouble(valorPref);
        percentImposto = Double.parseDouble(percentImpost);

        if (valorNegociado >= valorPrefa){
            valorCalculo = valorNegociado - valorPrefa;
        }else if ( valorPrefa>valorNegociado){
            valorCalculo = valorPrefa - valorNegociado;
        }
        valorImposto = ((valorCalculo * percentImposto) / 100);
        JOptionPane.showMessageDialog(null, "O valor do imposto é.: "+valorImposto);

    }

}