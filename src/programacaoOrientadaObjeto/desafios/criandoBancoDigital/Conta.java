package programacaoOrientadaObjeto.desafios.criandoBancoDigital;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public abstract class Conta implements IConta {
    private static final int AGENCIA_PADRAO = 1;  // Número padrão da agência
    private static int SEQUENCIAL = 1;  // Contador estático para gerar números de conta sequenciais
    protected int agencia;  // Número da agência
    protected int numero;  // Número da conta
    protected double saldo;  // Saldo da conta
    protected Cliente cliente;  // Cliente associado à conta
    private Banco banco;  // Banco ao qual a conta está associada
    protected List<Transacao> historicoTransacoes = new ArrayList<>();  // Histórico de transações da conta

    // Construtor da classe Conta
    public Conta(Cliente cliente, Banco banco) {
        this.agencia = Conta.AGENCIA_PADRAO;  // Definir a agência padrão
        this.numero = Conta.SEQUENCIAL++;  // Gerar número de conta sequencial
        this.cliente = cliente;  // Associar o cliente à conta
        this.banco = banco;  // Associar a conta ao banco
        this.banco.adicionarConta(this);  // Adicionar a conta à lista de contas do banco
    }

    // Método getter para obter o número da agência
    public int getAgencia() {
        return agencia;
    }

    // Método getter para obter o número da conta
    public int getNumeroConta() {
        return numero;
    }

    // Método getter para obter o saldo da conta
    public double getSaldo() {
        return saldo;
    }
    
    // Método getter para obter o cliente associado à conta
    public Cliente getCliente() {
        return cliente;
    }

    // Método setter para definir o cliente associado à conta
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    // Método getter para obter o histórico de transações da conta
    public List<Transacao> getHistoricoTransacoes() {
        return historicoTransacoes;
    }

    // Implementação do método sacar da interface IConta
    @Override
    public void sacar(double valor) {
        this.saldo -= valor;  // Subtrair o valor do saldo
        historicoTransacoes.add(new Transacao("Saque", valor, LocalDate.now().toString()));  // Adicionar transação de saque ao histórico
    }

    // Implementação do método depositar da interface IConta
    @Override
    public void depositar(double valor) {
        this.saldo += valor;  // Adicionar o valor ao saldo
        historicoTransacoes.add(new Transacao("Depósito", valor, LocalDate.now().toString()));  // Adicionar transação de depósito ao histórico
    }

    // Implementação do método transferir da interface IConta
    @Override
    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);  // Sacar o valor da conta de origem
        contaDestino.depositar(valor);  // Depositar o valor na conta de destino
        historicoTransacoes.add(new Transacao("Transferência", valor, LocalDate.now().toString()));  // Adicionar transação de transferência ao histórico
    }

    // Método para imprimir o extrato da conta (a ser implementado)
    public void imprimirExtrato() {
        // Implementação futura
    }

    // Método protegido para imprimir informações comuns da conta
    protected void imprimirInfosComuns() {
        System.out.println(String.format("Cliente: %s", this.cliente.getNome()));
        System.out.println(String.format("Agencia: %d", this.agencia));
        System.out.println(String.format("Numero: %d", this.numero));
        System.out.println(String.format("Saldo: %.2f", this.saldo));
    }

    // Método protegido para imprimir o histórico de transações da conta
    protected void imprimirHistoricoTransacoes() {
        System.out.println("====== Histórico de Transações ======");
        for (Transacao transacao : historicoTransacoes) {
            System.out.println(String.format("%s - %s: %.2f", transacao.getData(), transacao.getTipo(), transacao.getValor()));
        }
    }
}
