package programacaoOrientadaObjeto.collections.set.pesquisa;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class AgendaContatos {

	private Set<Contato> contatoSet;

	public AgendaContatos() {
		this.contatoSet = new HashSet<>();
	}

	public void adicionarContato(String nome, int numeroTelefone) {
		contatoSet.add(new Contato(nome, numeroTelefone));
	}

	public void exibirContatos() {
		System.out.println(contatoSet);
	}

	public Set<Contato> pesquisarPorNome(String nome) {
		Set<Contato> contatosPorNome = new HashSet<>();
		if (!contatoSet.isEmpty()) {
			for (Contato c : contatoSet) {
				if (c.getNome().contains(nome)) {
					contatosPorNome.add(c);
				}
			}
			return contatosPorNome;
		} else {
			throw new RuntimeException("O conjunto está vazio!");
		}
	}



	public Contato atualizarNumeroContato(String nome, int novoNumero) {
		Contato contatoAtualizado = null;
		for(Contato c : contatoSet) {
			if(c.getNome().equalsIgnoreCase(nome)) {
				c.setNumero(novoNumero);
				contatoAtualizado = c;
				break;
			}
		}
		return contatoAtualizado;
		
		
	}

	public void removerContato(String nome) {
	    List<Contato> contatoParaRemover = new ArrayList<>();
	    for (Contato c: contatoSet) {
	        if (c.getNome().contains(nome)) {
	            contatoParaRemover.add(c);
	        }
	    }
	    contatoSet.removeAll(contatoParaRemover);
	}
	
	


	public static void main(String[] args) {
		AgendaContatos agendaContatos = new AgendaContatos();

		//agendaContatos.exibirContatos();
		agendaContatos.adicionarContato("Raphael", 1198655);
		agendaContatos.adicionarContato("Raphael", 1198650);
		agendaContatos.adicionarContato("Raphael Musico", 1198656);
		agendaContatos.adicionarContato("Raphael Santos", 1198657);
		agendaContatos.adicionarContato("Raphael San", 1198658);
		agendaContatos.adicionarContato("Jaque San", 119865);
		agendaContatos.exibirContatos();
		//System.out.println(agendaContatos.pesquisarPorNome("San"));
		agendaContatos.exibirContatos();
		//agendaContatos.removerContato("San");
		agendaContatos.exibirContatos();
		agendaContatos.atualizarNumeroContato("Raphael Musico", 55550);
		agendaContatos.exibirContatos();
		System.out.println("Contato atualizado: " + agendaContatos.atualizarNumeroContato("Raphael", 55551));
		
	}
}

