package com.suvrat;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;

import com.suvrat.validator.IsUniqueForUserAndEmail;

@Entity
@Table(name="user")
public class User {
	
	
	public User() {
	
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "user_id", updatable = false, nullable = false)
	public Long id;
	
	@IsUniqueForUserAndEmail(value="user_name",message="User Name Already Exist")
	@Column(name = "user_name")
	@NotBlank(message="User Name Required")
	@NotNull(message="User Name Required")
	public String userName;
	
	@IsUniqueForUserAndEmail(value="email",message="Email Already Exist")
	@Column(name="email")
	@Pattern(regexp="(?:[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*|\"(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21\\x23-\\x5b\\x5d-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])*\")@(?:(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?|\\[(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?|[a-z0-9-]*[a-z0-9]:(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21-\\x5a\\x53-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])+)\\])" , message = "Enter valid email")
	public String email;
	
	@Column(name="first_name")
	@NotBlank(message="First Name Required")
	@NotNull(message="First Name Required")
	public String firstName;
	
	@Column(name="last_name")
	@NotBlank(message ="Last Name Required")
	@NotNull(message ="Last Name Required")
	public String lastname;
	
	
	@Column(name="password")
	@NotNull(message ="Password Required")
	@NotBlank(message ="Password Required")
	public String password;
	
	@Column(name="user_type")
	public String userType="student";
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	
	

}
