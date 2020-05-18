package controler;

import donnees.BD;
import vue.RVoiture;
import vue.RapportClient;
import vue.RapportLocationParClient;

/**
 * 
 * @author Quentin BERNARD / Lucas PORTAL
 */
public class MainController{
	
	BD bd;
	
	RapportClient rClient;
	RapportLocationParClient rapportLocationParClient;
	RVoiture rVoiture;
	
	public MainController() {
		this.bd = new BD(); // mock bd, the program start with those data at each start
	}
		
}
