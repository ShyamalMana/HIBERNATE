package com.shyam;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee 
{
	@Id
	private long id;
	private String name;
	private String shift;
	private long salary;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getShift() {
		return shift;
	}
	public void setShift(String shift) {
		this.shift = shift;
	}
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", shift=" + shift + ", salary=" + salary + "]";
	}

}
