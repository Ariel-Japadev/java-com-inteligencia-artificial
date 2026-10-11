import java.util.Scanner;

public class Main{
    private final static String WELCOME_MENSAGGE = "olá qual é o seu nome";

    public static void main(String[] args){
        var scan = new Scanner(System.in);
        System.out.println(WELCOME_MENSAGGE);
        var name = scan.nextLine();
        System.out.println("informe sua idade");
        var age = scan.nextInt();
        System.out.println("seu nome é "+ name + " e sua idade é "+ age);


        scan.close();
    }
}