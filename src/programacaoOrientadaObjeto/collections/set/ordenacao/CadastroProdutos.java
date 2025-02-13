package programacaoOrientadaObjeto.collections.set.ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {


	private Set<Produto> produtoSet;

	public CadastroProdutos() {
		this.produtoSet = new HashSet<>();
	}


	public void adicionarProduto(long cod, String nome, double preco, int quantidade) {
		produtoSet.add(new Produto(cod, nome, preco, quantidade));
	}

	public Set<Produto> exibirProdutosPorNome() {
		Set<Produto> produtosPorNome = new TreeSet<>(produtoSet);
		return produtosPorNome;
	}

	public Set<Produto> exibirProdutosPorPreco() {
		Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
		produtosPorPreco.addAll(produtoSet);
		return produtosPorPreco;
	}

	public static void main(String[] args) {
		CadastroProdutos cadastroProduto = new CadastroProdutos();
		cadastroProduto.adicionarProduto(1l, "Carro 1", 6.00, 2);
		cadastroProduto.adicionarProduto(2l, "Carro 6", 3.00, 5);
		cadastroProduto.adicionarProduto(5l, "Carro 3", 10.00, 4);
		cadastroProduto.adicionarProduto(4l, "Carro 4", 5.00, 1);
		//System.out.println(cadastroProduto.produtoSet);
		System.out.println(cadastroProduto.exibirProdutosPorNome());
		System.out.println(cadastroProduto.exibirProdutosPorPreco());
	}
}


