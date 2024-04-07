package com.shyam;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Car 
{
	@Id
	private long cid;
	private String cname;
	private long cprice;
	@OneToOne
	private Engine engine;
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
	public long getCprice() {
		return cprice;
	}
	public void setCprice(long cprice) {
		this.cprice = cprice;
	}
	public Engine getEngine() {
		return engine;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	

}
