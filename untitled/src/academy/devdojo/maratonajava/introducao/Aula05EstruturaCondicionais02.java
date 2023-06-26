package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturaCondicionais02 {
    public static void main(String[] args) {
        int idade = 14;
        String categoria;

        if(idade < 15){
            categoria = "Criança";
        } else if (idade >= 15 && idade <=18) {
            categoria = "Juvenil";
        }else{
            categoria = "Adulto";
        }
        System.out.println(categoria);
    }
}
