package modele;
/**
 * 
 * Les clients ayant 5 locations ou plus devienne "client régulier" au moment de la 5e location.
 *
 * À partir de la 5e location, leur pointsBonClient = 1 (valeur de départ), et augmente ensuite selon
 * les règles de la méthode getGoodPointsForRegularCustomer.
 */
public class ClientRegulier extends Client {
	
	public String nom;
	public String tel;
	public String adresse;
	public int nombreDeLocation;
	public int pointsBonClient;

	/*public ClientRegulier() {
		
	}*/
	public ClientRegulier(String nom, String tel, String adresse, int nblocation, int pointsBonClient) {
		super(nom, tel, adresse,nblocation);
		this.pointsBonClient = pointsBonClient;
		
	}
	
	public int getPointsBonClient() {
		return pointsBonClient;
	}

	public void setPointsBonClient(int pointsBonClient) {
		this.pointsBonClient = pointsBonClient;
	}

	public void addPoints(int value) {
		this.pointsBonClient += value;
	}
}
