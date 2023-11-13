import calcul.CalculFactureClientParticulier;
import calcul.CalculFactureClientPro;
import client.ClientParticulier;
import client.ClientPro;
import energie.Energie;

public class Main {

	public static void main(String[] args) {
		ClientParticulier clientParticulier = new ClientParticulier("EKL999888777", "M", "Filali", "Taha");
		ClientPro clientPro1 = new ClientPro("EKL123456789", "000", "raison social 1", 15000000);
		ClientPro clientPro2 = new ClientPro("EKL000111222", "222", "raison social 2", 90000);
		
		CalculFactureClientPro calculFactureClientPro = new CalculFactureClientPro();
		CalculFactureClientParticulier calculFactureClientParticulier = new CalculFactureClientParticulier();

		double calculeFactureClientParticulier = calculFactureClientParticulier.calculateInvoice(clientParticulier, Energie.ELECTRICITE, Energie.GAZ, 55.3, 100);
		double calculeFactureClientPro1 = calculFactureClientPro.calculateInvoice(clientPro1,Energie.ELECTRICITE, Energie.GAZ, 53.4, 74.2);
		double calculeFactureClientPro2 = calculFactureClientPro.calculateInvoice(clientPro2,Energie.ELECTRICITE, Energie.GAZ, 53.4, 74.2);
		
		
		System.out.println("le client " + clientPro1.getRefClient() + " va payer " +calculeFactureClientPro1 + " €");
		System.out.println("le client " + clientPro2.getRefClient() + " va payer " +calculeFactureClientPro2 + " €");
		System.out.println("le client" + clientParticulier.getRefClient() + " va payer " +calculeFactureClientParticulier + " €" );
		

	}

}
