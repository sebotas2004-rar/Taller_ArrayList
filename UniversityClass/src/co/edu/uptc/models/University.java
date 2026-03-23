package co.edu.uptc.models;

import java.time.LocalDate;

import co.edu.uptc.logic.BaseClass;

public class University extends BaseClass {

	private String name;
	private String address;
	private String website;
	private LocalDate foundationDate;
	private boolean publicService;
	
	public University() {
		super();
	}
	
	public University(String name, String id, String address, String website, LocalDate foundationDate,
			boolean publicService) {
		super();
		this.name = name;
		this.id = id;
		this.address = address;
		this.website = website;
		this.foundationDate = foundationDate;
		this.publicService = publicService;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getWebsite() {
		return website;
	}
	public void setWebsite(String website) {
		this.website = website;
	}
	public LocalDate getFoundationDate() {
		return foundationDate;
	}
	public void setFoundationDate(LocalDate foundationDate) {
		this.foundationDate = foundationDate;
	}
	public boolean isPublicService() {
		return publicService;
	}
	public void setPublicService(boolean publicService) {
		this.publicService = publicService;
	}

	@Override
	public String toString() {
		return "University [name=" + name + ", address=" + address + ", website=" + website + ", foundationDate="
				+ foundationDate + ", publicService=" + publicService + "]";
	}
	
	
}
