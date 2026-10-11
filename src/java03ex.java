import java.util.Scanner;

public class java03ex {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("qual é a base do retângulo");
        int lado1 = scan.nextInt();

        System.out.println("qual altura do retângulo");
        int lado2 = scan.nextInt();

        int area = lado1 * lado2;
        System.out.println("a area do retângulo é igual a "+area);

        scan.close();
    }
}

