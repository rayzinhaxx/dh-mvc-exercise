package lojaOnline.views;

import java.time.LocalDate;

public class PedidoView {
	public void printPedidoDetails(int pedidoId_pedido, LocalDate pedidoData_emissao, String pedidoStatus_pedido, double pedidoValor_total, String pedidoNota_fiscal, int pedidoFk_cliente, int pedidoFk_produto) {
		System.out.println("Pedido: ");
		System.out.println("Id_Pedido: " + pedidoId_pedido);
		System.out.println("Data de Emissão: " + pedidoData_emissao);
		System.out.println("Status: " + pedidoStatus_pedido);
		System.out.println("Valor Total: " + pedidoValor_total);
		System.out.println("Nota Fiscal: " + pedidoNota_fiscal);
		System.out.println("Fk_cliente: " + pedidoFk_cliente);
		System.out.println("Fk_produto: " + pedidoFk_produto);
	}
}
