import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String nome;
        int idade;

        
        while (true) {
            System.out.println("Nome: ");
            nome = scan.next();
            if(nome == "0"){
                break;
            }
            System.out.println("Idade: ");
            idade = scan.nextInt();        
        }
    }
}
