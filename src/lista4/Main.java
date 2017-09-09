package lista4;
import java.util.Scanner;

public class Main {

	private static Scanner scanner;

	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		Agenda a = new Agenda();
		

		
		int sair = 0;
		int opcao = 0;

		while (sair == 0) {
			switch (opcao) {
			case 0: {
				a.imprimeOpcoes();
				opcao = scanner.nextInt();
				break;
			}
			case 1: {
				a.cadastrarAluno();
				opcao = 0;
				break;
			}
			case 2:{
				a.cadastrarProfessor();
				opcao = 0;
				break;
			}
			case 3:{
				a.excluirAluno();
				opcao = 0;
				break;
			}
			case 4:{
				a.excluirProfessor();
				opcao = 0;
				break;
			}
			case 5:{
				a.alteraAlunos();
				opcao = 0;
				break;
				
			}
			case 6:{
				a.alteraProfessor();
				opcao = 0;
				break;
			}
			case 7:{
				a.listarTodos();
				opcao = 0;
				break;
			}
			}

		}

	}
}
