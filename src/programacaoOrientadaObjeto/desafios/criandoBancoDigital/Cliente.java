package programacaoOrientadaObjeto.desafios.criandoBancoDigital;

public class Cliente {
    protected String nome;  // Nome do cliente
    private Banco banco;  // Banco ao qual o cliente está associado

    // Construtor da classe Cliente
    public Cliente(String nome, Banco banco) {
        this.nome = nome;  // Definir o nome do cliente
        this.banco = banco;  // Associar o cliente ao banco
        this.banco.adicionarCliente(this);  // Adicionar o cliente à lista de clientes do banco
    }

    // Método getter para obter o nome do cliente
    public String getNome() {
        return nome;
    }

    // Método setter para definir o nome do cliente
    public void setNome(String nome) {
        this.nome = nome;
    }
}
