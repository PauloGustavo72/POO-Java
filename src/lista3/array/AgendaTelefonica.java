package lista3.array;

import java.util.Scanner;

public class AgendaTelefonica {

		private Pessoa[] pessoas;
		private Scanner scanner;
		
		
		public AgendaTelefonica() {
			pessoas = new Pessoa[5];
			scanner = new Scanner(System.in);
		}


		public void cadastrarPessoa(){
			for(int i = 0; i < pessoas.length; i++){
				if(pessoas[i] == null){
					System.out.println("\ninsira um nome para a pessoa: ");
					String nome = scanner.next();
					System.out.println("\ninsira o numero de telefone: ");
					String tel = scanner.next();
					System.out.println("\ninsira o email: ");
					String email = scanner.next();
					Pessoa nova = new Pessoa(nome, tel, email);
					pessoas[i] = nova;
					System.out.println("\nNovo contato adicionado\n");
					break;
				}
			}
		}

			
		public void imprimirOpcoes(){
			System.out.println("\nEscolha uma opção: \n");
			System.out.println("1 - listar contatos.\n");
			System.out.println("2 - incluir contatos. \n");
			System.out.println("3 - sair\n");
						
		}
		
		public void imprimirPessoas(){
			for (Pessoa pessoa : pessoas) {
				if(pessoa != null){
					System.out.println("\nNome: " +pessoa.getNome() + "\nTelefone: "
					+ pessoa.getTelefone() + "\nEmail: " + pessoa.getEmail());
				}
			}
		}
		
		public Pessoa[] getPessoas(){
			return pessoas;
		}
		
		public void setPessoas(Pessoa[] pessoas){
			this.pessoas = pessoas;
		}


}
