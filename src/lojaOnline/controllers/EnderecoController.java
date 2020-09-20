package lojaOnline.controllers;

import lojaOnline.models.Cliente;
import lojaOnline.models.Endereco;
import lojaOnline.views.EnderecoView;

public class EnderecoController {
	private Endereco model;
	private EnderecoView view;
	
	public EnderecoController(Endereco model, EnderecoView view) {
		this.model = model;
		this.view = view;
	}
	
	public Cliente getClienteCliente() {
		return model.getCliente();
	}
	public void setEnderecoCliente(Cliente cliente) {
		model.setCliente(cliente);
	}
	
	public int getEnderecoId_endereco() {
		return model.getId_endereco();
	}

	public String getEnderecoEstado() {
		return model.getEstado();
	}
	public void setEnderecoEstado(String estado) {
		model.setEstado(estado);
	}
	public String getEnderecoCidade() {
		return model.getCidade();
	}
	public void setEnderecoCidade(String cidade) {
		model.setCidade(cidade);
	}
	public String getEnderecoBairro() {
		return model.getBairro();
	}
	public void setEnderecoBairro(String bairro) {
		model.setBairro(bairro);
	}
	public String getEnderecoCep() {
		return model.getCep();
	}
	public void setEnderecoCep(String cep) {
		model.setCep(cep);
	}
	public String getEnderecoLogradouro() {
		return model.getLogradouro();
	}
	public void setEnderecoLogradouro(String logradouro) {
		model.setLogradouro(logradouro);
	}
	public int getEnderecoFk_cliente() {
		return model.getFk_cliente();
	}
	public void updateView() {
		view.printEnderecoDetails(model.getId_endereco(), model.getEstado(), model.getCidade(), model.getBairro(), model.getCep(), model.getLogradouro(), model.getFk_cliente());
	}
}
