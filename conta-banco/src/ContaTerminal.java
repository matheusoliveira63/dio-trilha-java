import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Bem-vindo ao sistema de abertura de conta bancária!");
        System.out.println("Por favor, informe os dados solicitados abaixo:");
        
        // Solicitando e lendo os dados da conta
        System.out.print("Por favor, digite o número da Agência: ");
        String agencia = scanner.nextLine();
        
        System.out.print("Por favor, digite o número da Conta: ");
        int numero = scanner.nextInt();
        scanner.nextLine(); // Consumindo a quebra de linha pendente
        
        System.out.print("Por favor, digite o nome do Cliente: ");
        String nomeCliente = scanner.nextLine();
        
        System.out.print("Por favor, digite o saldo inicial: ");
        double saldo = scanner.nextDouble();
        
        // Fechando o scanner
        scanner.close();
        
        // Exibindo a mensagem de confirmação
        String mensagem = "Olá " + nomeCliente + 
                         ", obrigado por criar uma conta em nosso banco, " +
                         "sua agência é " + agencia + 
                         ", conta " + numero + 
                         " e seu saldo " + String.format("%.2f", saldo) + 
                         " já está disponível para saque";
        
        System.out.println("\n" + mensagem);
    }
}
    

