package academy.devdojo.maratonajava.javacore.Kenum.domain;

public enum TipoCliente {
    PESSOA_FISICA(1,"Pessoa Física"),
    PESSOA_JURIDICA(2,"Pessoa Jurídica");

    public int valor;
    public String nomeRelatorio;
    TipoCliente(int valor, String nomeRelatorio) {
    this.valor = valor;
    this.nomeRelatorio = nomeRelatorio;
    }


    public int getValor() {
        return valor;
    }

    public String getNomeRelatorio() {
        return nomeRelatorio;
    }

    public void setNomeRelatorio(String nomeRelatorio) {
        this.nomeRelatorio = nomeRelatorio;
    }
}
