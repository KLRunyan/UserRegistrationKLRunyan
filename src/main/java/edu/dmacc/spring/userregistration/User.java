package edu.dmacc.spring.userregistration;

public class User {
	private String name;
	private String lastName;
	private String password;
	private String detail;
	private String birthMonth;
	private Gender gender;
	private String country;
	private boolean nonSmoking;
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	public String getBirthMonth() {
		return birthMonth;
	}
	public void setBirthMonth(String birthMonth) {
		this.birthMonth = birthMonth;
	}
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public boolean isNonSmoking() {
		return nonSmoking;
	}
	public void setNonSmoking(boolean nonSmoking) {
		this.nonSmoking = nonSmoking;
	}
	
}
