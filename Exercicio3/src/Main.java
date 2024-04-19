//Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao
//Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em
//ordem crescente ou decrescente.


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    int a,b;
    Scanner ler = new Scanner(System.in);

        System.out.println("Informe o primeiro número inteiro:");
        a = ler.nextInt();

        System.out.println("Informe o segundo número inteiro:");
        b = ler.nextInt();

        if ( (a % b == 0) || (b % a ==0) ){
            System.out.println("Os números são múltiplos");
        }else{
            System.out.println("Os números não são múltiplos");
        }

    }
}