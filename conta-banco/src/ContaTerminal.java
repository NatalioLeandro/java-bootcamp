import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numero;
        String agencia;
        String nome_cliente;
        double saldo;

        System.out.println("Digite o número da conta: ");
        numero = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Digite o número da agência: ");
        agencia = scanner.next();
        scanner.nextLine();

        System.out.println("Digite o nome do cliente: ");
        nome_cliente = scanner.next();
        scanner.nextLine();

        System.out.println("Digite o saldo da conta: ");
        saldo = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Olá " + nome_cliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque");

        scanner.close();

    }

}
