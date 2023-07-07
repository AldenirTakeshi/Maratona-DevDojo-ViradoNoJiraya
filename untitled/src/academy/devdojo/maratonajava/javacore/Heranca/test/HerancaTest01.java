package academy.devdojo.maratonajava.javacore.Heranca.test;

import academy.devdojo.maratonajava.javacore.Heranca.domain.Endereco;
import academy.devdojo.maratonajava.javacore.Heranca.domain.Funcionario;
import academy.devdojo.maratonajava.javacore.Heranca.domain.Pessoa;

public class HerancaTest01{
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua 3");
        endereco.setCep("012345-209");
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Toyohisa Shimazu");
        pessoa.setCpf("12345678990");
        pessoa.setEndereco(endereco);

        pessoa.imprimi();

        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Oda Nobunaga");
        funcionario.setCpf("123456");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(20000);
        System.out.println("------------------------");
        funcionario.imprimi();
    }
}
