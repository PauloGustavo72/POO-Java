package lista6;

public class Produto {
	private String nome;
	private int quantidade;
	private static int quantidadeTotalProdutos;
	
	public Produto() {
		setQuantidadeTotalProdutos(getQuantidadeTotalProdutos() + 1);
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public static int getQuantidadeTotalProdutos() {
		return quantidadeTotalProdutos;
	}

	public static void setQuantidadeTotalProdutos(int quantidadeTotalProdutos) {
		Produto.quantidadeTotalProdutos = quantidadeTotalProdutos;
	}
}
