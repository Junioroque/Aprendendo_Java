package exercicios_Java._2_Estrutura_de_Controle;

import java.util.Scanner;

public class C_entre_com_dois_numeros {
/*
   Escreva um código que o usuário entre com um primeiro número,
   um segundo número maior que o primeiro e escolhe entre a opção par e impar,
   com isso o código deve informar todos os números pares ou ímpares
   (de acordo com a seleção inicial) no intervalo de números informados,
   incluindo os números informados e em ordem decrescente;
 */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int resultado = 0;

        System.out.println("Digite um numero: ");
        int numero1 = scanner.nextInt();
        System.out.println("Digite outro numero mas maior que o primeiro: ");
        int numero2 = scanner.nextInt();

        System.out.println("Selecione opção impar ou par? ");
        String opcao = scanner.next();


        switch (opcao){

            case("impar"):
                for(int i = numero2; i >= numero1; i--) {
                    resultado = i;
                    if(resultado % 2 != 0){

                        System.out.print(resultado + " ");
                    }
                }

                break;
            case("par"):
                for(int i = numero2; i >= numero1; i--) {
                    resultado = i;
                    if(resultado % 2 == 0){

                        System.out.print(resultado + " ");
                    }
                }
                break;
        }

        scanner.close();
    }

}
