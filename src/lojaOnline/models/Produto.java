package lojaOnline.models;

public class Produto {
	private static int id_produto;
	private int codigo;
    private double preco;
    private String nome;
    private String descricao;
    private int qtd_estoque;
    
    public Produto () {
    	Produto.id_produto += 1;
    }
	public int getId_produto() {
		return id_produto;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public int getQtd_estoque() {
		return qtd_estoque;
	}
	public void setQtd_estoque(int qtd_estoque) {
		this.qtd_estoque = qtd_estoque;
	}
    
}
