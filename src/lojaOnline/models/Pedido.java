package lojaOnline.models;

import java.time.LocalDate;

public class Pedido {
	private static int id_pedido;
    private LocalDate data_emissao;
    private String status_pedido;
    private double valor_total;
    private String nota_fiscal;
	private Cliente cliente;
	private int fk_cliente = cliente.getId_cliente();
	private Produto produto;
	private int fk_produto = produto.getId_produto();
	
	public Pedido() {
		this.id_pedido += 1;
	}
	public int getId_pedido() {
		return id_pedido;
	}
	public LocalDate getData_emissao() {
		return data_emissao;
	}
	public void setData_emissao(LocalDate data_emissao) {
		this.data_emissao = data_emissao;
	}
	public String getStatus_pedido() {
		return status_pedido;
	}
	public void setStatus_pedido(String status_pedido) {
		this.status_pedido = status_pedido;
	}
	public double getValor_total() {
		return valor_total;
	}
	public void setValor_total(double valor_total) {
		this.valor_total = valor_total;
	}
	public String getNota_fiscal() {
		return nota_fiscal;
	}
	public void setNota_fiscal(String nota_fiscal) {
		this.nota_fiscal = nota_fiscal;
	}
	public int getFk_cliente() {
		return fk_cliente;
	}
	public int getFk_produto() {
		return fk_produto;
	}
}
