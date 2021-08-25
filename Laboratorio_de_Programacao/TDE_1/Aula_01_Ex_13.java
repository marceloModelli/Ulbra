/* 13 - Faça um programa que calcula a que distância, em pés, um ouvinte está da queda de um relâmpago.
O som viaja a aproximadamente 1.100 pés por segundo pelo ar. Logo, conhecer o intervalo entre o momento
em que você viu um relâmpago e o momento em que o som o alcançou lhe permitirá calcular a distância do relâmpago.
Para este projeto, considere que o intervalo seja de 7,2 segundos.
 */

package Aula_Lab_Prog;

import java.util.Scanner;

public class Aula_01_Ex_13{

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double veloSom = 1100;
        System.out.println("Insira o intervalo de segundos desde a queda até a chegada do som.:");

        double inter = input.nextDouble();
        double dist = (veloSom * inter);
        System.out.println("Considerando a velocidade do som.: "+veloSom+" pés, num intervalo de.: "+inter+" Segundos");
        System.out.println("O ouvinte está a uma distância de .: "+dist+" pés do relâmpago");

    }
}