package academy.devdojo.maratonajava.javacore.Kenum.test;

import academy.devdojo.maratonajava.javacore.Kenum.domain.Cliente;
import academy.devdojo.maratonajava.javacore.Kenum.domain.TipoCliente;

public class ClienteTest01 {
    public static void main(String[] args) {
        Cliente cliente01 = new Cliente("Tsubasa", TipoCliente.PESSOA_FISICA);
        Cliente cliente02 = new Cliente("Tsubasa",TipoCliente.PESSOA_JURIDICA);
        Cliente cliente03 = new Cliente("Tsubasa",TipoCliente.PESSOA_FISICA);
        Cliente cliente04 = new Cliente("Tsubasa",TipoCliente.PESSOA_JURIDICA);
        System.out.println(cliente01);
        System.out.println(cliente02);
        System.out.println(cliente03);
        System.out.println(cliente04);
    }
}
