package com.shyam;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Company 
{
	@Id
	private long cid;
	private String cname;
	private String caddress;
	@OneToMany
	private List<Employee> list;
	public long getCid() {
		return cid;
	}
	public void setCid(long cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getCaddress() {
		return caddress;
	}
	public void setCaddress(String caddress) {
		this.caddress = caddress;
	}
	public List<Employee> getList() {
		return list;
	}
	public void setList(List<Employee> list) {
		this.list = list;
	}
	@Override
	public String toString() {
		return "Company [cid=" + cid + ", cname=" + cname + ", caddress=" + caddress + ", list=" + list + "]";
	}
	

}
