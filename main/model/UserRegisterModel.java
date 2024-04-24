package com.cts.blood.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "NewUsers")


public class UserRegisterModel {

	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private Long user_id;

	@Column(name = "username")
	private String username;

	@Column(name = "user_fullname")
	private String user_fullname;
	
	@Column(name = "Age")
	private int Age;

	@Column(name = "Gender")
	private String Gender;

	@Column(name = "BloodGroup")
	private String BloodGroup;

	@Column(name = "mobile_number")
	private String user_mobile;

	@Column(name = "City")
	private String City;
	
	@Column(name = "user_email")
	private String user_email;

	@Column(name = "password")
	private String password;

	@Column(name = "Last Donation Date")
	private String lastDonationDate;

	public Long getUser_id() {
		return user_id;
	}

	public void setUser_id(Long user_id) {
		this.user_id = user_id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getUser_fullname() {
		return user_fullname;
	}

	public void setUser_fullname(String user_fullname) {
		this.user_fullname = user_fullname;
	}

	public int getAge() {
		return Age;
	}

	public void setAge(int age) {
		Age = age;
	}

	public String getGender() {
		return Gender;
	}

	public void setGender(String gender) {
		Gender = gender;
	}

	public String getBloodGroup() {
		return BloodGroup;
	}

	public void setBloodGroup(String bloodGroup) {
		BloodGroup = bloodGroup;
	}

	public String getUser_mobile() {
		return user_mobile;
	}

	public void setUser_mobile(String user_mobile) {
		this.user_mobile = user_mobile;
	}

	public String getCity() {
		return City;
	}

	public void setCity(String city) {
		City = city;
	}

	public String getUser_email() {
		return user_email;
	}

	public void setUser_email(String user_email) {
		this.user_email = user_email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getLastDonationDate() {
		return lastDonationDate;
	}

	public void setLastDonationDate(String lastDonationDate) {
		this.lastDonationDate = lastDonationDate;
	}

	@Override
	public String toString() {
		return "UserRegisterModel [user_id=" + user_id + ", username=" + username + ", user_fullname=" + user_fullname
				+ ", Age=" + Age + ", Gender=" + Gender + ", BloodGroup=" + BloodGroup + ", user_mobile=" + user_mobile
				+ ", City=" + City + ", user_email=" + user_email + ", password=" + password + ", lastDonationDate="
				+ lastDonationDate + "]";
	}


	


}













