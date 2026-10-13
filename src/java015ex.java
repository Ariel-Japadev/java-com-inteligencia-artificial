import java.util.Scanner;
//lista em ordem decrescente de numero pares e impares
public class java015ex {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("entre com um numero");
        int primeiroNumber = scan.nextInt();

        System.out.println("entre com o segundo numero");
        System.out.println("(atenção) ele deve ser maior que o primeiro numero");
        int segundoNumber = scan.nextInt();

        scan.nextLine();

        if (segundoNumber < primeiroNumber) {
            System.out.println("o segundo numero precisa ser maior que o primeiro");
            return;
        }
        System.out.println("escolha o que deseja listar digite (par) ou (impar)");
        String escolha = scan.nextLine();


        System.out.println("numeros classificados em ordem decrescente");

        for (int valor = segundoNumber; valor >= primeiroNumber; valor--) {

            if (escolha.equalsIgnoreCase("par") && valor % 2 == 0) {
                System.out.println(valor);

            } else if (escolha.equalsIgnoreCase("impar") && valor % 2 != 0) {
                System.out.println(valor);
            }
        }
        scan.close();
    }
}
