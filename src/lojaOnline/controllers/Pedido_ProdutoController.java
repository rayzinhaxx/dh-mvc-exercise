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
	
	public int getQuantidade_produto() {
		return model.getQuantidade_produto();
	}
	public void setQuantidade_produto(int quantidade_produto) {
		model.setQuantidade_produto(quantidade_produto);
	}
	public int getFk_pedido() {
		return model.getFk_pedido();
	}
	public int getFk_produto() {
		return model.getFk_produto();
	}
	public void updateView() {
		view.printPedido_ProdutoDetails(model.getQuantidade_produto(), model.getFk_pedido(), model.getFk_produto());
	}
}
