import java.util.Scanner;
//divisor (ele só para quando o resultado da divisão do proximo numero resta 0
public class java016ex {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("digite o primeiro numero");
        int numeroAtual = scan.nextInt();

        while(true) {
            System.out.println("digite o proximo numero para dividir");
            int proximoNumero = scan.nextInt();

            if (proximoNumero == 0) {
                System.out.println("ERRO: não é possivel dividir por 0 ");
                break;
            }

            if (numeroAtual % proximoNumero != 0) {
                int resto = numeroAtual % proximoNumero;
                System.out.println("PARANDO: a divisão não é exata o resto é igual a " + resto);
                break;
            }
            numeroAtual = numeroAtual / proximoNumero;
            System.out.println("divisão exata! o novo numero atual é "+ numeroAtual);
        }
        scan.close();
    }
}
