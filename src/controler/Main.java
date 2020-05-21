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
			mc.afficheTableauClient(clients);
			
			
			
		    ObservableList<Client> list = mc.bd.listeClient(); 
		    
			
			root.getChildren().add(clients);
			
			Button voirClients = new Button();
			Button voirVoitures = new Button();
			mc.afficherBoutons(voirClients, voirVoitures);
			
			root.getChildren().add(voirClients);
			root.getChildren().add(voirVoitures);
						
			voirClients.setOnAction(new EventHandler<ActionEvent>() {
				
				@Override
				public void handle(ActionEvent arg0) {
					
				    clients.setItems(list);
				    
				}
			});
			
			voirVoitures.setOnAction(new EventHandler<ActionEvent>() {
				
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
	
