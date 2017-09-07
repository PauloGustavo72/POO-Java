package lista3.vector;

import java.util.ArrayList;
import java.util.Scanner;


public class AgendaTelefonica {

		private ArrayList<Pessoa> pessoas;
		private Scanner scanner;
		
		
		public AgendaTelefonica() {
			pessoas = new ArrayList<Pessoa>();
			scanner = new Scanner(System.in);
		}


		public void cadastrarPessoa(){
				
					System.out.println("\ninsira um nome para a pessoa: ");
					String nome = scanner.next();
					System.out.println("\ninsira o numero de telefone: ");
					String tel = scanner.next();
					System.out.println("\ninsira o email: ");
					String email = scanner.next();
					Pessoa nova = new Pessoa(nome, tel, email);
					pessoas.add(nova);
					System.out.println("\nNovo contato adicionado\n");
					
				
			
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
		
		public ArrayList<Pessoa> getPessoas(){
			return pessoas;
		}
		
		public void setPessoas(ArrayList<Pessoa> pessoas){
			this.pessoas = pessoas;
		}


}
