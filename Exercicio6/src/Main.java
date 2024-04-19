//Você deve fazer um programa que leia um valor qualquer e apresente uma mensagem dizendo em qual dos
//seguintes intervalos ([0,25], (25,50], (50,75], (75,100]) este valor se encontra. Obviamente se o valor não estiver em
//nenhum destes intervalos, deverá ser impressa a mensagem “Fora de intervalo”.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int valor;
        Scanner ler = new Scanner(System.in);

        System.out.println("Informe um valor qualquer: ");
        valor = ler.nextInt();

        if (valor>=0 && valor<25 ){
            System.out.println("O valor se encontra entre 0 e 25");
        } else if (valor>=25 && valor<50) {
            System.out.println("O valor se encontra entre 25 e 50");
        } else if (valor>=50 && valor<75) {
            System.out.println("O valor se encontra entre 50 e 75");
        } else if (valor>=75 && valor<=100) {
            System.out.println("O valor de encontra entre 75 e 100");
        }else{
            System.out.println("Fora de intervalo");
        }


    }
}