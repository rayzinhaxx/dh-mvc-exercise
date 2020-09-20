package lojaOnline.models;

public class Telefone {
	private static int id_telefone;
	private String ddd;
	private String numero;
	private int fk_cliente;
	
	public Telefone() {
		Telefone.id_telefone += 1;
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
	public int getFk_cliente() {
		return fk_cliente;
	}
	public void setFk_cliente(int fk_cliente) {
		this.fk_cliente = fk_cliente;
	}
}
