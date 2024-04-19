//Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int n;
        Scanner ler = new Scanner(System.in);

        System.out.println("Informe um número inteiro:");
        n = ler.nextInt();

        if (n%2==0){
            System.out.println("O "+n+" é um número par");
        }else{
            System.out.println("O "+n+" é um número ímpar");
        }

    }
}