package com.tech.Pojo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class DummeyData {

	@Id
	private int dummeyId;
	private String dummeyName;
	private String dummeyColor;
	private int dummyNumber;
	public int getDummyNumber() {
		return dummyNumber;
	}
	public void setDummyNumber(int dummyNumber) {
		this.dummyNumber = dummyNumber;
	}
	public int getDummeyId() {
		return dummeyId;
	}
	public void setDummeyId(int dummeyId) {
		this.dummeyId = dummeyId;
	}
	public String getDummeyName() {
		return dummeyName;
	}
	public void setDummeyName(String dummeyName) {
		this.dummeyName = dummeyName;
	}
	public String getDummeyColor() {
		return dummeyColor;
	}
	public void setDummeyColor(String dummeyColor) {
		this.dummeyColor = dummeyColor;
	}
	
	
}
