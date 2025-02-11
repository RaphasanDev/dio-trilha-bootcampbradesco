package desafios.modelandoIphoneULM;

import desafios.modelandoIphoneULM.classes.Interfaces;


/**
 * 
 */
public class Iphone extends Interfaces{


	public static void main(String[] args) {
		Iphone meuIphone = new Iphone();

		// Testando ReprodutorMusical
		meuIphone.selecionarMusica("Minha Música Favorita");
		meuIphone.tocar();
		meuIphone.pausar();

		// Testando AparelhoTelefonico
		meuIphone.ligar("98655-0545");
		meuIphone.atender();
		meuIphone.iniciarCorreioVoz();

		// Testando NavegadorInternet
		meuIphone.exibirPagina("https://www.exemplo.com");
		meuIphone.adicionarNovaAba();
		meuIphone.atualizarPagina();
	}
	
	//Inicialmente a estrutura era para chamar a interface direto na classe main, mas para dar um pouco
	//complexidade criei um pacote para as interfaces e outro para uma classe que implementa todas elas
	//Assim a calsse main só chama os métodos sem precisar implementa-los.
	
	// Métodos do ReprodutorMusical
	/*public void tocar() {
		System.out.println("Reproduzindo música...");
	}

    //@Override
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
    }*/
}