package programacaoOrientadaObjeto.desafios.criandoBancoDigital;

public class Main {

	public static void main(String[] args) {

		Conta cc1 = new ContaCorrente();
		Conta cc2 = new ContaCorrente();
		Conta cp = new ContaPoupanca();

		cc1.imprimirExtrato();
		cc2.imprimirExtrato();
		
		cc1.depositar(100.0);
		cc1.transferir(10.0, cc2);
		
		cc1.imprimirExtrato();
		cc2.imprimirExtrato();
	}
}