package Desafios.A_basicos_java;

import java.util.Scanner;

public class Sintaxe_Basica_2 {
/*
   Identificação De Serviços AWS Por Código Em Java
   Implemente um programa que leia uma string representando
   o código de operação e imprima o nome do serviço AWS correspondente:
   "EC2", "S3" ou "Lambda".
   Se o código não corresponder exatamente a nenhum desses, imprima "Codigo invalido".
*/
    public static void main(String[] args) {
        Scanner valor = new Scanner(System.in);

        System.out.println("Qual serviço que você quer: ");
        String codigo = valor.nextLine();

        // TODO: Verifique se o código corresponde exatamente a "EC2", "S3" ou "Lambda" e imprima o serviço correspondente.
        // Caso contrário, imprima "Codigo invalido".
        if("EC2".equals(codigo))
            System.out.println("EC2");

        else if ("S3".equals(codigo))
            System.out.println("S3");

        else if ("Lambda".equals(codigo))
            System.out.println("Lambda");

        else
            System.out.println("Codigo invalido");

        valor.close();
    }
}
