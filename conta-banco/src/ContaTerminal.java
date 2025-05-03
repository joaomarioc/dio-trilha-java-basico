import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args) {
        // Configurando o Locale para US para usar ponto como separador decimal
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Por favor, digite o número da Conta!");
        int numero = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha
        
        System.out.println("Por favor, digite o número da Agência!");
        String agencia = scanner.nextLine();
        
        System.out.println("Por favor, digite o nome do Cliente!");
        String nomeCliente = scanner.nextLine();
        
        System.out.println("Por favor, digite o saldo inicial!");
        // Permitindo tanto ponto quanto vírgula como separador decimal
        String saldoInput = scanner.nextLine().replace(',', '.');
        double saldo = Double.parseDouble(saldoInput);
        
        scanner.close();
        
        // Formatando a mensagem de saída
        String mensagem = "Olá " + nomeCliente + 
                         ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + 
                         ", conta " + numero + 
                         " e seu saldo " + String.format("%.2f", saldo) + 
                         " já está disponível para saque!";
        
        System.out.println(mensagem);
    }     
}
