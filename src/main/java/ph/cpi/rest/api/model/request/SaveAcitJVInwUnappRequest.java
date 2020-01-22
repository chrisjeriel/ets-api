package ph.cpi.rest.api.model.request;

import java.math.BigDecimal;
import java.util.List;

public class SaveAcitJVInwUnappRequest {
	
	private Integer tranId;
	private Integer tranType;
	private List<InwUnappliedCollection> saveInwCollection;
	private List<InwUnappliedCollection> delInwCollection;
	

	public Integer getTranId() {
		return tranId;
	}

	public void setTranId(Integer tranId) {
		this.tranId = tranId;
	}

	public Integer getTranType() {
		return tranType;
	}

	public void setTranType(Integer tranType) {
		this.tranType = tranType;
	}

	public List<InwUnappliedCollection> getSaveInwCollection() {
		return saveInwCollection;
	}

	public void setSaveInwCollection(List<InwUnappliedCollection> saveInwCollection) {
		this.saveInwCollection = saveInwCollection;
	}
	
	
	public List<InwUnappliedCollection> getDelInwCollection() {
		return delInwCollection;
	}

	public void setDelInwCollection(List<InwUnappliedCollection> delInwCollection) {
		this.delInwCollection = delInwCollection;
	}

	@Override
	public String toString() {
		return "SaveAcitJVInwUnappRequest [tranId=" + tranId + ", tranType=" + tranType + ", saveInwCollection="
				+ saveInwCollection + ", delInwCollection=" + delInwCollection + "]";
	}
}

class InwUnappliedCollection {
	private Integer tranId;
	private Integer policyId;
	private Integer instNo;
	private Integer paytType;
	private String currCd;
	private BigDecimal currRate;
	private BigDecimal premAmt;
	private BigDecimal riComm;
	private BigDecimal riCommVat;
	private BigDecimal charges;
	private BigDecimal netDue;
	private BigDecimal balance;
	private BigDecimal cumPayment;
	private BigDecimal paytAmt;
	private BigDecimal localAmt;
	private BigDecimal totalPayt;
	private BigDecimal remainingBal;
	private BigDecimal overdueInt;
	private String remarks;
	private String createUser;
	private String createDate;
	private String updateUser;
	private String updateDate;
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
	public String getCurrCd() {
		return currCd;
	}
	public void setCurrCd(String currCd) {
		this.currCd = currCd;
	}
	
	public Integer getPaytType() {
		return paytType;
	}
	public void setPaytType(Integer paytType) {
		this.paytType = paytType;
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
	public BigDecimal getNetDue() {
		return netDue;
	}
	public void setNetDue(BigDecimal netDue) {
		this.netDue = netDue;
	}
	
	public BigDecimal getBalance() {
		return balance;
	}
	public void setBalance(BigDecimal balance) {
		this.balance = balance;
	}
	public BigDecimal getCumPayment() {
		return cumPayment;
	}
	public void setCumPayment(BigDecimal cumPayment) {
		this.cumPayment = cumPayment;
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
	public BigDecimal getTotalPayt() {
		return totalPayt;
	}
	public void setTotalPayt(BigDecimal totalPayt) {
		this.totalPayt = totalPayt;
	}
	public BigDecimal getRemainingBal() {
		return remainingBal;
	}
	public void setRemainingBal(BigDecimal remainingBal) {
		this.remainingBal = remainingBal;
	}
	public BigDecimal getOverdueInt() {
		return overdueInt;
	}
	public void setOverdueInt(BigDecimal overdueInt) {
		this.overdueInt = overdueInt;
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
	public String getCreateDate() {
		return createDate;
	}
	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}
	public String getUpdateUser() {
		return updateUser;
	}
	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}
	public String getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(String updateDate) {
		this.updateDate = updateDate;
	}
	@Override
	public String toString() {
		return "InwUnappliedCollection [tranId=" + tranId + ", policyId=" + policyId + ", instNo=" + instNo
				+ ", paytType=" + paytType + ", currCd=" + currCd + ", currRate=" + currRate + ", premAmt=" + premAmt
				+ ", riComm=" + riComm + ", riCommVat=" + riCommVat + ", charges=" + charges + ", netDue=" + netDue
				+ ", balance=" + balance + ", cumPayment=" + cumPayment + ", paytAmt=" + paytAmt + ", localAmt="
				+ localAmt + ", totalPayt=" + totalPayt + ", remainingBal=" + remainingBal + ", overdueInt="
				+ overdueInt + ", remarks=" + remarks + ", createUser=" + createUser + ", createDate=" + createDate
				+ ", updateUser=" + updateUser + ", updateDate=" + updateDate + "]";
	}
	
}
