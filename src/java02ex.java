import java.util.Scanner;

public class java02ex {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("qual o primeiro lado do quadrado");
        int lado1 = scan.nextInt();

        int area = lado1 * lado1;
        System.out.println("a area do quadrado é igual a "+area);

        scan.close();
    }
}
