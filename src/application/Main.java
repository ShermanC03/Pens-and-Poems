package application;
 
import java.nio.file.Paths;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

@SuppressWarnings("unused")
public class Main extends Application {
	 
		
 @Override
 public void start(Stage stage) {
  try {
	 SoundHandler.RunMusic("gu/slay.wav");
	  
   Parent root = FXMLLoader.load(getClass().getResource("Scene1.fxml"));
   Scene scene = new Scene(root);
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