package application;

import java.io.IOException;

import javafx.animation.FadeTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;

public class SceneController {

 private Stage stage;
 private Scene scene;
 private Parent root;
 private StackPane rootPane;
 
 Button btn1,btn2;
 
 public void switchToScene1() throws IOException {
	
Parent root =FXMLLoader.Load(getClass().getResource("Scene2.fxml"));
Stage window = (Stage) btn1.getScene().getWindow();
window.setScene(new Scene(root,750,500));
 }
 
 public void switchToScene2 (ActionEvent event) throws IOException {
	 makeFadeOut();
  Parent root = FXMLLoader.load(getClass().getResource("Scene3.fxml"));
  stage = (Stage)((Node)event.getSource()).getScene().getWindow();
  scene = new Scene(root);
  stage.setScene(scene);
  stage.show();
 }
 
 public void switchScene3(ActionEvent event) throws IOException {
	  Parent root = FXMLLoader.load(getClass().getResource("Scene3.fxml"));
	  stage = (Stage)((Node)event.getSource()).getScene().getWindow();
	  scene = new Scene(root);
	  stage.setScene(scene);
	  stage.show();
	 }
 
 public void switchToScene4(ActionEvent event) throws IOException {
	 makeFadeOut();
  Parent root = FXMLLoader.load(getClass().getResource("Scene4.fxml"));
  stage = (Stage)((Node)event.getSource()).getScene().getWindow();
  scene = new Scene(root);
  stage.setScene(scene);
  stage.show();
 }
 
 public void switchToScene5(ActionEvent event) throws IOException {
	 makeFadeOut();
  Parent root = FXMLLoader.load(getClass().getResource("Scene5.fxml"));
  stage = (Stage)((Node)event.getSource()).getScene().getWindow();
  scene = new Scene(root);
  stage.setScene(scene);
  stage.show();
 }
 
 public void switchToScene6(ActionEvent event) throws IOException {
	 makeFadeOut();
  Parent root = FXMLLoader.load(getClass().getResource("Scene6.fxml"));
  stage = (Stage)((Node)event.getSource()).getScene().getWindow();
  scene = new Scene(root);
  stage.setScene(scene);
  stage.show();
 }
 public void switchToScene7(ActionEvent event) throws IOException {
	 makeFadeOut();
  Parent root = FXMLLoader.load(getClass().getResource("Scene7.fxml"));
  stage = (Stage)((Node)event.getSource()).getScene().getWindow();
  scene = new Scene(root);
  stage.setScene(scene);
  stage.show();
 }
 public void switchToScene8(ActionEvent event) throws IOException {
	 makeFadeOut();
  Parent root = FXMLLoader.load(getClass().getResource("Scene8.fxml"));
  stage = (Stage)((Node)event.getSource()).getScene().getWindow();
  scene = new Scene(root);
  stage.setScene(scene);
  stage.show();
 }
 public void switchToScene9(ActionEvent event) throws IOException {
	 makeFadeOut();
  Parent root = FXMLLoader.load(getClass().getResource("Scene9.fxml"));
  stage = (Stage)((Node)event.getSource()).getScene().getWindow();
  scene = new Scene(root);
  stage.setScene(scene);
  stage.show();
 }
 public void switchToScene10(ActionEvent event) throws IOException {
	 makeFadeOut();
  Parent root = FXMLLoader.load(getClass().getResource("Scene10.fxml"));
  stage = (Stage)((Node)event.getSource()).getScene().getWindow();
  scene = new Scene(root);
  stage.setScene(scene);
  stage.show();
 }public void switchToScene11(ActionEvent event) throws IOException {
	 makeFadeOut();
  Parent root = FXMLLoader.load(getClass().getResource("Scene11.fxml"));
  stage = (Stage)((Node)event.getSource()).getScene().getWindow();
  scene = new Scene(root);
  stage.setScene(scene);
  stage.show();
 }public void switchToScene12(ActionEvent event) throws IOException {
	 makeFadeOut();
  Parent root = FXMLLoader.load(getClass().getResource("Scene12.fxml"));
  stage = (Stage)((Node)event.getSource()).getScene().getWindow();
  scene = new Scene(root);
  stage.setScene(scene);
  stage.show();
 }public void switchToScene13(ActionEvent event) throws IOException {
	 makeFadeOut();
  Parent root = FXMLLoader.load(getClass().getResource("Scene13.fxml"));
  stage = (Stage)((Node)event.getSource()).getScene().getWindow();
  scene = new Scene(root);
  stage.setScene(scene);
  stage.show();
 }public void switchToScene14(ActionEvent event) throws IOException {
	 makeFadeOut();
  Parent root = FXMLLoader.load(getClass().getResource("Scene14.fxml"));
  stage = (Stage)((Node)event.getSource()).getScene().getWindow();
  scene = new Scene(root);
  stage.setScene(scene);
  stage.show();
 }public void switchToScene15(ActionEvent event) throws IOException {
	 makeFadeOut();
  Parent root = FXMLLoader.load(getClass().getResource("Scene15.fxml"));
  stage = (Stage)((Node)event.getSource()).getScene().getWindow();
  scene = new Scene(root);
  stage.setScene(scene);
  stage.show();
 }public void switchToScene16(ActionEvent event) throws IOException {
	 makeFadeOut();
  Parent root = FXMLLoader.load(getClass().getResource("Scene16.fxml"));
  stage = (Stage)((Node)event.getSource()).getScene().getWindow();
  scene = new Scene(root);
  stage.setScene(scene);
  stage.show();
 }public void switchToScene17(ActionEvent event) throws IOException {
	 makeFadeOut();
  Parent root = FXMLLoader.load(getClass().getResource("Scene17.fxml"));
  stage = (Stage)((Node)event.getSource()).getScene().getWindow();
  scene = new Scene(root);
  stage.setScene(scene);
  stage.show();
 }public void switchToScene18(ActionEvent event) throws IOException {
	 makeFadeOut();
  Parent root = FXMLLoader.load(getClass().getResource("Scene18.fxml"));
  stage = (Stage)((Node)event.getSource()).getScene().getWindow();
  scene = new Scene(root);
  stage.setScene(scene);
  stage.show();
 }public void switchToScene19(ActionEvent event) throws IOException {
	 makeFadeOut();
  Parent root = FXMLLoader.load(getClass().getResource("Scene19.fxml"));
  stage = (Stage)((Node)event.getSource()).getScene().getWindow();
  scene = new Scene(root);
  stage.setScene(scene);
  stage.show();
 }public void switchToScene20(ActionEvent event) throws IOException {
	 makeFadeOut();
  Parent root = FXMLLoader.load(getClass().getResource("Scene20.fxml"));
  stage = (Stage)((Node)event.getSource()).getScene().getWindow();
  scene = new Scene(root);
  stage.setScene(scene);
  stage.show();
 }public void switchToScene21(ActionEvent event) throws IOException {
	 makeFadeOut();
  Parent root = FXMLLoader.load(getClass().getResource("Scene21.fxml"));
  stage = (Stage)((Node)event.getSource()).getScene().getWindow();
  scene = new Scene(root);
  stage.setScene(scene);
  stage.show();
 }public void switchToScene22(ActionEvent event) throws IOException {
	 makeFadeOut();
  Parent root = FXMLLoader.load(getClass().getResource("Scene22.fxml"));
  stage = (Stage)((Node)event.getSource()).getScene().getWindow();
  scene = new Scene(root);
  stage.setScene(scene);
  stage.show();
 }public void switchToScene23(ActionEvent event) throws IOException {
	 makeFadeOut();
  Parent root = FXMLLoader.load(getClass().getResource("Scene23.fxml"));
  stage = (Stage)((Node)event.getSource()).getScene().getWindow();
  scene = new Scene(root);
  stage.setScene(scene);
  stage.show();
 }
 public void switchToScene24(ActionEvent event) throws IOException {
	 makeFadeOut();
  Parent root = FXMLLoader.load(getClass().getResource("Scene24.fxml"));
  stage = (Stage)((Node)event.getSource()).getScene().getWindow();
  scene = new Scene(root);
  stage.setScene(scene);
  stage.show();
 }public void switchToScene25(ActionEvent event) throws IOException {
	 makeFadeOut();
  Parent root = FXMLLoader.load(getClass().getResource("Scene25.fxml"));
  stage = (Stage)((Node)event.getSource()).getScene().getWindow();
  scene = new Scene(root);
  stage.setScene(scene);
  stage.show();
 }public void switchToScene26(ActionEvent event) throws IOException {
	 makeFadeOut();
  Parent root = FXMLLoader.load(getClass().getResource("Scene26.fxml"));
  stage = (Stage)((Node)event.getSource()).getScene().getWindow();
  scene = new Scene(root);
  stage.setScene(scene);
  stage.show();
 }public void switchToScene27(ActionEvent event) throws IOException {
	 makeFadeOut();
  Parent root = FXMLLoader.load(getClass().getResource("Scene27.fxml"));
  stage = (Stage)((Node)event.getSource()).getScene().getWindow();
  scene = new Scene(root);
  stage.setScene(scene);
  stage.show();
 }public void switchToScene28(ActionEvent event) throws IOException {
	 makeFadeOut();
  Parent root = FXMLLoader.load(getClass().getResource("Scene28.fxml"));
  stage = (Stage)((Node)event.getSource()).getScene().getWindow();
  scene = new Scene(root);
  stage.setScene(scene);
  stage.show();
 }public void switchToScene29(ActionEvent event) throws IOException {
	 makeFadeOut();
  Parent root = FXMLLoader.load(getClass().getResource("Scene29.fxml"));
  stage = (Stage)((Node)event.getSource()).getScene().getWindow();
  scene = new Scene(root);
  stage.setScene(scene);
  stage.show();
 }public void switchToScene30(ActionEvent event) throws IOException {
	 makeFadeOut();
  Parent root = FXMLLoader.load(getClass().getResource("Scene30.fxml"));
  stage = (Stage)((Node)event.getSource()).getScene().getWindow();
  scene = new Scene(root);
  stage.setScene(scene);
  stage.show();
 }public void switchToScene31(ActionEvent event) throws IOException {
	 makeFadeOut();
  Parent root = FXMLLoader.load(getClass().getResource("Scene31.fxml"));
  stage = (Stage)((Node)event.getSource()).getScene().getWindow();
  scene = new Scene(root);
  stage.setScene(scene);
  stage.show();
 }public void switchToScene32(ActionEvent event) throws IOException {
	 makeFadeOut();
  Parent root = FXMLLoader.load(getClass().getResource("Scene32.fxml"));
  stage = (Stage)((Node)event.getSource()).getScene().getWindow();
  scene = new Scene(root);
  stage.setScene(scene);
  stage.show();
 }public void switchToScene33(ActionEvent event) throws IOException {
	 makeFadeOut();
  Parent root = FXMLLoader.load(getClass().getResource("Scene33.fxml"));
  stage = (Stage)((Node)event.getSource()).getScene().getWindow();
  scene = new Scene(root);
  stage.setScene(scene);
  stage.show();
 }public void switchToScene34(ActionEvent event) throws IOException {
	 makeFadeOut();
  Parent root = FXMLLoader.load(getClass().getResource("Scene34.fxml"));
  stage = (Stage)((Node)event.getSource()).getScene().getWindow();
  scene = new Scene(root);
  stage.setScene(scene);
  stage.show();
 }public void switchToScene35(ActionEvent event) throws IOException {
	 makeFadeOut();
  Parent root = FXMLLoader.load(getClass().getResource("Scene35.fxml"));
  stage = (Stage)((Node)event.getSource()).getScene().getWindow();
  scene = new Scene(root);
  stage.setScene(scene);
  stage.show();
 }public void switchToScene36(ActionEvent event) throws IOException {
	 makeFadeOut();
  Parent root = FXMLLoader.load(getClass().getResource("Scene36.fxml"));
  stage = (Stage)((Node)event.getSource()).getScene().getWindow();
  scene = new Scene(root);
  stage.setScene(scene);
  stage.show();
 }public void switchToScene37(ActionEvent event) throws IOException {
	 makeFadeOut();
  Parent root = FXMLLoader.load(getClass().getResource("Scene37.fxml"));
  stage = (Stage)((Node)event.getSource()).getScene().getWindow();
  scene = new Scene(root);
  stage.setScene(scene);
  stage.show();
 }public void switchToScene38(ActionEvent event) throws IOException {
	 makeFadeOut();
  Parent root = FXMLLoader.load(getClass().getResource("Scene38.fxml"));
  stage = (Stage)((Node)event.getSource()).getScene().getWindow();
  scene = new Scene(root);
  stage.setScene(scene);
  stage.show();
 }public void switchToScene39(ActionEvent event) throws IOException {
	 makeFadeOut();
  Parent root = FXMLLoader.load(getClass().getResource("Scene39.fxml"));
  stage = (Stage)((Node)event.getSource()).getScene().getWindow();
  scene = new Scene(root);
  stage.setScene(scene);
  stage.show();
 }public void switchToScene40(ActionEvent event) throws IOException {
	 makeFadeOut();
  Parent root = FXMLLoader.load(getClass().getResource("Scene40.fxml"));
  stage = (Stage)((Node)event.getSource()).getScene().getWindow();
  scene = new Scene(root);
  stage.setScene(scene);
  stage.show();
 }public void switchToScene41(ActionEvent event) throws IOException {
	 makeFadeOut();
  Parent root = FXMLLoader.load(getClass().getResource("Scene41.fxml"));
  stage = (Stage)((Node)event.getSource()).getScene().getWindow();
  scene = new Scene(root);
  stage.setScene(scene);
  stage.show();
 }public void switchToScene42(ActionEvent event) throws IOException {
	 makeFadeOut();
  Parent root = FXMLLoader.load(getClass().getResource("Scene42.fxml"));
  stage = (Stage)((Node)event.getSource()).getScene().getWindow();
  scene = new Scene(root);
  stage.setScene(scene);
  stage.show();
 }public void switchToScene43(ActionEvent event) throws IOException {
	 makeFadeOut();
  Parent root = FXMLLoader.load(getClass().getResource("Scene43.fxml"));
  stage = (Stage)((Node)event.getSource()).getScene().getWindow();
  scene = new Scene(root);
  stage.setScene(scene);
  stage.show();
 }public void switchToScene44(ActionEvent event) throws IOException {
	 makeFadeOut();
  Parent root = FXMLLoader.load(getClass().getResource("Scene44.fxml"));
  stage = (Stage)((Node)event.getSource()).getScene().getWindow();
  scene = new Scene(root);
  stage.setScene(scene);
  stage.show();
 }public void switchToScene45(ActionEvent event) throws IOException {
	 makeFadeOut();
  Parent root = FXMLLoader.load(getClass().getResource("Scene45.fxml"));
  stage = (Stage)((Node)event.getSource()).getScene().getWindow();
  scene = new Scene(root);
  stage.setScene(scene);
  stage.show();
 }public void switchToScene46(ActionEvent event) throws IOException {
	 makeFadeOut();
  Parent root = FXMLLoader.load(getClass().getResource("Scene46.fxml"));
  stage = (Stage)((Node)event.getSource()).getScene().getWindow();
  scene = new Scene(root);
  stage.setScene(scene);
  stage.show();
 }public void switchToScene47(ActionEvent event) throws IOException {
	 makeFadeOut();
  Parent root = FXMLLoader.load(getClass().getResource("Scene47.fxml"));
  stage = (Stage)((Node)event.getSource()).getScene().getWindow();
  scene = new Scene(root);
  stage.setScene(scene);
  stage.show();
 }public void switchToScene48(ActionEvent event) throws IOException {
	 makeFadeOut();
  Parent root = FXMLLoader.load(getClass().getResource("Scene48.fxml"));
  stage = (Stage)((Node)event.getSource()).getScene().getWindow();
  scene = new Scene(root);
  stage.setScene(scene);
  stage.show();
 }public void switchToScene49(ActionEvent event) throws IOException {
	 makeFadeOut();
  Parent root = FXMLLoader.load(getClass().getResource("Scene49.fxml"));
  stage = (Stage)((Node)event.getSource()).getScene().getWindow();
  scene = new Scene(root);
  stage.setScene(scene);
  stage.show();
 }public void switchToScene50(ActionEvent event) throws IOException {
	 makeFadeOut();
  Parent root = FXMLLoader.load(getClass().getResource("Scene50.fxml"));
  stage = (Stage)((Node)event.getSource()).getScene().getWindow();
  scene = new Scene(root);
  stage.setScene(scene);
  stage.show();
 }public void switchToScene51(ActionEvent event) throws IOException {
	 makeFadeOut();
  Parent root = FXMLLoader.load(getClass().getResource("Scene51.fxml"));
  stage = (Stage)((Node)event.getSource()).getScene().getWindow();
  scene = new Scene(root);
  stage.setScene(scene);
  stage.show();
 }public void switchToScene52(ActionEvent event) throws IOException {
	 makeFadeOut();
  Parent root = FXMLLoader.load(getClass().getResource("Scene52.fxml"));
  stage = (Stage)((Node)event.getSource()).getScene().getWindow();
  scene = new Scene(root);
  stage.setScene(scene);
  stage.show();
 }public void switchToScene53(ActionEvent event) throws IOException {
	 makeFadeOut();
  Parent root = FXMLLoader.load(getClass().getResource("Scene53.fxml"));
  stage = (Stage)((Node)event.getSource()).getScene().getWindow();
  scene = new Scene(root);
  stage.setScene(scene);
  stage.show();
 }public void switchToScene54(ActionEvent event) throws IOException {
	 makeFadeOut();
  Parent root = FXMLLoader.load(getClass().getResource("Scene54.fxml"));
  stage = (Stage)((Node)event.getSource()).getScene().getWindow();
  scene = new Scene(root);
  stage.setScene(scene);
  stage.show();
 }public void switchToScene55(ActionEvent event) throws IOException {
	 makeFadeOut();
  Parent root = FXMLLoader.load(getClass().getResource("Scene55.fxml"));
  stage = (Stage)((Node)event.getSource()).getScene().getWindow();
  scene = new Scene(root);
  stage.setScene(scene);
  stage.show();
 }public void switchToScene56(ActionEvent event) throws IOException {
	 makeFadeOut();
  Parent root = FXMLLoader.load(getClass().getResource("Scene56.fxml"));
  stage = (Stage)((Node)event.getSource()).getScene().getWindow();
  scene = new Scene(root);
  stage.setScene(scene);
  stage.show();
 }public void switchToScene57(ActionEvent event) throws IOException {
	 makeFadeOut();
  Parent root = FXMLLoader.load(getClass().getResource("Scene57.fxml"));
  stage = (Stage)((Node)event.getSource()).getScene().getWindow();
  scene = new Scene(root);
  stage.setScene(scene);
  stage.show();
 }
private void makeFadeOut() {
	FadeTransition fadeTransition = new FadeTransition();
	fadeTransition.setDuration(Duration.millis(1000));
	fadeTransition.setNode(rootPane);
	  fadeTransition.setFromValue(1);
	  fadeTransition.setToValue(0);
	  fadeTransition.play();	
}
}