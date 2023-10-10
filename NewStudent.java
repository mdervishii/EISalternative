package login;

import java.util.ArrayList;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
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

public class NewStudent {
	
public Scene exec(Stage PrimaryStage) {
        
		PrimaryStage.setTitle("New Student");
        
        BorderPane bp=new BorderPane();
        bp.setStyle("-fx-background-color: #08448c");
        
        Text title = new Text("Add New Student");
		title.setFont(Font.font("Helvetica", FontWeight.BOLD, 25));
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
		TextField tfusername=new TextField();
		grid.add(un, 0, 0);
		grid.add(tfusername, 1,0 );
		Label pass=new Label("Password:");
		pass.setFont(Font.font("Helvetica", FontWeight.BOLD, 10));
		pass.setTextFill(Color.WHITE); 
		PasswordField pfpass = new PasswordField();
		grid.add(pass, 0, 1);
		grid.add(pfpass, 1,1 );
		Label Name=new Label("Name:");
		Name.setFont(Font.font("Helvetica", FontWeight.BOLD, 10));
		Name.setTextFill(Color.WHITE); 
		TextField tfname = new TextField();
		grid.add(Name, 0, 2);
		grid.add(tfname, 1,2 );
		Label Lastname=new Label("Last Name:");
		Lastname.setFont(Font.font("Helvetica", FontWeight.BOLD, 10));
		Lastname.setTextFill(Color.WHITE); 
		TextField tflastname = new TextField();
		grid.add(Lastname, 0, 3);
		grid.add(tflastname, 1,3 );
		Label bd=new Label("Birthday:");
		bd.setFont(Font.font("Helvetica", FontWeight.BOLD, 10));
		bd.setTextFill(Color.WHITE); 
		TextField tfbd = new TextField();
		grid.add(bd, 0, 4);
		grid.add(tfbd, 1,4 );
		Label bpl=new Label("Birthplace:");
		bpl.setFont(Font.font("Helvetica", FontWeight.BOLD, 10));
		bpl.setTextFill(Color.WHITE); 
		TextField tfbpl = new TextField();
		grid.add(bpl, 0, 5);
		grid.add(tfbpl, 1,5 );
		Label fn=new Label("Father Name:");
		fn.setFont(Font.font("Helvetica", FontWeight.BOLD, 10));
		fn.setTextFill(Color.WHITE); 
		TextField tffn = new TextField();
		grid.add(fn, 0, 6);
		grid.add(tffn, 1,6 );
		Label mn=new Label("Mother Name:");
		mn.setFont(Font.font("Helvetica", FontWeight.BOLD, 10));
		mn.setTextFill(Color.WHITE); 
		TextField tfmn = new TextField();
		grid.add(mn, 0, 7);
		grid.add(tfmn, 1,7 );
		Label rd=new Label("Registration Date:");
		rd.setFont(Font.font("Helvetica", FontWeight.BOLD, 10));
		rd.setTextFill(Color.WHITE); 
		TextField tfrd = new TextField();
		grid.add(rd, 0, 8);
		grid.add(tfrd, 1,8 );
		Label cy=new Label("Current Year:");
		cy.setFont(Font.font("Helvetica", FontWeight.BOLD, 10));
		cy.setTextFill(Color.WHITE); 
		TextField tfcy = new TextField();
		grid.add(cy, 0, 9);
		grid.add(tfcy, 1,9 );
		Label sms=new Label("Semester:");
		sms.setFont(Font.font("Helvetica", FontWeight.BOLD, 10));
		sms.setTextFill(Color.WHITE); 
		TextField tfsms = new TextField();
		grid.add(sms, 0, 10);
		grid.add(tfsms, 1,10 );
		Label cs=new Label("Class:");
		cs.setFont(Font.font("Helvetica", FontWeight.BOLD, 10));
		cs.setTextFill(Color.WHITE); 
		TextField tfcs = new TextField();
		grid.add(cs, 0, 11);
		grid.add(tfcs, 1,11 );
		Label gpa=new Label("GPA:");
		gpa.setFont(Font.font("Helvetica", FontWeight.BOLD, 10));
		gpa.setTextFill(Color.WHITE); 
		TextField tfgpa = new TextField();
		grid.add(gpa, 0, 12);
		grid.add(tfgpa, 1,12 );
		Label al=new Label(" ");

		
		Button addnew=new Button("Add");
		grid.add(addnew, 0, 13);
		addnew.getStyleClass().add("login-button");
		
		addnew.setOnAction(e -> {
			String username=tfusername.getText();
			String password=pfpass.getText();
			String name=tfname.getText();
			String lastname=tflastname.getText();
			String birthday=tfbd.getText();
			String birthplace=tfbpl.getText();
			String fathername=tffn.getText();
			String mothername=tfmn.getText();
			String registrationdate=tfrd.getText();
			String currentyear=tfcy.getText();
			String semester=tfsms.getText();
			String course=tfcs.getText();
			String cgpa=tfgpa.getText();
			
			StudentControl sc=new StudentControl();
			sc.signup(username, password, name, lastname, birthday, birthplace, fathername, mothername, registrationdate, currentyear, semester, course, cgpa);
			
			Alert succes=new Alert(AlertType.CONFIRMATION);
			succes.setHeaderText("Student was registered");
			succes.showAndWait();
		});
		
		Button back=new Button("Back");
		grid.add(back, 1, 13);
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
		
		Scene sc = new Scene(bp, 600, 600);
		
		String style= getClass().getResource("style.css").toExternalForm();
		sc.getStylesheets().add(style);
		
		PrimaryStage.setScene(sc);
		
		PrimaryStage.show();
		
		return sc;
	}

}
