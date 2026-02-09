package exercicios_Java._1_Fundamento_da_Linguagem;

import java.util.Scanner;

public class B_desafio_digite_tamanho_do_quadrado {
/*
 Escreva um código que receba o tamanho do lado de um quadrado,
 calcule sua área e exiba na tela.
  -> fórmula: área=lado X lado
 */
  public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

      System.out.println("Digite um lado do quadrado?");
      int lado = scanner.nextInt();

      double area = lado * lado;

      System.out.println("Aréa do quadrado é: "+area);

      scanner.close();
  }
}
