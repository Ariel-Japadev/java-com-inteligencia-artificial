import java.util.Scanner;

public class java05ex {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("qual é o seu nome? ");
        var name = scan.nextLine();

        System.out.println("qual é sua idade ? ");
        var age = scan.nextInt();
        scan.nextLine();

        System.out.println("voce é emancipado S/N ? ");
        var emancipated = scan.nextLine().equalsIgnoreCase("s");

        var canDrive = (age >= 18 || age >= 16 && emancipated);
        var mensage = "";
        if (canDrive) {
            mensage = name + " voce pode dirigir";
        }
        else {
            mensage = name + " voce não pode dirigir";
        }
        System.out.println(mensage);
        System.out.println("fim da execução");
    }
}
