package lojaOnline.views;

public class TelefoneView {
	public void printTelefoneDetails(int telefoneId_telefone, String telefoneDdd, String telefoneNumero, int telefoneFk_cliente) {
		System.out.println("Telefone: ");
		System.out.println("Id_telefone: " + telefoneId_telefone);
		System.out.println("DDD: " + telefoneDdd);
		System.out.println("Número: " + telefoneNumero);
		System.out.println("Fk_cliente: " + telefoneFk_cliente);
	}
}
