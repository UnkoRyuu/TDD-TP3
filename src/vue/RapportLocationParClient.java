package vue;

import donnees.BD;
import modele.Voiture;

/**
 * Rapport des locations par client.
 * 
 * Pour un client choisi dans la liste des clients (RapportClient),
 * ce rapport affiche à nouveau le nom du client et ses locations.
 * Pour chaque location, le rapport affiche la date de début, la date de fin,
 * ainsi que la marque, le modèle et l'année du véhicule.
 *
 */
public class RapportLocationParClient {
	
	public RapportLocationParClient() {
		
		int i;
		BD bd = new BD();
		String location=""; 
		String listeLocation="";
		int bonPoints;
		
		for (i=0; i<bd.arrLstLocation.size(); i++) {
			
						
			location = " Client : " + bd.arrLstLocation.get(i).getClient().getNom();
			location += "| Client Regulier : " + bd.arrLstLocation.get(i).getClientRegulier().getPointsBonClient();
			location += "| Voiture : " + bd.arrLstLocation.get(i).getVoiture().getModele();	
			location += "| Periode de location : " + bd.arrLstLocation.get(i).getpL().getDateDebut();
			location += "| Periode de location : " + bd.arrLstLocation.get(i).getpL().getDateFin();
			listeLocation += location + "\n";
		}	
		System.out.println("Rapport location par client : \n " + listeLocation);
	}
}
