package classGroupUser;

public abstract class User {

	private String name;
	private String login;
	private String password;
	
	
	public User() {
		super();
		this.name = "Unknown";
		this.login = "Unknown";
		this.password = "Unknown";
	}
	
	public User(String name, String login, String password) {
		super();
		this.name = name;
		this.login = login;
		this.password = password;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", login=" + login + ", password=" + password + "]";
	}
	
	
	
	
}
