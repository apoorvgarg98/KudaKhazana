package modal;

public class User {
	private String userame;
	private String name;
	private String password;
	private String mobile;
	private String email;
	
	public User(String userame, String name, String password, String mobile, String email) {
		super();
		this.userame = userame;
		this.name = name;
		this.password = password;
		this.mobile = mobile;
		this.email = email;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUserame() {
		return userame;
	}
	public void setUserame(String userame) {
		this.userame = userame;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	
}
