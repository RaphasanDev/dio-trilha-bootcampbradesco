package pilares;



public class Carro {
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
}
