package lojaOnline.views;

public class Pedido_ProdutoView {
	public void printPedido_ProdutoDetails (int pedido_produtoQuantidade_produto, int pedido_produtoFk_pedido, int pedido_produtoFk_produto) {
		System.out.println("Pedido_Produto: ");
		System.out.println("Quantidade do Produto: " + pedido_produtoQuantidade_produto);
		System.out.println("Fk_Pedido: " + pedido_produtoFk_pedido);
		System.out.println("Fk_Produto: " + pedido_produtoFk_produto);
	}
}
