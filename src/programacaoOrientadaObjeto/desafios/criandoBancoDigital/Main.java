package programacaoOrientadaObjeto.desafios.criandoBancoDigital;

import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Banco banco = new Banco();  // Criar uma nova instância da classe Banco
        banco.setNome("Meu Banco Digital");  // Definir o nome do banco

        Cliente cliente1 = new Cliente("Raphael", banco);  // Criar um novo cliente e associá-lo ao banco
        Cliente cliente2 = new Cliente("Tayler", banco);  // Criar um novo cliente e associá-lo ao banco
        Cliente cliente3 = new Cliente("Timoty", banco);  // Criar um novo cliente e associá-lo ao banco

        Conta cc1 = new ContaCorrente(cliente1, banco);  // Criar uma nova Conta Corrente para o cliente1 e associá-la ao banco
        Conta cc2 = new ContaCorrente(cliente2, banco);  // Criar uma nova Conta Corrente para o cliente2 e associá-la ao banco
        Conta cp = new ContaPoupanca(cliente3, banco);  // Criar uma nova Conta Poupança para o cliente3 e associá-la ao banco

        /*
         * cc1.imprimirExtrato(); 
         * cc2.imprimirExtrato();
         */

        cc1.depositar(100.0);  // Depositar 100 na conta cc1
        cc1.transferir(10.0, cc2);  // Transferir 10 da conta cc1 para a conta cc2
        cc2.transferir(5.0, cp);  // Transferir 5 da conta cc2 para a conta cp

        cc1.imprimirExtrato(); // Imprimir o extrato da conta cc1
        cc2.imprimirExtrato(); // Imprimir o extrato da conta cc2
        cp.imprimirExtrato(); // Imprimir o extrato da conta cp, se desejar

        // Associar clientes com suas contas
        Map<Cliente, List<Conta>> associacao = banco.associarClientesComContas();

        // Imprimindo a associação de clientes com suas contas
        for (Map.Entry<Cliente, List<Conta>> entry : associacao.entrySet()) {
            System.out.println("Cliente: " + entry.getKey().getNome());
            for (Conta conta : entry.getValue()) {
                System.out.println("  Conta: " + conta.getNumeroConta() + " | Saldo: " + conta.getSaldo());
            }
        }
    }
}
