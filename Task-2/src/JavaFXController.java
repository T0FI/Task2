
import java.io.IOException;

import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class JavaFXController {
	
	
	//MAIN PAGE
	@FXML
	private Button triangleButton;
	
	public void triangleButtonOnAction(Event e) throws IOException {
		Scene trianglePage = new Scene(FXMLLoader.load(getClass().getResource("javafx/TrianglePage.fxml")));
		Main.GUIGlobal.setScene(trianglePage);
	}
	
	@FXML
	private Button rectangleButton;
	
	public void rectangleButtonOnAction(Event e) throws IOException {
		Scene rectanglePage = new Scene (FXMLLoader.load(getClass().getResource("javafx/RectanglePage.fxml")));
		Main.GUIGlobal.setScene(rectanglePage);
	}
	
	@FXML
	private TextField letterTextBox;
	
	public void textEnter (Event e) throws IOException {
		String input = letterTextBox.getText();
		
		if (input.equalsIgnoreCase("r")) {
			
			Scene rectanglePage = new Scene (FXMLLoader.load(getClass().getResource("javafx/RectanglePage.fxml")));
			Main.GUIGlobal.setScene(rectanglePage);
			return;
		}
		
		else if (input.equalsIgnoreCase("t")) {
			
			Scene trianglePage = new Scene(FXMLLoader.load(getClass().getResource("javafx/TrianglePage.fxml")));
			Main.GUIGlobal.setScene(trianglePage);
			return;
			}
		else if (input.equalsIgnoreCase("q")) {
			
			
			
			return;
		}
		
		Scene ErrorPageLetter = new Scene(FXMLLoader.load(getClass().getResource("javafx/ErrorPageLetter.fxml")));
		Main.GUIGlobal.setScene(ErrorPageLetter);
		//GOTO error
		
	}
	
	public void okMainButtonOnAction (Event e) throws IOException {
		textEnter(e);
	}
	
	
	//ERRORLETTER PAGE
	private Button errorLetterButton;
	
	public void errorLetterOnAction (Event e) throws IOException {
		
		Scene mainPage = new Scene(FXMLLoader.load(getClass().getResource("javafx/mainPage.fxml")));
		Main.GUIGlobal.setScene(mainPage);
		
	}
	
	
	//TRIANGLE PAGE
	
	
	
	
	
	
}
