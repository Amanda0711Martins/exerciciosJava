import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args){
        int numeroConta = 0;
        String agencia;
        String nomeCliente;
        float saldo = 0f;

        Scanner teclado = new Scanner(System.in);  

        System.out.println("Prezado Cliente, seja bem vindo !\nPor favor, digite o número da Agência: ");
        agencia = teclado.nextLine();

        System.out.println("Digite seu nome completo: ");
        nomeCliente = teclado.nextLine();

        System.out.println("Digite o número da Conta: ");
        numeroConta = teclado.nextInt();
      
        System.out.println("Digite o saldo da conta: ");
        saldo = teclado.nextFloat();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia +
        ", conta "+ numeroConta + " e seu saldo de R$ "+ saldo + " já está disponível para saque.");

        teclado.close();
}
                            }
