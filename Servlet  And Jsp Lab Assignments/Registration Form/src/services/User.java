package services;

public class User {
	private String userName;
	private String password;
	private String rPassword;
	private int age;
	private String gender;
	private String city;
	private String[] technologies;
	private int wexp;
	public User(String userName, String password, String rPassword, int age, String gender, String city,
			String[] technologies, int wexp) {
		super();
		this.userName = userName;
		this.password = password;
		this.rPassword = rPassword;
		this.age = age;
		this.gender = gender;
		this.city = city;
		this.technologies = technologies;
		this.wexp = wexp;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getrPassword() {
		return rPassword;
	}
	public void setrPassword(String rPassword) {
		this.rPassword = rPassword;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String[] getTechnologies() {
		return technologies;
	}
	public void setTechnologies(String[] technologies) {
		this.technologies = technologies;
	}
	public int getWexp() {
		return wexp;
	}
	public void setWexp(int wexp) {
		this.wexp = wexp;
	}

	
}
