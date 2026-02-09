package exercicios_Java._1_Fundamento_da_Linguagem;

import java.util.Scanner;

/*
   Escreva um código que receba o nome e a idade de 2 pessoas
   e imprima a diferença de idade entre elas
 */

public class D_desafio_imprime_diferencia_de_idade {
    public static void main(String[] args) {
        Scanner idade = new Scanner(System.in);

        System.out.println("Digite a idade de duas pessoas?");
        System.out.println("****************************** ");
        System.out.println("Primeira Idade: ");
        int idade1 = idade.nextInt();
        System.out.println("Segunda Idade: ");
        int idade2 = idade.nextInt();
        int resultado = 0;
        if(idade1 > idade2){
            resultado = idade1 - idade2;
            System.out.println("Diferencia de idade: "+ resultado);
        }else {
            resultado = idade2 - idade1;
            System.out.println("Diferença de idade é: "+resultado);
        }
        System.out.println("****************************** ");

        idade.close();
    }
}
