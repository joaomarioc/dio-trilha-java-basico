public class ExemploBreakContinue {
    public static void main(String[] args) {
        for(int numero = 1; numero <=10; numero ++){
            if(numero == 3 || numero == 8) {
                continue;
            }
            System.out.println(numero);

        }
    }
}
