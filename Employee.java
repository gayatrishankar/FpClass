package org.dummy.emp;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {
	
	public Employee(int id, String name, String emailId, long phone) {
		super();
		this.id = id;
		this.name = name;
		this.emailId = emailId;
		this.phone = phone;
		//this.gender = gender;
	}
	@Id
	private int id;
	private String name;
	private String emailId;
	private long phone;
	//private boolean gender;
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
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	/*public boolean isGender() {
		return gender;
	}
	public void setGender(boolean gender) {
		this.gender = gender;
	}*/
	

}
