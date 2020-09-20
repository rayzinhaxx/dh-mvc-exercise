package lojaOnline.controllers;

import lojaOnline.models.Pedido_Produto;
import lojaOnline.views.Pedido_ProdutoView;

public class Pedido_ProdutoController {
	private Pedido_Produto model;
	private Pedido_ProdutoView view;
	
	public Pedido_ProdutoController(Pedido_Produto model, Pedido_ProdutoView view) {
		this.model = model;
		this.view = view;
	}
	
	public int getPedido_ProdutoQuantidade_produto() {
		return model.getQuantidade_produto();
	}
	public void setPedido_ProdutoQuantidade_produto(int quantidade_produto) {
		model.setQuantidade_produto(quantidade_produto);
	}
	public int getPedido_ProdutoFk_pedido() {
		return model.getFk_pedido();
	}
	public void setPedido_ProdutoFk_produto(int fk_produto){
		model.setFk_produto(fk_produto);
	}
	public int getFk_produto() {
		return model.getFk_produto();
	}
	public void setPedido_ProdutoFk_pedido(int fk_pedido){
		model.setFk_pedido(fk_pedido);
	}
	public void updateView() {
		view.printPedido_ProdutoDetails(model.getQuantidade_produto(), model.getFk_pedido(), model.getFk_produto());
	}
}
