package com.tech.Pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CustomerData1")	
public class CustomerData  {
	
	@Id
	@Column(unique = true ,nullable = false)
	private String adharno;
	@Column(unique = true ,nullable = false)
	private String phoneno;
	
	
	
	public String getAdharno() {
		return adharno;
	}
	public void setAdharno(String adharno) {
		this.adharno = adharno;
	}
	public String getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}
	@Override
	public String toString() {
		return "CustomerData [adharno=" + adharno + ", phoneno=" + phoneno + "]";
	}
		
	
}
