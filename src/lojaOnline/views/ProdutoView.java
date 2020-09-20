package lojaOnline.views;

public class ProdutoView {
	public void printProdutoDetails(int produtoId_produto, int produtoCodigo, double produtoPreco, String produtoNome, String produtoDescricao, int produtoQtd_estoque) {
		System.out.println("Produto: ");
		System.out.println("Id_produto: " + produtoId_produto);
		System.out.println("Código: " + produtoCodigo);
		System.out.println("Preço: " + produtoPreco);
		System.out.println("Nome: " + produtoNome);
		System.out.println("Descrição: " + produtoDescricao);
		System.out.println("Estoque: " + produtoQtd_estoque);
	}
}
