package com.alibaba.taobao.Dao;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@Entity
public class User {
	
	@Id
	@NotNull
	@Column(name="id",nullable = false, updatable = false)
	private String id;
	
	@NotNull
    @Size(max = 64)
    @Column(name = "username", nullable = false)
	private String username;
	
	@NotNull
    @Size(max = 64)
    @Column(name = "password", nullable = false)
	private String password;
	
	@NotNull
    @Column(name = "role", nullable = false)
	private String role;
	
	@NotNull
    @Column(name = "firstname", nullable = false)
	private String firstname;
	
	@NotNull
    @Column(name = "lastname", nullable = false)
	private String lastname;
	
	@NotNull
    @Column(name = "address", nullable = false)
	private String address;
	
	@NotNull
    @Column(name = "city", nullable = false)
	private String city;
	
	@NotNull
    @Column(name = "state", nullable = false)
	private String state;
	
	@NotNull
    @Column(name = "zipcode", nullable = false)
	private String zipcode;
	
	@NotNull
    @Column(name = "email", nullable = false)
	private String email;

	public User() {
		
	}
	public User(@NotNull String id, @NotNull @Size(max = 64) String username, @NotNull @Size(max = 64) String password,
			@NotNull String role, @NotNull String firstname, @NotNull String lastname, @NotNull String address,
			@NotNull String city, @NotNull String state, @NotNull String zipcode, @NotNull String email) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.role = role;
		this.firstname = firstname;
		this.lastname = lastname;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zipcode = zipcode;
		this.email = email;
	}



	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password=" + password + ", role=" + role
				+ ", firstname=" + firstname + ", lastname=" + lastname + ", address=" + address + ", city=" + city
				+ ", state=" + state + ", zipcode=" + zipcode + ", email=" + email + "]";
	}
	
}
