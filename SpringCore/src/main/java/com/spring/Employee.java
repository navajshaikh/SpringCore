package com.spring;

public class Employee {
	
	private int id;
	private String name;
	private String address;
	private String dateOfJoining;
	
	public Employee(int id, String name, String address, String dateOfJoining) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.dateOfJoining = dateOfJoining;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDateOfJoining() {
		return dateOfJoining;
	}

	public void setDateOfJoining(String dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", address=" + address + ", dateOfJoining=" + dateOfJoining
				+ "]";
	}
	

}
