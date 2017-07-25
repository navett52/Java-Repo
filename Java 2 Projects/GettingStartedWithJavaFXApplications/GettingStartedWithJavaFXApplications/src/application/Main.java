// Adapted from http://docs.oracle.com/javase/8/javafx/get-started-tutorial/get_start_apps.htm#JFXST804
// Bill Nicholson
// nicholdw@ucmail.uc.edu

package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			BorderPane root = new BorderPane();
			Scene scene = new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			//add label
			Label l = new Label();
			
			l.setText("I love CNE Highschool");
			StackPane layout = new StackPane();
			layout.getChildren().add(l);
			
			Scene scene1 = new Scene(layout,300,300);
			
			primaryStage.setScene(scene1);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
