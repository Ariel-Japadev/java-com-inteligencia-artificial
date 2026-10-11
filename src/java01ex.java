import java.util.Scanner;

public class java01ex {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("qual é o seu nome?");
        String name = scan.nextLine();
        System.out.println("qual é o ano de nascimento?");
        int ano = scan.nextInt();
        int idade;
        if (ano > 2026) {
            System.out.println("esse ano não é valido");
        } else {
            idade = 2026 - ano;
            System.out.println("olá " + name + " voce tem " + idade + " anos");
        }
        scan.close();
    }
}
