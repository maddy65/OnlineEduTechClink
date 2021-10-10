package com.onlinetech.clinkk.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users")

public class Users {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	
	@Column(name = "userId")
	private String  userId;
	
	
	@Column(name = "first_name")
	private String  fristName;
	
	@Column(name = "last_name")
	private String lastName;
	
	@Column(name = "completed")
	private int completed;
	
	@Column(name = "inprogress")
	private int inprogress;
	
	public Users() {
		
	}
	
	public Users(String fristName, String lastName, int completed, int inprogress, String userId) {
		super();
		this.fristName = fristName;
		this.lastName = lastName;
		this.completed = completed;
		this.inprogress = inprogress;
		this.userId = userId;
	}
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	
	

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getFristName() {
		return fristName;
	}

	public void setFristName(String fristName) {
		this.fristName = fristName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getcompleted() {
		return completed;
	}

	public void setcompleted(int completed) {
		this.completed = completed;
	}

	public int getInprogress() {
		return inprogress;
	}

	public void setInprogress(int inprogress) {
		this.inprogress = inprogress;
	}

	
}
