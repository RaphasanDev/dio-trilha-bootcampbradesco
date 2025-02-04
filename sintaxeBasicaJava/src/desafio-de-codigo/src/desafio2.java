
import java.util.Scanner;

public class desafio2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double saldo = scanner.nextDouble();

        // TODO: Implemente a classificação do cliente com base no saldo:
        String confortavel = "Confortavel";
        String negativado = "Negativado";
        String baixo = "Baixo";
        if (saldo < 0) {
            System.out.println(negativado);
        } else if (saldo >= 0 && saldo <= 500) {
            System.out.println(baixo);
        } else {
            System.out.println(confortavel);
        }
        scanner.close();

    }
}
