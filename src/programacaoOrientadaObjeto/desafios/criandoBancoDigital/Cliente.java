package programacaoOrientadaObjeto.desafios.criandoBancoDigital;

public class Cliente {
    protected String nome;
    private Banco banco;

    public Cliente(String nome, Banco banco) {
        this.nome = nome;
        this.banco = banco;
        this.banco.adicionarCliente(this);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}