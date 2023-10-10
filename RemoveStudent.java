package login;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class RemoveStudent {
	
public Scene exec(Stage PrimaryStage) {
        
		PrimaryStage.setTitle("Remove Student");
        
        BorderPane bp=new BorderPane();
        bp.setStyle("-fx-background-color: #08448c");
        
        Text title = new Text("Input username of student you want to remove");
		title.setFont(Font.font("Helvetica", FontWeight.NORMAL, 20));
		title.setFill(Color.WHITE); 
		
		HBox top = new HBox(15);
		top.setPadding(new Insets(10, 10, 10, 10));
	    top.setStyle("-fx-background-color: #08448c");
	    top.getChildren().add(title);
	    top.setAlignment(Pos.CENTER);
	    
		GridPane grid = new GridPane();
		grid.setAlignment(Pos.CENTER);
		grid.setHgap(5);
		grid.setVgap(5);
		grid.setPadding(new Insets(20, 20, 20, 20));
		
		Label un=new Label("Username:");
		un.setFont(Font.font("Helvetica", FontWeight.BOLD, 10));
		un.setTextFill(Color.WHITE); 
		TextField tfun=new TextField();
		grid.add(un, 0, 0);
		grid.add(tfun, 1,0 );
		
		Button remove=new Button("Remove");
		grid.add(remove, 0, 1);
		remove.getStyleClass().add("login-button");
		
		remove.setOnAction(e -> {
			String username=tfun.getText();
			
			StudentControl sc=new StudentControl();
			sc.removeStudent(username);
			
			Alert succes=new Alert(AlertType.CONFIRMATION);
			succes.setHeaderText("Student was removed");
			succes.showAndWait();
		});
		
		Button back=new Button("Back");
		grid.add(back, 1, 1);
		back.getStyleClass().add("login-button");
		back.setOnAction(e -> {
			PrimaryStage.setScene((new AllStudents()).exec(PrimaryStage));
		});
		
		HBox logIn = new HBox();
	    logIn.setStyle("-fx-background-color: #08448c");
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
	
		bp.setTop(top);
		bp.setCenter(logIn);
		bp.setBottom(bottom);
		
		Scene sc = new Scene(bp, 600, 300);
		
		String style= getClass().getResource("style.css").toExternalForm();
		sc.getStylesheets().add(style);
		
		PrimaryStage.setScene(sc);
		
		PrimaryStage.show();
		
		return sc;
	}

}
