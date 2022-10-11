import java.util.Scanner;

public class Ex4 {
 public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int quantidadeNumeros;
    int numero = 0;
    int quantidadePares = 0, quantidadeImpares = 0;

    System.out.println("Quantidade de números: ");
    quantidadeNumeros = scan.nextInt();

    int count = 0;
    do {
        System.out.println("Número: ");
        numero = scan.nextInt();
        
        if (numero % 2 == 0) {
            quantidadePares++;
        } else {
            quantidadeImpares++;
        }

        count++;
    } while(count < quantidadeNumeros);

    System.out.println("Números pares: " + quantidadePares);
    System.out.println("Números impares: " + quantidadeImpares);
 }   
}
