package ph.cpi.rest.api.model.claims;

import java.math.BigDecimal;

import org.joda.time.DateTime;

public class ClaimPaytRequest {

	private Integer claimId;
	private Integer projId;
	private Integer histNo;
	private Integer paytReqId;
	private String paytReqNo;
	private String paytReqStat;
	private String paytReqStatDesc;
	private String createUser;
	private DateTime createDate;
	private String updateUser;
	private DateTime updateDate;
	
	private String histCategory;
	private String histCategoryDesc;
	private String histType;
	private String histTypeDesc;
	private String currencyCd;
	private BigDecimal currencyRt;
	private BigDecimal reserveAmt;
	private BigDecimal paytAmt;
	private String refNo;
	private DateTime refDate;
	private String particulars;
	private String payeeNo;
	private String payee;
	private String tranTypeName;
	
	public String getTranTypeName() {
		return tranTypeName;
	}
	public void setTranTypeName(String tranTypeName) {
		this.tranTypeName = tranTypeName;
	}
	public String getPayeeNo() {
		return payeeNo;
	}
	public void setPayeeNo(String payeeNo) {
		this.payeeNo = payeeNo;
	}
	public String getPayee() {
		return payee;
	}
	public void setPayee(String payee) {
		this.payee = payee;
	}
	public String getParticulars() {
		return particulars;
	}
	public void setParticulars(String particulars) {
		this.particulars = particulars;
	}
	public BigDecimal getCurrencyRt() {
		return currencyRt;
	}
	public void setCurrencyRt(BigDecimal currencyRt) {
		this.currencyRt = currencyRt;
	}
	public Integer getClaimId() {
		return claimId;
	}
	public void setClaimId(Integer claimId) {
		this.claimId = claimId;
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
	public Integer getPaytReqId() {
		return paytReqId;
	}
	public void setPaytReqId(Integer paytReqId) {
		this.paytReqId = paytReqId;
	}
	public String getPaytReqNo() {
		return paytReqNo;
	}
	public void setPaytReqNo(String paytReqNo) {
		this.paytReqNo = paytReqNo;
	}
	public String getPaytReqStat() {
		return paytReqStat;
	}
	public void setPaytReqStat(String paytReqStat) {
		this.paytReqStat = paytReqStat;
	}
	public String getPaytReqStatDesc() {
		return paytReqStatDesc;
	}
	public void setPaytReqStatDesc(String paytReqStatDesc) {
		this.paytReqStatDesc = paytReqStatDesc;
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
	public String getHistCategory() {
		return histCategory;
	}
	public void setHistCategory(String histCategory) {
		this.histCategory = histCategory;
	}
	public String getHistCategoryDesc() {
		return histCategoryDesc;
	}
	public void setHistCategoryDesc(String histCategoryDesc) {
		this.histCategoryDesc = histCategoryDesc;
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
	public String getCurrencyCd() {
		return currencyCd;
	}
	public void setCurrencyCd(String currencyCd) {
		this.currencyCd = currencyCd;
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
	@Override
	public String toString() {
		return "ClaimPaytRequest [claimId=" + claimId + ", projId=" + projId + ", histNo=" + histNo + ", paytReqId="
				+ paytReqId + ", paytReqNo=" + paytReqNo + ", paytReqStat=" + paytReqStat + ", paytReqStatDesc="
				+ paytReqStatDesc + ", createUser=" + createUser + ", createDate=" + createDate + ", updateUser="
				+ updateUser + ", updateDate=" + updateDate + ", histCategory=" + histCategory + ", histCategoryDesc="
				+ histCategoryDesc + ", histType=" + histType + ", histTypeDesc=" + histTypeDesc + ", currencyCd="
				+ currencyCd + ", currencyRt=" + currencyRt + ", reserveAmt=" + reserveAmt + ", paytAmt=" + paytAmt
				+ ", refNo=" + refNo + ", refDate=" + refDate + ", particulars=" + particulars + ", payeeNo=" + payeeNo
				+ ", payee=" + payee + ", tranTypeName=" + tranTypeName + "]";
	}
}