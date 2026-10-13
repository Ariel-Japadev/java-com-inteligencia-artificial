import java.util.Scanner;

public class java012ex {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        var name = " ";
        while (true){
            System.out.println("informe seu nome");
            name = scan.nextLine();
            System.out.println(name);

            if (name.equalsIgnoreCase("exit")){
                break;
            }
        }
    }
}
