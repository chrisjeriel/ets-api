package ph.cpi.rest.api.model.accountingintrust;

import java.math.BigDecimal;

import org.joda.time.DateTime;

public class AcitJVQuarterPremRes {
	private BigDecimal fundsHeld;
	private DateTime quarterEnding;
	private BigDecimal premResQuota;
	private BigDecimal premRes1surplus;
	private BigDecimal premRes2surplus;
	
	public BigDecimal getFundsHeld() {
		return fundsHeld;
	}
	public void setFundsHeld(BigDecimal fundsHeld) {
		this.fundsHeld = fundsHeld;
	}
	public DateTime getQuarterEnding() {
		return quarterEnding;
	}
	public void setQuarterEnding(DateTime quarterEnding) {
		this.quarterEnding = quarterEnding;
	}
	
	
	public BigDecimal getPremResQuota() {
		return premResQuota;
	}
	public void setPremResQuota(BigDecimal premResQuota) {
		this.premResQuota = premResQuota;
	}
	public BigDecimal getPremRes1surplus() {
		return premRes1surplus;
	}
	public void setPremRes1surplus(BigDecimal premRes1surplus) {
		this.premRes1surplus = premRes1surplus;
	}
	public BigDecimal getPremRes2surplus() {
		return premRes2surplus;
	}
	public void setPremRes2surplus(BigDecimal premRes2surplus) {
		this.premRes2surplus = premRes2surplus;
	}
	@Override
	public String toString() {
		return "AcitJVQuarterPremRes [fundsHeld=" + fundsHeld + ", quarterEnding=" + quarterEnding + ", premResQuota="
				+ premResQuota + ", premRes1surplus=" + premRes1surplus + ", premRes2surplus=" + premRes2surplus + "]";
	}
	
}
