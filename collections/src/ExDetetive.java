import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ExDetetive {
    public static void main(String[] args) {
        List <String> respostas = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        String resposta = "";

        System.out.println("Telefonou para a vítima?");
        resposta = scan.next();
        respostas.add(resposta.toLowerCase());
        System.out.println("Esteve no local do crime?");
        resposta = scan.next();
        respostas.add(resposta.toLowerCase());
        System.out.println("Mora perto da vítima?");
        resposta = scan.next();
        respostas.add(resposta.toLowerCase());
        System.out.println("Devia para a vítima?");
        resposta = scan.next();
        respostas.add(resposta.toLowerCase());
        System.out.println("Já trabalhou com a vítima?");
        resposta = scan.next();
        respostas.add(resposta.toLowerCase());

        int sim = 0;
        Iterator<String> contador = respostas.iterator();
        while(contador.hasNext()){
            String resp = contador.next();
            if(resp.contains("sim")) {
                sim ++;
            }
        }
        
        switch(sim) {
            case 2:
                System.out.println(">> SUSPEITA <<"); break;
            case 3:
            case 4:
                System.out.println(">> CÚMPLICE <<"); break;
            case 5:
                System.out.println(">> ASSASSINO <<"); break;
            default:
                System.out.println(">> INOCENTE <<"); break;
        }
    }
}
