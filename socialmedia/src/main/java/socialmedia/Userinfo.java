package socialmedia;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Userinfo 
{
	@Id
	private int uid;
	private String uname;
	private String uemail;
	private String upassword;
	@OneToMany
	private List<Socialmedia> l;
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getUemail() {
		return uemail;
	}
	public void setUemail(String uemail) {
		this.uemail = uemail;
	}
	public String getUpassword() {
		return upassword;
	}
	public void setUpassword(String upassword) {
		this.upassword = upassword;
	}
	public List<Socialmedia> getL() {
		return l;
	}
	public void setL(List<Socialmedia> l) {
		this.l = l;
	}
	
	

}
