import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Fatorial: ");
        int fatorial = scan.nextInt();
        int multiplicacao = 1;

        for (int i = fatorial; i >= 1; i--) {
           multiplicacao *= i;
        }
        System.out.println("!" + fatorial + " = " + multiplicacao);
    }
}
