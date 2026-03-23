package co.edu.uptc.models;

import co.edu.uptc.logic.BaseClass;

public class Student extends BaseClass {
private String firstName;
private String lastName;
private int currentSemester;
private int age;

public Student() {
	super();
}

public Student(String firstName, String lastName, String id, int currentSemester, int age) {
	super();
	this.firstName = firstName;
	this.lastName = lastName;
	this.id = id;
	this.currentSemester = currentSemester;
	this.age = age;
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

public String getId() {
	return id;
}

public void setId(String id) {
	this.id = id;
}

public int getCurrentSemester() {
	return currentSemester;
}

public void setCurrentSemester(int currentSemester) {
	this.currentSemester = currentSemester;
}

public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}

@Override
public String toString() {
	return "Student [firstName=" + firstName + ", lastName=" + lastName + ", currentSemester=" + currentSemester
			+ ", age=" + age + "]";
}



}
