package modele;

/**
 * 
 * @author Quentin
 *A quoi sert cette classe ? 
 *
 *Price n'est pas utilisé dans les functions / méthodes
 */
public class CalculPrix {
	
	private double price;
	private final double PRIXLOCATIONJOURTOYOTA = 17.5;
	private final double PRIXLOCATIONJOURTESLA = 33.0;
	private final double PRIXLOCATIONJOURHONDA = 22.0;
	private final double PRIXLOCATIONJOURCHEVROLET = 27.5;
	private final double PRIXLOCATIONJOURBASE = 34.0;
	
	public CalculPrix(double price) {
		this.price = price;
	}
	
	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	public void addTxToPrice() {
		
	}	
	
	public double getPriceForThisCar(Voiture v) {
		switch(v.getMarque()) {
		case "Toyota" :
			return this.PRIXLOCATIONJOURTOYOTA;
		case "Honda" :
			return this.PRIXLOCATIONJOURTESLA;
		case "Tesla" :
			return this.PRIXLOCATIONJOURHONDA;
		case "Chevrolet" :
			return this.PRIXLOCATIONJOURCHEVROLET;
		default :
			return this.PRIXLOCATIONJOURBASE;
		}
	}
	
	public void showNewBill() {
		
	}

	
}
