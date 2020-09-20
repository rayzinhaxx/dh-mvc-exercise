package lojaOnline.models;

public class Telefone {
	private static int id_telefone;
	private String ddd;
	private String numero;
	private Cliente cliente;
	private int fk_cliente = cliente.getId_cliente();
	
	public Telefone() {
		this.id_telefone += 1;
	}
	public int getId_telefone() {
		return id_telefone;
	}
	public String getDdd() {
		return ddd;
	}
	public void setDdd(String ddd) {
		this.ddd = ddd;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public int getFk_cliente() {
		return fk_cliente;
	}
}
