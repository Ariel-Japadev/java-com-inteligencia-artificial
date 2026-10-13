import java.util.Scanner;
//calculadora de (1 a 10)
public class java013ex {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("entre com um numero de 1 a 10");
        int numero = scan.nextInt();
        int constant1;

        if (numero >=1 && numero  <= 10) {
            System.out.println("tabuada de 1 ");
            for (constant1 = 1 ; constant1 <= 10 ; constant1++){
                int resultado = numero * constant1;
                System.out.println(numero + "x" + constant1 + "="+ resultado );
            }

        }

        scan.close();
    }
}