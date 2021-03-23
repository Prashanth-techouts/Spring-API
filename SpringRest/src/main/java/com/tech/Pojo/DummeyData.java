package com.tech.Pojo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class DummeyData {

	@Id
	private int dummeyId;
	private String dummeyfirstName;
	private String dummeyLastName;
	private int dummyPhoneNo;
	public int getDummeyId() {
		return dummeyId;
	}
	public void setDummeyId(int dummeyId) {
		this.dummeyId = dummeyId;
	}
	public String getDummeyfirstName() {
		return dummeyfirstName;
	}
	public void setDummeyfirstName(String dummeyfirstName) {
		this.dummeyfirstName = dummeyfirstName;
	}
	public String getDummeyLastName() {
		return dummeyLastName;
	}
	public void setDummeyLastName(String dummeyLastName) {
		this.dummeyLastName = dummeyLastName;
	}
	public int getDummyPhoneNo() {
		return dummyPhoneNo;
	}
	public void setDummyPhoneNo(int dummyPhoneNo) {
		this.dummyPhoneNo = dummyPhoneNo;
	}
	
	
	
}
