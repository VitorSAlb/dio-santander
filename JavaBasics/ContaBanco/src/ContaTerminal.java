import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor, digite a sua Agência: [ex: xxx-x]");
        String agencia = sc.nextLine();
        System.out.println("Por favor, digite o número da sua conta: [ex: xxxx]");
        int numero = sc.nextInt();
        sc.nextLine();
        System.out.println("Por favor, digite o nome do Cliente: ");
        String nome = sc.nextLine();
        System.out.println("Por favor, insira um saldo na sua conta: ");
        double saldo = sc.nextDouble();
        sc.close();
        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque", nome, agencia, numero, saldo);

    }
}
