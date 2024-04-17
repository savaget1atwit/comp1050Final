package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.image.Image;


public class Main extends Application {

    
    
	@Override
	public void start(Stage primaryStage) {
		try {
			Pane root = FXMLLoader.load(getClass().getResource("CS2 Final - Daniel & Tobi Start Game.fxml"));
			
			Scene scene1 = new Scene(root);
			primaryStage.setScene(scene1);
			primaryStage.getIcons().add(new Image("file:/C:/Users/danie/Downloads/Whack-a-mole Main Photo.png"));
			primaryStage.show();
			
	
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
