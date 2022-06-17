package entities;

import java.util.Date;

public class Client {
	private String name;
	private String email;
	private Date birthdate;
	
	public Client() {
	}
	public Client(String name, String email, Date birthdate) {
		this.name = name;
		this.email = email;
		this.birthdate = birthdate;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getBirthdate() {
		return birthdate;
	}
	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}
	
	
	
	
}
