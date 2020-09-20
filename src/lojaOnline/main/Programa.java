package lojaOnline.main;

import java.time.LocalDate;

import lojaOnline.controllers.ClienteController;
import lojaOnline.models.Cliente;
import lojaOnline.views.ClienteView;

public class Programa {
	public static void main(String[] args) {
		Cliente modelC = new Cliente();
		ClienteView viewC = new ClienteView();
		ClienteController controllerC = new ClienteController(modelC, viewC);
		LocalDate data = LocalDate.of(1998, 7, 24);
		
		controllerC.setClienteCpf("000.123.456-78");
		controllerC.setClienteEmail("rayssaferreira@domino.com");
		controllerC.setClienteNascimento(data);
		controllerC.setClienteNome("Rayssa Ferreira");
		controllerC.setClienteRg("00000000000");
		
		controllerC.updateView();
		
//		Endereco modelE = new Endereco();
//		EnderecoView viewE = new EnderecoView();
//		EnderecoController controllerE = new EnderecoController(modelE, viewE);
//		
//		controllerE.setEnderecoBairro("Novo Mondubim");
//		controllerE.setEnderecoCep("60.123-456");
//		controllerE.setEnderecoCidade("Fortaleza");
//		controllerE.setEnderecoEstado("CE");
//		controllerE.setEnderecoLogradouro("Rua 2");
//		
//		controllerE.updateView();
		
	}
}
