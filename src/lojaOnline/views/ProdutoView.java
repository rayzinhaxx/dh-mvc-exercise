package lojaOnline.views;

public class ProdutoView {
	public void printProdutoDetails(int produtoId_produto, int produtoCodigo, double produtoPreco, String produtoNome, String produtoDescricao, int produtoQtd_estoque) {
		System.out.println("Produto: ");
		System.out.println("Id_produto: " + produtoId_produto);
		System.out.println("C�digo: " + produtoCodigo);
		System.out.println("Pre�o: " + produtoPreco);
		System.out.println("Nome: " + produtoNome);
		System.out.println("Descri��o: " + produtoDescricao);
		System.out.println("Estoque: " + produtoQtd_estoque);
	}
}
