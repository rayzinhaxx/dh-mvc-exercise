package lojaOnline.models;

public class Endereco {
	private static int id_endereco;
	private String estado;
	private String cidade;
	private String bairro;
	private String cep;
	private String logradouro;
	private Cliente cliente;
	private int fk_cliente = cliente.getId_cliente();
	
	public Endereco() {
		this.id_endereco += 1;
	}
	public Cliente getCliente() {
		return this.cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public int getId_endereco() {
		return id_endereco;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	public int getFk_cliente() {
		return fk_cliente;
	}
	
}
