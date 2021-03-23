package com.tech.Pojo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class DummeyData {

	@Id
	private int dummeyId;
	private String dummeyName;
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
	
	
}
