

import java.io.IOException;

import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class JavaFXController {
	
	
	//MAIN PAGE
	@FXML //This is used to assign buttons and text boxes the .fxml files that I have created 
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
	@FXML
	private TextArea logTextArea;
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
			
			Scene quitPage = new Scene(FXMLLoader.load(getClass().getResource("javafx/QuitPage.fxml")));
			Main.GUIGlobal.setScene(quitPage);
			
			for (int i = 0; i < Main.triangleList.size(); ++i) { // this is getting the triangle lengths from the linked list
				Integer[] triangle;
				triangle = Main.triangleList.get(i);
				int a, b, c;
				a = triangle[0]; 
				b = triangle[1]; 
				c = triangle[2]; 
				
			}
			
			for (int i = 0; i < Main.rectangleList.size(); ++i) { // this is getting the rectangle lengths from the linked list
				Integer[] rectangle = Main.rectangleList.get(i);
				int a, b;
				a = rectangle[0];
				b = rectangle[1];
//				textArea.appendText(String.valueOf(a)); // "String.valueof" will convert the integer to a string 
//				textArea.appendText(String.valueOf(b));
				logTextArea.setText("Hello world");
			}
			return;
		}
		//GOTO error
		Scene ErrorPageLetter = new Scene(FXMLLoader.load(getClass().getResource("javafx/ErrorPageLetter.fxml")));
		Main.GUIGlobal.setScene(ErrorPageLetter);
		
		
		// Increase Red
		for (int i = 0; i < 200; i += 40) {
			Main.Bray.setLED(i, 0, 0);
			Main.Bray.buzz(250,1000);
		}
		// Decrease Red
		for (int i = 200; i >= 0; i -= 40) {
			Main.Bray.setLED(i, 0, 0);
		}
		// Increase Red
		for (int i = 0; i < 200; i += 40) {
			Main.Bray.setLED(i, 0, 0);
		}
		// Decrease Red
		for (int i = 200; i >= 0; i -= 40) {
			Main.Bray.setLED(i, 0, 0);
		}
		// Increase Red
		for (int i = 0; i < 200; i += 40) {
			Main.Bray.setLED(i, 0, 0);
		}
		// Decrease Red
		for (int i = 200; i >= 0; i -= 40) {
			Main.Bray.setLED(i, 0, 0);
		}
		// Increase Red
		for (int i = 0; i < 200; i += 40) {
			Main.Bray.setLED(i, 0, 0);
		}
		// Decrease Red
		for (int i = 200; i >= 0; i -= 40) {
			Main.Bray.setLED(i, 0, 0);
		}
		// Increase Red
		for (int i = 0; i < 200; i += 40) {
			Main.Bray.setLED(i, 0, 0);
		}
		// Decrease Red
		for (int i = 200; i >= 0; i -= 40) {
			Main.Bray.setLED(i, 0, 0);
		}
		
		
	}
	
	public void okMainButtonOnAction (Event e) throws IOException {
		textEnter(e);
	}
	
	public void quitButtonOnAction (Event e) throws IOException {
		System.exit(0);
	}
	
	
	//ERRORLETTER PAGE
	@FXML
	private Button errorLetterButton;
	
	public void errorLetterButtonOnAction (Event e) throws IOException {
		
		Scene mainPage = new Scene(FXMLLoader.load(getClass().getResource("javafx/mainPage.fxml")));
		Main.GUIGlobal.setScene(mainPage);
		
	}
	
	//ERRORSIZE PAGE
	@FXML
	private Button errorSizeButton;
	
	public void errorSizeButtonOnAction (Event e) throws IOException {
	
		Scene mainPage = new Scene(FXMLLoader.load(getClass().getResource("javafx/mainPage.fxml")));
		Main.GUIGlobal.setScene(mainPage);
	}
	
	// ERRORTRIANGLE PAGE
	@FXML
	private Button errorTriangleButton;
	
	public void errorTriangleButtonOnAction (Event e) throws IOException {
		
		Scene mainPage = new Scene(FXMLLoader.load(getClass().getResource("javafx/mainPage.fxml")));
		Main.GUIGlobal.setScene(mainPage);
	}
	
	
	
	//TRIANGLE PAGE
	@FXML
	private TextField textBoxA, textBoxB, textBoxC;
	
	public void okTriButtonOnAction (Event e) throws IOException {
		int a = 0, b = 0, c = 0; 
		try {
		a = Integer.valueOf(textBoxA.getText()); //String is converted to an integer
		b = Integer.valueOf(textBoxB.getText());
		c = Integer.valueOf(textBoxC.getText());
		} catch (NumberFormatException ex) { //Catch any errors and go to the error page specified below
			Scene ErrorPageSize = new Scene(FXMLLoader.load(getClass().getResource("javafx/ErrorPageSize.fxml")));
			Main.GUIGlobal.setScene(ErrorPageSize);
			
			// Increase Red
			for (int i = 0; i < 200; i += 40) {
				Main.Bray.setLED(i, 0, 0);
				Main.Bray.buzz(250,1000);
			}
			// Decrease Red
			for (int i = 200; i >= 0; i -= 40) {
				Main.Bray.setLED(i, 0, 0);
			}
			// Increase Red
			for (int i = 0; i < 200; i += 40) {
				Main.Bray.setLED(i, 0, 0);
			}
			// Decrease Red
			for (int i = 200; i >= 0; i -= 40) {
				Main.Bray.setLED(i, 0, 0);
			}
			// Increase Red
			for (int i = 0; i < 200; i += 40) {
				Main.Bray.setLED(i, 0, 0);
			}
			// Decrease Red
			for (int i = 200; i >= 0; i -= 40) {
				Main.Bray.setLED(i, 0, 0);
			}
			// Increase Red
			for (int i = 0; i < 200; i += 40) {
				Main.Bray.setLED(i, 0, 0);
			}
			// Decrease Red
			for (int i = 200; i >= 0; i -= 40) {
				Main.Bray.setLED(i, 0, 0);
			}
			// Increase Red
			for (int i = 0; i < 200; i += 40) {
				Main.Bray.setLED(i, 0, 0);
			}
			// Decrease Red
			for (int i = 200; i >= 0; i -= 40) {
				Main.Bray.setLED(i, 0, 0);
			}
			
		}
		
		
		if (a <20 || a >80) {
			Scene ErrorPageSize = new Scene(FXMLLoader.load(getClass().getResource("javafx/ErrorPageSize.fxml")));
			Main.GUIGlobal.setScene(ErrorPageSize);
			
			// Increase Red
			for (int i = 0; i < 200; i += 40) {
				Main.Bray.setLED(i, 0, 0);
				Main.Bray.buzz(250,1000);
			}
			// Decrease Red
			for (int i = 200; i >= 0; i -= 40) {
				Main.Bray.setLED(i, 0, 0);
			}
			// Increase Red
			for (int i = 0; i < 200; i += 40) {
				Main.Bray.setLED(i, 0, 0);
			}
			// Decrease Red
			for (int i = 200; i >= 0; i -= 40) {
				Main.Bray.setLED(i, 0, 0);
			}
			// Increase Red
			for (int i = 0; i < 200; i += 40) {
				Main.Bray.setLED(i, 0, 0);
			}
			// Decrease Red
			for (int i = 200; i >= 0; i -= 40) {
				Main.Bray.setLED(i, 0, 0);
			}
			// Increase Red
			for (int i = 0; i < 200; i += 40) {
				Main.Bray.setLED(i, 0, 0);
			}
			// Decrease Red
			for (int i = 200; i >= 0; i -= 40) {
				Main.Bray.setLED(i, 0, 0);
			}
			// Increase Red
			for (int i = 0; i < 200; i += 40) {
				Main.Bray.setLED(i, 0, 0);
			}
			// Decrease Red
			for (int i = 200; i >= 0; i -= 40) {
				Main.Bray.setLED(i, 0, 0);
			}
			
			return;
		}
		
		else if (b <20 || b >80) {
			Scene ErrorPageSize = new Scene(FXMLLoader.load(getClass().getResource("javafx/ErrorPageSize.fxml")));
			Main.GUIGlobal.setScene(ErrorPageSize);
			
			// Increase Red
			for (int i = 0; i < 200; i += 40) {
				Main.Bray.setLED(i, 0, 0);
				Main.Bray.buzz(250,1000);
			}
			// Decrease Red
			for (int i = 200; i >= 0; i -= 40) {
				Main.Bray.setLED(i, 0, 0);
			}
			// Increase Red
			for (int i = 0; i < 200; i += 40) {
				Main.Bray.setLED(i, 0, 0);
			}
			// Decrease Red
			for (int i = 200; i >= 0; i -= 40) {
				Main.Bray.setLED(i, 0, 0);
			}
			// Increase Red
			for (int i = 0; i < 200; i += 40) {
				Main.Bray.setLED(i, 0, 0);
			}
			// Decrease Red
			for (int i = 200; i >= 0; i -= 40) {
				Main.Bray.setLED(i, 0, 0);
			}
			// Increase Red
			for (int i = 0; i < 200; i += 40) {
				Main.Bray.setLED(i, 0, 0);
			}
			// Decrease Red
			for (int i = 200; i >= 0; i -= 40) {
				Main.Bray.setLED(i, 0, 0);
			}
			// Increase Red
			for (int i = 0; i < 200; i += 40) {
				Main.Bray.setLED(i, 0, 0);
			}
			// Decrease Red
			for (int i = 200; i >= 0; i -= 40) {
				Main.Bray.setLED(i, 0, 0);
			}
			
			return;
		}
		
		else if (c <20 || c >80) {
			Scene ErrorPageSize = new Scene(FXMLLoader.load(getClass().getResource("javafx/ErrorPageSize.fxml")));
			Main.GUIGlobal.setScene(ErrorPageSize);
			
			// Increase Red
			for (int i = 0; i < 200; i += 40) {
				Main.Bray.setLED(i, 0, 0);
				Main.Bray.buzz(250,1000);
			}
			// Decrease Red
			for (int i = 200; i >= 0; i -= 40) {
				Main.Bray.setLED(i, 0, 0);
			}
			// Increase Red
			for (int i = 0; i < 200; i += 40) {
				Main.Bray.setLED(i, 0, 0);
			}
			// Decrease Red
			for (int i = 200; i >= 0; i -= 40) {
				Main.Bray.setLED(i, 0, 0);
			}
			// Increase Red
			for (int i = 0; i < 200; i += 40) {
				Main.Bray.setLED(i, 0, 0);
			}
			// Decrease Red
			for (int i = 200; i >= 0; i -= 40) {
				Main.Bray.setLED(i, 0, 0);
			}
			// Increase Red
			for (int i = 0; i < 200; i += 40) {
				Main.Bray.setLED(i, 0, 0);
			}
			// Decrease Red
			for (int i = 200; i >= 0; i -= 40) {
				Main.Bray.setLED(i, 0, 0);
			}
			// Increase Red
			for (int i = 0; i < 200; i += 40) {
				Main.Bray.setLED(i, 0, 0);
			}
			// Decrease Red
			for (int i = 200; i >= 0; i -= 40) {
				Main.Bray.setLED(i, 0, 0);
			}
			
			return;
		}
		
		Main.DrawTriangle(a, b, c); //Get the values from text box a,b,c and draws the triangle using the values entered by user
		
		Scene ProcessingPage = new Scene(FXMLLoader.load(getClass().getResource("javafx/ProcessingPage.fxml")));
		Main.GUIGlobal.setScene(ProcessingPage);
	}
	
	//RECTANGLE PAGE
	@FXML
	private TextField textBoxWidth, textBoxHeight; 
		
	public void okRecButtonOnAction (Event e) throws IOException, InterruptedException {
		int a = 0, b = 0;
		

		try {
		a = Integer.valueOf(textBoxHeight.getText());
		b = Integer.valueOf(textBoxWidth.getText());
		} catch (NumberFormatException ex) {
			Scene ErrorPageSize = new Scene(FXMLLoader.load(getClass().getResource("javafx/ErrorPageSize.fxml")));
			Main.GUIGlobal.setScene(ErrorPageSize);
			
			
			// Increase Red
			for (int i = 0; i < 200; i += 40) {
				Main.Bray.setLED(i, 0, 0);
				Main.Bray.buzz(250,1000);
			}
			// Decrease Red
			for (int i = 200; i >= 0; i -= 40) {
				Main.Bray.setLED(i, 0, 0);
			}
			// Increase Red
			for (int i = 0; i < 200; i += 40) {
				Main.Bray.setLED(i, 0, 0);
			}
			// Decrease Red
			for (int i = 200; i >= 0; i -= 40) {
				Main.Bray.setLED(i, 0, 0);
			}
			// Increase Red
			for (int i = 0; i < 200; i += 40) {
				Main.Bray.setLED(i, 0, 0);
			}
			// Decrease Red
			for (int i = 200; i >= 0; i -= 40) {
				Main.Bray.setLED(i, 0, 0);
			}
			// Increase Red
			for (int i = 0; i < 200; i += 40) {
				Main.Bray.setLED(i, 0, 0);
			}
			// Decrease Red
			for (int i = 200; i >= 0; i -= 40) {
				Main.Bray.setLED(i, 0, 0);
			}
			// Increase Red
			for (int i = 0; i < 200; i += 40) {
				Main.Bray.setLED(i, 0, 0);
			}
			// Decrease Red
			for (int i = 200; i >= 0; i -= 40) {
				Main.Bray.setLED(i, 0, 0);
			}
			
		}
		

		
		if (a <20 || a >80) {
			Scene ErrorPageSize = new Scene(FXMLLoader.load(getClass().getResource("javafx/ErrorPageSize.fxml")));
			Main.GUIGlobal.setScene(ErrorPageSize);
			
			// Increase Red
			for (int i = 0; i < 200; i += 40) {
				Main.Bray.setLED(i, 0, 0);
				Main.Bray.buzz(250,1000);
			}
			// Decrease Red
			for (int i = 200; i >= 0; i -= 40) {
				Main.Bray.setLED(i, 0, 0);
			}
			// Increase Red
			for (int i = 0; i < 200; i += 40) {
				Main.Bray.setLED(i, 0, 0);
			}
			// Decrease Red
			for (int i = 200; i >= 0; i -= 40) {
				Main.Bray.setLED(i, 0, 0);
			}
			// Increase Red
			for (int i = 0; i < 200; i += 40) {
				Main.Bray.setLED(i, 0, 0);
			}
			// Decrease Red
			for (int i = 200; i >= 0; i -= 40) {
				Main.Bray.setLED(i, 0, 0);
			}
			// Increase Red
			for (int i = 0; i < 200; i += 40) {
				Main.Bray.setLED(i, 0, 0);
			}
			// Decrease Red
			for (int i = 200; i >= 0; i -= 40) {
				Main.Bray.setLED(i, 0, 0);
			}
			// Increase Red
			for (int i = 0; i < 200; i += 40) {
				Main.Bray.setLED(i, 0, 0);
			}
			// Decrease Red
			for (int i = 200; i >= 0; i -= 40) {
				Main.Bray.setLED(i, 0, 0);
			}
			
			return;
		}
		
		else if (b <20 || b >80) {
			Scene ErrorPageSize = new Scene(FXMLLoader.load(getClass().getResource("javafx/ErrorPageSize.fxml")));
			Main.GUIGlobal.setScene(ErrorPageSize);
			
			// Increase Red
			for (int i = 0; i < 200; i += 40) {
				Main.Bray.setLED(i, 0, 0);
				Main.Bray.buzz(250,1000);
			}
			// Decrease Red
			for (int i = 200; i >= 0; i -= 40) {
				Main.Bray.setLED(i, 0, 0);
			}
			// Increase Red
			for (int i = 0; i < 200; i += 40) {
				Main.Bray.setLED(i, 0, 0);
			}
			// Decrease Red
			for (int i = 200; i >= 0; i -= 40) {
				Main.Bray.setLED(i, 0, 0);
			}
			// Increase Red
			for (int i = 0; i < 200; i += 40) {
				Main.Bray.setLED(i, 0, 0);
			}
			// Decrease Red
			for (int i = 200; i >= 0; i -= 40) {
				Main.Bray.setLED(i, 0, 0);
			}
			// Increase Red
			for (int i = 0; i < 200; i += 40) {
				Main.Bray.setLED(i, 0, 0);
			}
			// Decrease Red
			for (int i = 200; i >= 0; i -= 40) {
				Main.Bray.setLED(i, 0, 0);
			}
			// Increase Red
			for (int i = 0; i < 200; i += 40) {
				Main.Bray.setLED(i, 0, 0);
			}
			// Decrease Red
			for (int i = 200; i >= 0; i -= 40) {
				Main.Bray.setLED(i, 0, 0);
			}
			
			return;
		}
	

				
		Main.DrawRectangle(a, b);
		
		Scene ProcessingPage = new Scene(FXMLLoader.load(getClass().getResource("javafx/ProcessingPage.fxml")));
		Main.GUIGlobal.setScene(ProcessingPage);
		


			

			
	}
	@FXML 
	private Button cancelButton;
	
	public void cancelButtonOnAction (Event e) throws IOException {
		
		Main.isCancelled = true;
		
		Scene mainPage = new Scene(FXMLLoader.load(getClass().getResource("javafx/mainPage.fxml")));
		Main.GUIGlobal.setScene(mainPage);
		
		
	}
	@FXML
	private Button doneButton;
	
	public void doneButtonOnAction (Event e) throws IOException {
		
		Main.isCancelled = true;
		
		Scene mainPage = new Scene(FXMLLoader.load(getClass().getResource("javafx/mainPage.fxml")));
		Main.GUIGlobal.setScene(mainPage);
	}
	
}
