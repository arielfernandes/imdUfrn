package imd.fic.TempoDeJogo;

import java.util.Scanner;

public class Main {
    public static class Time {
        int totalS, totalB, totalA;
        int acertoS, acertoB, acertoA;
    }
    public static void main(String[] args) {
	// write your code here
        Scanner leitor = new Scanner(System.in);
        int jogadores;
        String nome;
        Time dados = new Time();

        jogadores = leitor.nextInt();

        dados.totalS = dados.totalB = dados.totalA = dados.acertoA = dados.acertoB = dados.acertoS  = 0;


        for(int i = 0; i < jogadores; i++) {
           nome = leitor.next();

            dados.totalS += leitor.nextInt();
            dados.totalB += leitor.nextInt();
            dados.totalA += leitor.nextInt();

            dados.acertoS += leitor.nextInt();
            dados.acertoB += leitor.nextInt();
            dados.acertoA += leitor.nextInt();

        }
        System.out.printf("Pontos de Saque: %.2f %%.\n", (double)dados.acertoS/dados.totalS* 100);
        System.out.printf("Pontos de Bloqueio: %.2f %%.\n", (double)dados.acertoB/dados.totalB* 100);
        System.out.printf("Pontos de Ataque: %.2f %%.\n", (double)dados.acertoA/dados.totalA* 100);

    }
}
