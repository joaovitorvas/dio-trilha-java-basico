// IMPORTANTE: Para ler os dados de entrada do usuário, utilize a classe Scanner, 
// instanciando seu leitor da seguinte forma: "Scanner leitor = new Scanner(System.in);". 
// Por outro lado, para imprimir suas saídas, utilize System.out.print ou System.out.println. 

import java.util.*;

public class Ex5DIO {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int[] elementos = {64, 137, -16, 43, 67, 81, -90, 212, 10, 75};
        int nao = 0;

        int valorDoUsuario = leitor.nextInt();

        for (int i = 0; i < elementos.length; i++) {
            int elemento = elementos[i];
            if (valorDoUsuario == elemento) {
                System.out.print("Achei " + valorDoUsuario + " na posicao " + i);
            } else {
                nao++;
            }
        }
        if (nao == 10) {
            System.out.println("Numero " + valorDoUsuario + " nao encontrado! ");
        }

        //TODO: Retorne o valor do elemento no Array junto de sua respectiva posição.

    }
}