package com.shyam;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Subject 
{
	@Id
	private int subid;
	private String subname;
	private long subprice;
	public int getSubid() {
		return subid;
	}
	public void setSubid(int subid) {
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
	

}
