import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int numeroDaConta;
        String agencia;
        String nomeDoCliente;
        float saldoDaConta;;
        System.out.println("Por favor, digite o número da sua conta:");
        numeroDaConta = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Por favor, digite a sua Agência:");
        agencia = entrada.nextLine();
        System.out.println("Por favor, digite o seu nome completo:");
        nomeDoCliente = entrada.nextLine();
        System.out.println("Por favor, digite o valor do seu saldo:");
        saldoDaConta = entrada.nextFloat();
        entrada.close();

        System.out.println("Olá " + nomeDoCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroDaConta + " e seu saldo R$ " + saldoDaConta + " já está disponível para saque.");
    }
}
