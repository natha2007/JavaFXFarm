package application.java;
	



import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
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

		        Scene scene = new Scene(menu, 300, 400);
		        scene.getStylesheets().add(
		            getClass().getResource("/application/ressources/application.css").toExternalForm()
		        );

		        stage.setTitle("Menu JavaFX");
		        stage.setScene(scene);
		        stage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
