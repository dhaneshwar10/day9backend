package com.example.demo.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Login {
  @Id
  private String Email;
  private String Password;
public String getEmail() {
	return Email;
}
public void setUsername(String email) {
	Email = email;
}
public String getPassword() {
	return Password;
}
public void setPassword(String password) {
	Password = password;
}
public Login(String email, String password) {
	super();
	Email = email;
	Password = password;
}
}
