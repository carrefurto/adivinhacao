import java.util.Random;
import java.util.Scanner;

public class Adivinhacao {

    public static void main(String[] args) {
        Random randomizador = new Random();
        int numeroAleatorio = randomizador.nextInt(100) + 1;

        System.out.println("------------------------------------");
        System.out.println("          JOGO DE ADIVINHAÇÃO");
        System.out.println("------------------------------------");
        System.out.print("Chute um número entre 1-100: ");

        jogo (numeroAleatorio);

    }
    private static void jogo (int numeroAleatorio) {
        int tentativas = 10;
        Scanner leitor1 = new Scanner(System.in);
        do {
            int numeroEscolhido2 = leitor1.nextInt();

            if (numeroEscolhido2 == numeroAleatorio) {
                System.out.println("PARABÉNS!! VOCÊ ACERTOU O NÚMERO SECRETO!!");
                System.out.println("------------------------------------");
                break;
            } else if (numeroEscolhido2 < numeroAleatorio) {
                tentativas--;
                System.out.println("O número secreto é maior que o número escolhido Tentativas: " + tentativas);
            } else {
                tentativas--;
                System.out.println("O número secreto é menor que o número escolhido. Tentativas: " + tentativas);
            }
        } while (tentativas > 0);

        if (tentativas == 0) {
            System.out.println("QUE PENA, o número secreto era: " + numeroAleatorio);
            System.out.println("------------------------------------");
        }
        fimDeJogo();
    }
    private static void fimDeJogo (){
        Scanner leitorFinal = new Scanner(System.in);
        String resposta;
        do {
            System.out.println("FIM DE JOGO! Gostaria de Tentar Novamente? (Sim/Não)");
            resposta = leitorFinal.nextLine();
            if (resposta.equals("sim")){
                System.out.println("Recomeçando...");
            } else if (resposta.equals("não")) {
                System.out.println("encerrando...");
            } else {
                System.out.println("insira uma resposta válida por favor. (Sim/Nâo) ");
                resposta = leitorFinal.nextLine();
            }
        } while (resposta
    }
}
