package ph.cpi.rest.api.model.utils;

import java.math.BigDecimal;

public class POLR052J {

	private String extractUser;
	private String extractDate;
	private String currencyCd;
	private String lineCd;
	private String cedingId;
	private String cedingName;
	private BigDecimal ret1PremAmt;
	private BigDecimal ret1CommAmt;
	private BigDecimal ret1VatRiComm;
	private BigDecimal ret1NetDue;
	private BigDecimal ret2PremAmt;
	private BigDecimal ret2CommAmt;
	private BigDecimal ret2VatRiComm;
	private BigDecimal ret2NetDue;
	private String dateParam;
	private String dateRange;
	private String fromDate;
	private String toDate;
	private String lineCdParam;
	
	public String getExtractUser() {
		return extractUser;
	}
	public void setExtractUser(String extractUser) {
		this.extractUser = extractUser;
	}
	public String getExtractDate() {
		return extractDate;
	}
	public void setExtractDate(String extractDate) {
		this.extractDate = extractDate;
	}
	public String getCurrencyCd() {
		return currencyCd;
	}
	public void setCurrencyCd(String currencyCd) {
		this.currencyCd = currencyCd;
	}
	public String getLineCd() {
		return lineCd;
	}
	public void setLineCd(String lineCd) {
		this.lineCd = lineCd;
	}
	public String getCedingId() {
		return cedingId;
	}
	public void setCedingId(String cedingId) {
		this.cedingId = cedingId;
	}
	public String getCedingName() {
		return cedingName;
	}
	public void setCedingName(String cedingName) {
		this.cedingName = cedingName;
	}
	public BigDecimal getRet1PremAmt() {
		return ret1PremAmt;
	}
	public void setRet1PremAmt(BigDecimal ret1PremAmt) {
		this.ret1PremAmt = ret1PremAmt;
	}
	public BigDecimal getRet1CommAmt() {
		return ret1CommAmt;
	}
	public void setRet1CommAmt(BigDecimal ret1CommAmt) {
		this.ret1CommAmt = ret1CommAmt;
	}
	public BigDecimal getRet1VatRiComm() {
		return ret1VatRiComm;
	}
	public void setRet1VatRiComm(BigDecimal ret1VatRiComm) {
		this.ret1VatRiComm = ret1VatRiComm;
	}
	public BigDecimal getRet1NetDue() {
		return ret1NetDue;
	}
	public void setRet1NetDue(BigDecimal ret1NetDue) {
		this.ret1NetDue = ret1NetDue;
	}
	public BigDecimal getRet2PremAmt() {
		return ret2PremAmt;
	}
	public void setRet2PremAmt(BigDecimal ret2PremAmt) {
		this.ret2PremAmt = ret2PremAmt;
	}
	public BigDecimal getRet2CommAmt() {
		return ret2CommAmt;
	}
	public void setRet2CommAmt(BigDecimal ret2CommAmt) {
		this.ret2CommAmt = ret2CommAmt;
	}
	public BigDecimal getRet2VatRiComm() {
		return ret2VatRiComm;
	}
	public void setRet2VatRiComm(BigDecimal ret2VatRiComm) {
		this.ret2VatRiComm = ret2VatRiComm;
	}
	public BigDecimal getRet2NetDue() {
		return ret2NetDue;
	}
	public void setRet2NetDue(BigDecimal ret2NetDue) {
		this.ret2NetDue = ret2NetDue;
	}
	public String getDateParam() {
		return dateParam;
	}
	public void setDateParam(String dateParam) {
		this.dateParam = dateParam;
	}
	public String getDateRange() {
		return dateRange;
	}
	public void setDateRange(String dateRange) {
		this.dateRange = dateRange;
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
	public String getLineCdParam() {
		return lineCdParam;
	}
	public void setLineCdParam(String lineCdParam) {
		this.lineCdParam = lineCdParam;
	}
	@Override
	public String toString() {
		return "POLR052J [extractUser=" + extractUser + ", extractDate=" + extractDate + ", currencyCd=" + currencyCd
				+ ", lineCd=" + lineCd + ", cedingId=" + cedingId + ", cedingName=" + cedingName + ", ret1PremAmt="
				+ ret1PremAmt + ", ret1CommAmt=" + ret1CommAmt + ", ret1VatRiComm=" + ret1VatRiComm + ", ret1NetDue="
				+ ret1NetDue + ", ret2PremAmt=" + ret2PremAmt + ", ret2CommAmt=" + ret2CommAmt + ", ret2VatRiComm="
				+ ret2VatRiComm + ", ret2NetDue=" + ret2NetDue + ", dateParam=" + dateParam + ", dateRange=" + dateRange
				+ ", fromDate=" + fromDate + ", toDate=" + toDate + ", lineCdParam=" + lineCdParam + "]";
	}
}
