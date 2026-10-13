import java.util.Scanner;
//DESAFIO DIO 01
public class javaDesafiosetorbancario01 {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        String operacao = scan.nextLine();

        Boolean operacaovalida = false;

        operacaovalida = operacao.equals("DEPOSITO") || operacao.equals("SAQUE") || operacao.equals("TRANSFERENCIA");

            System.out.println(operacaovalida ? "VALID" : "INVALID");

        scan.close();
    }
}
