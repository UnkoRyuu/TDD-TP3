package vue;
import donnees.BD;
/**
 * Rapport des voitures.
 * 
 * Faire la liste des voitures de l'entreprise.
 *
 */
public class RVoiture {
	
	public RVoiture() {
		
		int i;
		BD bd = new BD();
		String voiture=""; 
		String listeVoitures="";
		
		for (i=0; i<bd.arrLstVoiture.size(); i++) {
			
			voiture = bd.arrLstVoiture.get(i).getModele();
			voiture += " Marque : " + bd.arrLstVoiture.get(i).getMarque();
			voiture += " Annee : " + bd.arrLstVoiture.get(i).getAnnee();	
			listeVoitures += voiture;
		}	
		System.out.println("Rapport voitures: " + listeVoitures);
	
		
	}
}

