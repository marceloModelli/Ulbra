//Aula 01 - 12- A gravidade da Lua é cerca de 17% a da Terra. Crie um programa que calcule seu peso na Lua.

package Aula_Lab_Prog;

import java.util.Scanner;

public class Aula_01_Ex_12 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Insira seu peso na Terra.:");
        double pesoTerra = input.nextDouble();
        double pesoLua = (pesoTerra * 17) / 100;
        System.out.println("Seu peso na Terra.:"+pesoTerra+" Kg - Equivale a .:"+ pesoLua + " Kg na lua!");

    }
}
