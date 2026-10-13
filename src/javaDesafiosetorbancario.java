import java.util.Scanner;
//DESAFIO DIO
public class javaDesafiosetorbancario {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        String operacao = scan.nextLine();

        Boolean operacaovalida = false;

        operacaovalida = operacao.equals("DEPOSITO") || operacao.equals("SAQUE") || operacao.equals("TRANSFERENCIA");

            System.out.println(operacaovalida ? "VALID" : "INVALID");

        scan.close();
    }
}
