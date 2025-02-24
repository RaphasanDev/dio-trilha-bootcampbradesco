package programacaoOrientadaObjeto.desafios.criandoBancoDigital;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public abstract class Conta implements IConta {
    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;
    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;
    private Banco banco;
    protected List<Transacao> historicoTransacoes = new ArrayList<>();

    public Conta(Cliente cliente, Banco banco) {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = Conta.SEQUENCIAL++;
        this.cliente = cliente;
        this.banco = banco;
        this.banco.adicionarConta(this);
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumeroConta() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }
    
    public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public List<Transacao> getHistoricoTransacoes() {
        return historicoTransacoes;
    }

    @Override
    public void sacar(double valor) {
        this.saldo -= valor;
        historicoTransacoes.add(new Transacao("Saque", valor, LocalDate.now().toString()));
    }

    @Override
    public void depositar(double valor) {
        this.saldo += valor;
        historicoTransacoes.add(new Transacao("Depósito", valor, LocalDate.now().toString()));
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
        historicoTransacoes.add(new Transacao("Transferência", valor, LocalDate.now().toString()));
    }

    public void imprimirExtrato() {
        
    }

    protected void imprimirInfosComuns() {
        System.out.println(String.format("Cliente: %s", this.cliente.getNome()));
        System.out.println(String.format("Agencia: %d", this.agencia));
        System.out.println(String.format("Numero: %d", this.numero));
        System.out.println(String.format("Saldo: %.2f", this.saldo));
    }

    protected void imprimirHistoricoTransacoes() {
        System.out.println("====== Histórico de Transações ======");
        for (Transacao transacao : historicoTransacoes) {
            System.out.println(String.format("%s - %s: %.2f", transacao.getData(), transacao.getTipo(), transacao.getValor()));
        }
    }
}