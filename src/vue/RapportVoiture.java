package vue;
import donnees.BD;
/**
 * Rapport des voitures.
 * 
 * Faire la liste des voitures de l'entreprise.
 *
 */
public class RapportVoiture {
	
	public RapportVoiture() {
		
		int i;
		BD bd = new BD();
		String voiture=""; 
		String listeVoitures="";
		
		for (i=0; i<bd.arrLstVoiture.size(); i++) {
			
			voiture = " Modele : " + bd.arrLstVoiture.get(i).getModele();
			voiture += "| Marque : " + bd.arrLstVoiture.get(i).getMarque();
			voiture += "| Annee : " + bd.arrLstVoiture.get(i).getAnnee();	
			listeVoitures += voiture + "\n";
		}	
		System.out.println("Rapport voitures: " + listeVoitures);
	
		
	}
}

