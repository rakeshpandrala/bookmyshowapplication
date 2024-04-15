package booking.entity;

public class registration 
{
	private String name;
	private String age;
	private String moviename;
	private String price;
	private String seatnumber;
	private String password;
	
	@Override
	public String toString() {
		return "registration [age=" + age + ", price=" + price + ", name=" + name + ", moviename=" + moviename + "]";
	}
	public String getAge() {
		return age;
	}
	public String getPrice() {
		return price;
	}
	public String getName() {
		return name;
	}
	public String getMoviename() {
		return moviename;
	}
	
	public registration(String name, String age, String moviename, String price, String password, String seatnumber) {
		super();
		this.name = name;
		this.age = age;
		this.moviename = moviename;
		this.price = price;
		this.password = password;
		this.seatnumber = seatnumber;
		
	}
	public String getSeatnumber() {
		return seatnumber;
	}
	public void setSeatnumber(String seatnumber) {
		this.seatnumber = seatnumber;
	}
	public String getPassword() {
		return password;
	}
	
	
	
	
}
