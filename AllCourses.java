package login;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TableColumn.CellEditEvent;
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

public class AllCourses {
	
	public Scene exec(Stage PrimaryStage) {
		
		PrimaryStage.setTitle("Courses");
		
		CourseControl stc=new CourseControl();
		ObservableList<Course> courses=FXCollections.observableArrayList(stc.getCourses());
		
		BorderPane bp=new BorderPane();
		
		TableView<Course> table=new TableView();
		table.setEditable(true);
		table.setItems(courses);
		
		TableColumn Name=new TableColumn("Name");
		Name.setCellFactory(TextFieldTableCell.forTableColumn());
		Name.setCellValueFactory(new PropertyValueFactory<Course,String>("name"));
		TableColumn Professor=new TableColumn("Professor");
		Professor.setCellFactory(TextFieldTableCell.forTableColumn());
		Professor.setCellValueFactory(new PropertyValueFactory<Course,String>("professor"));
		TableColumn Class=new TableColumn("Class");
		Class.setCellFactory(TextFieldTableCell.forTableColumn());
		Class.setCellValueFactory(new PropertyValueFactory<Course,String>("classs"));
		TableColumn ECTS=new TableColumn("ECTS");
		ECTS.setCellFactory(TextFieldTableCell.forTableColumn());
		ECTS.setCellValueFactory(new PropertyValueFactory<Course,String>("ECTS"));
		TableColumn Credit=new TableColumn("Credits");
		Credit.setCellFactory(TextFieldTableCell.forTableColumn());
		Credit.setCellValueFactory(new PropertyValueFactory<Course,String>("credits"));
		TableColumn Hours=new TableColumn("Hours");
		Hours.setCellFactory(TextFieldTableCell.forTableColumn());
		Hours.setCellValueFactory(new PropertyValueFactory<Student,String>("hours"));
		
		table.getColumns().addAll(Name,Professor,Class,ECTS,Credit,Hours);
	
		Button edit=new Button("Edit");
		edit.getStyleClass().add("login-button");
		edit.setOnAction(e -> {
			Name.setOnEditCommit(new EventHandler<CellEditEvent<Course,String>>(){
				@Override
				public void handle(CellEditEvent<Course, String> tc) {
					// TODO Auto-generated method stub
					Course current=(Course)tc.getTableView().getItems().get(tc.getTablePosition().getRow());
					int pos=stc.positionOfCourse(current);
					current.setName(tc.getNewValue());
					stc.editCourse(current,pos);
				}
			});
			Professor.setOnEditCommit(new EventHandler<CellEditEvent<Course,String>>(){
				@Override
				public void handle(CellEditEvent<Course, String> tc) {
					// TODO Auto-generated method stub
					Course current=(Course)tc.getTableView().getItems().get(tc.getTablePosition().getRow());
					int pos=stc.positionOfCourse(current);
					current.setProfessor(tc.getNewValue());
					stc.editCourse(current,pos);
				}
			});
			Class.setOnEditCommit(new EventHandler<CellEditEvent<Course,String>>(){
				@Override
				public void handle(CellEditEvent<Course, String> tc) {
					// TODO Auto-generated method stub
					Course current=(Course)tc.getTableView().getItems().get(tc.getTablePosition().getRow());
					int pos=stc.positionOfCourse(current);
					current.setClasss(tc.getNewValue());
					stc.editCourse(current,pos);
				}
			});
			ECTS.setOnEditCommit(new EventHandler<CellEditEvent<Course,String>>(){
				@Override
				public void handle(CellEditEvent<Course, String> tc) {
					// TODO Auto-generated method stub
					Course current=(Course)tc.getTableView().getItems().get(tc.getTablePosition().getRow());
					int pos=stc.positionOfCourse(current);
					current.setECTS(tc.getNewValue());
					stc.editCourse(current,pos);
				}
			});
			Credit.setOnEditCommit(new EventHandler<CellEditEvent<Course,String>>(){
				@Override
				public void handle(CellEditEvent<Course, String> tc) {
					// TODO Auto-generated method stub
					Course current=(Course)tc.getTableView().getItems().get(tc.getTablePosition().getRow());
					int pos=stc.positionOfCourse(current);
					current.setCredits(tc.getNewValue());
					stc.editCourse(current,pos);
				}
			});
			Hours.setOnEditCommit(new EventHandler<CellEditEvent<Course,String>>(){
				@Override
				public void handle(CellEditEvent<Course, String> tc) {
					// TODO Auto-generated method stub
					Course current=(Course)tc.getTableView().getItems().get(tc.getTablePosition().getRow());
					int pos=stc.positionOfCourse(current);
					current.setHours(tc.getNewValue());
					stc.editCourse(current,pos);
				}
			});
		});
		
		Button add=new Button("Add new");
		add.getStyleClass().add("login-button");
		add.setOnAction(e -> {
				PrimaryStage.setScene((new NewCourse()).exec(PrimaryStage));
		});
		
		Button remove=new Button("Remove");
		remove.getStyleClass().add("login-button");
		remove.setOnAction(e -> {
				PrimaryStage.setScene((new RemoveCourse()).exec(PrimaryStage));
		});
		
		Button back=new Button("Back");
		back.getStyleClass().add("login-button");
		back.setOnAction(e -> {
			PrimaryStage.setScene((new HomeAdmin()).exec(PrimaryStage));
		});
		
		Text title = new Text("List Of Courses");
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
		return sc;
	}

}
