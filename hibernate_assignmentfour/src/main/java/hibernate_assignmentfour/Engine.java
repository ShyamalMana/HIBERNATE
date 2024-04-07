package hibernate_assignmentfour;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Engine {
	@Id
    private int eid;
	private String ename;
	private int ecc;
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public int getEcc() {
		return ecc;
	}
	public void setEcc(int ecc) {
		this.ecc = ecc;
	}

}
