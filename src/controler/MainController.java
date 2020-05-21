package controler;

import donnees.BD;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import modele.Client;
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
		rLocationParClient = new RapportLocationParClient();
		}
	public void affichageClients() {
		rClient.affichageRapportClientFXML();
		rClient.affichageRapportConsole();
		
	}
	
	public void affichageVoitureEnConsole() {
		rVoiture.affichageRapportVoiture();
		System.out.println("coucou c'est moi");
	}
	public void afficheTableauClient( TableView<Client> clients) {
		
		
		TableColumn<Client, String> nomClient //
        = new TableColumn<Client, String>("nom");
		nomClient.setPrefWidth(133);

		// Create column Email (Data type of String).
		TableColumn<Client, String> adresseClient//
        = new TableColumn<Client, String>("adresse");
		adresseClient.setPrefWidth(176);
		// Create column FullName (Data type of String).
		TableColumn<Client, String> telephoneClient//
        = new TableColumn<Client, String>("telephone");
		telephoneClient.setPrefWidth(133);
		TableColumn<Client, Integer> nbLocationClient//
        = new TableColumn<Client, Integer>("locations");
		nbLocationClient.setPrefWidth(80);
		
		nomClient.setCellValueFactory(new PropertyValueFactory<>("nom"));
	    adresseClient.setCellValueFactory(new PropertyValueFactory<>("adresse"));
	    telephoneClient.setCellValueFactory(new PropertyValueFactory<>("tel"));
	    nbLocationClient.setCellValueFactory(new PropertyValueFactory<>("nombreDeLocation"));
	    
	    clients.getColumns().addAll(nomClient,adresseClient,telephoneClient,nbLocationClient);
		clients.setLayoutX(140);
		clients.setPrefWidth(535);
		clients.fixedCellSizeProperty();
		
	}
	
	public void afficherBoutons(Button voirClients,Button voirVoitures) {
		voirClients.setText("Voir les clients");
		voirClients.setVisible(true);
		voirClients.setPrefSize(20, 10);
		voirClients.setPrefWidth(120);
		voirClients.setPrefHeight(50);
	
		voirVoitures.setText("Voir les voitures");
		voirVoitures.setVisible(true);
		voirVoitures.setPrefSize(20, 10);
		voirVoitures.setPrefWidth(120);
		voirVoitures.setPrefHeight(50);
		voirVoitures.setLayoutY(70);
		
	}
}

		
