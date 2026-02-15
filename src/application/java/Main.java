package application.java;
	



import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;



public class Main extends Application {
	@Override
	public void start(Stage stage) {
		try {
			 	Button playBtn = new Button("Jouer");
		        Button optionsBtn = new Button("Options");
		        Button quitBtn = new Button("Quitter");
		        
		        playBtn.getStyleClass().add("btnPlay");

		        VBox menu = new VBox(15, playBtn, optionsBtn, quitBtn);
		        menu.getStyleClass().add("menu");

		        Scene scene = new Scene(menu, 1000, 600);
		        scene.getStylesheets().add(
		            getClass().getResource("/application/ressources/application.css").toExternalForm()
		        );

		        stage.setTitle("Menu JavaFX");
		        stage.setScene(scene);
		        stage.show();
		        
		        VBox vBoxTest = new VBox(5, new Label("Test"));
		        Scene test = new Scene(vBoxTest, 1000, 600);
		        
		        playBtn.setOnAction(e -> {
		        	stage.setScene(test);
		        });
		        
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
