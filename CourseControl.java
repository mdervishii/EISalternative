package login;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class CourseControl {
	
	private ArrayList<Course> courses;
	private File file;
	
	public CourseControl() {
		courses=new ArrayList<Course>();
		file=new File("courses.bin");
		if(file.exists())
			readCourses();
	}
	
	public ArrayList<Course> getCourses(){
		return this.courses;
	}

	public void addCourse(Course c) {
		this.courses.add(c);
	}
	
	public void add(String name,String professor,String classs,String ECTS,String credits,String hours) {
		Course c=new Course(name,professor,classs,ECTS,credits,hours);
		this.addCourse(c);
		writeCourses();
	}
	
	public void removeCourse(String name) {
		for (Course x : courses)
			if (x.getName().equals(name)) {
				this.courses.remove(x);
				writeCourses();
				break;
			}
	}
		
	private void readCourses() {
		try {
			FileInputStream fis=new FileInputStream(file);
			ObjectInputStream ois=new ObjectInputStream(fis);

			courses=(ArrayList<Course>)ois.readObject();
			
			ois.close();
			fis.close();
		}
		catch(Exception e){
			System.out.println("Error");
		}
		
	}
	
	private void writeCourses() {
		try {
			FileOutputStream fos=new FileOutputStream(file);
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			
			oos.writeObject(courses);
			
			oos.close();
			fos.close();
		}
		catch(Exception e){
			System.out.println("Error");
		}
		
	}
	
	public void editCourse(Course c,int pos) {
		this.courses.set(pos, c);
		writeCourses();
	}
	
	public int positionOfCourse(Course current) {
		for(int i=0;i<this.courses.size();i++) {
			if(current.getName().equals(this.courses.get(i).getName())){
				return i;
			}
		}
		return -1;
	}

}
