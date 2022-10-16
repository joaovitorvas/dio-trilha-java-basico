import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/*Faça um programa que receba a temperatura média dos 6
primeiros meses do ano e armazene-as em uma lista.

Após isto, calcule a média semestral das temperaturas e
mostre todas as temperaturas acima desta média, e em que
mês elas ocorreram (mostrar o mês por extenso: 1 – Janeiro, 2
– Fevereiro e etc). */

public class ExTemperatura {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List <Integer> temperaturas = new ArrayList<>();
        int soma = 0;
        int temperatura = 0;

        for (int i = 1; i <= 6; i++) {
            System.out.println("Digite a temperatura do " + i  + "° mês");
            temperatura = scan.nextInt();
            soma += temperatura;
            temperaturas.add(temperatura);
        }

        double media = soma / 6;
        System.out.println("Media de temperatura = " + media);

        Iterator<Integer> iterator = temperaturas.iterator();
        int count = 1;
        while (iterator.hasNext()) {
            Integer temp = iterator.next();
            if (temp > media) {
                switch (count) {
                    case 1:
                    System.out.printf("1 - janeiro: " + temp);
                        break;
                    case 2:
                    System.out.printf("2 - fevereiro: " + temp);
                        break;
                    case 3:
                    System.out.printf("3 - março: " + temp);
                        break;
                    case 4:
                    System.out.printf("4 - abril: " + temp);
                        break;
                    case 5:
                    System.out.printf("5 - maio: " + temp);
                        break;
                    case 6:
                    System.out.printf("6 - junho: " + temp);
                        break;
                }
            }
            count++;
        }

    }
}

