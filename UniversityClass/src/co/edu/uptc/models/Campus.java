package co.edu.uptc.models;

import co.edu.uptc.logic.BaseClass;

public class Campus extends BaseClass {

	private String campusName;
	private int capacity;
	private double totalArea;
	private String cityName;
	public Campus() {
		super();
	}
	public Campus(String campusName, String id, int capacity, double totalArea, String cityName) {
		super();
		this.campusName = campusName;
		this.id = id;
		this.capacity = capacity;
		this.totalArea = totalArea;
		this.cityName = cityName;
	}
	public String getCampusName() {
		return campusName;
	}
	public void setCampusName(String campusName) {
		this.campusName = campusName;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public double getTotalArea() {
		return totalArea;
	}
	public void setTotalArea(double totalArea) {
		this.totalArea = totalArea;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	@Override
	public String toString() {
		return "Campus [campusName=" + campusName + ", capacity=" + capacity + ", totalArea=" + totalArea
				+ ", cityName=" + cityName + "]";
	}
	
	
}
