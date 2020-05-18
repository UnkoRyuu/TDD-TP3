package controler;

import donnees.BD;
import vue.RapportVoiture;
import vue.RapportClient;
import vue.RapportLocationParClient;

/**
 * 
 * @author Quentin BERNARD / Lucas PORTAL
 */
public class MainController{
	
	BD bd;
	
	RapportClient rClient;
	RapportLocationParClient rLocationParClient;
	RapportVoiture rVoiture;
	
	public MainController() {
		this.bd = new BD(); // mock bd, the program start with those data at each start
		rClient = new RapportClient();
		rVoiture = new RapportVoiture();
		}
}
		
