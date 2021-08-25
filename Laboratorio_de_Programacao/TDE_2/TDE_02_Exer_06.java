package Aula_Lab_Prog;

import javax.swing.JOptionPane;

public class TDE_02_Exer_06{

    public static void main(String[] args) {

        String cont;

        int con, totalResist, teste = 0, maior = 0, menor = 0;
        totalResist = 0;
        cont = JOptionPane.showInputDialog("Digite a quantidade de resistências.:");
        con = Integer.parseInt(cont);

        int n[] = new int[con];
        String valor[] = new String[con];

        for (int c = 0; c <= n.length - 1; ++c) {
            teste = c + 1;
            valor[c] = JOptionPane.showInputDialog("Digite um valor para a resistência.: (" + teste + ")");
            n[c] = Integer.parseInt(valor[c]);
            totalResist = totalResist + n[c];
        }
        JOptionPane.showMessageDialog(null, "Resistência Equivalente (SOMA) das (" + con + ") resistências é.: " + totalResist);
        for (int c = 1; c <= n.length - 1; ++c) {
            if (n[c] > n[maior]) {
                maior = c;
            }
        }
        for (int c = 1; c <= n.length - 1; ++c) {
            if (n[c] < n[menor]) {
                menor = c;
            }
        }
        ++menor;
        ++maior;
        JOptionPane.showMessageDialog(null, "A maior resistência foi a .: R"+(maior--)+" e o valor dela foi.: "+n[maior]);
        JOptionPane.showMessageDialog(null, "A menor resistência foi a .: R"+(menor--)+" e o valor dela foi.: "+n[menor]);
    }
}
