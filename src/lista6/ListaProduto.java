package lista6;

import java.util.Scanner;

public class ListaProduto {
	Produto p;
	Scanner entrada = new Scanner(System.in);
	public void cadastrarProduto(){
		p = new Produto();
		System.out.println("Digite o nome do produto:");
		p.setNome(entrada.next());
		System.out.println("Digite a quantidade: ");
		p.setQuantidade(entrada.nextInt());
	}
	
	public void editarProduto() {
		
	}
	
	public void removerProdutos() {
		
	}
}
