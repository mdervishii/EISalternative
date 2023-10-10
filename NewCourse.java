package login;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
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

public class NewCourse {
	
public Scene exec(Stage PrimaryStage) {
        
		PrimaryStage.setTitle("New Course");
        
        BorderPane bp=new BorderPane();
        bp.setStyle("-fx-background-color: #08448c");
        
        Text title = new Text("Add New Course");
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
		
		Label n=new Label("Name:");
		n.setFont(Font.font("Helvetica", FontWeight.BOLD, 10));
		n.setTextFill(Color.WHITE); 
		TextField tfn=new TextField();
		grid.add(n, 0, 0);
		grid.add(tfn, 1,0 );
		Label pr=new Label("Professor:");
		pr.setFont(Font.font("Helvetica", FontWeight.BOLD, 10));
		pr.setTextFill(Color.WHITE); 
		TextField tfpr=new TextField();
		grid.add(pr, 0, 1);
		grid.add(tfpr, 1,1 );
		Label Cl=new Label("Class:");
		Cl.setFont(Font.font("Helvetica", FontWeight.BOLD, 10));
		Cl.setTextFill(Color.WHITE); 
		TextField tfcl = new TextField();
		grid.add(Cl, 0, 2);
		grid.add(tfcl, 1,2 );
		Label ECT=new Label("ECTS:");
		ECT.setFont(Font.font("Helvetica", FontWeight.BOLD, 10));
		ECT.setTextFill(Color.WHITE); 
		TextField tfects = new TextField();
		grid.add(ECT, 0, 3);
		grid.add(tfects, 1,3 );
		Label credit=new Label("Credits:");
		credit.setFont(Font.font("Helvetica", FontWeight.BOLD, 10));
		credit.setTextFill(Color.WHITE); 
		TextField tfc = new TextField();
		grid.add(credit, 0, 4);
		grid.add(tfc, 1,4 );
		Label hour=new Label("Hours:");
		hour.setFont(Font.font("Helvetica", FontWeight.BOLD, 10));
		hour.setTextFill(Color.WHITE); 
		TextField tfh = new TextField();
		grid.add(hour, 0, 5);
		grid.add(tfh, 1,5 );
		
		
		Button addnew=new Button("Add");
		grid.add(addnew, 0, 13);
		addnew.getStyleClass().add("login-button");
		
		addnew.setOnAction(e -> {
			String name=tfn.getText();
			String professor=tfpr.getText();
			String classs=tfcl.getText();
			String ECTS=tfects.getText();
			String credits=tfc.getText();
			String hours=tfh.getText();
			
			CourseControl cc=new CourseControl();
			cc.add(name, professor, classs, ECTS, credits, hours);
			
			Alert succes=new Alert(AlertType.CONFIRMATION);
			succes.setHeaderText("Course was registered");
			succes.showAndWait();
		});
		
		Button back=new Button("Back");
		grid.add(back, 1, 13);
		back.getStyleClass().add("login-button");
		back.setOnAction(e -> {
			PrimaryStage.setScene((new AllCourses()).exec(PrimaryStage));
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
