package com.tech.Pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="CustomerData2")
public class PersonalData {

	@Id
	@GeneratedValue
	private int customerid;
	
	private String Firstname;
	private String Lastname;
	@Column(unique = true, nullable = false)
	private String email;
	private String Gender;
	private String Dob;
	
	@OneToOne
	
	private CustomerData customerdata;
	
	
	public CustomerData getCustomerdata() {
		return customerdata;
	}
	public void setCustomerdata(CustomerData customerdata) {
		this.customerdata = customerdata;
	}
	
	public int getCustomerid() {
		return customerid;
	}
	public void setCustomerid(int customerid) {
		this.customerid = customerid;
	}
	public String getFirstname() {
		return Firstname;
	}
	public void setFirstname(String firstname) {
		Firstname = firstname;
	}
	public String getLastname() {
		return Lastname;
	}
	public void setLastname(String lastname) {
		Lastname = lastname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public String getDob() {
		return Dob;
	}
	public void setDob(String dob) {
		Dob = dob;
	}
	
	
}
