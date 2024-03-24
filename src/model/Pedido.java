package model;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Pedido {
	
	private int numeroNota;
	private double valorTotal;
	private Lista<ItemPedido> itensPedido;

	public Pedido() {
		this.numeroNota = 0;
		this.valorTotal = 0;
		this.itensPedido = new Lista<ItemPedido>();
	}

	public int getNumeroNota() {
		return numeroNota;
	}

	public void setNumeroNota(int numeroNota) {
		this.numeroNota = numeroNota;
	}

	public double getValorTotal() throws Exception {
		int tamanho = itensPedido.size();
		for (int i = 0; i < tamanho; i++) {
			ItemPedido p = itensPedido.get(i);
			double quantidade = p.getQuantidade();
			valorTotal = valorTotal + (quantidade * p.getProduto().getValor());
		}
		return valorTotal;
	}
	
	public Lista<ItemPedido> getItensPedido() {
		return itensPedido;
	}
	
	public void adicionarItem(ItemPedido item) throws Exception {
		itensPedido.addLast(item);
	}
	
	
}
