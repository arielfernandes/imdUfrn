package imd.fic.Alunos;

import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner leitor = new Scanner(System.in);
        Q3i aluno = new Q3i();
        System.out.println("Digite o nome do aluno");
        aluno.nome=leitor.nextLine();
        System.out.println("Digite a serie de "+aluno.nome);
        aluno.serie=leitor.nextInt();
        System.out.println("Digite a turma");
        aluno.turma=leitor.nextInt();
        System.out.println("Digite o numero de presencas");
        aluno.presenca=leitor.nextInt();
        System.out.println("Digite o rendimento do aluno");
        aluno.rendimento=leitor.nextFloat();
        imprimir(aluno);

    }
    public static void imprimir(Q3i i){
        System.out.println("Dados do aluno");
        System.out.println("Nome"+i.nome);
        System.out.println("Serie"+i.serie);
        System.out.println("Turma"+i.turma);
        System.out.println("Presenças"+i.presenca);
        System.out.println("Rendimento"+i.rendimento);
    }
}