package programacaoOrientadaObjeto.collections.map.operacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
	private Map<String, Integer> agendaContatoMap;

	public AgendaContatos() {
		this.agendaContatoMap = new HashMap<>();
	}

	public void adicionarContato(String nome, Integer telefone) {

		agendaContatoMap.put(nome, telefone);
	}

	public void removerContatos(String nome) {
		if (!agendaContatoMap.isEmpty()) {
			agendaContatoMap.remove(nome);
		}

	}

	public Integer pesquisarPorNome(String nome) {
		Integer numeroPorNome = null;
		if (!agendaContatoMap.isEmpty()) {
		 numeroPorNome=	agendaContatoMap.get(nome);
			
		}
		return numeroPorNome;
		
	}
	 public void exibirContatos() {
		    if (!agendaContatoMap.isEmpty()) {
		      System.out.println(agendaContatoMap);
		    } else {
		      System.out.println("A agenda de contatos está vazia.");
		    }
		  }
	
	public static void main(String[] arqgs) {
		AgendaContatos agendaContatos = new AgendaContatos();
		
		agendaContatos.adicionarContato("Raphael", 986550544);
		agendaContatos.adicionarContato("Theo", 986550545);
		agendaContatos.adicionarContato("Thomas", 986550546);
		agendaContatos.adicionarContato("Tayler", 986550547);
		agendaContatos.adicionarContato("Timoty", 986550548);
		agendaContatos.adicionarContato("Jaqueline", 986550549);
		
		agendaContatos.exibirContatos();
		
		agendaContatos.removerContatos("Raphael");
		agendaContatos.exibirContatos();
		System.out.println("o numero é: " + agendaContatos.pesquisarPorNome("Tayler"));
		
	}

	
}
