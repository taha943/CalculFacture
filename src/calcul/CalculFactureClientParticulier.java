package calcul;

import client.Client;
import client.ClientParticulier;
import client.ClientPro;
import energie.Energie;
import energie.EnergyPrices;

public class CalculFactureClientParticulier implements CalculFacture {

	
	@Override
    public double calculateInvoice(ClientParticulier client, Energie energieElectricte ,  Energie energieGaz , double consommationGaz ,  double consommationElectricite) {

        return getPrixConsommationGaz(client , energieGaz , consommationGaz) +getPrixConsommationElectricite(client,energieElectricte,consommationElectricite) ;
    }
	
	@Override
    public double getPrixConsommationGaz(Client client , Energie energie , double consommationGaz) {
		
		if (client instanceof ClientParticulier) {
        double prixKwh = 0;

    		  if (energie==Energie.GAZ) {
    			  prixKwh= EnergyPrices.GAZ_PARTICULIER;
    		  }
    		
    		  return prixKwh * consommationGaz;
		}
		return 0;
    	
    	
    }
    
	@Override
    public  double getPrixConsommationElectricite(Client client , Energie energie , double consommationElectricite) {
		
		if (client instanceof ClientParticulier) {
        double prixKwh = 0;

    		  if (energie==Energie.ELECTRICITE) {
    			  prixKwh= EnergyPrices.ELECTRICITE_PARTICULIER;
    		  }
    		
    		  return prixKwh * consommationElectricite;
		}
		return consommationElectricite;
    	
    	
    }


	@Override
	public double calculateInvoice(ClientPro client, Energie energieElectricte, Energie energieGaz,
			double consommationGaz, double consommationElectricite) {
		return 0;
	}
    
    



}