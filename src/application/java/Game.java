package application.java;

import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;

public class Game extends Scene {

	public Game(Parent root, double x, double y) {
		super(root, x, y);
	}
	
	public static Group getContent() {
		Group root = new Group();
		Label bjr = new Label("Bonjour");
		root.getChildren().addAll(bjr);
		
		return root;
		
	}

}
