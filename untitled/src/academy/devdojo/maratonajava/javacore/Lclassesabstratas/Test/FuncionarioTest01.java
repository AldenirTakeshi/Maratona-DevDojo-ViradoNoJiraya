package academy.devdojo.maratonajava.javacore.Lclassesabstratas.Test;

import academy.devdojo.maratonajava.javacore.Lclassesabstratas.domain.Desenvolvedor;
import academy.devdojo.maratonajava.javacore.Lclassesabstratas.domain.Funcionario;
import academy.devdojo.maratonajava.javacore.Lclassesabstratas.domain.Gerente;

public class FuncionarioTest01 {
    public static void main(String[] args) {
//    Funcionario funcionario = new Funcionario("Zoro",2000);
        Desenvolvedor desenvolvedor = new Desenvolvedor("Touya", 12000);
        Gerente gerente = new Gerente("Nami", 5000);
//        System.out.println(funcionario);
        System.out.println(gerente);
        System.out.println(desenvolvedor);
        gerente.imprime();
        desenvolvedor.imprime();
    }
}
