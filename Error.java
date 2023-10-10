package login;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Error {
	
	public Scene exec(Stage PrimaryStage) {
		
		PrimaryStage.setTitle("Error!");
		
		BorderPane bp=new BorderPane();
        bp.setStyle("-fx-background-color:white");
	    
	    GridPane grid = new GridPane();
		grid.setAlignment(Pos.CENTER);
		grid.setHgap(5);
		grid.setVgap(5);
		grid.setPadding(new Insets(20,20,20,20));
		
		Text title = new Text("OOPS!");
		title.getStyleClass().add("error-text"); 
		grid.add(title,0,0);
		
		Text error=new Text("Your username and password do not match! ");
		error.getStyleClass().add("error-text");
		grid.add(error, 0, 1);
		
		Button tryagain=new Button("Try again");
		grid.add(tryagain, 0, 2);
		tryagain.getStyleClass().add("error-button");
		tryagain.setOnAction(new EventHandler<ActionEvent>(){
			public void handle(ActionEvent e) {
				PrimaryStage.setScene((new LogInPage()).exec(PrimaryStage));
				
			}
		});
		
		Button cancel=new Button("Cancel");
		grid.add(cancel, 0, 3);
		cancel.getStyleClass().add("error-button");
		cancel.setOnAction((ActionEvent event) -> {
            Platform.exit();
        });
		
		bp.setCenter(grid);
		
		Scene sc = new Scene(bp, 410, 200);
		
		String style= getClass().getResource("style.css").toExternalForm();
		sc.getStylesheets().add(style);
		
		PrimaryStage.setScene(sc);
		
		PrimaryStage.show();
		
		return sc;
		
	}

}
