package programacaoOrientadaObjeto.desafios.criandoBancoDigital;

// Importação das classes necessárias
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Banco {
    private String nome;  // Nome do banco
    private List<Cliente> clientes = new ArrayList<>();  // Lista de clientes do banco
    private List<Conta> contas = new ArrayList<>();  // Lista de contas do banco

    // Método getter para obter o nome do banco
    public String getNome() {
        return nome;
    }

    // Método setter para definir o nome do banco
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Método getter para obter a lista de clientes do banco
    public List<Cliente> getClientes() {
        return clientes;
    }

    // Método getter para obter a lista de contas do banco
    public List<Conta> getContas() {
        return contas;
    }

    // Método para adicionar um cliente à lista de clientes do banco
    public void adicionarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    // Método para adicionar uma conta à lista de contas do banco
    public void adicionarConta(Conta conta) {
        contas.add(conta);
    }

    // Método para associar clientes com suas contas
    public Map<Cliente, List<Conta>> associarClientesComContas() {
        Map<Cliente, List<Conta>> associacao = new HashMap<>();  // Mapa para armazenar a associação entre clientes e contas

        // Loop para percorrer a lista de contas
        for (Conta conta : contas) {
            Cliente cliente = conta.getCliente();  // Obter o cliente associado à conta
            // Verificar se o cliente já está no mapa
            if (!associacao.containsKey(cliente)) {
                associacao.put(cliente, new ArrayList<>());  // Se não estiver, adicionar o cliente ao mapa com uma nova lista de contas
            }
            associacao.get(cliente).add(conta);  // Adicionar a conta à lista de contas do cliente no mapa
        }

        return associacao;  // Retornar o mapa com a associação entre clientes e contas
    }
}
