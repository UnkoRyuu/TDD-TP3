package modele;

/**
 * 
 * @author Quentin
 * getGoodPointsForRegularCustomer n'est pas dans la bonne classe
 * elle gère les les points de location en fonction de type de client
 *
 */
public class Location {
	
	private Client client;
	private ClientRegulier clientRegulier;
	private Voiture voiture;
	private PeriodeLocation pL;
	
	public Location(Client client, Voiture voiture, PeriodeLocation pL) {
		this.client = client;
		this.clientRegulier = null;
		this.voiture = voiture;
		this.pL = pL;
	}
	
	public Location(ClientRegulier clientRegulier, Voiture voiture, PeriodeLocation pL) {
		this.client = null;
		this.clientRegulier = clientRegulier;
		this.voiture = voiture;
		this.pL = pL;
	}
	
	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public ClientRegulier getClientRegulier() {
		return clientRegulier;
	}

	public void setClientRegulier(ClientRegulier clientRegulier) {
		this.clientRegulier = clientRegulier;
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
	
	public int getGoodPointsForRegularCustomer(int nbLocation) {
		int points = 0;
		if (nbLocation < 15) {
			points = 1;
		} else if (nbLocation < 45) {
			points = 2;
		} else if (nbLocation >= 75) {
			points = 3;
		}
		return points;
	}

}
