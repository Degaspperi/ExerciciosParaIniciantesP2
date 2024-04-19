//Fazer um programa para ler um número inteiro,
//e depois dizer se este número é negativo ou não



import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int n;
        Scanner ler = new Scanner(System.in);

        System.out.println("Informe um número:");
        n = ler.nextInt();

        if (n>0){
            System.out.println("O "+n+" é um número positivo");
        }else{
            System.out.println("O "+n+" é um número negativo");
        }


    }
}