import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class OrdenandoSet {
    public static void main(String[] args) {
        System.out.println("--\tOrdem aleatória\t---");
        Set <Serie> minhasSeries = new HashSet<>(){{
            add(new Serie("got", "fantasia", 60));
            add(new Serie("dark", "drama", 60));
            add(new Serie("that '70s show", "comédia", 25));
        }};
        for (Serie serie : minhasSeries) System.out.println(serie.getNome() + "-" + serie.getGenero() + "-" + serie.getTempoEpisodio());

        System.out.println("--\tOrdem Inserção\t---");
        Set <Serie> minhasSeries1 = new LinkedHashSet<>(){{
            add(new Serie("got", "fantasia", 60));
            add(new Serie("dark", "drama", 60));
            add(new Serie("that '70s show", "comédia", 25));
        }};
        for (Serie serie : minhasSeries1) System.out.println(serie.getNome() + "-" + serie.getGenero() + "-" + serie.getTempoEpisodio());

        System.out.println("--\tOrdem natural (TempoEpisodio)\t---");
        Set<Serie> minhasSeries2 = new TreeSet<>(minhasSeries);
        System.out.println(minhasSeries2);

        System.out.println("--\tOrdem Nome/Gênero/TempoEpisodio\t---");
        Set<Serie> minhaSeries3 = new TreeSet<>(new ComparatorNomeGeneroTempoEpisodio());
        minhaSeries3.addAll(minhasSeries1);
        for (Serie serie : minhaSeries3) System.out.println(serie.getNome() + "-" + serie.getGenero() + "-" + serie.getTempoEpisodio());
        }
    }

    class Serie implements Comparable <Serie>{
        private String nome;
        private String genero;
        private Integer tempoEpisodio;
    


    public Serie(String nome, String genero, Integer tempoEpisodio) {
        this.nome = nome;
        this.genero = genero;
        this.tempoEpisodio = tempoEpisodio;
    }

    public String getNome() {
        return nome;
    }
    public String getGenero() {
        return genero;
    }
    public Integer getTempoEpisodio() {
        return tempoEpisodio;
    }


    @Override
    public String toString() {
        return "{" +
            " nome='" + getNome() + "'" +
            ", genero='" + getGenero() + "'" +
            ", tempoEpisodio='" + getTempoEpisodio() + "'" +
            "}";
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Serie)) {
            return false;
        }
        Serie serie = (Serie) o;
        return Objects.equals(nome, serie.nome) && Objects.equals(genero, serie.genero) && Objects.equals(tempoEpisodio, serie.tempoEpisodio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, genero, tempoEpisodio);
    }

    @Override
    public int compareTo(Serie serie){
        int tempoEpisodio = Integer.compare(this.getTempoEpisodio(), serie.getTempoEpisodio());
        if (tempoEpisodio != 0) return tempoEpisodio;
        return this.getGenero().compareTo(serie.getGenero());
        
    }
}

class ComparatorNomeGeneroTempoEpisodio implements Comparator<Serie> {
    @Override
    public int compare(Serie s1, Serie s2){
        int nome = s1.getNome().compareTo(s2.getNome());
        if (nome != 0) return nome;

        int genero = s1.getGenero().compareTo(s2.getGenero());
        if (genero != 0) return genero;

        return Integer.compare(s1.getTempoEpisodio(), s2.getTempoEpisodio());
    }
}