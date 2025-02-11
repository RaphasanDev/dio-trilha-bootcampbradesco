package programacaoOrientadaObjeto.collections.list.operacoesBasicas;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 */
public class ListaTarefa {
	//atributo
	private List<Tarefa> tarefaList;

	public ListaTarefa() {
		this.tarefaList = new ArrayList<>(); 
	}

	public void adicionarTarefa(String descricao) {
		tarefaList.add(new Tarefa(descricao));
	}
	//para remover um item da lista vamos utilizar um laço primeiro para poder comparar o objeto recebido com os objetos na lista 
	//e quando encontrar o objeto correspondente, ai adicionaremos ele na lista de remocao
	public void removeTarefa(String descricao) {
		List<Tarefa> tarefasParaRemover = new ArrayList<>();

		for (Tarefa t : tarefaList) {
			if(t.getDescricao().equalsIgnoreCase(descricao)) {
				tarefasParaRemover.add(t);
			}
		}
		//utilizar o removeAll pois assim conseguimos verificar todas as possibilidade de correspondencias de uma unica vez
		tarefaList.removeAll(tarefasParaRemover);
	}
	public int obterNumeroTotalTarefas() {
		return tarefaList.size();

	}
	public void obterDescricoesTarefas(){
		if(!tarefaList.isEmpty()) {
			System.out.println(tarefaList);
		}else {
			System.out.println("A lista está vazia");
		}
		
	}

	
	public static void main(String[] args) {
		ListaTarefa listaTarefa = new ListaTarefa(); 
		System.out.println("O total de tarefas agora é: " + listaTarefa.obterNumeroTotalTarefas());
		listaTarefa.adicionarTarefa("Comprar comida");
		//listaTarefa.adicionarTarefa("Fazer comida");
		//listaTarefa.adicionarTarefa("Comer comida");
		//listaTarefa.adicionarTarefa("Guardar comida");
		//listaTarefa.adicionarTarefa("Comprar comida");
		
		
		System.out.println("O total de tarefas agora é: " + listaTarefa.obterNumeroTotalTarefas());
		
		listaTarefa.obterDescricoesTarefas();
		listaTarefa.removeTarefa("Comprar comida");
		
		System.out.println("O total de tarefas agora é: " + listaTarefa.obterNumeroTotalTarefas());
		listaTarefa.obterDescricoesTarefas();
		
		
	}
}

