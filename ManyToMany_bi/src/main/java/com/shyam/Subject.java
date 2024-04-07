package com.shyam;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Subject
{
	@Id
	private long subid;
	private String subname;
	private long subprice;
	@ManyToMany(mappedBy = "subjects")
	private List<Student>students;
	public long getSubid() {
		return subid;
	}
	public void setSubid(long subid) {
		this.subid = subid;
	}
	public String getSubname() {
		return subname;
	}
	public void setSubname(String subname) {
		this.subname = subname;
	}
	public long getSubprice() {
		return subprice;
	}
	public void setSubprice(long subprice) {
		this.subprice = subprice;
	}
	public List<Student> getStudents() {
		return students;
	}
	public void setStudents(List<Student> students) {
		this.students = students;
	}

}
