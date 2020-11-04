package ph.cpi.rest.api.model.accountingintrust;

import java.math.BigDecimal;

import org.joda.time.DateTime;

public class AcitOsPolPrem {
	private DateTime bookingDate;
	private String policyNo;
	private String policyId;
	private String instNo;
	private String coRefNo;
	private String insured;
	private String currCd;
	private BigDecimal premAmt;
	private BigDecimal commAmt;
	private BigDecimal vatRiComm;
	private BigDecimal amtDue;
	public DateTime getBookingDate() {
		return bookingDate;
	}
	public void setBookingDate(DateTime bookingDate) {
		this.bookingDate = bookingDate;
	}
	public String getPolicyNo() {
		return policyNo;
	}
	public void setPolicyNo(String policyNo) {
		this.policyNo = policyNo;
	}
	public String getPolicyId() {
		return policyId;
	}
	public void setPolicyId(String policyId) {
		this.policyId = policyId;
	}
	public String getInstNo() {
		return instNo;
	}
	public void setInstNo(String instNo) {
		this.instNo = instNo;
	}
	public String getCoRefNo() {
		return coRefNo;
	}
	public void setCoRefNo(String coRefNo) {
		this.coRefNo = coRefNo;
	}
	public String getInsured() {
		return insured;
	}
	public void setInsured(String insured) {
		this.insured = insured;
	}
	public String getCurrCd() {
		return currCd;
	}
	public void setCurrCd(String currCd) {
		this.currCd = currCd;
	}
	public BigDecimal getPremAmt() {
		return premAmt;
	}
	public void setPremAmt(BigDecimal premAmt) {
		this.premAmt = premAmt;
	}
	public BigDecimal getCommAmt() {
		return commAmt;
	}
	public void setCommAmt(BigDecimal commAmt) {
		this.commAmt = commAmt;
	}
	public BigDecimal getVatRiComm() {
		return vatRiComm;
	}
	public void setVatRiComm(BigDecimal vatRiComm) {
		this.vatRiComm = vatRiComm;
	}
	public BigDecimal getAmtDue() {
		return amtDue;
	}
	public void setAmtDue(BigDecimal amtDue) {
		this.amtDue = amtDue;
	}
	@Override
	public String toString() {
		return "AcitOsPolPrem [bookingDate=" + bookingDate + ", policyNo=" + policyNo + ", policyId=" + policyId
				+ ", instNo=" + instNo + ", coRefNo=" + coRefNo + ", insured=" + insured + ", currCd=" + currCd
				+ ", premAmt=" + premAmt + ", commAmt=" + commAmt + ", vatRiComm=" + vatRiComm + ", amtDue=" + amtDue
				+ "]";
	}
	
}
