package application;

import java.io.IOException;

import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.util.Duration;

public class SceneController implements Initializable {
	private Stage stage;
	private Scene scene;
	private Parent root;
	
	public void switchtoScene1(ActionEvent event) throws IOException {
		Parent root = FXMLLoader.load(getClass().getResource("CS2 Final - Daniel & Tobi Start Game.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	public void switchtoScene2(ActionEvent event)throws IOException {
		Parent root = FXMLLoader.load(getClass().getResource("GameScene.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	@FXML
	private ImageView startmole1;
	@FXML
	private ImageView startmole2;
	@FXML
	private ImageView startmole3;
	@FXML
	private ImageView startmole4;
	
	public void initialize(URL arg0, ResourceBundle arg1) {
		 TranslateTransition translate = new TranslateTransition();
		 translate.setNode(startmole1);
		 translate.setByY(-20);
		 translate.setDuration(Duration.millis(1000));
		 translate.setCycleCount(TranslateTransition.INDEFINITE);
		 translate.setAutoReverse(true);
		 translate.play();
		 
		 TranslateTransition translate2 = new TranslateTransition();
		 translate2.setNode(startmole2);
		 translate2.setByY(-20);
		 translate2.setDuration(Duration.millis(1000));
		 translate2.setCycleCount(TranslateTransition.INDEFINITE);
		 translate2.setAutoReverse(true);
		 translate2.play();
		 TranslateTransition translate3 = new TranslateTransition();
		 translate3.setNode(startmole3);
		 translate3.setByY(-20);
		 translate3.setDuration(Duration.millis(1000));
		 translate3.setCycleCount(TranslateTransition.INDEFINITE);
		 translate3.setAutoReverse(true);
		 translate3.play();
		 TranslateTransition translate4 = new TranslateTransition();
		 translate4.setNode(startmole4);
		 translate4.setByY(-20);
		 translate4.setDuration(Duration.millis(1000));
		 translate4.setCycleCount(TranslateTransition.INDEFINITE);
		 translate4.setAutoReverse(true);
		 translate4.play();
	}
	
	
	
	
}
