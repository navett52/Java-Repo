/* 
 Bill Nicholson
 nicholdw@ucmail.uc.edu
 
 Build a stage (window) from the ground up.

 JavaFX terminology:
     A window is called a stage
     The contents of the window is called a scene

 This example does not use SceneBuilder

 See https://www.youtube.com/watch?v=FLkOX4Eez6o for a tutorial on this

 If you get an restricted class error when you extend the Application class: 
                http://stackoverflow.com/questions/860187/access-restriction-on-class-due-to-restriction-on-required-library-rt-jar
*/

package helloWorld;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Region;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class HelloWorld extends javafx.application.Application {

	public static void main(String[] args) {	
		launch(args);	//  Required. Just put it here and fuget about it. 
	}

	@Override
	// This method is called automagically by javafx.application.Application
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("Hello World using JavaFX");
		
		Button btnNew = new Button();
		btnNew.setText("Click Me");
		
		// Define a layout for our scene
		StackPane layout = new StackPane();
		layout.getChildren().add(btnNew);
		
		// create the contents of the window and add the scene to the stage (window).
		Scene scene = new Scene(layout, 300, 250);
		
		primaryStage.setScene(scene);
		scene.getStylesheets().add(HelloWorld.class.getResource("win7Button.css").toExternalForm());
		primaryStage.show();
		
	}
}
