//Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A
//seguir, calcule e mostre o valor da conta a pagar.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int cod, quant;
        double total=0;
        Scanner ler = new Scanner(System.in);

        System.out.println("Olá, esse é o nosso menu atual \nCÓDIGO     ESPECIFICAÇÃO            PREÇO");
        System.out.println("1          Cachorro Quente          R$4.00");
        System.out.println("2          X-Salada                 R$4.50");
        System.out.println("3          X-Bacon                  R$5,00");
        System.out.println("4          Torrada Simples          R$2,00");
        System.out.println("5          Refrigerante             R$1,50");

        System.out.println("Informe o código do produto desejado:");
        cod = ler.nextInt();

        System.out.println("Informe a quantidade de produto desejado");
        quant = ler.nextInt();

        if (cod==1){
            total = quant*4;
        } else if (cod==2) {
            total = quant*4.50 ;
        } else if (cod==3) {
            total = quant*5 ;
        } else if (cod==4) {
            total = quant*2 ;
        } else if (cod==5) {
            total = quant*1.50 ;
        }else if ( cod > 5 || cod < 0){
            System.out.println("Código invalido");
        }
        System.out.printf("O valor total do pedido é: %.2f",total);
    }
}