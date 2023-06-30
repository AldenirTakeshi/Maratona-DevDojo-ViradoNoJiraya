package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Estudante;

public class ImpressoraEstudante {
    public  void imprime(Estudante estudante) {

        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);

    }
}
