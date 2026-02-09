package exercicios_Java._2_Estrutura_de_Controle;

import java.util.Scanner;

public class A_escreva_uma_tabuada {
/*
   Escreva um código onde o usuário entra com um número
   e seja gerada a tabuada de 1 até 10 desse número;
 */
    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int tabuada = numero.nextInt();

        for(int i = 0; i <= 10; i++) {
            int resultado = i * tabuada;
            System.out.println(i+" X "+tabuada+" = "+resultado);
        }

        numero.close();
    }
}
