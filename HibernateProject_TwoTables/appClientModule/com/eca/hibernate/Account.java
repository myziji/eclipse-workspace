package com.eca.hibernate;

public class Account {
	private Long id = null;

	private String acctName;
	private Integer acctNumber;
	private String firstName = null;
	private String lastName = null;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAcctName() {
		return acctName;
	}

	public void setAcctName(String acctName) {
		this.acctName = acctName;
	}

	public Integer getAcctNumber() {
		return acctNumber;
	}

	public void setAcctNumber(Integer acctNumber) {
		this.acctNumber = acctNumber;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	

}
