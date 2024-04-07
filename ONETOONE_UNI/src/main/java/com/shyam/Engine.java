package com.shyam;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Engine 
{
	@Id
	private long eid;
	private String ename;
	private long eprice;
	public long getEid() {
		return eid;
	}
	public void setEid(long eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public long getEprice() {
		return eprice;
	}
	public void setEprice(long eprice) {
		this.eprice = eprice;
	}

}
