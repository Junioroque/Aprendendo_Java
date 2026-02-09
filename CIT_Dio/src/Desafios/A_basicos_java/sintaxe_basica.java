package Desafios.A_basicos_java;

import java.util.Scanner;

public class sintaxe_basica {
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

        String EC2 = "Preciso de um servidor para rodar aplicacoes";
        String S3 = "Quero armazenar imagens e videos";
        String RDS = "Necessito de um banco de dados realcional";
        String Lambda = "Preciso executar funcoes sem servidor";
        String Servico_desconhecido = "Solicito um servico de inteligencia artificial";

        if(EC2.equals(servico)){
            System.out.println("EC2");
        } else if (S3.equals(servico)) {
            System.out.println("S3");
        }else if(RDS.equals(servico)){
            System.out.println("RDS");
        }else if (Lambda.equals(servico)) {
            System.out.println("Lambda");
        }else {
            System.out.println("Servico desconhecido");
        }
    }
}

