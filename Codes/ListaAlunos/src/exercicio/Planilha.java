package exercicio;

import java.util.Scanner;

import entidades.Aluno;
import listas.Alunos;

public class Planilha {

	 public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Alunos turma = new Alunos();
		 int rm;
		 double media;
		int resp=1;
		
		do {
			System.out.println("\t RM: ");
			rm = sc.nextInt();
			System.out.println("\t Media: ");
			media = sc.nextDouble();
			Aluno aluno = new Aluno(rm, media);
			turma.insere(aluno);
			turma.apresenta();
			System.out.println("Deseja cadastrar mais 1 aluno? (1-sim)");
			resp = sc.nextInt();
			} while(resp==1);
		sc.close();
	}
}
