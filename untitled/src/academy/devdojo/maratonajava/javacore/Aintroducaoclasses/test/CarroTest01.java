package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.nome = "Crevolet";
        carro1.modelo = "Prisma";
        carro1.ano = 2012;

        carro2.nome = "Ford";
        carro2.modelo = "Ka";
        carro2.ano = 2022;

        carro1 = carro2;


        System.out.println("Carro:" + carro1.nome + " Modelo:" + carro1.modelo + " Ano:" + carro1.ano);

        System.out.println("\nCarro:" + carro2.nome + " Modelo:" + carro2.modelo + " Ano:" + carro2.ano);
    }
}
