public class java010ex {
    public static void main(String[] args){

        for (var numero = 2 ; numero <= 10; numero++){
            if (numero % 2 == 0){
                continue;
            }
            System.out.println("numero"+ numero);
        }
    }
}
