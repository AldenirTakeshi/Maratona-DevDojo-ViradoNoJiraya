package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTest {
    public static void main(String[] args) {
        Funcionario funcionario01 = new Funcionario();

        funcionario01.setNome("Sanji");
        funcionario01.setIdade(23);
//        funcionario01.salario = new double[3];
        funcionario01.setSalarios(new double[]{1200, 987.32, 2000});
//        funcionario01.salarios[0] = 1000;
//        funcionario01.salarios[1] = 2000;
//        funcionario01.salarios[2] = 2000;
        funcionario01.imprimir();
        funcionario01.getMedia();
        System.out.println("Média " + funcionario01.getMedia());

    }
}
