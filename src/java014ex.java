import java.util.Scanner;
//calculadora de IMC
public class java014ex {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("informe sua altura");
        double altura = scan.nextDouble();
        System.out.println("informe seu peso");
        double peso = scan.nextDouble();

        double imc = peso / Math.pow(altura, 2);

        if (imc >= 40) {
            System.out.println("voce esta com obesidade III (mórbidade) , seu IMC é = " +imc);
        } else if (imc >= 35) {
            System.out.println("voce esta com obesidaade grau II (severa) , seu IMC é = "+ imc);
        } else if (imc >= 30) {
            System.out.println(" voce esta com obesidaade grau I , seu IMC é = "+ imc);
        } else if (imc >= 25) {
            System.out.println("voce esta levemente acima do peso  seu IMC é = " + imc);
        } else if (imc >= 18.6) {
            System.out.println("seu peso esta no ideal, e seu IMC é = " + imc);
        } else if (imc <= 18.5) {
            System.out.println("voce esta abaixo do peso, seu IMC é = " + imc);
        }
    }
}

