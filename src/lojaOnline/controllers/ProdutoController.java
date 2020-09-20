package lojaOnline.controllers;

import lojaOnline.models.Produto;
import lojaOnline.views.ProdutoView;

public class ProdutoController {
	private Produto model;
	private ProdutoView view;
	
	public ProdutoController(Produto model, ProdutoView view) {
		this.model = model;
		this.view = view;
	}
	
	public int getProdutoId_produto() {
		return model.getId_produto();
	}
	public int getProdutoCodigo() {
		return model.getCodigo();
	}
	public void setProdutoCodigo(int codigo) {
		model.setCodigo(codigo);
	}
	public double getProdutoPreco() {
		return model.getPreco();
	}
	public void setProdutoPreco(double preco) {
		model.setPreco(preco);
	}
	public String getProdutoNome() {
		return model.getNome();
	}
	public void setProdutoNome(String nome) {
		model.setNome(nome);
	}
	public String getProdutoDescricao() {
		return model.getDescricao();
	}
	public void setProdutoDescricao(String descricao) {
		model.setDescricao(descricao);
	}
	public int getProdutoQtd_estoque() {
		return model.getQtd_estoque();
	}
	public void setProdutoQtd_estoque(int qtd_estoque) {
		model.setQtd_estoque(qtd_estoque);
	}
	public void updateView() {
		view.printProdutoDetails(model.getId_produto(), model.getCodigo(), model.getPreco(), model.getNome(), model.getDescricao(), model.getQtd_estoque());
	}
}
