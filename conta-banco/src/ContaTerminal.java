import java.util.Random;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o nome do Cliente:");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, " + nomeCliente + " digite o número da Agência:");
        String agencia = scanner.nextLine();
        
        System.out.println("Por favor, " + nomeCliente + " digite o saldo:");
        double saldo = scanner.nextDouble();

        // Gerando número da conta automaticamente
        String numeroConta = gerarNumeroConta();

        String mensagem = String.format("Olá "+ nomeCliente + ", obrigado por criar uma conta em nosso banco! Sua agência é " + agencia + ", sua conta é" + numeroConta + " e seu saldo" + saldo +  " já está disponível para saque.");
        
        System.out.println(mensagem);

        scanner.close();
    }

    // Método para gerar o número da conta no formato 12345-6
    public static String gerarNumeroConta() {
        Random random = new Random();
        int numero = 10000 + random.nextInt(90000); // Gera um número entre 10000 e 99999
        int digito = random.nextInt(10); // Gera um dígito entre 0 e 9
        return String.format("%05d-%d", numero, digito);
    }
}

