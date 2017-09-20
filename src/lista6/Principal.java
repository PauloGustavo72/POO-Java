package lista6;

import java.util.Scanner;

public class Principal {

	private static Scanner entrada;

	public static void main(String[] args) {
		int sair = 0;
		int opcao = 0;
		Opcoes o  = new Opcoes();
		entrada = new Scanner(System.in);
		ListaProduto lp = new ListaProduto();

		while (sair == 0) {
			switch (opcao) {
			case 0: {
				o.imprimeOpcoes();
				opcao = entrada.nextInt();
				break;
			}case 1:{
				lp.cadastrarProduto();
				opcao = 0;
				break;
			}case 2:{
				lp.editarProduto();
				opcao = 0;
				break;
			}case 3:{
				lp.removerProdutos();
				opcao = 0;
				break;
			}

			}
		}
	}

}
