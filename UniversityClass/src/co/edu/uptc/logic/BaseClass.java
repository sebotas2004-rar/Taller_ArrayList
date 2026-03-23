package co.edu.uptc.logic;


public class BaseClass {
	protected String id;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "BaseClass [id=" + id + "]";
	}
	
}
