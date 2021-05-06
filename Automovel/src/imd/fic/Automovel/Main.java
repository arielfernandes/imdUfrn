package imd.fic.Automovel;

import java.util.Scanner;

public class Main {
    public static class Veiculos {
        public String marcaDoFabricante;
        public String modelo;
        public int anoDeFabricacao;
        public int qtdPassageiros;
    }

    public static void main(String[] args) {
        // write your code here
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite a marca do seu primeiro veiculo");
        Veiculos v1 = lerVeiculos(leitor);
        System.out.println("Digite a marca do seu segundo veiculo");
        Veiculos v2 = lerVeiculos(leitor);
        System.out.println("----Seu primeiro veiculo é----");
        imprimirVeiculos(v1);
        System.out.println("----Seu segundo veiculo é----");
        imprimirVeiculos(v2);


    }
    public static Veiculos lerVeiculos(Scanner leitor) {
        Veiculos v = new Veiculos();
        System.out.println("Digite a marca do veiculo:");
        v.marcaDoFabricante = leitor.next();
        System.out.println("Digite o modelo: ");
        v.modelo = leitor.next();
        System.out.println("Digite o ano de fabricação: ");
        v.anoDeFabricacao = leitor.nextInt();
        System.out.println("Digite a qtd de passageiros: ");
        v.qtdPassageiros = leitor.nextInt();

        return v;

    }
    public static void imprimirVeiculos(Veiculos v) {
        System.out.println(v.marcaDoFabricante + " ," + v.modelo);
        System.out.println(v.anoDeFabricacao + " ," + v.qtdPassageiros);
    }
}