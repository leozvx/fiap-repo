package exercicio5;

import java.util.Scanner;

import filas.FilaString;

public class Consultorio {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		FilaString filaPacientes = new FilaString();
		filaPacientes.Init();
		int opcao = 0;
		do {
			System.out.println("0 - Encerrar atendimento");
			System.out.println("1 - Inserir paciente na fila");
			System.out.println("2 - Atender paciente");
			System.out.println("Opcao: ");
			opcao = teclado.nextInt();
			switch (opcao) {
			case 0:
				break;
			case 1:
				System.out.println("Digite o nome do paciente: ");
				filaPacientes.Enqueue(teclado.next());
				break;
			case 2:
				System.out.println("Paciente: " + filaPacientes.first() + " foi para o atendimento: ");
				filaPacientes.Dequeue();
				break;
			default:
				System.out.println("Opcao Invalida!\n");
			}
		} while (opcao != 0);
		teclado.close();
	}
		
	}
	

