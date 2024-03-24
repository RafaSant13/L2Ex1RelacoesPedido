package view;

import model.ItemPedido;
import model.Lista;
import model.Pedido;
import model.Produto;

public class Principal {

	public static void main(String[] args) {
		Produto p1 = new Produto();
		Produto p2 = new Produto();
		
		p1.setCodigo(1);
		p1.setValor(5.5);
		p1.setDescricao("Pão de Forma");
		
		p2.setCodigo(2);
		p2.setValor(3);
		p2.setDescricao("Bolacha");
		
		ItemPedido ip1 = new ItemPedido();
		ItemPedido ip2 = new ItemPedido();
		
		ip1.setProduto(p1);
		ip1.setQuantidade(3);
		ip2.setProduto(p2);
		ip2.setQuantidade(2);
		
		Pedido pd = new Pedido();
		
		try {
			pd.adicionarItem(ip1);
			pd.adicionarItem(ip2);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		Lista<ItemPedido> l = pd.getItensPedido();
		int tamanho = l.size();
		for (int i = 0; i<tamanho; i++) {
			ItemPedido ip;
			try {
				ip = l.get(i);
				System.out.println("Código: "+ip.getProduto().getCodigo()+" | Valor: R$"+ip.getProduto().getValor()+" | Descrição: "+ip.getProduto().getDescricao()+" | Quantidade: "+ip.getQuantidade());
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		try {
			System.out.println("Valor Total = R$"+pd.getValorTotal());
		} catch (Exception e) {
			e.printStackTrace(); 
		}
	}

}
