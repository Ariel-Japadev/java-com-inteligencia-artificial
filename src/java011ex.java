import java.util.Scanner;
//formas de trabalhar com while(enquanto)
public class java011ex {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        var name = "";
        while (!name.equalsIgnoreCase("exit")) {
            System.out.println("informe um nome");
            name = scan.next();
            System.out.println(name);
        }
    }
}