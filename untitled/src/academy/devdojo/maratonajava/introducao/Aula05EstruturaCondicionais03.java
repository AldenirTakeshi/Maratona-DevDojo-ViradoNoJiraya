package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturaCondicionais03 {

    public static void main(String[] args) {
        double salario = 7000;
        String mensagemDoar = "Eu vou doar 500 pro DevDojo";
        String mensagemNãoDoar = "Ainda não tenho condições, mas vou ter!";

        // (condicao) ? verdadeiro : falso;
        String resultado = (salario > 5000) ? mensagemDoar : mensagemNãoDoar;
        //boolean possoComprar = salario > 5000 ? true : false;

        System.out.println(resultado);
    }
}
