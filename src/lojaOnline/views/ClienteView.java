package lojaOnline.views;

import java.time.LocalDate;

public class ClienteView {
	public void printClienteDetails(int clienteId_cliente, String clienteNome, String clienteCpf, String clienteRg, String clienteEmail, LocalDate clienteNascimento) {
		System.out.println("Id_Cliente: " + clienteId_cliente);
		System.out.println("Nome: " + clienteNome);
		System.out.println("CPF: " + clienteCpf);
		System.out.println("RG: " + clienteRg);
		System.out.println("E-mail: " + clienteEmail);
		System.out.println("Data de Nascimento: " + clienteNascimento);
	}
}
