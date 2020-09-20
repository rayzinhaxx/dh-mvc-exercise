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

		System.out.println("---------------------");

		Cliente modelC1 = new Cliente();
		ClienteView viewC1 = new ClienteView();
		ClienteController controllerC1 = new ClienteController(modelC, viewC);
		
		controllerC1.setClienteCpf("000.123.456-78");
		controllerC1.setClienteEmail("rayssaferreira@domino.com");
		controllerC1.setClienteNascimento(data);
		controllerC1.setClienteNome("Rayssa Ferreira");
		controllerC1.setClienteRg("00000000000");
		
		controllerC1.updateView();
		
	}
}
