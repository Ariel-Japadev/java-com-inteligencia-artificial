import java.util.Scanner;

public class java07ex {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        //segunda forma de trabalhar com switch case

        System.out.println("informe um numero de 1 a 7");
        var numeroDia = scan.nextInt();

        switch (numeroDia) {
            case 1, 7 -> System.out.println("domingo");
            case 2 -> System.out.println("segunda");
            case 3 -> System.out.println("terça");
            case 4 -> System.out.println("quarta");
            case 5 -> System.out.println("quinta");
            case 6 -> System.out.println("sexta");
            default -> System.out.println("opção invalida");
        }
    }
}
