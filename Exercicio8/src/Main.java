//Em um país imaginário denominado Lisarb, todos os habitantes ficam felizes em pagar seus impostos, pois sabem
//que nele não existem políticos corruptos e os recursos arrecadados são utilizados em benefício da população, sem
//qualquer desvio. A moeda deste país é o Rombus, cujo símbolo é o R$.
//Leia um valor com duas casas decimais, equivalente ao salário de uma pessoa de Lisarb. Em seguida, calcule e
//mostre o valor que esta pessoa deve pagar de Imposto de Renda, segundo a tabela abaixo.
//Lembre que, se o salário for R$ 3002.00, a taxa que incide é de 8% apenas sobre R$ 1000.00, pois a faixa de
//salário que fica de R$ 0.00 até R$ 2000.00 é isenta de Imposto de Renda. No exemplo fornecido (abaixo), a taxa é
//de 8% sobre R$ 1000.00 + 18% sobre R$ 2.00, o que resulta em R$ 80.36 no total. O valor deve ser impresso com
//duas casas decimais

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double renda, total, imposto1, imposto2, imposto3;
        Scanner ler = new Scanner(System.in);

        System.out.println("Informe o valor da sua renda:");
        renda = ler.nextDouble();

        if (renda>0 && renda<=2000){
            System.out.printf("Insento de imposto");
        } else if (renda<=3000) {
            total = (renda-2000) *0.08;
            System.out.printf("Valor de imposto de renda que deverá ser pago: R$ %.2f",total);
        } else if (renda<4500) {
            total = (renda-3000) * 0.18 + 80;
            System.out.printf("Valor de imposto de renda que deverá ser pago: R$ %.2f",total);
        } else if (renda>4500) {
            total = (renda-4500) * 0.28 + 80 + 270;
            System.out.printf("Valor de imposto de renda que deverá ser pago: R$ %.2f",total);
        }

    }
}