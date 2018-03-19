package modal;

public class NGO {
	private String id;
	private String name;
	private String[] required;
	// location variable
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String[] getRequired() {
		return required;
	}
	public void setRequired(String[] required) {
		this.required = required;
	}
	public NGO(String id, String name, String[] required) {
		super();
		this.id = id;
		this.name = name;
		this.required = required;
	}
		
}
