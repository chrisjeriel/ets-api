package ph.cpi.rest.api.model.request;

import java.math.BigDecimal;

import org.joda.time.DateTime;

public class RetrieveAcitCMDMListRequest {
	private String tranId;
	private String memoType;
	private String memoTranType;
	private DateTime memoDate;
	private String memoStatus;
	private DateTime refNoDate;
	private String payee;
	private String particulars;
	private String currCd;
	private BigDecimal cmdmAmt;
	private BigDecimal localAmt;
	
	public String getTranId() {
		return tranId;
	}
	public void setTranId(String tranId) {
		this.tranId = tranId;
	}
	public String getMemoType() {
		return memoType;
	}
	public void setMemoType(String memoType) {
		this.memoType = memoType;
	}
	public String getMemoTranType() {
		return memoTranType;
	}
	public void setMemoTranType(String memoTranType) {
		this.memoTranType = memoTranType;
	}
	public DateTime getMemoDate() {
		return memoDate;
	}
	public void setMemoDate(DateTime memoDate) {
		this.memoDate = memoDate;
	}
	public String getMemoStatus() {
		return memoStatus;
	}
	public void setMemoStatus(String memoStatus) {
		this.memoStatus = memoStatus;
	}
	public DateTime getRefNoDate() {
		return refNoDate;
	}
	public void setRefNoDate(DateTime refNoDate) {
		this.refNoDate = refNoDate;
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
	public String getCurrCd() {
		return currCd;
	}
	public void setCurrCd(String currCd) {
		this.currCd = currCd;
	}
	public BigDecimal getCmdmAmt() {
		return cmdmAmt;
	}
	public void setCmdmAmt(BigDecimal cmdmAmt) {
		this.cmdmAmt = cmdmAmt;
	}
	public BigDecimal getLocalAmt() {
		return localAmt;
	}
	public void setLocalAmt(BigDecimal localAmt) {
		this.localAmt = localAmt;
	}
	@Override
	public String toString() {
		return "RetrieveAcitCMDMListRequest [tranId=" + tranId + ", memoType=" + memoType + ", memoTranType="
				+ memoTranType + ", memoDate=" + memoDate + ", memoStatus=" + memoStatus + ", refNoDate=" + refNoDate
				+ ", payee=" + payee + ", particulars=" + particulars + ", currCd=" + currCd + ", cmdmAmt=" + cmdmAmt
				+ ", localAmt=" + localAmt + "]";
	}
}
