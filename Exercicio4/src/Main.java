//Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode
//começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int horaI, horaF, total;
        Scanner ler = new Scanner(System.in);

        System.out.println("Informe a hora (inteira) que o jogo iniciou;");
        horaI = ler.nextInt();

        System.out.println("Informe a hora (inteira) que o jogo foi encerrado:");
        horaF = ler.nextInt();
        
        if(horaI == horaF){
            total = 24;
        } else if (horaI < horaF) {
                total = horaF - horaI;
            }else{
                total = 24 - horaI + horaF;
        }
        System.out.println("A hora total de jogo foi de: "+total+" horas");

    }
}