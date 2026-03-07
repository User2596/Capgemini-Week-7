package com.jpa.MapTable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="customer_details")
public class CustomerDetails {

	@Id
	@Column
	private int id;
	
	@Column
	private String mobile;
	
	@Column
	private String address;
	
	@Column
	private String email;
	
	@OneToOne(mappedBy = "customerDetails")
	private Customer customer;
	
	public CustomerDetails() {}

	public CustomerDetails(int id, String mobile, String address, String email) {
		this.id = id;
		this.mobile = mobile;
		this.address = address;
		this.email = email;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	
}
