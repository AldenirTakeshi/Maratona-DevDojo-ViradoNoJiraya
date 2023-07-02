package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Funcionario {

    public String nome;
    public int idade;
    public double[] salarios;

    public void imprimir() {
        System.out.println(this.nome);
        System.out.println(this.idade);

        if (salarios != null) {
            for (double salario : salarios) {
                System.out.println(salario + " ");
            }
            imprimeMediaSalario();

        }
    }

    public void imprimeMediaSalario() {
        if (salarios == null){
            return;
        }
        double media = 0;
        for (double salario : salarios) {
            media += salario;
        }
        media /= salarios.length;
        System.out.println("\nMedia Salarial: " + media);
    }
//        System.out.println(this.salario[0]);
//        System.out.println(this.salario[1]);
//        System.out.println(this.salario[2]);
}
