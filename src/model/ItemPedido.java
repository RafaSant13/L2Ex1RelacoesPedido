package model;

public class ItemPedido {
	
	private int quantidade;
	private Produto produto;

	public ItemPedido() {
		this.quantidade = 0;
		this.produto = new Produto();
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

}
