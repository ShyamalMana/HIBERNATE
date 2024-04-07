package com.shyam;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Ssd 
{
	@Id
	private int sid;
	private String sname;
	private String smemory;
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getSmemory() {
		return smemory;
	}
	public void setSmemory(String smemory) {
		this.smemory = smemory;
	}
	

}
