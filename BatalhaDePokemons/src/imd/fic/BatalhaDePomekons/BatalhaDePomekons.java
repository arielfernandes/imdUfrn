package imd.fic.BatalhaDePomekons;

import java.util.Scanner;

public class BatalhaDePomekons {
    public static class Pomekon {
        int ataque;
        int defesa;
        int level;
        int bonus;

        public float valorGolpe() {
            float valorGolpe = (float)(ataque+defesa)/2;
            if(level % 2 == 0) {
                return valorGolpe + bonus;
            } else {
                return valorGolpe;
            }
        }
    }
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int qtdInstacias = leitor.nextInt();

        Pomekon pomekons[] = new Pomekon[qtdInstacias*2];

        for(int i = 0; i < qtdInstacias*2; i+=2) {
            int bonus = leitor.nextInt();

            //Pomekons de Dabriel
            pomekons[i] = new Pomekon();
            pomekons[i].ataque = leitor.nextInt();
            pomekons[i].defesa = leitor.nextInt();
            pomekons[i].level = leitor.nextInt();
            pomekons[i].bonus = bonus;

            //Pomekons de Guarte
            pomekons[i+1] = new Pomekon();
            pomekons[i+1].ataque = leitor.nextInt();
            pomekons[i+1].defesa = leitor.nextInt();
            pomekons[i+1].level = leitor.nextInt();
            pomekons[i+1].bonus = bonus;

        }

        for(int i = 0; i < qtdInstacias*2; i+=2) {
            if(pomekons[i].valorGolpe() > pomekons[i + 1].valorGolpe()) {
                System.out.println("Dabriel");
            }else if (pomekons[i].valorGolpe() < pomekons[i + 1].valorGolpe()) {
                System.out.println("Guarte");
            }else {
                System.out.println("Empate");
            }
        }
    }
}
