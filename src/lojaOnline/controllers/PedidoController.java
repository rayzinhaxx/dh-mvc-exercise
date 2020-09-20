package lojaOnline.controllers;

import java.time.LocalDate;

import lojaOnline.models.Pedido;
import lojaOnline.views.PedidoView;

public class PedidoController {
	private Pedido model;
	private PedidoView view;
	
	public PedidoController(Pedido model, PedidoView view) {
		this.model = model;
		this.view = view;
	}
	
	public int getPedidoId_pedido() {
		return model.getId_pedido();
	}
	public LocalDate getPedidoData_emissao() {
		return  model.getData_emissao();
	}
	public void setPedidoData_emissao(LocalDate data_emissao) {
		model.setData_emissao(data_emissao);
	}
	public String getPedidoStatus_pedido() {
		return model.getStatus_pedido();
	}
	public void setPedidoStatus_pedido(String status_pedido) {
		 model.setStatus_pedido(status_pedido);
	}
	public double getPedidoValor_total() {
		return model.getValor_total();
	}
	public void setPedidoValor_total(double valor_total) {
		model.setValor_total(valor_total);
	}
	public String getPedidoNota_fiscal() {
		return model.getNota_fiscal();
	}
	public void setPedidoNota_fiscal(String nota_fiscal) {
		model.setNota_fiscal(nota_fiscal);
	}
	public int getPedidoFk_cliente() {
		return  model.getFk_cliente();
	}
	public void setPedidoFk_cliente(int fk_cliente) {
		model.setFk_cliente(fk_cliente);
	}
	public int getPedidoFk_produto() {
		return  model.getFk_produto();
	}
	public void setPedidoFk_produto(int fk_produto) {
		model.setFk_produto(fk_produto);
	}
	public void updateView() {
		view.printPedidoDetails(model.getId_pedido(), model.getData_emissao(), model.getStatus_pedido(), model.getValor_total(), model.getNota_fiscal(), model.getFk_cliente(), model.getFk_produto());
	}
}
