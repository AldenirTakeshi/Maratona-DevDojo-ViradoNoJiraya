package academy.devdojo.maratonajava.introducao;

public class AtividadeTaxa {
    public static void main(String[] args) {
        double salario = 25000;
        double resultado;
        double TaxaImposto = 0.0970;


        if (salario <= 34713){
            resultado = salario * TaxaImposto;
        } else if (salario >= 34713 && salario <= 68508 ) {
            resultado  = salario * 0.3735;
        }else{
            resultado = salario * 0.4950;
        }

        System.out.println("O imposto a ser pago sera de: " + resultado);
    }
}
