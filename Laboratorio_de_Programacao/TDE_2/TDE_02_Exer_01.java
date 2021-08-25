/* Aula 02. Ex01.: Usando a classe Scanner para entrada de dados, crie uma classe que receba o valor de um produto e
a porcentagem de desconto, calcule e mostre o valor do desconto e o valor do produto com o desconto.
Observação: o valor do desconto é calculado por meio da fórmula: valor do desconto = valor do produto * percentual de desconto / 100.
 */

package Aula_Lab_Prog;

import java.util.Scanner;

public class TDE_02_Exer_01{

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Digite o valor do produto, em R$.:");
        double valorProduto = input.nextDouble();
        System.out.println("Digite o percentual de desconto, em %");
        double percentDesc = input.nextDouble();
        double desc = (valorProduto * (percentDesc / 100));
        double precoComDesc = (valorProduto - desc);
        System.out.println("Considerando o preço original.: "+valorProduto+" e o desconto de.:"+percentDesc+"% concedido.");
        System.out.println("O valor do desconto em reais ficou.: R$ "+desc);
        System.out.println("E o valor final do produto com desconto ficou.: R$ "+precoComDesc);

    }
}