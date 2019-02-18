
import java.io.IOException;

import javax.swing.JOptionPane;

import edu.cmu.ri.createlab.terk.robot.finch.Finch;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {  // "extends Application" is used to make the Main class behave like an application 

	public static Finch Bray = new Finch(); 

	@Override
	public void start(Stage GUI) throws IOException { // The main entry point for the designs created using the JavaFX application


		// Check if the finch is levelled on a flat surface
		while (1 == 1) {
			if (Bray.isFinchLevel()) {
				// After confirming finch being levelled
				// Increase Green
				for (int i = 0; i < 256; i += 2) {
					Main.Bray.setLED(0, i, 0);

				}
				// Decrease Green
				for (int i = 255; i >= 0; i -= 2) {
					Main.Bray.setLED(0, i, 0);
				}
				
				break;
			}
			//If the finch is not levelled
			// Increase Red
			for (int i = 0; i < 252; i += 4) {
				Main.Bray.setLED(i, 0, 0);

			}
			// Decrease Red
			for (int i = 252; i >= 0; i -= 4) {
				Main.Bray.setLED(i, 0, 0);

			}
			// Increase Red
			for (int i = 0; i < 252; i += 4) {
				Main.Bray.setLED(i, 0, 0);

			}
			// Decrease Red
			for (int i = 252; i >= 0; i -= 4) {
				Main.Bray.setLED(i, 0, 0);

			}
			JOptionPane.showMessageDialog(null,"Finch is not level. Place finch \n on a levelled surface \n and press ok.");  // Message will pop up if the finch is not levelled on the floor
		}
		
		// Finch is level
		
		
		// GUI Setup
		GUI.setHeight(550);
		GUI.setWidth(1040);
		
		// create main page using JavaFX
		Scene mainPage = new Scene(FXMLLoader.load(getClass().getResource("mainPage.fxml"))); // .fxml file is the design created after exporting from JavaFX Scene Builder
		// set the GUI to hold the main page
		GUI.setScene(mainPage);
		
		GUI.show();
		
		

//		System.exit(0); // Exits with 0 errors
	}
	
	public static void main(String[] args) {
		launch();
	}


}
