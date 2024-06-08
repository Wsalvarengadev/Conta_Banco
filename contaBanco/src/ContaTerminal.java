import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        int numero;
        String agencia, nomeCliente;
        double saldo;

        System.out.print("Por favor entre com número da conta: ");
        numero = input.nextInt();
        System.out.print("Por favor entre com a agencia: ");
        agencia = input.next();
        System.out.print("Por favor entre com nome do cliente: ");
        input.nextLine();
        nomeCliente = input.nextLine();
        System.out.print("Por favor entre com saldo: ");
        saldo = input.nextDouble();
        
        System.out.println();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta:%d e2134 seu saldo:%.2f já está disponivel pra saque", nomeCliente, agencia, numero, saldo); 


    }
}
