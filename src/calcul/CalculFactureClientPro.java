package calcul;

import client.Client;
import client.ClientParticulier;
import client.ClientPro;
import energie.Energie;
import energie.EnergyPrices;

public class CalculFactureClientPro implements CalculFacture {
	
	
	
	@Override
	public  double calculateInvoice(ClientPro client, Energie energieElectricte , Energie energieGaz , double consommationGaz ,  double consommationElectricite) {

        return getPrixConsommationGaz(client , energieGaz , consommationGaz) +getPrixConsommationElectricite(client,energieElectricte,consommationElectricite) ;
    }

    public  double getPrixConsommationGaz(Client client , Energie energieGaz , double consommationGaz) {
        ClientPro particulierClient = (ClientPro) client;
        double prixKwh = 0;
    	if (energieGaz==Energie.GAZ) {
    		if (particulierClient.getCa()>1000000)
    			prixKwh= EnergyPrices.GAZ_PRO_HIGH_CA;
    		else 
    			prixKwh= EnergyPrices.GAZ_PRO_LOW_CA;
    		  }
    		  return prixKwh * consommationGaz;
    }
    
   
    public  double getPrixConsommationElectricite(Client client , Energie energieElectricite , double consommationElectricite) {
    	ClientPro particulierClient = (ClientPro) client;
        double prixKwh = 0;
        if (energieElectricite==Energie.ELECTRICITE) {
        	if (particulierClient.getCa()>1000000)
        		prixKwh= EnergyPrices.ELECTRICITE_PRO_HIGH_CA;
        	else 
        		prixKwh= EnergyPrices.ELECTRICITE_PRO_LOW_CA;    		
    	}
    		  return prixKwh * consommationElectricite;
    	
    	
    }

	@Override
	public double calculateInvoice(ClientParticulier client, Energie energieElectricte, Energie energieGaz,
			double consommationGaz, double consommationElectricite) {
		return 0;
	}
    

}
