package login;

import javafx.application.Application;
import javafx.stage.Stage;

public class Welcome extends Application {
	
	public void start(Stage primaryStage) {
		
        primaryStage.setScene((new LogInPage()).exec(primaryStage));
	    primaryStage.show(); 
	}

	public static void main(String[] args) {
		launch(args);
	}

}
