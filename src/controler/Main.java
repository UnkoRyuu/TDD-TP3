package controler;
	


import donnees.BD;
import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.stage.Stage;
import javafx.util.Callback;
import modele.Client;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TableView.ResizeFeatures;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			MainController mc = new MainController();
			Group root = new Group();
			
			TableView<Client> clients = new TableView<Client>();
			
			TableColumn<Client, String> nomClient //
            = new TableColumn<Client, String>("nom");

			// Create column Email (Data type of String).
			TableColumn<Client, String> adresseClient//
            = new TableColumn<Client, String>("adresse");

			// Create column FullName (Data type of String).
			TableColumn<Client, String> telephoneClient//
            = new TableColumn<Client, String>("telephone");
			
			TableColumn<Client, Integer> nbLocationClient//
            = new TableColumn<Client, Integer>("nombre de location");

			
			nomClient.setCellValueFactory(new PropertyValueFactory<>("nom"));
		    adresseClient.setCellValueFactory(new PropertyValueFactory<>("adresse"));
		    telephoneClient.setCellValueFactory(new PropertyValueFactory<>("tel"));
		    nbLocationClient.setCellValueFactory(new PropertyValueFactory<>("nombreDeLocation"));
		    
		    BD donneesBd = new BD();
		    ObservableList<Client> list = donneesBd.listeClient(); 
		    
			clients.getColumns().addAll(nomClient,adresseClient,telephoneClient,nbLocationClient);
			clients.setLayoutX(110);
			clients.setPrefWidth(535);
			clients.fixedCellSizeProperty();
			root.getChildren().add(clients);
			
			Button voirClients = new Button();
			voirClients.setText("Voir les clients");
			voirClients.setVisible(true);
			voirClients.setPrefSize(20, 10);
			voirClients.setPrefWidth(100);
			voirClients.setPrefHeight(50);
			
			Button voirVoiture = new Button();
			voirVoiture.setText("Voir les voitures");
			voirVoiture.setVisible(true);
			voirVoiture.setPrefSize(20, 10);
			voirVoiture.setPrefWidth(100);
			voirVoiture.setPrefHeight(50);
			voirVoiture.setLayoutY(70);
			
			
			root.getChildren().add(voirClients);
			root.getChildren().add(voirVoiture);
						
			voirClients.setOnAction(new EventHandler<ActionEvent>() {
				
				@Override
				public void handle(ActionEvent arg0) {
					
				    clients.setItems(list);
				    
				}
			});
			
			voirVoiture.setOnAction(new EventHandler<ActionEvent>() {
				
				@Override
				public void handle(ActionEvent arg0) {
					mc.affichageVoitureEnConsole();
					
				}
			});
			
			Scene scene = new Scene(root,700,400);
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
	
