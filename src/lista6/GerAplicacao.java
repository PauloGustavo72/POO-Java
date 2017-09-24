package lista6;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GerAplicacao {

	List<Produto> produtos = new ArrayList<>();

	public void cadastrarProduto() throws IOException {

		String nome = Inputs.pegaNome();

		if (GerProdutos.descobreIndex(produtos, nome) >= 0) {
			System.out.println("Produtos ja existente");
			GerProdutos.atualizaProduto(produtos, nome);
		}

		else {
			produtos.add(new Produto(nome, Inputs.pegaQuantidade()));
			System.out.println("Produto Adicionado com Sucesso");
		}
		
		Serializacao.salvar(produtos);

	}

	public void atualizarProduto() throws IOException {

		String nome = Inputs.pegaNome();

		if (GerProdutos.descobreIndex(produtos, nome) >= 0) {
			GerProdutos.atualizaProduto(produtos, nome);
			Serializacao.salvar(produtos);
		}

		else {
			System.out.println("Produto Nao existente");
		}
		
	}

	
	public void removerProduto() throws IOException {

		String nome = Inputs.pegaNome();

		if (GerProdutos.descobreIndex(produtos, nome) >= 0) {
			produtos.remove(GerProdutos.descobreIndex(produtos, nome));
			Serializacao.salvar(produtos);
		}

		else {
			System.out.println("Produto Inexistente");
		}

	}

	public void adicionarQuantidade() throws IOException {

		String nome = Inputs.pegaNome();

		if (GerProdutos.descobreIndex(produtos, nome) >= 0) {
			int aux = produtos.get(GerProdutos.descobreIndex(produtos, nome)).getQuantidade();
			produtos.get(GerProdutos.descobreIndex(produtos, nome)).setQuantidade(aux+Inputs.pegaQuantidade());
			Serializacao.salvar(produtos);
		} else {
			System.out.println("Produto Inexistente");
		}

	}

	public void reduzirQuantidade() throws IOException {

		String nome = Inputs.pegaNome();

		if (GerProdutos.descobreIndex(produtos, nome) >= 0) {
			int aux = produtos.get(GerProdutos.descobreIndex(produtos, nome)).getQuantidade();
			produtos.get(GerProdutos.descobreIndex(produtos, nome)).setQuantidade(aux-Inputs.pegaQuantidade());
			Serializacao.salvar(produtos);
		} else {
			System.out.println("Produto Inexistente");
		}

	}

	public void listarTodos() throws ClassNotFoundException, IOException {
		produtos = Serializacao.ler();
		for (Produto produto : produtos) {
			System.out.println(produto.getNome() + "   "  + produto.getQuantidade() );
		}
	}



	

}