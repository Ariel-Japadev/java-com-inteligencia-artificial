import java.util.Scanner;

public class java06ex {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //primeira forma de trabalhar com switch case

        System.out.println("informe um numero de 1 a 7");
        var numeroDia = scan.next();

        switch (numeroDia) {

            case "6":
                System.out.println("sabado(fim de semana)");
                break;
            case "7":
                System.out.println("domingo(fim de semana)");
                break;
            case "1":
                System.out.println("segunda");
                break;
            case "2":
                System.out.println("terça");
                break;

            case "3":
                System.out.println("quarta");
                break;
            case "4":
                System.out.println("quinta");
                break;
            case "5":
                System.out.println("sexta");
                break;


            default:
                System.out.println("opção invalida");

        }
        scan.close();
    }
}
