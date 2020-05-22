package modele;

public class Voiture {
	
	private String marque;
	private String annee;
	private String modele;
	
	public Voiture(String marque, String modele, String annee) {
		this.marque= marque;
		this.modele = modele;
		this.annee = annee;
	}

	public String getModele() {
		return modele;
	}

	public void setModele(String modele) {
		this.modele = modele;
	}
	
	public String getMarque() {
		return marque;
	}

	public void setMarque(String marque) {
		this.marque = marque;
	}

	public String getAnnee() {
		return annee;
	}

	public void setAnnee(String annee) {
		this.annee = annee;
	}

}
