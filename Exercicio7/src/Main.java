//Leia 2 valores com uma casa decimal (x e y), que devem representar as coordenadas
//de um ponto em um plano. A seguir, determine qual o quadrante ao qual pertence o
//ponto, ou se está sobre um dos eixos cartesianos ou na origem (x = y = 0).
//Se o ponto estiver na origem, escreva a mensagem “Origem”.
//Se o ponto estiver sobre um dos eixos escreva “Eixo X” ou “Eixo Y”, conforme for a
//situação.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double x, y;
        Scanner ler = new Scanner(System.in);

        System.out.println("Informe a coordenada X: ");
        x = ler.nextDouble();

        System.out.println("Informe a coordenada Y: ");
        y = ler.nextDouble();

        if (x>0 && y>0){
            System.out.println("Você está no Q1");
        } else if (x>0 && y<0) {
            System.out.println("Você está no Q4");
        } else if (x<0 && y<0) {
            System.out.println("Você está no Q3");
        } else if (x<0 && y>0) {
            System.out.println("Você está no Q2");
        } else if (x==0 && y==0) {
            System.out.println("Você está na origem");
        } else if (x==0) {
            System.out.println("Você está no eixo X");
        }else{
            System.out.println("Você está no eixo Y");
        }

    }
}