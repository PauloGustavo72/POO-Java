package lista4;
import java.util.Scanner;

public class Aluno extends Pessoa {
	Scanner scanner = new Scanner(System.in);

	private String numeroMatricula;
	
	@Override
	public String dadosFormatados() {
		String dadosFormatados = super.dadosFormatados();
		dadosFormatados = dadosFormatados + "\nMatrícula: " + getNumeroMatricula();
		return dadosFormatados;
	}

	public String getNumeroMatricula() {
		return numeroMatricula;
	}

	public void setNumeroMatricula(String numeroMatricula) {
		this.numeroMatricula = numeroMatricula;
	}
	
	public Aluno pegaAluno(Aluno a){
		System.out.println("Digite o nome: ");
		a.setNome(scanner.nextLine());
		System.out.println("Digite o email: ");
		a.setEmail(scanner.next());
		System.out.println("Digite o telefone: ");
		a.setTelefone(scanner.next());
		System.out.println("Digite o numero de matrícula: ");
		a.setNumeroMatricula(scanner.next());
		
		return a;
	}
	
	public void editaAluno(){
		System.out.println("1- Alterar nome.");
		System.out.println("2- Alterar telefone.");
		System.out.println("3- Alterar email.");
		System.out.println("4- Alterar numero de Matricula.");
		int aux = scanner.nextInt();
		switch(aux){
		case 1:{ 
			alteraNome();
			break;
		}
		case 2:{
			alteraTelefone();
			break;
		}
		case 3:{
			alteraEmail();
			break;
		}
		case 4:{
			alteranumeroMatricula();
			break;
		}
		
		}
		
	}
	
	public void alteranumeroMatricula(){
		System.out.println("Digite o novo numero: ");
		String numero = scanner.next();
		this.setNumeroMatricula(numero);
	}

}
