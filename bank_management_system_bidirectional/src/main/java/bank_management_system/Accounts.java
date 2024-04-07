package bank_management_system;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Accounts 
{
	@Id
	private long acid;
	private String acname;
	private String acstatus;
	@ManyToOne
	@JoinColumn
	private Bank bank;
	public long getAcid() {
		return acid;
	}
	public void setAcid(long acid) {
		this.acid = acid;
	}
	public String getAcname() {
		return acname;
	}
	public void setAcname(String acname) {
		this.acname = acname;
	}
	public String getAcstatus() {
		return acstatus;
	}
	public void setAcstatus(String acstatus) {
		this.acstatus = acstatus;
	}
	public Bank getBank() {
		return bank;
	}
	public void setBank(Bank bank) {
		this.bank = bank;
	}
	
}
	
	
	


