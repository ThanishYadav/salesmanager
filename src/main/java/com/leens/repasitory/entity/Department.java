package com.leens.repasitory.entity;

import org.springframework.data.mongodb.core.mapping.Field;

public class Department {
	
	@Field(name="depatment_name")
	private String departmentsName;
	
	@Field(name="location")
	private String location;
	
	
	public String getDepartmentsName() {
		return departmentsName;
	}
	public void setDepartmentsName(String departmentsName) {
		this.departmentsName = departmentsName;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}

}
