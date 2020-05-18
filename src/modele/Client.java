package modele;

public class Client {
	
	public String nom;
	public String tel;
	public String adresse;
	public int nombreDeLocation;
	
	public Client(String nom, String tel, String adresse, int nblocation) {
		this.nom = nom;
		this.tel = tel;
		this.adresse = adresse;
		this.nombreDeLocation = nblocation;		
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public int getNombreDeLocation() {
		return nombreDeLocation;
	}

	public void setNombreDeLocation(int nombreDeLocation) {
		this.nombreDeLocation = nombreDeLocation;
	}
	
	
	

}
