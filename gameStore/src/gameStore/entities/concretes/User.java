package gameStore.entities.concretes;

import gameStore.entities.abstracts.Entity;

public class User implements Entity{
	private int id;
	private String name;
	private String lastName;
	private String nationalityId;
	private int birthYear;
	private String mail;
	private String password;
	public User() {
		super();
	}
	public User(int id, String name, String lastName, String nationalityId, int birthYear, String mail,
			String password) {
		super();
		this.id = id;
		this.name = name;
		this.lastName = lastName;
		this.nationalityId = nationalityId;
		this.birthYear = birthYear;
		this.mail = mail;
		this.password = password;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getNationalityId() {
		return nationalityId;
	}
	public void setNationalityId(String nationalityId) {
		this.nationalityId = nationalityId;
	}
	public int getBirthYear() {
		return birthYear;
	}
	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
