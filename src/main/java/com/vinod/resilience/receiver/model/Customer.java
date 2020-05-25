package com.vinod.resilience.receiver.model;

import javax.persistence.*;

@Entity
@Table(name = "customer")
public class Customer {

	private Long id;
	private String fullname;
	private String description;
	private String emailid;

	public Customer() {
		super();
	}

	public Customer(String fullname, String description, String emailid) {
		super();
		this.fullname = fullname;
		this.description = description;
		this.emailid = emailid;
	}

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getEmailid() {
		return emailid;
	}

	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", fullname=" + fullname + ", description=" + description + ", emailid=" + emailid
				+ "]";
	}

}
