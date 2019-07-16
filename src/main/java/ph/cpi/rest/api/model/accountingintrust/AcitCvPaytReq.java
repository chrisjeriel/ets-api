package ph.cpi.rest.api.model.accountingintrust;

import java.math.BigDecimal;

import org.joda.time.DateTime;

public class AcitCvPaytReq {
	private Integer tranId;
	private Integer itemNo;
	private Integer reqId;
	private String reqPrefix;
	private Integer reqYear;
	private Integer reqMm;
	private Integer reqSeqNo;
	private Integer tranTypeCd;
	private DateTime reqDate;
	private String requestedBy;
	private String particulars;
	private String currCd;
	private Integer currRate;
	private BigDecimal reqAmt;
	private BigDecimal localAmt;
	private String createUser;
	private DateTime createDate;
	private String updateUser;
	private DateTime updateDate;
	public Integer getTranId() {
		return tranId;
	}
	public void setTranId(Integer tranId) {
		this.tranId = tranId;
	}
	public Integer getItemNo() {
		return itemNo;
	}
	public void setItemNo(Integer itemNo) {
		this.itemNo = itemNo;
	}
	public Integer getReqId() {
		return reqId;
	}
	public void setReqId(Integer reqId) {
		this.reqId = reqId;
	}
	public String getReqPrefix() {
		return reqPrefix;
	}
	public void setReqPrefix(String reqPrefix) {
		this.reqPrefix = reqPrefix;
	}
	public Integer getReqYear() {
		return reqYear;
	}
	public void setReqYear(Integer reqYear) {
		this.reqYear = reqYear;
	}
	public Integer getReqMm() {
		return reqMm;
	}
	public void setReqMm(Integer reqMm) {
		this.reqMm = reqMm;
	}
	public Integer getReqSeqNo() {
		return reqSeqNo;
	}
	public void setReqSeqNo(Integer reqSeqNo) {
		this.reqSeqNo = reqSeqNo;
	}
	public Integer getTranTypeCd() {
		return tranTypeCd;
	}
	public void setTranTypeCd(Integer tranTypeCd) {
		this.tranTypeCd = tranTypeCd;
	}
	public DateTime getReqDate() {
		return reqDate;
	}
	public void setReqDate(DateTime reqDate) {
		this.reqDate = reqDate;
	}
	public String getRequestedBy() {
		return requestedBy;
	}
	public void setRequestedBy(String requestedBy) {
		this.requestedBy = requestedBy;
	}
	public String getParticulars() {
		return particulars;
	}
	public void setParticulars(String particulars) {
		this.particulars = particulars;
	}
	public String getCurrCd() {
		return currCd;
	}
	public void setCurrCd(String currCd) {
		this.currCd = currCd;
	}
	public Integer getCurrRate() {
		return currRate;
	}
	public void setCurrRate(Integer currRate) {
		this.currRate = currRate;
	}
	public BigDecimal getReqAmt() {
		return reqAmt;
	}
	public void setReqAmt(BigDecimal reqAmt) {
		this.reqAmt = reqAmt;
	}
	public BigDecimal getLocalAmt() {
		return localAmt;
	}
	public void setLocalAmt(BigDecimal localAmt) {
		this.localAmt = localAmt;
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
		return "AcitCvPaytReq [tranId=" + tranId + ", itemNo=" + itemNo + ", reqId=" + reqId + ", reqPrefix="
				+ reqPrefix + ", reqYear=" + reqYear + ", reqMm=" + reqMm + ", reqSeqNo=" + reqSeqNo + ", tranTypeCd="
				+ tranTypeCd + ", reqDate=" + reqDate + ", requestedBy=" + requestedBy + ", particulars=" + particulars
				+ ", currCd=" + currCd + ", currRate=" + currRate + ", reqAmt=" + reqAmt + ", localAmt=" + localAmt
				+ ", createUser=" + createUser + ", createDate=" + createDate + ", updateUser=" + updateUser
				+ ", updateDate=" + updateDate + "]";
	}
}
