package login;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class StudentControl {
	
	private ArrayList<Student> students;
	private File file;
	
	public StudentControl() {
		students=new ArrayList<Student>();
		file=new File("students.bin");
		if(file.exists())
			readStudents();
	}
	
	public ArrayList<Student> getStudents(){
		return this.students;
	}

	public void addStudent(Student s) {
		this.students.add(s);
	}
	
	public void signup(String username, String password,String name,String lastname,String birthday,String birthplace,String fathername,String mothername,String registrationdate,String currentyear,String semester,String course,String cgpa) {
		Student s=new Student(username,password,name,lastname,birthday,birthplace,fathername,mothername,registrationdate,currentyear,semester,course,cgpa);
		this.addStudent(s);
		writeStudents();
	}

	public Student check(String username,String password) {
		for(Student s:students) 
			if(s.getUsername().equals(username) && s.getPassword().equals(password)) 
				return s;
			return null;
	}
	
	public void removeStudent(String username) {
		for (Student x : students)
			if (x.getUsername().equals(username)) {
				this.students.remove(x);
				writeStudents();
				break;
			}
	}
		
	private void readStudents() {
		try {
			FileInputStream fis=new FileInputStream(file);
			ObjectInputStream ois=new ObjectInputStream(fis);

			students=(ArrayList<Student>)ois.readObject();
			
			ois.close();
			fis.close();
		}
		catch(Exception e){
			System.out.println("Error");
		}
		
	}
	
	private void writeStudents() {
		try {
			FileOutputStream fos=new FileOutputStream(file);
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			
			oos.writeObject(students);
			
			oos.close();
			fos.close();
		}
		catch(Exception e){
			System.out.println("Error");
		}
		
	}
	
	public void editStudent(Student s,int pos) {
		this.students.set(pos, s);
		writeStudents();
	}
	
	public int positionOfStudent(Student current) {
		for(int i=0;i<this.students.size();i++) {
			if(current.getUsername().equals(this.students.get(i).getUsername())){
				return i;
			}
		}
		return -1;
	}
	

}
