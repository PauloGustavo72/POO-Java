package lista5;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Agenda {
	private Scanner scanner = new Scanner(System.in);
	private List<Aluno> alunos = new ArrayList<>();
	private List<Professor> professores = new ArrayList<>();

	public void listarTodos() throws IOException {
		System.out.println("Lista de contatos de alunos: ");
		CadastrarBanco.leitorAluno();
		System.out.println("Lista de contato de professores: ");
		CadastrarBanco.leitorProfessor();
	}

	public void cadastrarAluno() throws IOException {
		Aluno a = new Aluno();
		a.pegaAluno(a);
	}

	public void excluirAluno() {
		String nome;
		System.out.println("Digite o nome que deseja excluir: ");
		nome = scanner.next();
		for (Aluno aluno : alunos) {
			if (aluno.getNome().equals(nome)) {
				alunos.remove(aluno);
				System.out.println(aluno.getNome() + " Excluido com sucesso.\n");
			}
		}
	}

	public void cadastrarProfessor() throws IOException {
		Professor p = new Professor();
		p.pegaProfessor(p);
	}

	public void excluirProfessor() {
		String nome;
		System.out.println("Digite o nome que deseja excluir: ");
		nome = scanner.next();
		for (Professor p : professores) {
			if (p.getNome().equals(nome)) {
				professores.remove(p);
				System.out.println(p.getNome() + " Excluido com sucesso.\n");
			}
		}
	}

	public void alteraProfessor() {
		System.out.println("Digite o nome do professor que deseja alterar:");
		String nome = scanner.next();
		for (Professor professor : professores) {
			if (professor.getNome().equals(nome)) {
				professor.editaProfessores();
			}
		}
	}

	public void alteraAlunos() {
		System.out.println("digite o nome do aluno que deseja alterar: ");
		String nome = scanner.next();
		for (Aluno aluno : alunos) {
			if (aluno.getNome().equals(nome))
				aluno.editaAluno();
		}
	}

	public void imprimeOpcoes() {
		System.out.println("1- Cadastrar Aluno");
		System.out.println("2- Cadastrar Professor");
		System.out.println("3- Excluir Aluno");
		System.out.println("4- Excluir Professor");
		System.out.println("5- Editar Aluno");
		System.out.println("6- Editar Professor");
		System.out.println("7- Listar tudo");
		System.out.println("0- Sair");
	}

}
