package booking.entity;

public class loginpojo 
{
	private String name;
	private String password;
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
	public loginpojo(String name, String password) 
	{
		super();
		this.name = name;
		this.password = password;
	}
	@Override
	public String toString() {
		return "loginpojo [name=" + name + ", password=" + password + "]";
	}
}
