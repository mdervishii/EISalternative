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

public class StudentProfile {
	
    Student current;
	
	public StudentProfile(Student current) {
		this.current=current;
	}
	
public Scene exec(Stage PrimaryStage) {
        
		PrimaryStage.setTitle("My Profile");
        
        BorderPane bp=new BorderPane();
        bp.setStyle("-fx-background-color:#08448c");
        
        Text title = new Text("Profile");
		title.setFont(Font.font("Helvetica", FontWeight.BOLD, 25));
		title.setFill(Color.WHITE);
		
		HBox top = new HBox(15);
		top.setPadding(new Insets(10, 10, 10, 10));
	    top.setStyle("-fx-background-color: #08448c");
	    top.getChildren().add(title);
	    top.setAlignment(Pos.CENTER);
	    
		GridPane grid = new GridPane();
		bp.setStyle("-fx-background-color:#08448c");
		grid.setAlignment(Pos.CENTER);
		grid.setHgap(5);
		grid.setVgap(5);
		grid.setPadding(new Insets(20, 20, 20, 20));
		
		Label n=new Label("Name:");
		n.setFont(Font.font("Helvetica", FontWeight.BOLD, 15));
		n.setTextFill(Color.WHITE);
		Text name=new Text();
		name.setText(current.getName());
		name.setFill(Color.WHITE);
		grid.add(n, 0, 0);
		grid.add(name, 1,0 );
		Label l=new Label("Last name:");
		l.setFont(Font.font("Helvetica", FontWeight.BOLD, 15));
		l.setTextFill(Color.WHITE);
		Text last=new Text();
		last.setText(current.getLastname());
		last.setFill(Color.WHITE);
		grid.add(l, 0, 1);
		grid.add(last, 1,1 );
		Label b=new Label("Birthday:");
		b.setFont(Font.font("Helvetica", FontWeight.BOLD, 15));
		b.setTextFill(Color.WHITE);
		Text birth=new Text();
		birth.setText(current.getBirthday());
		birth.setFill(Color.WHITE);
		grid.add(b, 0, 2);
		grid.add(birth, 1,2 );
		Label bpl=new Label("Birthplace:");
		bpl.setFont(Font.font("Helvetica", FontWeight.BOLD, 15));
		bpl.setTextFill(Color.WHITE);
		Text birthp=new Text();
		birthp.setFill(Color.WHITE);
		birthp.setText(current.getBirthplace());
		grid.add(bpl, 0, 3);
		grid.add(birthp, 1,3 );
		Label fn=new Label("Father's Name:");
		fn.setFont(Font.font("Helvetica", FontWeight.BOLD, 15));
		fn.setTextFill(Color.WHITE);
		Text fathern=new Text();
		fathern.setText(current.getFathername());
		fathern.setFill(Color.WHITE);
		grid.add(fn, 0, 4);
		grid.add(fathern, 1,4 );
		Label mn=new Label("Mother's Name:");
		mn.setFont(Font.font("Helvetica", FontWeight.BOLD, 15));
		mn.setTextFill(Color.WHITE);
		Text mothern=new Text();
		mothern.setFill(Color.WHITE);
		mothern.setText(current.getMothername());
		grid.add(mn, 0, 5);
		grid.add(mothern, 1,5 );
		Label rd=new Label("Registration date:");
		rd.setFont(Font.font("Helvetica", FontWeight.BOLD, 15));
		rd.setTextFill(Color.WHITE);
		Text rdd=new Text();
		rdd.setFill(Color.WHITE);
		rdd.setText(current.getRegistrationdate());
		grid.add(rd, 0, 6);
		grid.add(rdd, 1,6 );
		Label cy=new Label("Current Year");
		cy.setFont(Font.font("Helvetica", FontWeight.BOLD, 15));
		cy.setTextFill(Color.WHITE);
		Text cyy=new Text();
		cyy.setFill(Color.WHITE);
		cyy.setText(current.getCurrentyear());
		grid.add(cy,0,7);
		grid.add(cyy, 1,7 );
		Label s=new Label("Semester:");
		s.setFont(Font.font("Helvetica", FontWeight.BOLD, 15));
		s.setTextFill(Color.WHITE);
		Text sm=new Text();
		sm.setFill(Color.WHITE);
		sm.setText(current.getSemester());
		grid.add(s, 0, 8);
		grid.add(sm, 1,8 );
		Label c=new Label("Class:");
		c.setTextFill(Color.WHITE);
		c.setFont(Font.font("Helvetica", FontWeight.BOLD, 15));
		Text cl=new Text();
		cl.setText(current.getCourse());
		cl.setFill(Color.WHITE);
		grid.add(c, 0, 9);
		grid.add(cl, 1,9 );
		Label cgpa=new Label("CGPA:");
		cgpa.setTextFill(Color.WHITE);
		cgpa.setFont(Font.font("Helvetica", FontWeight.BOLD, 15));
		Text cgpaa=new Text();
		cgpaa.setFill(Color.WHITE);
		cgpaa.setText(current.getCgpa());
		grid.add(cgpa, 0, 10);
		grid.add(cgpaa,1,10);
		

		Button back=new Button("Back");
		grid.add(back, 1, 11);
		back.getStyleClass().add("login-button");
		back.setOnAction(e -> {
			PrimaryStage.setScene((new HomeStudent(current)).exec(PrimaryStage));
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
		
		Scene sc = new Scene(bp, 600, 500);
		
		String style= getClass().getResource("style.css").toExternalForm();
		sc.getStylesheets().add(style);
		
		PrimaryStage.setScene(sc);
		
		PrimaryStage.show();
		
		return sc;
	}


}
