package modele;

/**
 * 
 * @author Quentin
 * getGoodPointsForRegularCustomer n'est pas dans la bonne classe
 * elle g�re les les points de location en fonction des clients r�guliers
 *
 * 	1er constructeur : client normal
 *	2eme constructeur client regulier
 *
 */
public class Location {
	
	private Client client;
	private Voiture voiture;
	private PeriodeLocation pL;
	
	public Location(Client client, Voiture voiture, PeriodeLocation pL) {
		this.client = client;
		this.voiture = voiture;
		this.pL = pL;
	}
	
	public Location(ClientRegulier clientRegulier, Voiture voiture, PeriodeLocation pL) {
		this.client = clientRegulier;
		this.voiture = voiture;
		this.pL = pL;
	}
	
	
	
	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public Voiture getVoiture() {
		return voiture;
	}

	public void setVoiture(Voiture voiture) {
		this.voiture = voiture;
	}

	public PeriodeLocation getpL() {
		return pL;
	}

	public void setpL(PeriodeLocation pL) {
		this.pL = pL;
	}
	
	
}
