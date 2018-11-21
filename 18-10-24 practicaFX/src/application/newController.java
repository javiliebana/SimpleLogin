package application;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class newController {
	
	private Stage stage;
	@FXML
	private void handleClose() {
		System.exit(0);
	}
	@FXML
	private void nuevaVista() {
		try {
	        FXMLLoader loader = new FXMLLoader();
	        loader.setLocation(getClass().getResource("NewDocument.fxml"));
	        AnchorPane mypane = (AnchorPane) loader.load();
	        Scene scene= new Scene(mypane);
	        stage = new Stage();
	        stage.setTitle("New Window");
	        stage.setScene(scene);
	        stage.show();
	        
  
	    } catch (IOException e) {
	        
	    }
	}
}
