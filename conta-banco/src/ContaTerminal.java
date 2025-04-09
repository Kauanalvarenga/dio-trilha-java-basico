import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        System.out.println("Seja bem-vindo ao banco Digital");

        System.out.println("Por favor, digite os dados da conta a seguir: ");

        Scanner scanner = new Scanner(System.in);


        System.out.println("Por favor, digite o número da conta: ");
        int NumeroConta = scanner.nextInt();

        System.out.println("Por favor, digite o número da agência: ");
        double Agencia = scanner.nextDouble();

        System.out.println("Por favor, digite o nome do cliente: ");
        String NomeCliente = scanner.next();  

        System.out.println("Por favor, digite o saldo da conta: ");
        
        double Saldo = scanner.nextDouble();



        println("Olá " + NomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + Agencia + ", conta " + NumeroConta + " e seu saldo de R$" + Saldo + " já está disponível para saque.");
        
 

    }
}