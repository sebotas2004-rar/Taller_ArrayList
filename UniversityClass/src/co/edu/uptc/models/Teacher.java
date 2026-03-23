package co.edu.uptc.models;

import co.edu.uptc.logic.BaseClass;

public class Teacher extends BaseClass {

	private String firstName;
	private String lastName;
	private String contractType;
	private boolean teachingStatus;
	public Teacher() {
		super();
	}
	public Teacher(String firstName, String lastName, String id, String contractType, boolean teachingStatus) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.id = id;
		this.contractType = contractType;
		this.teachingStatus = teachingStatus;
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
	public String getContractType() {
		return contractType;
	}
	public void setContractType(String contractType) {
		this.contractType = contractType;
	}
	public boolean isTeachingStatus() {
		return teachingStatus;
	}
	public void setTeachingStatus(boolean teachingStatus) {
		this.teachingStatus = teachingStatus;
	}
	@Override
	public String toString() {
		return "Teacher [firstName=" + firstName + ", lastName=" + lastName + ", contractType=" + contractType
				+ ", teachingStatus=" + teachingStatus + "]";
	}
	
	
}
