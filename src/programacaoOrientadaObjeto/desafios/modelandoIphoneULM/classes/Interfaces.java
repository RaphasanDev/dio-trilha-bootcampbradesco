package programacaoOrientadaObjeto.desafios.modelandoIphoneULM.classes;

import programacaoOrientadaObjeto.desafios.modelandoIphoneULM.interfaces.AparelhoTelefonico;
import programacaoOrientadaObjeto.desafios.modelandoIphoneULM.interfaces.NavegadorInternet;
import programacaoOrientadaObjeto.desafios.modelandoIphoneULM.interfaces.ReprodutorMusical;

public class Interfaces implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {

	
	public void tocar() {
		System.out.println("Reproduzindo música...");
	}

    @Override
    public void pausar() {
        System.out.println("Música pausada.");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Música selecionada: " + musica);
    }

    // Métodos do AparelhoTelefonico
    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo chamada...");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz.");
    }

    // Métodos do NavegadorInternet
    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo página: " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada.");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Página atualizada.");
    }
}