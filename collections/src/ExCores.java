import java.util.*;

/* Crie um conjunto contendo as cores do arco-íris e:

Exiba todas as cores uma abaixo da outra

A quantidade de cores que o arco-íris tem

Exiba as cores em ordem alfabética

Exiba as cores na ordem inversa da que foi informada

Exiba todas as cores que começam com a letra ”v”

Remova todas as cores que não começam com a letra “v”

Limpe o conjunto

Confira se o conjunto está vazio*/

public class ExCores {
    public static void main(String[] args) {
        System.out.println("--\tOrdem aleatória\t---");
        Set <String> cores = new HashSet<>(){{
            add("Vermelho");
            add("Azul");
            add("Verde");
            add("Rosa");
            add("Roxo");
            add("Branco");
            add("Cinza");
        }};
        System.out.println(cores.toString());
        
        System.out.println("Exiba uma abaixo da outra: ");
        for (String cor : cores) {
            System.out.println(cor);
        }


        System.out.println("Exiba as cores em ordem alfabética: ");
        Set<String> cores2 = new TreeSet<>(cores);
        System.out.println(cores2);
        int i = 0;

        for (String cor2 : cores2) {
            i++;    
        }
        System.out.println("Quantidade de cores: " + i);

        System.out.println("Ordem inversa: ");
        List <String> coresReverse = new ArrayList(cores);
        Collections.reverse(coresReverse);
        System.out.println(coresReverse);


        System.out.println("Exiba as cores que começam com V");
        for (String cor: cores) {
            if(cor.startsWith("v") || (cor.startsWith("V"))) System.out.println(cor);
        }

        System.out.println("Remova as cores que não começam com V");
        Iterator<String> iterator = cores.iterator();
            
        while (iterator.hasNext()) {
            if(!iterator.next().startsWith("V"))  iterator.remove();
        }
        System.out.println(cores);

        System.out.println("Limpe o conjunto: ");
        cores.clear();

        System.out.println(cores);

        System.out.println(cores.isEmpty());
        }
    }



