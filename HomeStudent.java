package login;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class HomeStudent {
	
	Student current;
	
	public HomeStudent(Student current) {
		this.current=current;
	}
	
	public Scene exec(Stage PrimaryStage) {
	
	    PrimaryStage.setTitle("Home");
	    
	    BorderPane bp=new BorderPane();
        bp.setStyle("-fx-background-color: #08448c");
        
        Text title = new Text("EPOKA INTERACTIVE SYSTEM");
		title.setFont(Font.font("Helvetica", FontWeight.BOLD, 20));
		title.setFill(Color.WHITE); 
		
		HBox top = new HBox(15);
		top.setPadding(new Insets(15, 15, 15, 15));
		top.setStyle("-fx-background-color: #08448c");
		top.getChildren().add(title);
		top.setAlignment(Pos.CENTER);
		
	    GridPane grid = new GridPane();
	    grid.setStyle("-fx-background-color:white");
	    grid.setAlignment(Pos.CENTER_LEFT);
		grid.setHgap(10);
		grid.setVgap(10);
		grid.setPadding(new Insets(25, 25, 25, 25));

		Button profile=new Button("Profile"); 
		grid.add(profile, 0, 0);
		profile.getStyleClass().add("profile-button");
		profile.setOnAction(e -> {
			PrimaryStage.setScene((new StudentProfile(current)).exec(PrimaryStage));
		});
		
		Button transcript=new Button("Transcript");
		grid.add(transcript, 1, 0);
		transcript.getStyleClass().add("transcript-button");
		
		Button currentcourses=new Button("Current Courses");
		grid.add(currentcourses, 2, 0);
		currentcourses.getStyleClass().add("currentcourses-button");
		
		Button pastcourses=new Button("Past Courses");
		grid.add(pastcourses, 0, 1);
		pastcourses.getStyleClass().add("pastcourses-button");
		
		Text studentID=new Text();
		studentID.setText("Student Id:"+current.getId());
		grid.add(studentID, 1, 1);
		studentID.getStyleClass().add("studentID-text");
		
		Button exit=new Button("Exit");
		grid.add(exit, 2, 1);
		exit.getStyleClass().add("exit-button");
		exit.setOnAction((ActionEvent event) -> {
            Platform.exit();
        });
		
		Text copyright=new Text("2023 © Epoka University, CEN215 Project #M Office");
		copyright.setFont(Font.font("Helvetica", FontWeight.NORMAL, 10));
		copyright.setFill(Color.WHITE); 
		
		HBox bottom = new HBox(15);
		bottom.setPadding(new Insets(15, 15, 15, 15));
		bottom.setStyle("-fx-background-color: #08448c");
		bottom.getChildren().add(copyright);
		bottom.setAlignment(Pos.CENTER);
		
		bp.setTop(top);
		bp.setCenter(grid);
		bp.setBottom(bottom);

		Scene sc = new Scene(bp, 900, 400);
		
		String style= getClass().getResource("style.css").toExternalForm();
		sc.getStylesheets().add(style);
		
		PrimaryStage.setScene(sc);

		PrimaryStage.show();

		return sc;
		
	}

}
