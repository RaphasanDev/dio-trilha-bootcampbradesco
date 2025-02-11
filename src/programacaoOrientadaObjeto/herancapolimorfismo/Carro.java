package programacaoOrientadaObjeto.herancapolimorfismo;


public class Carro extends Veiculo{
    
    @Override
    public void ligar(){
        confereCambio();
        confereceCombustivel();
        System.out.println("CARRO LIGADO");
    }
    private void confereceCombustivel(){
        System.out.println("CONFERINDO COMBUSTIVEL");
    }
    private void confereCambio(){
        System.out.println("CONFERINDO CAMBIO");
    }

    @Override
    public void desligar(){
        System.out.println("Carro desligado");
    }

}
