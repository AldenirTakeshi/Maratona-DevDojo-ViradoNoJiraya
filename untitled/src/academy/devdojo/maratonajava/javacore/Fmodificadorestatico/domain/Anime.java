package academy.devdojo.maratonajava.javacore.Fmodificadorestatico.domain;

public class Anime {
    private String nome;
    private static int[] episodios;
    // 0- Bloco de inicialização é executado quando a JVM carregar a classe
    // 1- Alocamento espaço em memoria para o objeto
    // 2- Cada Atributo de classe é crado e inicializado com valores default ou que for
    // 3- Bloco de inicialização é executado
    // 4- Constructor é executado
    static {
        System.out.println("Dentro do bloco de inicialização");
        episodios = new int[100];
        for(int i=0;i< episodios.length ;i++){
            episodios[i] = i+1;
        }
    }
    static {
        System.out.println("Dentro do bloco de inicialização2");}
    static {
        System.out.println("Dentro do bloco de inicialização3");}

    public Anime(String nome) {
        this.nome = nome;
    }

    public Anime() {
        for(int episodios: Anime.episodios){
            System.out.print(episodios + " ");
        }
        System.out.println();
    }

    public String getNome() {
        return nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }
}
