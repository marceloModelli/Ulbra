package Aula_Lab_Prog;

import javax.swing.JOptionPane;

public class TDE_02_Exer_05{

    public static void main(String[] args) {

        String prod, val;
        double valor = -1;
        double desc = 0;
        double valorComDesc = 0;

        prod = JOptionPane.showInputDialog("Digite o nome do produto.:");

        while (valor < 0) {
            val = JOptionPane.showInputDialog("Digite o valor do produto.:");
            valor = Double.parseDouble(val);
            if (valor < 0) {
                JOptionPane.showMessageDialog(null, "Valor Inválido!");
            }
        }
        if (valor>=1000){
            desc = 8;
        }
        if ((valor>=500)&&(valor<1000)){
            desc = 7;
        }
        if ((valor>=200)&&(valor<500)){
            desc = 6;
        }
        if ((valor>=50)&&(valor<200)){
            desc = 5;
        }
        if ((valor>0)&&(valor<50)){
            JOptionPane.showMessageDialog(null, "Comprinha merreca não ganha desconto!");
        }
        valorComDesc = (valor - ((valor * desc)/100));
        JOptionPane.showMessageDialog(null, "Produto.: "+prod+" , valor original.: R$ "+valor+" , valor com desconto.: R$ "+valorComDesc+" , foi aplicado desconto de .: "+desc+" %");
    }
}