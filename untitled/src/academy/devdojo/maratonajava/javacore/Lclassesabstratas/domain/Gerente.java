package academy.devdojo.maratonajava.javacore.Lclassesabstratas.domain;

public class Gerente extends Funcionario {
    @Override
    public String toString() {
        return "Gerente{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }

    @Override
    public void calculaBonus() {
        this.salario = this.salario  + this.salario * 0.2;
    }

    public Gerente(String nome, double salario) {
        super(nome, salario);
    }
}
