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
	@Override
	public String toString() {
		return "ClaimHistory [claimId=" + claimId + ", claimNo=" + claimNo + ", projId=" + projId + ", histNo=" + histNo
				+ ", histCategory=" + histCategory + ", histCatDesc=" + histCatDesc + ", histType=" + histType
				+ ", histTypeDesc=" + histTypeDesc + ", exGratia=" + exGratia + ", currencyCd=" + currencyCd
				+ ", currencyRt=" + currencyRt + ", reserveAmt=" + reserveAmt + ", paytAmt=" + paytAmt + ", refNo="
				+ refNo + ", refDate=" + refDate + ", remarks=" + remarks + ", createUser=" + createUser
				+ ", createDate=" + createDate + ", updateUser=" + updateUser + ", updateDate=" + updateDate + "]";
	}
}
