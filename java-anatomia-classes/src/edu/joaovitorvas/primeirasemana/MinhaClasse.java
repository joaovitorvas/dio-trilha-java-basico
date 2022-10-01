package edu.joaovitorvas.primeirasemana;
// public class MinhaClasse {
//     public static void main(String [] args) {
//         System.out.println("Minha primeira classe");

//         // Variavel
//         int anoAtual = 2021;
//         anoAtual = 2022;
//         // Constante
//         final String BR = "Brasil";

//         System.out.println("O ano do " + BR + " é " + anoAtual);


//         int idade = 16;
//         String nome = "João Vitor";
//         boolean vddOuFalsa = nome == "João Vitor";

//         System.out.println(vddOuFalsa);
//         System.out.println("Meu nome é " + nome + " e tenho " + idade + " Anos!");
//     }
// }


public class MinhaClasse{
    public  static void main(String [] args){
        String primeiroNome = "João Vitor";
        String segundoNome = "Vasconcelos";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        System.out.println(nomeCompleto);
    }   

public static String nomeCompleto (String primeiroNome, String segundoNome) {
    return primeiroNome.concat(" ").concat(segundoNome);
}
}