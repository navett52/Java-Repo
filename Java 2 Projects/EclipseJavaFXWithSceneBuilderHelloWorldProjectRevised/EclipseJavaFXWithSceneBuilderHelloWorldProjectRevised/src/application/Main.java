/**************************************************
 * Hello World Project with Scene Builder         *
 *                                                *
 * Bill Nicholson                                 *
 * nicholdw@ucmail.uc.edu                         *
 **************************************************/
// Event Handling: http://code.makery.ch/blog/javafx-8-event-handling-examples/

 
package application;
	
import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;


public class Main extends Application {
	@FXML
	private Button btnClickMe;	
	@FXML
	private TextField txtInput;
	
	@FXML
	public void OnClick(ActionEvent evt){
          System.out.println("Button clicked.");  
          // pop up a window and display the contents of txtInput
          // Jerry says ...
          Alert alert = new Alert(AlertType.INFORMATION);
          alert.setTitle("Jerry Rocks");
          alert.setContentText(txtInput.getText());
          alert.showAndWait();
        }
	
	@Override
	public void start(Stage primaryStage) {

		btnClickMe = new Button("btnClickMe");
		txtInput = new TextField();

		try {
            //BorderPane root = new BorderPane();
            Pane root;

			// Load root layout from fxml file.
            FXMLLoader loader = new FXMLLoader();
            
            loader.setLocation(Main.class.getResource("/application/FXMLHelloWorld.fxml"));
            root = (Pane) loader.load();

			Scene scene = new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}


        // lambda expression
//		btnClickMe.setOnAction(evt ->System.out.println("Lambdaler. Cancel clicked."));
	}
	
   // @Override // This method is called by the FXMLLoader when initialization is complete
    public void initialize(URL fxmlFileLocation, ResourceBundle resources) {
        assert btnClickMe != null : "fx:id=\"btnClickMe\" was not injected: check your FXML file 'simple.fxml'.";
        // initialize your logic here: all @FXML variables will have been injected
    }
	public static void main(String[] args) {
		launch(args);
	}
	
}
