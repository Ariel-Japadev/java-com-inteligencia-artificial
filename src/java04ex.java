import java.util.Scanner;

public class java04ex {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("o nome da primeira pessoa");
        String nome1 = scan.nextLine();
        System.out.println("a idade da primeira pessoa");
        int idade1 = scan.nextInt();
        scan.nextLine();
        System.out.println("o nome da segunda pessoa");
        String nome2 = scan.nextLine();
        System.out.println("a idade da segunda pessoa");
        int idade2 = scan.nextInt();

        int diferenca = idade1 - idade2;

        System.out.println("a diferença de idade é de "+ diferenca+ " anos");

        scan.close();
    }
}
