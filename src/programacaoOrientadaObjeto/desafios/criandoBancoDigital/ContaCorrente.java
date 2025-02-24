package programacaoOrientadaObjeto.desafios.criandoBancoDigital;

public class ContaCorrente extends Conta {

    // Construtor da classe ContaCorrente
    public ContaCorrente(Cliente cliente, Banco banco) {
        super(cliente, banco);  // Chamar o construtor da classe mãe (Conta) passando cliente e banco
    }

    // Método para imprimir o extrato da Conta Corrente
    public void imprimirExtrato() {
        System.out.println("====== Extrato Conta Corrente ======");  // Imprimir cabeçalho do extrato
        super.imprimirInfosComuns();  // Chamar método da classe mãe para imprimir informações comuns
        imprimirHistoricoTransacoes();  // Chamar método para imprimir histórico de transações
    }
}
