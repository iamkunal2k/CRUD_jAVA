package com.pa.test.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private  int id;
	private String name;
	private String city;
	private String status;

	public User( int id, String city, String name, String status) {
		this.city = city;
		this.id = id;
		this.name = name;
		this.status = status;
	}

	public User() {
		super();
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public void setId(int id) {
		this.id = id;
	}


	@Override
	public String toString() {
		return "User{" +
				"city='" + city + '\'' +
				", id=" + id +
				", name='" + name + '\'' +
				", status='" + status + '\'' +
				'}';
	}
}
