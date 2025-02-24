package programacaoOrientadaObjeto.desafios.criandoBancoDigital;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Banco {
	private String nome;
    private List<Cliente> clientes = new ArrayList<>();
    private List<Conta> contas = new ArrayList<>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public List<Conta> getContas() {
        return contas;
    }

    public void adicionarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public void adicionarConta(Conta conta) {
        contas.add(conta);
    }

    public Map<Cliente, List<Conta>> associarClientesComContas() {
        Map<Cliente, List<Conta>> associacao = new HashMap<>();
        
        for (Conta conta : contas) {
            Cliente cliente = conta.getCliente();
            if (!associacao.containsKey(cliente)) {
                associacao.put(cliente, new ArrayList<>());
            }
            associacao.get(cliente).add(conta);
        }
        
        return associacao;
    }
}