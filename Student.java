package login;

import java.util.ArrayList;

public class Student extends User{
	
	private String username;
	private String password;
	private String name;
	private String lastname;
	private String birthday;
	private String birthplace;
	private String fathername;
	private String mothername;
	private String registrationdate;
	private String currentyear;
	private String semester;
	private String course;
	private String cgpa;

	public Student(String username, String password,String name,String lastname,String birthday,String birthplace,String fathername,String mothername,String registrationdate,String currentyear,String semester,String course,String cgpa) {
		super();
		this.username=username;
		this.password=password;	
		this.name = name;
		this.lastname = lastname;
		this.birthday = birthday;
		this.birthplace = birthplace;
		this.fathername = fathername;
		this.mothername = mothername;
		this.registrationdate = registrationdate;
		this.currentyear = currentyear;
		this.semester = semester;
		this.course=course;
		this.cgpa=cgpa;
	}
	
	public String getUsername() {
		return username;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setUsername(String username) {
		this.username=username;
	}
	
	public void setPassword(String password) {
		this.password=password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getBirthplace() {
		return birthplace;
	}

	public void setBirthplace(String birthplace) {
		this.birthplace = birthplace;
	}

	public String getFathername() {
		return fathername;
	}

	public void setFathername(String fathername) {
		this.fathername = fathername;
	}

	public String getMothername() {
		return mothername;
	}

	public void setMothername(String mothername) {
		this.mothername = mothername;
	}

	public String getRegistrationdate() {
		return registrationdate;
	}

	public void setRegistrationdate(String registrationdate) {
		this.registrationdate = registrationdate;
	}

	public String getCurrentyear() {
		return currentyear;
	}

	public void setCurrentyear(String currentyear) {
		this.currentyear = currentyear;
	}

	public String getSemester() {
		return semester;
	}

	public void setSemester(String semester) {
		this.semester = semester;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String getCgpa() {
		return cgpa;
	}

	public void setCgpa(String cgpa) {
		this.cgpa = cgpa;
	}
	
}
