package onetomany;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Qspider_student 
{
	@Id
	private int qid;
	private String qname;
	private String qtime;
	@OneToMany
	private List<Course> c;
	public int getQid() {
		return qid;
	}
	public void setQid(int qid) {
		this.qid = qid;
	}
	public String getQname() {
		return qname;
	}
	public void setQname(String qname) {
		this.qname = qname;
	}
	public String getQtime() {
		return qtime;
	}
	public void setQtime(String qtime) {
		this.qtime = qtime;
	}
	public List<Course> getC() {
		return c;
	}
	public void setC(List<Course> c) {
		this.c = c;
	}
	

}
