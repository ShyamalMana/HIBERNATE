package com.shyam;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Laptop 
{
	@Id
	private int lid;
	private String lname;
	private int lprice;
	private String lcolor;
	@OneToOne
	private Ssd ssd;

	public int getLid() {
		return lid;
	}
	public void setLid(int lid) {
		this.lid = lid;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public int getLprice() {
		return lprice;
	}
	public void setLprice(int lprice) {
		this.lprice = lprice;
	}
	public String getLcolor() {
		return lcolor;
	}
	public void setLcolor(String lcolor) {
		this.lcolor = lcolor;
	}
	public Ssd getSsd() {
		return ssd;
	}
	public void setSsd(Ssd ssd) {
		this.ssd = ssd;
	}

}
