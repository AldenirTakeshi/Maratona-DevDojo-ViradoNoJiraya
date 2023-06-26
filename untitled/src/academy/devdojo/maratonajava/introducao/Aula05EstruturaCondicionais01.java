package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturaCondicionais01 {
    public static void main (String[] args){
        int idade = 15;
        boolean isAutotizadoComprarBebida = idade >= 18;
        // !
        if(isAutotizadoComprarBebida != false){
            System.out.println("Autorizado a comprar bebida alcólica");
        }else{
            System.out.println("Não Autorizado a comprar bebida alcólica");
        }

        if(!isAutotizadoComprarBebida){
            System.out.println("Não Autorizado a comprar bebida alcólica");
        }
    }
}
