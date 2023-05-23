package com.hos.app.Entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

@Entity
public class Usuario {

	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private int Id;
	
	@NotNull
	private String username;
	@NotNull
	private String password;
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
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
	
	
	
}
