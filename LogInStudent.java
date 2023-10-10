package login;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class LogInStudent {

		public Scene exec(Stage PrimaryStage) {
			
	        PrimaryStage.setTitle("STUDENT Log In");
	        
	        
	        BorderPane bp=new BorderPane();
	        bp.setStyle("-fx-background-color: #08448c");
	        
	        Text title = new Text("STUDENT");
			title.setFont(Font.font("Helvetica", FontWeight.BOLD, 25));
			title.setFill(Color.WHITE); 
			
			HBox top = new HBox(15);
			top.setPadding(new Insets(10,10,10,10));
		    top.setStyle("-fx-background-color: #08448c");
		    top.getChildren().add(title);
		    top.setAlignment(Pos.CENTER);
		    
			
			GridPane grid = new GridPane();
			grid.setAlignment(Pos.CENTER);
			grid.setHgap(5);
			grid.setVgap(5);
			grid.setPadding(new Insets(20,20,20,20));
			
			Text sign=new Text("Sign in ");
			sign.setFont(Font.font("Helvetica", FontWeight.NORMAL, 15));
			sign.setFill(Color.WHITE); 
			grid.add(sign, 0, 0);
			
			Label username=new Label("Username:");
			username.setFont(Font.font("Helvetica", FontWeight.BOLD, 10));
			username.setTextFill(Color.WHITE); 
			Label pass=new Label("Password:");
			pass.setFont(Font.font("Helvetica", FontWeight.BOLD, 10));
			pass.setTextFill(Color.WHITE); 
			
			TextField tfusername=new TextField();
			PasswordField pfpass = new PasswordField();
			
			grid.add(username, 0, 1);
			grid.add(tfusername, 1, 1);
			
			grid.add(pass, 0, 2);
			grid.add(pfpass, 1, 2);
			
			Button login=new Button("Log in");
			grid.add(login, 0, 3);
			login.getStyleClass().add("login-button");
			
			login.setOnAction(e -> {
				String u = tfusername.getText();
				String p = pfpass.getText();

				StudentControl sc=new StudentControl();
				Student s=sc.check(u, p);
				if(s!=null) {
					PrimaryStage.setScene((new HomeStudent(s)).exec(PrimaryStage));
					PrimaryStage.show();
				}
				else {
					PrimaryStage.setScene((new Error()).exec(PrimaryStage));
				}
			});
			
			Button back=new Button("Back");
			grid.add(back, 1, 3);
			back.getStyleClass().add("login-button");
			
			back.setOnAction(e -> {
				PrimaryStage.setScene((new LogInPage()).exec(PrimaryStage));
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
			
			Scene sc = new Scene(bp, 400, 300);
			
			String style= getClass().getResource("style.css").toExternalForm();
			sc.getStylesheets().add(style);
			
			return sc;
		}
}
