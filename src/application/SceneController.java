package application;

import java.io.IOException;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.ImageCursor;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.util.Duration;


import java.util.Random;


public class SceneController implements Initializable {
	private Stage stage;
	private Scene scene;
	private static int TotalScore = 0;
	private ImageView gamemole1 = new ImageView("file:///C:/Users/danie/Downloads/Whack-a-mole Main Photo.png");
	private ImageView buffgamemole = new ImageView("file:///C:/Users/danie/Downloads/Buff Diglet.png");
	private Text scoreValue = new Text("0");
	private Label scoreLabel = new Label("Score");
	private static int previousRandom = -1;
    private static Random rand = new Random();
    private RegularMole regularmole= new RegularMole();
    private BuffMole buffmole = new BuffMole();
    private int roundtime = 59;
    private Text timetext = new Text("59");
    private boolean isFirstClicked = true;
    private boolean gameEnded = false;
    private Text VictoryText = new Text("You Win!");
    private boolean GameWon = false;
    private Text LoseText = new Text("You Lose :(");
    		
  //  private int afktimer = 10;
  //  private Text afktimertext = new Text("10");
    
 
    
   
    
	
	//final static Text pl_score_text = new Text(170, 120, Integer.toString(TotalScore));
	//private static int roundtime = 0;
	

	
	
	public void switchtoScene1(ActionEvent event) throws IOException {
		Parent root = FXMLLoader.load(getClass().getResource("CS2 Final - Daniel & Tobi Start Game.fxml"));
		scoreValue.setText("0");
		TotalScore = 0;
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	public void switchtoScene2(ActionEvent event)throws IOException {
		
		Pane root = FXMLLoader.load(getClass().getResource("GameScene.fxml"));
		
		Image cursorImage = new Image("file:///C:/Users/danie/Downloads/Hammer.png");
		ImageCursor customCursor = new ImageCursor(cursorImage);
		root.setCursor(customCursor);
		
		
		
		
		scoreLabel.setFont(Font.font("KBanAvoxlost", 20));
		scoreLabel.setLayoutX(531);
		scoreLabel.setLayoutY(73);
		 
		 
		 
		 scoreValue = new Text("0");
		 scoreValue.setViewOrder(-1);
		 scoreValue.setX(548);
		 scoreValue.setY(110);
		 scoreValue.setFont(Font.font("KBanAvoxlost", 14));
		 
		
		 gamemole1.setX(10);
		 gamemole1.setY(210);
		 gamemole1.setFitWidth(140);
		 gamemole1.setFitHeight(112);
		 
		 
		 buffgamemole.setX(700);
		 buffgamemole.setY(700);
		 buffgamemole.setFitWidth(140);
		 buffgamemole.setFitHeight(150);
		 buffgamemole.setVisible(true);
		
		 
		 if ("20".equals(scoreValue.getText())) {
			    SetBuffMole();
			} 
		 else if ("40".equals(scoreValue.getText())) {
			    SetBuffMole();
			}
		 
		 timetext.setX(45);
		 timetext.setY(95);
		 timetext.setFont(Font.font("KBanAvoxlost", 15));
		 
		 TranslateTransition translate5 = new TranslateTransition();
		 translate5.setNode(gamemole1);
		 translate5.setByY(-20);
		 translate5.setDuration(Duration.millis(1000));
		 translate5.setCycleCount(TranslateTransition.INDEFINITE);
		 translate5.setAutoReverse(true);
		 translate5.play();
		 
		 VictoryText.setFont(Font.font("KBanAvoxlost", 50));
		 VictoryText.setFill(Color.YELLOW);
		 VictoryText.setLayoutX(205);
         VictoryText.setLayoutY(205);
         VictoryText.setOpacity(0.0);
         VictoryText.toFront();
		
         LoseText.setFont(Font.font("KBanAvoxlost", 50));
         LoseText.setFill(Color.RED);
         LoseText.setLayoutX(205);
         LoseText.setLayoutY(205);
         LoseText.setOpacity(0.0);
         LoseText.toFront();
		 
		 root.getChildren().add(scoreValue);
		 root.getChildren().add(gamemole1);
		 root.getChildren().add(scoreLabel);
		 root.getChildren().add(timetext);
		 root.getChildren().add(buffgamemole);
		 root.getChildren().add(VictoryText);
		 root.getChildren().add(LoseText);
		 
		 
		 

		 
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setResizable(false);
		stage.setScene(scene);
		stage.show();
	}
	
	
	
	
	
	
	public void updateScoreDisplay(int newScore) {
	
	scoreValue.setText(String.valueOf(newScore));
	}
	
	
	@FXML
	private ImageView startmole1;
	@FXML
	private ImageView startmole2;
	@FXML
	private ImageView startmole3;
	@FXML
	private ImageView startmole4;
	
	
	// Hole 1:  X: 112 Y: 96
	// Hole 2:  X: 370 Y: 96
	// Hole 3: 	X: 10  Y: 210
	// Hole 4: 	X: 230 Y: 214
	// Hole 5:  X: 443 Y: 214
	

	
	public static int getRandomNumber() {
        int randomInt;

        // Generate a random number
        do {
            randomInt = rand.nextInt(5) + 1;
        } while (randomInt == previousRandom);

        // Update the previousRandom
        previousRandom = randomInt;

        return randomInt;
    }
	
	
	private void moveMole1() {
		int randomHole = getRandomNumber();
		if (randomHole == 1) {
			gamemole1.setX(112);
			gamemole1.setY(96);
			
		}
		else if (randomHole == 2) {
			gamemole1.setX(370);
			gamemole1.setY(96);
			
		}
		else if (randomHole == 3) {
			gamemole1.setX(230);
			gamemole1.setY(214);
			
		}
		else if (randomHole == 4) {
			gamemole1.setX(10);
			gamemole1.setY(210);
			
		}
		else if (randomHole == 5) {
			gamemole1.setX(443);
			gamemole1.setY(214);
			
		}
		
	}
	
	private void MoveAwayBuffMole () {
		buffgamemole.setX(700);
		buffgamemole.setY(700);
		buffgamemole.setOpacity(1.0);
		
	}
	private void SetBuffMole() {
		buffgamemole.setX(370);
		buffgamemole.setY(80);
		buffgamemole.setOpacity(1.0);
		buffgamemole.toFront();
		buffgamemole.setVisible(true);
		
	}
	
	
	
		
		
	
	@FXML
	private void handleMole1Clicked() {
		if (!gameEnded) {
		if (isFirstClicked) {
			timetext.setText(String.valueOf(roundtime));
			 
			 Timeline roundTimeline = new Timeline(new KeyFrame (Duration.seconds(1), e ->{
				 roundtime--;
				 timetext.setText(String.valueOf(roundtime));
			 }));
				roundTimeline.setCycleCount(59); 
				roundTimeline.play();
				isFirstClicked = false;
				
			 }
		
		TotalScore += regularmole.getScoreValue();  // Increase score by 1
		updateScoreDisplay(TotalScore);  // Update displayed score
		//gamemole1.setOpacity(0.0);
		moveMole1();
		 if ("20".equals(scoreValue.getText())) {
			    SetBuffMole();
			} 
		 else if ("40".equals(scoreValue.getText())) {
			    SetBuffMole();
			}
		 else if ("60".equals(scoreValue.getText())) {
			    SetBuffMole();
		 }
		 if (roundtime > 0 && TotalScore >= 69) {
			 GameWon = true;
			 VictoryText.setOpacity(1);
	            gamemole1.setDisable(true);
	    		buffgamemole.setDisable(true);
			 
		 }
		 else if (roundtime == 0) {	 
			 LoseText.setOpacity(1);
			 LoseText.toFront();
			 gamemole1.setDisable(true);
			 buffgamemole.setDisable(true);
			
		 }
		 else if (roundtime <= 30 && TotalScore <= 20) {
			 LoseText.setOpacity(1);
			 LoseText.toFront();
			 gamemole1.setDisable(true);
			 buffgamemole.setDisable(true);
		 }
		}
	}
		

	
	
	
	
	
	@FXML
	private void handleBuffMoleClicked() {
		TotalScore += buffmole.getScoreValue();  // Increase score by 10
		updateScoreDisplay(TotalScore);  // Update displayed score
		MoveAwayBuffMole();
		
		
	}
	
	
	
	
	
	@Override
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
		 
		 
	 
		 gamemole1.setOnMouseClicked(event -> handleMole1Clicked());
		 buffgamemole.setOnMouseClicked(event -> handleBuffMoleClicked());
		 
		 }
		 
	}

	

	
	

