package calcul;

import client.Client;
import client.ClientParticulier;
import client.ClientPro;
import energie.Energie;

public interface CalculFacture {
	
    public double calculateInvoice(ClientParticulier client, Energie energieElectricte ,  Energie energieGaz , double consommationGaz ,  double consommationElectricite); 
    
    public double calculateInvoice(ClientPro client, Energie energieElectricte ,  Energie energieGaz , double consommationGaz ,  double consommationElectricite); 

    public  double getPrixConsommationGaz(Client client , Energie energie , double consommationGaz);
    
    public double getPrixConsommationElectricite(Client client , Energie energie , double consommationElectricite);



    
}
