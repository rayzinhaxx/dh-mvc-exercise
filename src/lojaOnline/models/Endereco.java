package lojaOnline.models;

public class Endereco {
	private static int id_endereco;
	private String estado;
	private String cidade;
	private String bairro;
	private String cep;
	private String logradouro;
	private int fk_cliente;
	
	public Endereco() {
		Endereco.id_endereco += 1;
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
	public void setFk_cliente(int fk_cliente) {
		this.fk_cliente = fk_cliente;
	}
	
}
