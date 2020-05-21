package controler;
	


import java.awt.Label;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import modele.Client;
import modele.ClientRegulier;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			MainController mc = new MainController();
			Group root = new Group();
			
			TableView<Client> clients = new TableView<Client>();
			TableView<ClientRegulier> clientsRegulier = new TableView<ClientRegulier>();
			mc.afficheTableauClient(clients,clientsRegulier);
						
		    ObservableList<Client> listeClients = mc.listeClient(); 
		    ObservableList<ClientRegulier> listeClientsReguliers = mc.listeClientsReguliers();
		    
			root.getChildren().add(clients);
			root.getChildren().add(clientsRegulier);
						
			Button voirClients = new Button();
			Button voirVoitures = new Button();
			mc.afficherBoutons(voirClients, voirVoitures);
			
			root.getChildren().add(voirClients);
			root.getChildren().add(voirVoitures);
						
			voirClients.setOnAction(new EventHandler<ActionEvent>() {
				
				@Override
				public void handle(ActionEvent arg0) {
					
				    clients.setItems(listeClients);
				    clientsRegulier.setItems(listeClientsReguliers);
				}
			});
			
			voirVoitures.setOnAction(new EventHandler<ActionEvent>() {
				
				@Override
				public void handle(ActionEvent arg0) {
					mc.affichageVoitureEnConsole();
					
				}
			});
			
			clients.setOnMousePressed(new EventHandler<MouseEvent>() {
			    @Override 
			    public void handle(MouseEvent event) {
			        if (event.isPrimaryButtonDown() && event.getClickCount() == 2) {
			            System.out.println(clients.getSelectionModel().getSelectedItem().getNom());                   
			        }
			    }
			});
				
			
			Scene scene = new Scene(root,1400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
			
					} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		
		launch(args);
		
	}
		
}
	
