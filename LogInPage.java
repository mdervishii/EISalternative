package login;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class LogInPage{
	
	public Scene exec(Stage PrimaryStage) {
		
        PrimaryStage.setTitle("EIS");
        
        
        BorderPane bp=new BorderPane();
        bp.setStyle("-fx-background-color: #08448c");
        
  
        Text title = new Text("EPOKA INTERACTIVE SYSTEM");
		title.setFont(Font.font("Helvetica", FontWeight.BOLD, 25));
		title.setFill(Color.WHITE); 
		
		HBox top = new HBox(15);
		top.setPadding(new Insets(15, 15, 15, 15));
		top.setStyle("-fx-background-color: #08448c");
		top.getChildren().add(title);
		top.setAlignment(Pos.CENTER);
	    
		
		GridPane grid = new GridPane();
		grid.setAlignment(Pos.CENTER);
		grid.setHgap(10);
		grid.setVgap(10);
		grid.setPadding(new Insets(25, 25, 25, 25));
		
		Text log=new Text("Log in to your account");
		grid.add(log, 0, 0);
		log.getStyleClass().add("log-text");
		
		Text student=new Text("Press here to log in as student ->");
		student.setFont(Font.font("Helvetica", FontWeight.NORMAL, 15));
		student.setFill(Color.web("#08448c")); 
		grid.add(student, 0, 1);
		
		Button std=new Button("Log in");
		grid.add(std, 1, 1);
		std.getStyleClass().add("login-button");
		
		std.setOnAction(new EventHandler<ActionEvent>(){
			public void handle(ActionEvent e) {
				PrimaryStage.setScene((new LogInStudent()).exec(PrimaryStage));
				
			}
		});
		
		Text admin=new Text("Press here to log in as admin ->");
		admin.setFont(Font.font("Helvetica", FontWeight.NORMAL, 15));
		admin.setFill(Color.web("#08448c")); 
		grid.add(admin, 0, 2);
		
		Button ad=new Button("Log in");
		grid.add(ad, 1, 2);
		ad.getStyleClass().add("login-button");
		
		ad.setOnAction(new EventHandler<ActionEvent>(){
			public void handle(ActionEvent e) {
				PrimaryStage.setScene((new LogInAdmin()).exec(PrimaryStage));
				
			}
		});
		
		HBox logIn = new HBox();
	    logIn.setStyle("-fx-background-color: white");
	    logIn.getChildren().add(grid);
	    logIn.setAlignment(Pos.CENTER);
	    
		
		Text copyright=new Text("2023 © Epoka University, CEN215 Project #M Office");
		copyright.setFont(Font.font("Helvetica", FontWeight.NORMAL, 10));
		copyright.setFill(Color.WHITE); 
		
		HBox bottom = new HBox(15);
		bottom.setPadding(new Insets(15, 15, 15, 15));
		bottom.setStyle("-fx-background-color: #08448c");
		bottom.getChildren().add(copyright);
		bottom.setAlignment(Pos.CENTER);
	    
		
		VBox l = new VBox();
		l.setStyle("-fx-background-color: #08448c");
		l.setPadding(new Insets(15, 15, 15, 15));
		
		VBox r = new VBox();
		r.setStyle("-fx-background-color: #08448c");
		r.setPadding(new Insets(15, 15, 15, 15));
		
	
		bp.setTop(top);
		bp.setLeft(l);
		bp.setRight(r);
		bp.setCenter(logIn);
		bp.setBottom(bottom);
		
		Scene sc = new Scene(bp, 500, 300);
		
		String style= getClass().getResource("style.css").toExternalForm();
		sc.getStylesheets().add(style);
		
		PrimaryStage.setScene(sc);
		
		PrimaryStage.show();
		
		return sc;
		
	}

}
