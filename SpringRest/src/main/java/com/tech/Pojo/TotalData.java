package com.tech.Pojo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class TotalData {
	
	@Id
	private String Phoneno;
	private String Firstname;
	private String Lastname;
	private String Address;
	private String State;
	private String Pincode;
	private String Email;
	private String Gender;
	private String Dob;
	private String Adharno;
	
	
	public TotalData() {}
	
	public TotalData(String phoneno, String firstname, String lastname, String address, String state, String pincode,
			String email, String gender, String dob, String adharno) {
		Phoneno = phoneno;
		Firstname = firstname;
		Lastname = lastname;
		Address = address;
		State = state;
		Pincode = pincode;
		Email = email;
		Gender = gender;
		Dob = dob;
		Adharno = adharno;
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
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
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
	
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	public String getPincode() {
		return Pincode;
	}
	public void setPincode(String pincode) {
		Pincode = pincode;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	
	public String getPhoneno() {
		return Phoneno;
	}
	public void setPhoneno(String phoneno) {
		Phoneno = phoneno;
	}
	
	public String getAdharno() {
		return Adharno;
	}
	public void setAdharno(String adharno) {
		Adharno = adharno;
	}
	
	@Override
	public String toString() {
		return "TotalData [Phoneno=" + Phoneno + ", Firstname=" + Firstname + ", Lastname=" + Lastname + ", Address="
				+ Address + ", State=" + State + ", Pincode=" + Pincode + ", Email=" + Email + ", Gender=" + Gender
				+ ", Dob=" + Dob + ", Adharno=" + Adharno + "]";
	}
	
	

}
