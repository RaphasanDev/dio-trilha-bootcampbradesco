package candidatura;

import java.util.Random;

public class ProcessoSeletivo {

    /*CASE 1
    public static void main(String[] args) {

        analisarCandidato(1900.0);
        analisarCandidato(2200.0);
        analisarCandidato(2000.0);
    }

    static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.0;
        if (salarioBase > salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO");
        } else if (salarioBase == salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
        } else {
            System.out.println("AGUARDANDO O RESULTADO DOS DEMAIS CANDIDATOS");
        }
    }*/
 /*CASE 2
    public static void main(String[] args) {
        selecaoCandidatos();
    }

    static void selecaoCandidatos() {
        String[] candidatos = {"THEO", "THOMAS", "TAYLER", "TIMOTY", "RAPHAEL", "JAQUELINE", "TISBUGO", "MUMUA", "JHONY", "PAN"};

        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;
        while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length) {
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();
            System.out.println("O candidato " + candidato + " solicitou R$ " + salarioPretendido + " de salário");
            if (salarioBase >= salarioPretendido) {
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga");
                candidatosSelecionados++;
            }
            candidatoAtual++;
        }
    }

    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2800);
    }*/
 /*CASE 3
    public static void main(String[] args) {
        imprimirSelecionados();
    }

    static void imprimirSelecionados() {
        String[] candidatos = {"THEO", "THOMAS", "TAYLER", "TIMOTY", "RAPHAEL", "JAQUELINE"};
        System.out.println("Imprimindo a lista de candidatos informando o indice do elemento");

        for (int indice = 0; indice < candidatos.length; indice++) {
            System.out.println("o candidato de nº " + (indice + 1) + " é " + candidatos[indice]);
        }
        System.out.println("Forma abreviada de interação for each");

        for (String candidato: candidatos){
            System.out.println("O candidato slecionado foi "+ candidato);
        }
    }*/
//CASE 4
    public static void main(String[] args) {
        String[] candidatos = {"THEO", "THOMAS", "TAYLER", "TIMOTY", "RAPHAEL", "JAQUELINE"};
        for (String candidato : candidatos) {
            entrandoEmContato(candidato);

        }
    }

    static void entrandoEmContato(String candidato) {
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;
        do {
            atendeu = atender();
            continuarTentando = !atendeu;
            if (continuarTentando) 
                tentativasRealizadas++;
                else
                System.out.println("Contato realizado com sucesso");
            
        } while (continuarTentando && tentativasRealizadas < 3);
        if (atendeu) {
            System.out.println("Conseguimos contato com " + candidato + " na " + tentativasRealizadas + "ª tentativa!");
        } else {
            System.out.println("Não conseguimos contato com " + candidato + ", numero máximo de tentativas ralizadas: " + tentativasRealizadas);
        }
    }

    static boolean atender() {
        return new Random().nextInt(3) == 1;
    }
}
