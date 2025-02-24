package programacaoOrientadaObjeto.desafios.criandoBancoDigital;

import java.util.List;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		Banco banco = new Banco();
		banco.setNome("Meu Banco Digital");

		Cliente cliente1 = new Cliente("Raphael", banco);
		Cliente cliente2 = new Cliente("Tayler", banco);
		Cliente cliente3 = new Cliente("Timoty", banco);

		Conta cc1 = new ContaCorrente(cliente1, banco);
		Conta cc2 = new ContaCorrente(cliente2, banco);
		Conta cp = new ContaPoupanca(cliente3, banco);

		/*
		 * cc1.imprimirExtrato(); cc2.imprimirExtrato();
		 */

		cc1.depositar(100.0);
		cc1.transferir(10.0, cc2);
		cc2.transferir(5.0, cp);

		cc1.imprimirExtrato(); // Aqui você vai imprimir o extrato da cc1
		cc2.imprimirExtrato(); // Aqui você vai imprimir o extrato da cc2
		cp.imprimirExtrato(); // Agora, imprima o extrato da conta poupança (cp), se quiser
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