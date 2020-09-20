package lojaOnline.views;

public class EnderecoView {
	public void printEnderecoDetails(int clienteId_endereco, String clienteEstado, String clienteCidade, String clienteBairro, String clienteCep, String clienteLogradouro, int clienteId_cliente) {
		System.out.println("Endereço: ");
		System.out.println("Id_Cliente: " + clienteId_endereco);
		System.out.println("Estado: " + clienteEstado);
		System.out.println("Cidade" + clienteCidade);
		System.out.println("Bairro: " + clienteBairro);
		System.out.println("CEP: " + clienteCep);
		System.out.println("Logradouro: " + clienteLogradouro);
		System.out.println("Cliente: " + clienteId_cliente);
	}
}
