
import javax.swing.JOptionPane;

import edu.cmu.ri.createlab.terk.robot.finch.Finch;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

	public static Finch Bray = new Finch();

	@Override
	public void start(Stage GUI) throws Exception {


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
			for (int i = 0; i < 252; i += 4) {
				Main.Bray.setLED(i, 0, 0);

			}
			for (int i = 252; i >= 0; i -= 4) {
				Main.Bray.setLED(i, 0, 0);

			}
			JOptionPane.showMessageDialog(null,"Finch is not level. Place finch \n and press ok.");
		}
		
		//Finch is level
		
		
		//GUI Setup
		GUI.setHeight(500);
		GUI.setWidth(1000);
		
		//create main page using SceneBuilder
		Scene mainPage = new Scene(FXMLLoader.load(getClass().getResource("mainPage.fxml")));
		//set the GUI to hold the main page
		GUI.setScene(mainPage);
		
//		GUI.show();
		
		

		System.exit(0); //Exits with 0 errors
	}
	
	public static void main(String[] args) throws InterruptedException {
		launch();
	}


}
