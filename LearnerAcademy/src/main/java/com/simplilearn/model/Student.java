package com.simplilearn.model;

public class Student {
	 private String studentId;
	    private String firstName;
	    private String lastName;
	    private int age;
	    private String grade;

	    // Constructors
	    public Student() {
	    }

	    public Student(String studentId, String firstName, String lastName, int age, String grade) {
	        this.studentId = studentId;
	        this.firstName = firstName;
	        this.lastName = lastName;
	        this.age = age;
	        this.grade = grade;
	    }

	    // Getter and Setter methods
	    public String getStudentId() {
	        return studentId;
	    }

	    public void setStudentId(String studentId) {
	        this.studentId = studentId;
	    }

	    public String getFirstName() {
	        return firstName;
	    }

	    public void setFirstName(String firstName) {
	        this.firstName = firstName;
	    }

	    public String getLastName() {
	        return lastName;
	    }

	    public void setLastName(String lastName) {
	        this.lastName = lastName;
	    }

	    public int getAge() {
	        return age;
	    }

	    public void setAge(int age) {
	        this.age = age;
	    }

	    public String getGrade() {
	        return grade;
	    }

	    public void setGrade(String grade) {
	        this.grade = grade;
	    }

	    @Override
	    public String toString() {
	        return "Student{" +
	                "studentId='" + studentId + '\'' +
	                ", firstName='" + firstName + '\'' +
	                ", lastName='" + lastName + '\'' +
	                ", age=" + age +
	                ", grade='" + grade + '\'' +
	                '}';
	    }
	}