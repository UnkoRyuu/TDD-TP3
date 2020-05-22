package vue;
import donnees.BD;
/**
 * 
 * Rapport de la liste des clients.
 * 
 * Faire la liste des clients et des "Clients Réguliers" de l'entreprise.
 *
 */
public class RapportClient {
	public RapportClient() {
	}
	
	public void affichageRapportConsole(BD bd) {
		int i;
		String listeClients="", client=""; 
		for (i=0;i<bd.arrLstClient.size();i++) {
			
			client = bd.arrLstClient.get(i).getNom() + " | nb location : " + bd.arrLstClient.get(i).getNombreDeLocation();
			client += " | adresse : " + bd.arrLstClient.get(i).getAdresse();
			client += " | telephone : " + bd.arrLstClient.get(i).getTel();	
			listeClients += client + "\n";
		}
		
		for (i=0;i<bd.arrLstClientRegulier.size();i++) {
			
			client = bd.arrLstClientRegulier.get(i).getNom() + " | nb location : " + bd.arrLstClientRegulier.get(i).getNombreDeLocation();
			client += " | adresse : " + bd.arrLstClientRegulier.get(i).getAdresse();
			client += " | telephone : " + bd.arrLstClientRegulier.get(i).getTel();
			client += " | bons points : " + bd.arrLstClientRegulier.get(i).getPointsBonClient();
			listeClients += client + "\n";
		}	
		System.out.println("Rapport des clients :\n" + listeClients);
	}
}

