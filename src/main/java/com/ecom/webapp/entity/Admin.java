package com.ecom.webapp.entity;

import com.ecom.webapp.security.User;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "admin_info")
public class Admin extends User {
	
	@NotBlank(message = "Admin Name cannot be empty!")
	private String name;
	
	@NotBlank(message = "Email Id cannot be empty!")
	@Email(message = "Not a proper Email ID format! Enter again.")
	private String mailId;
	
	@NotBlank(message = "Phone Number cannot be empty!")
	@Size(min = 10, max = 10, message = "Invalid Phone Number. Please enter a vaild phone number.")
	@Pattern(regexp = "^\\d{10}$", message = "Invalid input:Enter numbers only.")
	@Column(unique = true)
	private String phoneNo;
	
	public Admin() {
	}
	
	public Admin(@NotBlank(message = "Admin Name cannot be empty!") String name,
			@NotBlank(message = "Email Id cannot be empty!") @Email(message = "Not a proper Email ID format! Enter again.") String mailId,
			@NotBlank(message = "Phone Number cannot be empty!") @Size(min = 10, max = 10, message = "Invalid Phone Number. Please enter a vaild phone number.") @Pattern(regexp = "^\\d{10}$", message = "Invalid input:Enter numbers only.") String phoneNo) {
		super();
		this.name = name;
		this.mailId = mailId;
		this.phoneNo = phoneNo;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMailId() {
		return mailId;
	}
	public void setMailId(String mailId) {
		this.mailId = mailId;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
}
