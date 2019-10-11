package ph.cpi.rest.api.model.accountingintrust;

import java.math.BigDecimal;

import org.joda.time.DateTime;

public class AcitInwPolPayts {
	private String tranNo;
	private Integer tranId;
	private DateTime tranDate;
	private Integer policyId;
	private Integer instNo;
	private String paytType;
	private String currCd;
	private BigDecimal currRate;
	private BigDecimal premAmt;
	private BigDecimal riComm;
	private BigDecimal riCommVat;
	private BigDecimal charges;
	private BigDecimal paytAmt;
	private BigDecimal localAmt;
	private String createUser;
	private DateTime createDate;
	private String updateUser;
	private DateTime updateDate;
	
	public DateTime getTranDate() {
		return tranDate;
	}
	public void setTranDate(DateTime tranDate) {
		this.tranDate = tranDate;
	}
	public String getTranNo() {
		return tranNo;
	}
	public void setTranNo(String tranNo) {
		this.tranNo = tranNo;
	}
	public Integer getTranId() {
		return tranId;
	}
	public void setTranId(Integer tranId) {
		this.tranId = tranId;
	}
	public Integer getPolicyId() {
		return policyId;
	}
	public void setPolicyId(Integer policyId) {
		this.policyId = policyId;
	}
	public Integer getInstNo() {
		return instNo;
	}
	public void setInstNo(Integer instNo) {
		this.instNo = instNo;
	}
	public String getPaytType() {
		return paytType;
	}
	public void setPaytType(String paytType) {
		this.paytType = paytType;
	}
	public String getCurrCd() {
		return currCd;
	}
	public void setCurrCd(String currCd) {
		this.currCd = currCd;
	}
	public BigDecimal getCurrRate() {
		return currRate;
	}
	public void setCurrRate(BigDecimal currRate) {
		this.currRate = currRate;
	}
	public BigDecimal getPremAmt() {
		return premAmt;
	}
	public void setPremAmt(BigDecimal premAmt) {
		this.premAmt = premAmt;
	}
	public BigDecimal getRiComm() {
		return riComm;
	}
	public void setRiComm(BigDecimal riComm) {
		this.riComm = riComm;
	}
	public BigDecimal getRiCommVat() {
		return riCommVat;
	}
	public void setRiCommVat(BigDecimal riCommVat) {
		this.riCommVat = riCommVat;
	}
	public BigDecimal getCharges() {
		return charges;
	}
	public void setCharges(BigDecimal charges) {
		this.charges = charges;
	}
	public BigDecimal getPaytAmt() {
		return paytAmt;
	}
	public void setPaytAmt(BigDecimal paytAmt) {
		this.paytAmt = paytAmt;
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
		return "AcitInwPolPayts [tranNo=" + tranNo + ", tranId=" + tranId + ", tranDate=" + tranDate + ", policyId="
				+ policyId + ", instNo=" + instNo + ", paytType=" + paytType + ", currCd=" + currCd + ", currRate="
				+ currRate + ", premAmt=" + premAmt + ", riComm=" + riComm + ", riCommVat=" + riCommVat + ", charges="
				+ charges + ", paytAmt=" + paytAmt + ", localAmt=" + localAmt + ", createUser=" + createUser
				+ ", createDate=" + createDate + ", updateUser=" + updateUser + ", updateDate=" + updateDate + "]";
	}
}
