package onetomany;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Course 
{
	@Id
	private int cid;
	private String cname;
	private int cprice;
	private String cduration;
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public int getCprice() {
		return cprice;
	}
	public void setCprice(int cprice) {
		this.cprice = cprice;
	}
	public String getCduration() {
		return cduration;
	}
	public void setCduration(String cduration) {
		this.cduration = cduration;
	}

}
