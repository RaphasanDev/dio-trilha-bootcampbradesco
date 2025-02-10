package pilares;

public class Autodromo {

    public static void main(String[] args) {
        Carro jeep = new Carro();
        jeep.setChassi("123456");
        jeep.ligar();
        System.out.println("Chassi: " + jeep.getChassi());
        jeep.desligar();

        Moto z400 = new Moto();
        z400.setChassi("654321");
        z400.ligar();
        System.out.println("Chassi: " + z400.getChassi());
        z400.desligar();

    }
}
