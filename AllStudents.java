package login;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableColumn.CellEditEvent;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;

public class AllStudents {
	
	public Scene exec(Stage PrimaryStage) {
		
		PrimaryStage.setTitle("Students");
		
		StudentControl stc=new StudentControl();
		ObservableList<Student> students=FXCollections.observableArrayList(stc.getStudents());
		
		BorderPane bp=new BorderPane();
		
		TableView<Student> table=new TableView();
		table.setEditable(true);
		table.setItems(students);
		
		TableColumn firstName=new TableColumn("First Name");
		firstName.setCellFactory(TextFieldTableCell.forTableColumn());
		firstName.setCellValueFactory(new PropertyValueFactory<Student,String>("name"));
		TableColumn lastName=new TableColumn("Last Name");
		lastName.setCellFactory(TextFieldTableCell.forTableColumn());
		lastName.setCellValueFactory(new PropertyValueFactory<Student,String>("lastname"));
		TableColumn Birthday=new TableColumn("Birthday");
		Birthday.setCellFactory(TextFieldTableCell.forTableColumn());
		Birthday.setCellValueFactory(new PropertyValueFactory<Student,String>("birthday"));
		TableColumn Birthplace=new TableColumn("Birthplace");
		Birthplace.setCellFactory(TextFieldTableCell.forTableColumn());
		Birthplace.setCellValueFactory(new PropertyValueFactory<Student,String>("birthplace"));
		TableColumn FatherName=new TableColumn("Father's Name");
		FatherName.setCellFactory(TextFieldTableCell.forTableColumn());
		FatherName.setCellValueFactory(new PropertyValueFactory<Student,String>("fathername"));
		TableColumn MotherName=new TableColumn("Mother's Name");
		MotherName.setCellFactory(TextFieldTableCell.forTableColumn());
		MotherName.setCellValueFactory(new PropertyValueFactory<Student,String>("mothername"));
		TableColumn RegistrationDt=new TableColumn("Registration Date");
		RegistrationDt.setCellFactory(TextFieldTableCell.forTableColumn());
		RegistrationDt.setCellValueFactory(new PropertyValueFactory<Student,String>("registrationdate"));
		TableColumn CurrentYr=new TableColumn("Current Year");
		CurrentYr.setCellFactory(TextFieldTableCell.forTableColumn());
		CurrentYr.setCellValueFactory(new PropertyValueFactory<Student,String>("currentyear"));
		TableColumn Semester=new TableColumn("Semester");
		Semester.setCellFactory(TextFieldTableCell.forTableColumn());
		Semester.setCellValueFactory(new PropertyValueFactory<Student,String>("semester"));
		TableColumn Class=new TableColumn("Class");
		Class.setCellFactory(TextFieldTableCell.forTableColumn());
		Class.setCellValueFactory(new PropertyValueFactory<Student,String>("course"));
		TableColumn GPA=new TableColumn("GPA");
		GPA.setCellFactory(TextFieldTableCell.forTableColumn());
		GPA.setCellValueFactory(new PropertyValueFactory<Student,String>("cgpa"));
		
		table.getColumns().addAll(firstName,lastName,Birthday,Birthplace,FatherName,MotherName,RegistrationDt,CurrentYr,Semester,Class,GPA);
	
		Button edit=new Button("Edit");
		edit.getStyleClass().add("login-button");
		edit.setOnAction(e -> {
			firstName.setOnEditCommit(new EventHandler<CellEditEvent<Student,String>>(){
				@Override
				public void handle(CellEditEvent<Student, String> tc) {
					// TODO Auto-generated method stub
					Student current=(Student)tc.getTableView().getItems().get(tc.getTablePosition().getRow());
					int pos=stc.positionOfStudent(current);
					current.setName(tc.getNewValue());
					stc.editStudent(current,pos);
				}
			});
			lastName.setOnEditCommit(new EventHandler<CellEditEvent<Student,String>>(){
				@Override
				public void handle(CellEditEvent<Student, String> tc) {
					// TODO Auto-generated method stub
					Student current=(Student)tc.getTableView().getItems().get(tc.getTablePosition().getRow());
					int pos=stc.positionOfStudent(current);
					current.setLastname(tc.getNewValue());
					stc.editStudent(current,pos);
				}
			});
			Birthday.setOnEditCommit(new EventHandler<CellEditEvent<Student,String>>(){
				@Override
				public void handle(CellEditEvent<Student, String> tc) {
					// TODO Auto-generated method stub
					Student current=(Student)tc.getTableView().getItems().get(tc.getTablePosition().getRow());
					int pos=stc.positionOfStudent(current);
					current.setBirthday(tc.getNewValue());
					stc.editStudent(current,pos);
				}
			});
			Birthplace.setOnEditCommit(new EventHandler<CellEditEvent<Student,String>>(){
				@Override
				public void handle(CellEditEvent<Student, String> tc) {
					// TODO Auto-generated method stub
					Student current=(Student)tc.getTableView().getItems().get(tc.getTablePosition().getRow());
					int pos=stc.positionOfStudent(current);
					current.setBirthplace(tc.getNewValue());
					stc.editStudent(current,pos);
				}
			});
			FatherName.setOnEditCommit(new EventHandler<CellEditEvent<Student,String>>(){
				@Override
				public void handle(CellEditEvent<Student, String> tc) {
					// TODO Auto-generated method stub
					Student current=(Student)tc.getTableView().getItems().get(tc.getTablePosition().getRow());
					int pos=stc.positionOfStudent(current);
					current.setFathername(tc.getNewValue());
					stc.editStudent(current,pos);
				}
			});
			MotherName.setOnEditCommit(new EventHandler<CellEditEvent<Student,String>>(){
				@Override
				public void handle(CellEditEvent<Student, String> tc) {
					// TODO Auto-generated method stub
					Student current=(Student)tc.getTableView().getItems().get(tc.getTablePosition().getRow());
					int pos=stc.positionOfStudent(current);
					current.setMothername(tc.getNewValue());
					stc.editStudent(current,pos);
				}
			});
			RegistrationDt.setOnEditCommit(new EventHandler<CellEditEvent<Student,String>>(){
				@Override
				public void handle(CellEditEvent<Student, String> tc) {
					// TODO Auto-generated method stub
					Student current=(Student)tc.getTableView().getItems().get(tc.getTablePosition().getRow());
					int pos=stc.positionOfStudent(current);
					current.setRegistrationdate(tc.getNewValue());
					stc.editStudent(current,pos);
				}
			});
			CurrentYr.setOnEditCommit(new EventHandler<CellEditEvent<Student,String>>(){
				@Override
				public void handle(CellEditEvent<Student, String> tc) {
					// TODO Auto-generated method stub
					Student current=(Student)tc.getTableView().getItems().get(tc.getTablePosition().getRow());
					int pos=stc.positionOfStudent(current);
					current.setCurrentyear(tc.getNewValue());
					stc.editStudent(current,pos);
				}
			});
			Semester.setOnEditCommit(new EventHandler<CellEditEvent<Student,String>>(){
				@Override
				public void handle(CellEditEvent<Student, String> tc) {
					// TODO Auto-generated method stub
					Student current=(Student)tc.getTableView().getItems().get(tc.getTablePosition().getRow());
					int pos=stc.positionOfStudent(current);
					current.setSemester(tc.getNewValue());
					stc.editStudent(current,pos);
				}
			});
			Class.setOnEditCommit(new EventHandler<CellEditEvent<Student,String>>(){
				@Override
				public void handle(CellEditEvent<Student, String> tc) {
					// TODO Auto-generated method stub
					Student current=(Student)tc.getTableView().getItems().get(tc.getTablePosition().getRow());
					int pos=stc.positionOfStudent(current);
					current.setCourse(tc.getNewValue());
					stc.editStudent(current,pos);
				}
			});
			GPA.setOnEditCommit(new EventHandler<CellEditEvent<Student,String>>(){
				@Override
				public void handle(CellEditEvent<Student, String> tc) {
					// TODO Auto-generated method stub
					Student current=(Student)tc.getTableView().getItems().get(tc.getTablePosition().getRow());
					int pos=stc.positionOfStudent(current);
					current.setCgpa(tc.getNewValue());
					stc.editStudent(current,pos);
				}
			});
		});
		
		Button add=new Button("Add new");
		add.getStyleClass().add("login-button");
		add.setOnAction(e -> {
				PrimaryStage.setScene((new NewStudent()).exec(PrimaryStage));
		});
		
		Button remove=new Button("Remove");
		remove.getStyleClass().add("login-button");
		remove.setOnAction(e -> {
				PrimaryStage.setScene((new RemoveStudent()).exec(PrimaryStage));
		});
		
		Button back=new Button("Back");
		back.getStyleClass().add("login-button");
		back.setOnAction(e -> {
			PrimaryStage.setScene((new HomeAdmin()).exec(PrimaryStage));
		});
		
		Text title = new Text("List Of Students");
		title.setFont(Font.font("Helvetica", FontWeight.BOLD, 20));
		title.setFill(Color.WHITE); 
		
		HBox top = new HBox(15);
		top.setPadding(new Insets(15, 15, 15, 15));
		top.setStyle("-fx-background-color: #08448c");
		top.getChildren().add(title);
		top.setAlignment(Pos.CENTER);
		
		HBox top1 = new HBox(15);
		top1.setPadding(new Insets(10, 10, 10, 10));
	    top1.setStyle("-fx-background-color: #08448c");
	    top1.getChildren().addAll(add,remove,edit,back);
	    top1.setAlignment(Pos.CENTER);
	    
	    GridPane grid = new GridPane();
	    grid.setStyle("-fx-background-color:#08448c");
	    grid.setAlignment(Pos.CENTER);
		grid.setHgap(10);
		grid.setVgap(5);
		grid.setPadding(new Insets(25, 25, 25, 25));
		grid.add(top, 0, 0);
		grid.add(top1, 0, 1);
		
		Text copyright=new Text("2023 © Epoka University, CEN215 Project #M Office");
		copyright.setFont(Font.font("Helvetica", FontWeight.NORMAL, 10));
		copyright.setFill(Color.WHITE); 
		
		HBox bottom = new HBox(15);
		bottom.setPadding(new Insets(15, 15, 15, 15));
		bottom.setStyle("-fx-background-color: #08448c");
		bottom.getChildren().add(copyright);
		bottom.setAlignment(Pos.CENTER);
		
		bp.setTop(grid);
		bp.setCenter(table);
		bp.setBottom(bottom);
		
		Scene sc=new Scene(bp,860,400);
		String style= getClass().getResource("style.css").toExternalForm();
		sc.getStylesheets().add(style);
		PrimaryStage.setTitle("Students");
		return sc;
	}

}
