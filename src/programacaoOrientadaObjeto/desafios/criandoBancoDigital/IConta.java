package programacaoOrientadaObjeto.desafios.criandoBancoDigital;

// Interface que define os métodos das contas
public interface IConta {

    // Método para sacar um valor da conta
    public void sacar(double valor);

    // Método para depositar um valor na conta
    public void depositar(double valor);

    // Método para transferir um valor para outra conta
    public void transferir(double valor, Conta contaDestino);
}
