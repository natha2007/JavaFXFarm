package application.java;
	



import java.awt.Dimension;

import javax.swing.JFrame;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;



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
		        
		        int[][] matrice = new int[100][60];
		        GridPane grid = new GridPane();
		        for (int i=0;i<matrice.length;i++) {
		        	for (int j=0;j<matrice[i].length;j++) {
		        		Rectangle rect1 = new Rectangle(10,10,Color.RED);
		        		if (i == 0 && j == 0) {
		        			rect1.setFill(Color.GREEN);
		        			rect1.setX(0);
		        			rect1.setY(0);
		        		} else if (i%2 == 0){
		        			rect1.setFill(Color.GREEN);
		        			rect1.setX(i+10);
			        		rect1.setY(j-10);
		        		} else {
		        			rect1.setX(i+10);
			        		rect1.setY(j-10);
		        		}
		        		grid.add(rect1, i, j);
		        	}
		        }
		        
		        
		        		
		      
		        
		        Scene test = new Scene(grid, 1000, 600);
		        
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
