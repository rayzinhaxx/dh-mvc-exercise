package lojaOnline.models;

public class Pedido_Produto {
	private int quantidade_produto;
	private Pedido pedido;
	private int fk_pedido = pedido.getId_pedido();
	private Produto produto;
	private int fk_produto = produto.getId_produto();
	
	public int getQuantidade_produto() {
		return quantidade_produto;
	}
	public void setQuantidade_produto(int quantidade_produto) {
		this.quantidade_produto = quantidade_produto;
	}
	public int getFk_pedido() {
		return fk_pedido;
	}
	public int getFk_produto() {
		return fk_produto;
	}
}
