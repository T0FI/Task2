
import java.io.IOException;

import javax.swing.JOptionPane;

import edu.cmu.ri.createlab.terk.robot.finch.Finch;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application { // "extends Application" is used to make the Main class behave like an
										// application
	public static void main(String[] args) {
		launch();
	}

	public static Stage GUIGlobal;

	public static Finch Bray = new Finch();

	@Override
	public void start(Stage GUI) throws IOException { // The main entry point for the designs created using the JavaFX application
		
		GUIGlobal = GUI;

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
		Scene mainPage = new Scene(FXMLLoader.load(getClass().getResource("javafx/mainPage.fxml"))); // .fxml file is the design created after exporting from JavaFX Scene Builder
		// set the GUI to hold the main page
		GUI.setScene(mainPage);
		
		GUI.show();
		
		

//		System.exit(0); // Exits with 0 errors
	}

	// DRAW LINE
	public static void DrawLine(int a) {
		for (int i = 0; i < a; ++i) {
			Bray.setWheelVelocities(54, 54, 250); // to go one cm
		}
	}

	// TURN METHOD
	public static void TurnMethod(int z) { // clockwise
		for (int i = 0; i < z; i++) {
			Bray.setWheelVelocities(48, -48, 22); // Turn 90 degrees
		}
	}

	// DRAW TRIANGLE

	public static void DrawTriangle(int a, int b, int c) {
		int angle1, angle2, angle3;
		

		DrawLine(a);
		TurnMethod(angle1);
		DrawLine(c);
		TurnMethod(angle3);
		DrawLine(b);
		TurnMethod(angle2);
		
	}
	
	
	//DRAW RECTANGLE
	
	public static void DrawRectangle(int a, int b) {
		
		DrawLine(a);
		TurnMethod(90);
		DrawLine(b);
		TurnMethod(90);
		DrawLine(a);
		TurnMethod(90);
		DrawLine(b);
		
	}
	
	
	
}
