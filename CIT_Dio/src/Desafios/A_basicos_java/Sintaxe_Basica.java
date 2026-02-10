package Desafios.A_basicos_java;

import java.util.Scanner;

public class Sintaxe_Basica {
/*
   AWS Service Matcher: Identifique O Serviço Ideal Para Cada Demanda.
   Uma única string representando a solicitação do cliente.
   Seu primeiro desafio é ajudar a equipe a identificar rapidamente qual
   serviço AWS deve ser utilizado.
     "EC2" para demandas de servidores virtuais,
     "S3" para armazenamento de arquivos,
     "RDS" para bancos de dados relacionais,
     "Lambda" para execuções de código sob demanda
   Se nenhum desse serviços não corresponder:
     "Servico desconhecido".
*/
    public static void main(String[] args) {
        Scanner valor = new Scanner(System.in);

        System.out.println("Qual serviço que o senhor deseja? ");
        String servico = valor.nextLine();

            String texto = servico.toLowerCase();

        //String EC2 = "preciso de um servidor para rodar aplicacoes";
        //String S3 = "quero armazenar imagens e videos";
        //String RDS = "necessito de um banco de dados realcional";
        //String Lambda = "preciso executar funcoes sem servidor";


        if("preciso de um servidor para rodar aplicacoes".equals(texto))
            System.out.println("EC2");

        else if ("quero armazenar imagens e videos".equals(texto))
            System.out.println("S3");

        else if("necessito de um banco de dados relacional".equals(texto))
            System.out.println("RDS");

        else if ("preciso executar funcoes sem servidor".equals(texto))
            System.out.println("Lambda");

        else
            System.out.println("Servico desconhecido");

        valor.close();
    }
}

