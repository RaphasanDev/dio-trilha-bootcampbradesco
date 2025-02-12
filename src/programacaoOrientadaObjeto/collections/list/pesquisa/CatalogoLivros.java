package programacaoOrientadaObjeto.collections.list.pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
	private List<Livro> livroList;

	public CatalogoLivros() {
		this.livroList = new ArrayList<>();
	}
	public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
		livroList.add(new Livro(titulo, autor, anoPublicacao));
		System.out.println("O Livro " + titulo + " foi adicionado do catalogo com sucesso");
	}
	public List<Livro> pesquisarPorAutor(String autor) {
		List<Livro> livrosPorAutor = new ArrayList<Livro>();
		if(!livroList.isEmpty()) {
			for(Livro l : livroList) {
				if(l.getAutor().equalsIgnoreCase(autor)) {
					livrosPorAutor.add(l);
				}
			}
		}
		return livrosPorAutor;

	}
	public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) {
		List<Livro> livrosPorIntervaloAno = new ArrayList<Livro>();

		if(!livroList.isEmpty()) {
			for(Livro l : livroList) {
				if(l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal) {
					livrosPorIntervaloAno.add(l);
				}
			}
		}
		return livrosPorIntervaloAno;
	}
	public Livro pesquisarPorTitulos(String titulo){
		Livro livroPorTitulo = null;
		if(!livroList.isEmpty()) {
			for(Livro l : livroList) {
				if(l.getTitulo().equalsIgnoreCase(titulo)) {
					livroPorTitulo = l;

				}
			}
		}return livroPorTitulo;
	}

	public void exibirCatalogo() {
		if(livroList.isEmpty()) {
			System.out.println("Catalogo vazio.");
		}else {
			for(Livro l : livroList) {
				System.out.println("\n" + l);
			}
		}

	}

	public static void main(String[] args) {
		CatalogoLivros catalogoLivros = new CatalogoLivros();
		//catalogoLivros.exibirCatalogo();
		catalogoLivros.adicionarLivro("História 1","Autor A", 2020);
		catalogoLivros.adicionarLivro("História 2","Autor B", 2021);
		catalogoLivros.adicionarLivro("História 3","Autor A", 2022);
		catalogoLivros.adicionarLivro("História 4","Autor D", 2023);
		catalogoLivros.adicionarLivro("História 5","Autor E", 2024);
		catalogoLivros.adicionarLivro("História 2","Autor F", 2025);
		catalogoLivros.adicionarLivro("História 7","Autor G", 2025);
		catalogoLivros.exibirCatalogo();
		//System.out.println(catalogoLivros.pesquisarPorAutor("Autor A"));
		//System.out.println(catalogoLivros.pesquisarPorTitulos("História 2"));
		//System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(2020, 2025));
	}
}
