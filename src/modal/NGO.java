package modal;

public class NGO {
	private String id;
	private String password;
	private String name;
	private String[] required;
	private String website;
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getWebsite() {
		return website;
	}
	public NGO(String id, String name, String[] required, String website) {
		super();
		this.id = id;
		this.name = name;
		this.required = required;
		this.website = website;
	}
	public void setWebsite(String website) {
		this.website = website;
	}
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
		
}
