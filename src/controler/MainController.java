package controler;

import donnees.BD;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import modele.Client;
import modele.ClientRegulier;
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
	@SuppressWarnings("unchecked")
	public void afficheTableauClient( TableView<Client> clients, TableView<ClientRegulier> clientsReguliers) {
		
		/*  Clients  */
		TableColumn<Client, String> nomClient
        = new TableColumn<Client, String>("nom");
		nomClient.setPrefWidth(133);

		TableColumn<Client, String> adresseClient
        = new TableColumn<Client, String>("adresse");
		adresseClient.setPrefWidth(176);
		
		TableColumn<Client, String> telephoneClient
        = new TableColumn<Client, String>("telephone");
		telephoneClient.setPrefWidth(133);
		
		TableColumn<Client, Integer> nbLocationClient
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
		
		/*	Clients Reguliers	*/
		
		TableColumn<ClientRegulier, String> nomClientRegulier
        = new TableColumn<ClientRegulier, String>("nom");
		nomClientRegulier.setPrefWidth(133);

		TableColumn<ClientRegulier, String> adresseClientRegulier
        = new TableColumn<ClientRegulier, String>("adresse");
		adresseClientRegulier.setPrefWidth(176);
		
		TableColumn<ClientRegulier, String> telephoneClientRegulier
        = new TableColumn<ClientRegulier, String>("telephone");
		telephoneClientRegulier.setPrefWidth(133);
		
		TableColumn<ClientRegulier, Integer> nbLocationClientRegulier
        = new TableColumn<ClientRegulier, Integer>("locations");
		nbLocationClientRegulier.setPrefWidth(80);
		
		TableColumn<ClientRegulier, Integer> bonPts
        = new TableColumn<ClientRegulier, Integer>("bons points");
		nbLocationClientRegulier.setPrefWidth(80);
		
		nomClientRegulier.setCellValueFactory(new PropertyValueFactory<>("nom"));
	    adresseClientRegulier.setCellValueFactory(new PropertyValueFactory<>("adresse"));
	    telephoneClientRegulier.setCellValueFactory(new PropertyValueFactory<>("tel"));
	    nbLocationClientRegulier.setCellValueFactory(new PropertyValueFactory<>("nombreDeLocation"));
	    bonPts.setCellValueFactory(new PropertyValueFactory<>("pointsBonClient"));
	    clientsReguliers.getColumns().addAll(nomClientRegulier,adresseClientRegulier,telephoneClientRegulier,nbLocationClientRegulier,bonPts);
		clientsReguliers.setLayoutX(740);
		clientsReguliers.setPrefWidth(610);
		clientsReguliers.fixedCellSizeProperty();
		
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
	
	 public ObservableList<Client> listeClient() {
			
			ObservableList<Client> listcli =FXCollections.observableArrayList(bd.arrLstClient); 
			return listcli; 
	 }
	 
	 public ObservableList<ClientRegulier> listeClientsReguliers() {
			
			ObservableList<ClientRegulier> listcli =FXCollections.observableArrayList(bd.arrLstClientRegulier); 
			return listcli; 
	 }
}

		
