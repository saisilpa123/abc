package com.tyss.ems.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee {
	private String name;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)  //automatically adds id and update sit
	private int id;
	private String email;
	private String password;
	private double sal;
	public Employee() {
		
	}
	public Employee(String name, int id, String email, String password, double sal, long phone) {
		super();
		this.name = name;
		this.id = id;
		this.email = email;
		this.password = password;
		this.sal = sal;
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", email=" + email + ", password=" + password + ", sal=" + sal
				+ ", phone=" + phone + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	private long phone;
	

}
