package academy.devdojo.maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        // + - / *
        int numero01 = 10;
        int numero02 = 20;
        double resultado = numero01 / (double) numero02;
        System.out.println(resultado);

        // %
        int resto = 21 % 2;
        System.out.println(resto);

        // < > <= >= == !=
        boolean isDezMaiorQueVinte = 10 >= 20;
        boolean isDezMenorQueVinte = 10 <= 20;
        boolean isDezIgualQueDez = 10 == 10;
        boolean isDezIgualQueVinte = 10 == 20;
        boolean isDezDiferenteDeDez = 10 != 10;

        System.out.println("isDezMaiorQueVinte " + isDezMaiorQueVinte);
        System.out.println("isDezMenorQueVinte " + isDezMenorQueVinte);
        System.out.println("isDezIgualQueVinte " + isDezIgualQueDez);
        System.out.println("isDezIgualQueVinte " + isDezIgualQueVinte);
        System.out.println("isDezDiferenteDeDez " + isDezDiferenteDeDez);

        // && (AND) || (OR) !(NOT)

        int idade = 29;
        float salario = 3500F;
        boolean isDentroDaLeiMaiorQueTrinta = idade >= 30 && salario >= 4612;
        boolean idDentroDaLeiMenorQueTrinta = idade <= 30 && salario >= 3381;


        System.out.println("isDentroDaLeiMaiorQueTrinta "+isDentroDaLeiMaiorQueTrinta);
        System.out.println("idDentroDaLeiMenorQueTrinta "+idDentroDaLeiMenorQueTrinta);

        double ValorTotalContaCorrente = 200;
        double ValorTotalContaPoupança = 10000;
        float ValorPlaystation = 5000F;

        boolean isPlaystationCincoCompravel = ValorTotalContaCorrente > ValorPlaystation || ValorTotalContaPoupança > ValorPlaystation;
        System.out.println("isPlaystationCincoCompravel " + isPlaystationCincoCompravel);

        // = += -= *= /= %=
        double bonus = 1800;
        bonus += 1000; // 2800
        bonus -= 1000; // 1800
        bonus *= 2;
        bonus /= 2;
        bonus %= 2;
        System.out.println(bonus);

        // ++ --
        int contador =0;
        contador += 1;
        contador++;
        contador--;
        ++contador;
        --contador;

        System.out.println(contador);
    }
}
