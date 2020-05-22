package vue;

import java.util.ArrayList;

import modele.Location;
import donnees.BD;

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
		
	}
		
	public void afficherRapportLocationVoiture() {	
		int i;
		BD bd = new BD();
		String location=""; 
		String listeLocation="";
		
		for (i=0; i<bd.arrLstLocation.size(); i++) {
									
			location = " Client : " + bd.arrLstLocation.get(i).getClient().getNom();
			location += "| Voiture : " + bd.arrLstLocation.get(i).getVoiture().getModele();	
			location += "| Periode de location : " + bd.arrLstLocation.get(i).getpL().getDateDebut();
			location += "| Periode de location : " + bd.arrLstLocation.get(i).getpL().getDateFin();
			listeLocation += location + "\n";
		}	
		System.out.println("Rapport total des locations \n " + listeLocation);
	}
	
	public void afficherRapportLocationVoitureParClient(ArrayList<Location> locationClient) {
		String location="";
		String listeLocation ="";
		int i = 0;
		for (i=0;i<locationClient.size();i++) {
			
			location = "Client : " + locationClient.get(i).getClient().getNom();
			location += "\t Marque de la voiture : " +  locationClient.get(i).getVoiture().getMarque();
			location += "\t Modele de la voiture : " +  locationClient.get(i).getVoiture().getModele();
			location += "\t Annee de la voiture : " +  locationClient.get(i).getVoiture().getAnnee();
			location += "\t Periode de location du : '" +  locationClient.get(i).getpL().getDateDebut();
			location += "' au '" +  locationClient.get(i).getpL().getDateFin() + "' ";
			listeLocation += location + "\n";
		}	
		System.out.println("Rapport location par client : \n" + listeLocation);
	}
}
