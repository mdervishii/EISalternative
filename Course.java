package login;

import java.io.Serializable;

public class Course implements Serializable{
	
	private String name;
	private String professor;
	private String classs;
	private String ECTS;
	private String credits;
	private String hours;
	private double midtermGrade;
    private double finalGrade;
    private double grade;
	
	public Course(String name,String professor,String classs,String ECTS,String credits,String hours) {
		this.setName(name);
		this.setProfessor(professor);
		this.setClasss(classs);
		this.setECTS(ECTS);
		this.setCredits(credits);
		this.setHours(hours);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getProfessor() {
		return professor;
	}

	public void setProfessor(String professor) {
		this.professor = professor;
	}

	public String getClasss() {
		return classs;
	}

	public void setClasss(String classs) {
		this.classs = classs;
	}

	public String getECTS() {
		return ECTS;
	}

	public void setECTS(String eCTS) {
		ECTS = eCTS;
	}

	public String getCredits() {
		return credits;
	}

	public void setCredits(String credits) {
		this.credits = credits;
	}

	public String getHours() {
		return hours;
	}

	public void setHours(String hours) {
		this.hours = hours;
	}

	public double getMidtermGrade() {
		return midtermGrade;
	}

	public void setMidtermGrade(double midtermGrade) {
		this.midtermGrade = midtermGrade;
	}

	public double getFinalGrade() {
		return finalGrade;
	}

	public void setFinalGrade(double finalGrade) {
		this.finalGrade = finalGrade;
	}

	public double getGrade() {
		return grade;
	}

	public void setGrade(double grade) {
		this.grade = grade;
	}
	

	
}
