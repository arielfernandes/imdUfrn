package imd.fic.JogoDaVelha;

import java.io.File;
import java.io.Serializable;
import java.util.Scanner;

public class jogoDaVelha {
    public static class Jogador implements Serializable {
        public String nome;
        public int vitorias;
        public int derrotas;
    }
    public static int jog;
    public static int[][] casa = new int[3][3];
    public static int linha, coluna, win;
    public static Scanner leitor = new Scanner(System.in);
    public static Jogador jogador1, jogador2;
    public static long inicio;
    public static Jogador[] jogadores = new Jogador[50];
    public static int quantidadeJogadores = 0;

    public static File arquivo = new File("ranking.obj");

}
