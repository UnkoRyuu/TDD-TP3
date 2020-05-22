package donnees;
import java.util.ArrayList;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import modele.Client;
import modele.ClientRegulier;
import modele.Location;
import modele.PeriodeLocation;
import modele.Taxes;
import modele.Voiture;

/*
 *  ** MOCK Database **
 *  This is the database when the program start.
 */


public class BD {
	
	public Taxes tx;
	public ArrayList<ClientRegulier> arrLstClientRegulier;
	public ArrayList<Client> arrLstClient;
	public ArrayList<Voiture> arrLstVoiture;
	public ArrayList<Location> arrLstLocation;
	
	public BD() {
		this.tx = new Taxes(5.0, 8.5);
		
		this.arrLstClientRegulier = new ArrayList<ClientRegulier>();
		this.arrLstClient = new ArrayList<Client>();
		this.arrLstVoiture = new ArrayList<Voiture>();
		this.arrLstLocation = new ArrayList<Location>();
		
		ClientRegulier cr1 = new ClientRegulier("Maxime Talbot","581-555-3456","47, avenue Royale, Rimouski",5,6);
		this.arrLstClientRegulier.add(cr1);
		
		ClientRegulier cr2 = new ClientRegulier("Johanne Tremblay","581-555-2387","99, rue des Pignons, Rimouski",6,15);	
		this.arrLstClientRegulier.add(cr2);
		
		Client c1 = new Client("Mélanie Charron","581-555-8823","12, rue des Fauvettes, Rimouski",0);
		this.arrLstClient.add(c1);
		
		Client c2 = new Client("François Beauchemin","581-555-7525","50, rue des Oliviers, Rimouski",3);
		this.arrLstClient.add(c2);
		
		Voiture v1 = new Voiture("Chevrolet","Bolt","2018");
		this.arrLstVoiture.add(v1);
		
		Voiture v2 = new Voiture("Tesla","3","2019");
		this.arrLstVoiture.add(v2);
		
		Voiture v3 = new Voiture("Toyota","Civic","2019");
		this.arrLstVoiture.add(v3);
		
		Voiture v4 = new Voiture("Honda","Civic","2019");
		this.arrLstVoiture.add(v4);
		
		PeriodeLocation pl1 = new PeriodeLocation("2020-04-01","2020-04-03");
		
		Location l1 = new Location(c1,v1,pl1);
		this.arrLstLocation.add(l1);
		
		PeriodeLocation pl2 = new PeriodeLocation("2020-04-01","2020-04-03");
		
		PeriodeLocation pl3 = new PeriodeLocation("2020-05-01","2020-06-03");
		
		
		Location l2 = new Location(cr1,v2,pl2);
		this.arrLstLocation.add(l2);
		
		Location l3 = new Location(c1,v3,pl3);
		//l3.setClient(c1);
		//l3.setVoiture(v3);
		//l3.setpL(pl3);
		this.arrLstLocation.add(l3);
	}
	 	
	 
	
}
