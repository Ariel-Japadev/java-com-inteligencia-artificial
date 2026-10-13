import java.util.Scanner;

public class jaavaDesafiosetorbancario02 {
    public static void main(String[] args){
            Scanner scanner = new Scanner(System.in);

            String codigoInformado = scanner.nextLine();
            String codigoEsperado = scanner.nextLine();

            if (codigoInformado.equals(codigoEsperado)){
                System.out.println("ACESSO LIBERADO");
            }
            else {
                System.out.println("ACESSO NEGADO");
            }
            scanner.close();
        }
    }
