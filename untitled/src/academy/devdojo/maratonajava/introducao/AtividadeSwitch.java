package academy.devdojo.maratonajava.introducao;

public class AtividadeSwitch {
    public static void main(String[] args) {
        byte dia = 7;
        String FimDeWeek;

        if(dia == 1 || dia == 7) {
            FimDeWeek = "Fim de semana";
        }else{
            FimDeWeek = "Dia Util";
        }

        switch (dia){

            case 1:
                System.out.println("Dom");
                System.out.println(FimDeWeek);
                break;
            case 2:
                System.out.println("Seg");
                System.out.println(FimDeWeek);
                break;
            case 3:
                System.out.println("Ter");
                System.out.println(FimDeWeek);
                break;
            case 4:
                System.out.println("Quar");
                System.out.println(FimDeWeek);
                break;
            case 5:
                System.out.println("Qui");
                System.out.println(FimDeWeek);
                break;
            case 6:
                System.out.println("Sex");
                System.out.println(FimDeWeek);
                break;
            case 7:
                System.out.println("Domingo");
                System.out.println(FimDeWeek);
                break;
            default:
                System.out.println("Inválido");
                break;
        }
    }
}
