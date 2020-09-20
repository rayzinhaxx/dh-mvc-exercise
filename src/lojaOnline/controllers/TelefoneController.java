package lojaOnline.controllers;

import lojaOnline.models.Cliente;
import lojaOnline.models.Telefone;
import lojaOnline.views.TelefoneView;

public class TelefoneController {
	private Telefone model;
	private TelefoneView view;
	
	public TelefoneController(Telefone model, TelefoneView view) {
		this.model = model;
		this.view = view;
	}
	
	public int getTelefoneId_telefone() {
		return model.getId_telefone();
	}
	public String getTelefoneDdd() {
		return model.getDdd();
	}
	public void setTelefoneDdd(String ddd) {
		model.setDdd(ddd);
	}
	public String getTelefoneNumero() {
		return model.getNumero();
	}
	public void setTelefoneNumero(String numero) {
		model.setNumero(numero);
	}
	public Cliente getTelefoneCliente() {
		return model.getCliente();
	}
	public void setTelefoneCliente(Cliente cliente) {
		model.setCliente(cliente);
	}
	public int getTelefoneFk_cliente() {
		return model.getFk_cliente();
	}
	public void updateView() {
		view.printTelefoneDetails(model.getId_telefone(), model.getDdd(), model.getNumero(), model.getFk_cliente());
	}
}
