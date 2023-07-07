package academy.devdojo.maratonajava.javacore.Heranca.test;

import academy.devdojo.maratonajava.javacore.Heranca.domain.Pessoa;

public class Funcionario2 extends Pessoa {
    public void imprime(){
        nome = "joao";
        System.out.println(this.nome);
    }
}
