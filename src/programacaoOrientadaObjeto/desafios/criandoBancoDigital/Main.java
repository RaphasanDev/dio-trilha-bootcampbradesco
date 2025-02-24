package programacaoOrientadaObjeto.desafios.criandoBancoDigital;

public class Main {

	public static void main(String[] args) {
		Cliente cliente = new Cliente();
		cliente.setNome("Raphael");
		Conta cc1 = new ContaCorrente(cliente);
		Conta cc2 = new ContaCorrente(cliente);
		Conta cp = new ContaPoupanca(cliente);

		cc1.imprimirExtrato();
		cc2.imprimirExtrato();
		
		cc1.depositar(100.0);
		cc1.transferir(10.0, cc2);
		
		cc1.imprimirExtrato();
		cc2.imprimirExtrato();
	}
}