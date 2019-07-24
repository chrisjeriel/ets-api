package ph.cpi.rest.api.model.claims;

import java.math.BigDecimal;

import org.joda.time.DateTime;

public class ClaimHistory {
	private Integer 	claimId;
	private String 		claimNo;
	private Integer  	projId;
	private Integer  	histNo;
	private String 	 	histCategory;
	private String 	 	histCatDesc;
	private String 	 	histType;
	private String 	 	histTypeDesc;
	private String		bookingMth;
	private Integer		bookingYear;
	private String 	 	exGratia;
	private String 	 	currencyCd;
	private Integer  	currencyRt;
	private BigDecimal  reserveAmt;
	private BigDecimal  paytAmt;
	private String 	 	refNo;
	private DateTime 	refDate;
	private String 	 	remarks;
	private String 	 	createUser;
	private DateTime 	createDate;
	private String 	 	updateUser;
	private DateTime 	updateDate;
	private Float		adjRate;
	private String		val1;
	private String		val2;
	private String		val3;
	private String		val4;
	public Integer getClaimId() {
		return claimId;
	}
	public void setClaimId(Integer claimId) {
		this.claimId = claimId;
	}
	public String getClaimNo() {
		return claimNo;
	}
	public void setClaimNo(String claimNo) {
		this.claimNo = claimNo;
	}
	public Integer getProjId() {
		return projId;
	}
	public void setProjId(Integer projId) {
		this.projId = projId;
	}
	public Integer getHistNo() {
		return histNo;
	}
	public void setHistNo(Integer histNo) {
		this.histNo = histNo;
	}
	public String getHistCategory() {
		return histCategory;
	}
	public void setHistCategory(String histCategory) {
		this.histCategory = histCategory;
	}
	public String getHistCatDesc() {
		return histCatDesc;
	}
	public void setHistCatDesc(String histCatDesc) {
		this.histCatDesc = histCatDesc;
	}
	public String getHistType() {
		return histType;
	}
	public void setHistType(String histType) {
		this.histType = histType;
	}
	public String getHistTypeDesc() {
		return histTypeDesc;
	}
	public void setHistTypeDesc(String histTypeDesc) {
		this.histTypeDesc = histTypeDesc;
	}
	public String getBookingMth() {
		return bookingMth;
	}
	public void setBookingMth(String bookingMth) {
		this.bookingMth = bookingMth;
	}
	public Integer getBookingYear() {
		return bookingYear;
	}
	public void setBookingYear(Integer bookingYear) {
		this.bookingYear = bookingYear;
	}
	public String getExGratia() {
		return exGratia;
	}
	public void setExGratia(String exGratia) {
		this.exGratia = exGratia;
	}
	public String getCurrencyCd() {
		return currencyCd;
	}
	public void setCurrencyCd(String currencyCd) {
		this.currencyCd = currencyCd;
	}
	public Integer getCurrencyRt() {
		return currencyRt;
	}
	public void setCurrencyRt(Integer currencyRt) {
		this.currencyRt = currencyRt;
	}
	public BigDecimal getReserveAmt() {
		return reserveAmt;
	}
	public void setReserveAmt(BigDecimal reserveAmt) {
		this.reserveAmt = reserveAmt;
	}
	public BigDecimal getPaytAmt() {
		return paytAmt;
	}
	public void setPaytAmt(BigDecimal paytAmt) {
		this.paytAmt = paytAmt;
	}
	public String getRefNo() {
		return refNo;
	}
	public void setRefNo(String refNo) {
		this.refNo = refNo;
	}
	public DateTime getRefDate() {
		return refDate;
	}
	public void setRefDate(DateTime refDate) {
		this.refDate = refDate;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public String getCreateUser() {
		return createUser;
	}
	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}
	public DateTime getCreateDate() {
		return createDate;
	}
	public void setCreateDate(DateTime createDate) {
		this.createDate = createDate;
	}
	public String getUpdateUser() {
		return updateUser;
	}
	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}
	public DateTime getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(DateTime updateDate) {
		this.updateDate = updateDate;
	}
	public Float getAdjRate() {
		return adjRate;
	}
	public void setAdjRate(Float adjRate) {
		this.adjRate = adjRate;
	}
	public String getVal1() {
		return val1;
	}
	public void setVal1(String val1) {
		this.val1 = val1;
	}
	public String getVal2() {
		return val2;
	}
	public void setVal2(String val2) {
		this.val2 = val2;
	}
	public String getVal3() {
		return val3;
	}
	public void setVal3(String val3) {
		this.val3 = val3;
	}
	public String getVal4() {
		return val4;
	}
	public void setVal4(String val4) {
		this.val4 = val4;
	}
	@Override
	public String toString() {
		return "ClaimHistory [claimId=" + claimId + ", claimNo=" + claimNo + ", projId=" + projId + ", histNo=" + histNo
				+ ", histCategory=" + histCategory + ", histCatDesc=" + histCatDesc + ", histType=" + histType
				+ ", histTypeDesc=" + histTypeDesc + ", bookingMth=" + bookingMth + ", bookingYear=" + bookingYear
				+ ", exGratia=" + exGratia + ", currencyCd=" + currencyCd + ", currencyRt=" + currencyRt
				+ ", reserveAmt=" + reserveAmt + ", paytAmt=" + paytAmt + ", refNo=" + refNo + ", refDate=" + refDate
				+ ", remarks=" + remarks + ", createUser=" + createUser + ", createDate=" + createDate + ", updateUser="
				+ updateUser + ", updateDate=" + updateDate + ", adjRate=" + adjRate + ", val1=" + val1 + ", val2="
				+ val2 + ", val3=" + val3 + ", val4=" + val4 + "]";
	}
}
