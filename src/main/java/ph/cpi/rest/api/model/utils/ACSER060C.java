package ph.cpi.rest.api.model.utils;

public class ACSER060C {

	private String debitAmt;
	private String creditAmt;
	private String glAcctId;
	private String shortCode;
	private String shortDesc;
	private String fromDate;
	private String toDate;
	private String period;
	private String printedBy;
	
	public String getDebitAmt() {
		return debitAmt;
	}
	public void setDebitAmt(String debitAmt) {
		this.debitAmt = debitAmt;
	}
	public String getCreditAmt() {
		return creditAmt;
	}
	public void setCreditAmt(String creditAmt) {
		this.creditAmt = creditAmt;
	}
	public String getGlAcctId() {
		return glAcctId;
	}
	public void setGlAcctId(String glAcctId) {
		this.glAcctId = glAcctId;
	}
	public String getShortCode() {
		return shortCode;
	}
	public void setShortCode(String shortCode) {
		this.shortCode = shortCode;
	}
	public String getShortDesc() {
		return shortDesc;
	}
	public void setShortDesc(String shortDesc) {
		this.shortDesc = shortDesc;
	}
	public String getFromDate() {
		return fromDate;
	}
	public void setFromDate(String fromDate) {
		this.fromDate = fromDate;
	}
	public String getToDate() {
		return toDate;
	}
	public void setToDate(String toDate) {
		this.toDate = toDate;
	}
	public String getPeriod() {
		return period;
	}
	public void setPeriod(String period) {
		this.period = period;
	}
	public String getPrintedBy() {
		return printedBy;
	}
	public void setPrintedBy(String printedBy) {
		this.printedBy = printedBy;
	}
	@Override
	public String toString() {
		return "ACSER060C [debitAmt=" + debitAmt + ", creditAmt=" + creditAmt + ", glAcctId=" + glAcctId
				+ ", shortCode=" + shortCode + ", shortDesc=" + shortDesc + ", fromDate=" + fromDate + ", toDate="
				+ toDate + ", period=" + period + ", printedBy=" + printedBy + "]";
	}
}
