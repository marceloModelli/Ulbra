package Aula_Lab_Prog;

import javax.swing.JOptionPane;

public class TDE_02_Exer_07 {

    public static void main(String[] args) {

        String loginLido, senhaLida, loginCorreto, senhaCorreta;
        loginCorreto = "java8";
        senhaCorreta = "java8";
        int tentavivas = 3;

        for (int i = 0; i <= 2; ++i) {
            loginLido = JOptionPane.showInputDialog("Digite seu Login.:");
            senhaLida = JOptionPane.showInputDialog("Digite sua Senha.:");
            if ((loginLido.equalsIgnoreCase(loginCorreto)) && (senhaLida.equalsIgnoreCase(senhaCorreta))) {
                JOptionPane.showMessageDialog(null, "Acesso Concedido!");
                break;
            } else {
                --tentavivas;
                if (tentavivas > 0) {
                    JOptionPane.showMessageDialog(null, "Você ainda têm " + tentavivas + " tentativas!");
                } else {
                    JOptionPane.showMessageDialog(null, "Login Negado, 3 tentativas incorretas!");
                }
            }
        }
    }
}

