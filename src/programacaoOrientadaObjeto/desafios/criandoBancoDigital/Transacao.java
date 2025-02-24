package programacaoOrientadaObjeto.desafios.criandoBancoDigital;

// Classe que representa uma transação bancária
public class Transacao {
    private String tipo;  // Tipo da transação (por exemplo, "Depósito", "Saque", "Transferência")
    private double valor;  // Valor da transação
    private String data;  // Data da transação

    // Construtor da classe Transacao
    public Transacao(String tipo, double valor, String data) {
        this.tipo = tipo;  // Definir o tipo da transação
        this.valor = valor;  // Definir o valor da transação
        this.data = data;  // Definir a data da transação
    }

    // Método getter para obter o tipo da transação
    public String getTipo() {
        return tipo;
    }

    // Método getter para obter o valor da transação
    public double getValor() {
        return valor;
    }

    // Método getter para obter a data da transação
    public String getData() {
        return data;
    }
}
