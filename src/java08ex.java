import java.util.Scanner;

public class java08ex {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        //segunda forma de trabalhar com switch case

        System.out.println("informe um numero de 1 a 7");
        var numeroDia = scan.nextInt();

        var message = switch (numeroDia) {
        case 1, 7 ->  ("final de semana");
            case 2 -> ("segunda");
            case 3 -> ("terça");
            case 4 -> ("quarta");
            case 5 -> ("quinta");
            case 6 -> ("sexta");
            default -> ("opção invalida");
        };
        System.out.println(message);

        scan.close();
    }
}
