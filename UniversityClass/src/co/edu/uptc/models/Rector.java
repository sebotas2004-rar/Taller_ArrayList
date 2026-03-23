package co.edu.uptc.models;

import java.time.LocalDate;

import co.edu.uptc.logic.BaseClass;

public class Rector extends BaseClass {

	private String academicTitle;
	private boolean workStatus;
	private String recName;
	private LocalDate appointmentDate;
	
	public Rector() {
		super();
	}

	public Rector(String id, String academicTitle, boolean workStatus,  String recName,
			LocalDate appointmentDate) {
		super();
		this.id = id;
		this.academicTitle = academicTitle;
		this.workStatus = workStatus;
		this.recName = recName;
		this.appointmentDate = appointmentDate;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getAcademicTitle() {
		return academicTitle;
	}

	public void setAcademicTitle(String academicTitle) {
		this.academicTitle = academicTitle;
	}

	public boolean isWorkStatus() {
		return workStatus;
	}

	public void setWorkStatus(boolean workStatus) {
		this.workStatus = workStatus;
	}

	public String getRecName() {
		return recName;
	}

	public void setRecName(String recName) {
		this.recName = recName;
	}

	public LocalDate getAppointmentDate() {
		return appointmentDate;
	}

	public void setAppointmentDate(LocalDate appointmentDate) {
		this.appointmentDate = appointmentDate;
	}

	@Override
	public String toString() {
		return "Rector [academicTitle=" + academicTitle + ", workStatus=" + workStatus + ", recName=" + recName
				+ ", appointmentDate=" + appointmentDate + "]";
	}

	
	
	
}
