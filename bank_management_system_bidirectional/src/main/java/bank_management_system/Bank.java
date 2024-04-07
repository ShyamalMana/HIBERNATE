package bank_management_system;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Bank 
{
	@Id
	private long bid; 
	private String bname;
	private String bifsc;
	@OneToMany(mappedBy = "bank")
	
	private List<Accounts> list;
	public long getBid() {
		return bid;
	}
	public void setBid(long bid) {
		this.bid = bid;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public String getBifsc() {
		return bifsc;
	}
	public void setBifsc(String bifsc) {
		this.bifsc = bifsc;
	}
	public List<Accounts> getList() {
		return list;
	}
	public void setList(List<Accounts> list) {
		this.list = list;
	}

}
