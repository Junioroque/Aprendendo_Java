package exercicios_Java._1_Fundamento_da_Linguagem;

import java.util.Scanner;

public class C_desafio_receba_base_altura {
/*
  Escreva um código que receba a base e a alturade um retângulo,
  calcule sua área e exiba na tela.
  -> fórmula: área=base X altura
 */
    public static void main(String[] args) {
        Scanner var = new Scanner(System.in);

        System.out.println("Digite a base: ");
        double base = var.nextDouble();

        System.out.println("Digite a altura: ");
        double altura = var.nextDouble();

        double area = base * altura;

        System.out.printf("A área do retangulo é: %.2f ", area);

        var.close();

    }
}
