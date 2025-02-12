package programacaoOrientadaObjeto.collections.list.operacoesBasicas;

import java.awt.event.ItemListener;
import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

	private List<Item> itemList;
	public CarrinhoDeCompras() {
		this.itemList = new ArrayList<>();
	}

	public void adicionarItem(String nome, Double preco, int quantidade) {
		itemList.add(new Item(nome, preco, quantidade));
	}
	public void removerItem(String nome) {
		List<Item> itensParaRemover = new ArrayList<>();

		for(Item t : itemList) {
			if(t.getNome().equalsIgnoreCase(nome)) {
				itensParaRemover.add(t);
			}
		}itemList.removeAll(itensParaRemover);
	}
	public int exibirItens() {
		return itemList.size();
	}
	public Double calcularValorTotal() {
		Double valorTotal = 0.00;

		for(Item item : itemList) {

			valorTotal += item.getPreco() * item.getQuantidade();
		}
		return valorTotal;
	}

	public void obterDescricoesTarefas(){
		if(!itemList.isEmpty()) {
			System.out.println(itemList);
		}else {
			System.out.println("A lista está vazia");}
	}


	public static void main(String[] args) {
		CarrinhoDeCompras carrinhoDeCompra = new CarrinhoDeCompras();
		System.out.println("O total de produtos é: " + carrinhoDeCompra.exibirItens());
		System.out.println("O valor total do carrinho é: R$ "+ carrinhoDeCompra.calcularValorTotal());
		carrinhoDeCompra.adicionarItem("produto1", 1.00, 1);
		carrinhoDeCompra.adicionarItem("produto2", 2.00, 1);
		System.out.println("O total de produtos é: " + carrinhoDeCompra.exibirItens());
		System.out.println("O valor total do carrinho é: R$ "+ carrinhoDeCompra.calcularValorTotal());
		carrinhoDeCompra.adicionarItem("produto3", 3.00, 1);
		carrinhoDeCompra.adicionarItem("produto4", 4.00, 1);
		carrinhoDeCompra.adicionarItem("produto5", 5.00, 1);
		System.out.println("O total de produtos é: " + carrinhoDeCompra.exibirItens());
		System.out.println("O valor total do carrinho é: R$ "+ carrinhoDeCompra.calcularValorTotal());
		carrinhoDeCompra.removerItem("produto1");
		System.out.println("O total de produtos é: " + carrinhoDeCompra.exibirItens());
		System.out.println("O valor total do carrinho é: R$ "+ carrinhoDeCompra.calcularValorTotal());

		carrinhoDeCompra.obterDescricoesTarefas();


	}
}
