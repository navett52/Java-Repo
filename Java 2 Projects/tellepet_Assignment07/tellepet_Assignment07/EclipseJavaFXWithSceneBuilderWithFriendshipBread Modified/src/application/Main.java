/**************************************************
 * Simple Project with Scene Builder              *
 *                                                *
 * Your Friendship Bread                          *
 *                                                *
 * Bill Nicholson                                 *
 * nicholdw@ucmail.uc.edu                         *
 **************************************************/
// Event Handling: http://code.makery.ch/blog/javafx-8-event-handling-examples/
/******************************************************
 * Edited by Evan Tellep                              *
 * Assignment 07                                      *
 * 03/08/2016                                         *
 * IT2045C (Computer Programming 2)                   *
 * Redo scene to allow employee to be added to db     *
 * OnClick written by Evan Tellep; FXML imports also  *
 * Ref:                                               *
 ******************************************************/
package application;
	
import java.net.URL;
import java.util.ResourceBundle;

import databaseUtilities.DatabaseInterface;
import employee.Employee;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;

//
public class Main extends Application {
	//Importing the objects from the scene
	@FXML
	private Button btnClickMe;	
	@FXML
	private TextField txtInputFirstName;
	@FXML
	private TextField txtInputLastName;
	@FXML
	private TextField txtInputEmployeeNumber;
	
	//OnClick method tells program what I want done when button is clicked
	@FXML
	public void OnClick(ActionEvent evt){
		//Creating a new DatabaseInteface object so I can call addEmployee method
		DatabaseInterface db = new DatabaseInterface();
		//Grabbing the test from the text fields in the scene and storing them in variables to be used to create employee
		String FirstName = txtInputFirstName.getText();
		String LastName = txtInputLastName.getText();
		String EmployeeNumber = txtInputEmployeeNumber.getText();
		//Creating employee object to be added to the database
		Employee test = new Employee(EmployeeNumber, LastName, FirstName);
		//Adding the newly created employee to the database
		db.AddEmployee(test);
	}

	@Override
	public void start(Stage primaryStage) {

		btnClickMe = new Button("btnClickMe");
		txtInputFirstName = new TextField();
		txtInputLastName = new TextField();
		txtInputEmployeeNumber = new TextField();

		try {
            Pane root;

			// Load root layout from fxml file.
            FXMLLoader loader = new FXMLLoader();
            
            loader.setLocation(Main.class.getResource("/application/DataEntry.fxml"));
            root = (Pane) loader.load();

			Scene scene = new Scene(root,600,600);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			// This Bootstrap CSS throws off many errors at runtime but the project continues.
			//scene.getStylesheets().add(getClass().getResource("bootstrap.css").toExternalForm());
			primaryStage.setScene(scene);
	        primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
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
