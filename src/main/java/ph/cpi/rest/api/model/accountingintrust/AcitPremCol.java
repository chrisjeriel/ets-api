package ph.cpi.rest.api.model.accountingintrust;

import java.math.BigDecimal;

import org.joda.time.DateTime;

public class AcitPremCol {
	private DateTime bookingDate;
	private String policyNo;
	private String policyId;
	private String instNo;
	private String coRefNo;
	private String insured;
	private String currCd;
	private BigDecimal polPremAmt;
	private BigDecimal polCommAmt;
	private BigDecimal polVatRiComm;
	private BigDecimal polAmtDue;
	
	private BigDecimal colPremAmt;
	private BigDecimal colCommAmt;
	private BigDecimal colVatRiComm;
	private BigDecimal colAmtDue;
	
	private BigDecimal osPremAmt;
	private BigDecimal osCommAmt;
	private BigDecimal osVatRiComm;
	private BigDecimal osAmtDue;
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
	public BigDecimal getPolPremAmt() {
		return polPremAmt;
	}
	public void setPolPremAmt(BigDecimal polPremAmt) {
		this.polPremAmt = polPremAmt;
	}
	public BigDecimal getPolCommAmt() {
		return polCommAmt;
	}
	public void setPolCommAmt(BigDecimal polCommAmt) {
		this.polCommAmt = polCommAmt;
	}
	public BigDecimal getPolVatRiComm() {
		return polVatRiComm;
	}
	public void setPolVatRiComm(BigDecimal polVatRiComm) {
		this.polVatRiComm = polVatRiComm;
	}
	public BigDecimal getPolAmtDue() {
		return polAmtDue;
	}
	public void setPolAmtDue(BigDecimal polAmtDue) {
		this.polAmtDue = polAmtDue;
	}
	public BigDecimal getColPremAmt() {
		return colPremAmt;
	}
	public void setColPremAmt(BigDecimal colPremAmt) {
		this.colPremAmt = colPremAmt;
	}
	public BigDecimal getColCommAmt() {
		return colCommAmt;
	}
	public void setColCommAmt(BigDecimal colCommAmt) {
		this.colCommAmt = colCommAmt;
	}
	public BigDecimal getColVatRiComm() {
		return colVatRiComm;
	}
	public void setColVatRiComm(BigDecimal colVatRiComm) {
		this.colVatRiComm = colVatRiComm;
	}
	public BigDecimal getColAmtDue() {
		return colAmtDue;
	}
	public void setColAmtDue(BigDecimal colAmtDue) {
		this.colAmtDue = colAmtDue;
	}
	public BigDecimal getOsPremAmt() {
		return osPremAmt;
	}
	public void setOsPremAmt(BigDecimal osPremAmt) {
		this.osPremAmt = osPremAmt;
	}
	public BigDecimal getOsCommAmt() {
		return osCommAmt;
	}
	public void setOsCommAmt(BigDecimal osCommAmt) {
		this.osCommAmt = osCommAmt;
	}
	public BigDecimal getOsVatRiComm() {
		return osVatRiComm;
	}
	public void setOsVatRiComm(BigDecimal osVatRiComm) {
		this.osVatRiComm = osVatRiComm;
	}
	public BigDecimal getOsAmtDue() {
		return osAmtDue;
	}
	public void setOsAmtDue(BigDecimal osAmtDue) {
		this.osAmtDue = osAmtDue;
	}
	@Override
	public String toString() {
		return "AcitPremCol [bookingDate=" + bookingDate + ", policyNo=" + policyNo + ", policyId=" + policyId
				+ ", instNo=" + instNo + ", coRefNo=" + coRefNo + ", insured=" + insured + ", currCd=" + currCd
				+ ", polPremAmt=" + polPremAmt + ", polCommAmt=" + polCommAmt + ", polVatRiComm=" + polVatRiComm
				+ ", polAmtDue=" + polAmtDue + ", colPremAmt=" + colPremAmt + ", colCommAmt=" + colCommAmt
				+ ", colVatRiComm=" + colVatRiComm + ", colAmtDue=" + colAmtDue + ", osPremAmt=" + osPremAmt
				+ ", osCommAmt=" + osCommAmt + ", osVatRiComm=" + osVatRiComm + ", osAmtDue=" + osAmtDue + "]";
	}	
	
}
