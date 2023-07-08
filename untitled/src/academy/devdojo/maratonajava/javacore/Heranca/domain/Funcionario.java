package academy.devdojo.maratonajava.javacore.Heranca.domain;

public class Funcionario extends Pessoa {

    private double salario;

    static{
        System.out.println("Dentro do bloco statico Funcionario");
    }
    {
        System.out.println("Bloco de Funcionario 1 ");
    }
    {
        System.out.println("Bloco de Funcionario 2");
    }

    public Funcionario(String nome){
        super(nome);
        System.out.println("Dentro do construtor Funcionario");

    }

    public void imprimi(){
        super.imprimi();
        System.out.println(this.salario);
    }

    public void relatorioDePagamento(){
        System.out.println("Eu " + this.nome + " recebi o salario de " + this.salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
