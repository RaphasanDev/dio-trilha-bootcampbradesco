package programacaoOrientadaObjeto.collections.list.ordenacao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoa {

		private List<Pessoa> pessoaList;
		
		public OrdenacaoPessoa() {
			this.pessoaList = new ArrayList<>();
		}
		public void adicionarPessoa(String nome, int idade, double altura) {
			pessoaList.add(new Pessoa(nome, idade, altura));
		}
		
		public List<Pessoa> ordenarPorIdade() {
			List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoaList);
			Collections.sort(pessoasPorIdade);
			return pessoasPorIdade;
			
		
		}
		public List<Pessoa> ordenarPorAltura(){
			List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoaList);{
				Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
			}
			return pessoasPorAltura;
		}

		public static void main(String args[]) {
			OrdenacaoPessoa ordenacaoPessoa = new OrdenacaoPessoa();
			ordenacaoPessoa.adicionarPessoa("Nome 1", 21, 1.55);
			ordenacaoPessoa.adicionarPessoa("Nome 2", 23, 1.54);
			ordenacaoPessoa.adicionarPessoa("Nome 3", 25, 1.53);
			ordenacaoPessoa.adicionarPessoa("Nome 4", 22, 1.52);
			ordenacaoPessoa.adicionarPessoa("Nome 5", 24, 1.51);
			
			System.out.println(ordenacaoPessoa.ordenarPorIdade());
			System.out.println(ordenacaoPessoa.ordenarPorAltura());
		}

}

