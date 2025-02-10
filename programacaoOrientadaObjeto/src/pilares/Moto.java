package pilares;

public class Moto extends Veiculo{
    @Override
    public void ligar(){
        System.out.println("MOTO LIGADA");
    }
    @Override
    public void desligar(){
        System.out.println("Moto desligada");
    }
}
