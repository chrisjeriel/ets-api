package ph.cpi.rest.api.model.request;

import java.math.BigDecimal;
import java.util.List;

import org.apache.ibatis.type.Alias;

public class SaveAcitJVRcvblsAgnstLosRequest {
	private Integer tranId;
	private Integer tranType;
	private List<ClmOffset> saveClmOffset;
	private List<ClmOffset> delClmOffset;
	private List<InwpolOffset> saveInwPol;
	private List<InwpolOffset> delInwPol;
	
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
	public List<ClmOffset> getSaveClmOffset() {
		return saveClmOffset;
	}
	public void setSaveClmOffset(List<ClmOffset> saveClmOffset) {
		this.saveClmOffset = saveClmOffset;
	}
	public List<ClmOffset> getDelClmOffset() {
		return delClmOffset;
	}
	public void setDelClmOffset(List<ClmOffset> delClmOffset) {
		this.delClmOffset = delClmOffset;
	}
	public List<InwpolOffset> getSaveInwPol() {
		return saveInwPol;
	}
	public void setSaveInwPol(List<InwpolOffset> saveInwPol) {
		this.saveInwPol = saveInwPol;
	}
	public List<InwpolOffset> getDelInwPol() {
		return delInwPol;
	}
	public void setDelInwPol(List<InwpolOffset> delInwPol) {
		this.delInwPol = delInwPol;
	}
	@Override
	public String toString() {
		return "SaveAcitJVRcvblsAgnstLosRequest [tranId=" + tranId + ", tranType=" + tranType + ", saveClmOffset="
				+ saveClmOffset + ", delClmOffset=" + delClmOffset + ", saveInwPol=" + saveInwPol + ", delInwPol="
				+ delInwPol + "]";
	}
	
}

@Alias ("ACITInwpolOffset")
class InwpolOffset{
	private Integer tranId;
	private Integer itemNo;
	private Integer policyId;
	private Integer instNo;
	private String currCd;
	private BigDecimal currRate;
	private BigDecimal premAmt;
	private BigDecimal riComm;
	private BigDecimal riCommVat;
	private BigDecimal charges;
	private BigDecimal netDue;
	private BigDecimal paytAmt;
	private BigDecimal localAmt;
	private BigDecimal overdueInt;
	private String remarks;
	private BigDecimal cumPayment;
	private BigDecimal balance;
	private BigDecimal totalPayt;
	private BigDecimal remainingBal;
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
	public Integer getItemNo() {
		return itemNo;
	}
	public void setItemNo(Integer itemNo) {
		this.itemNo = itemNo;
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
	
	public BigDecimal getCumPayment() {
		return cumPayment;
	}
	public void setCumPayment(BigDecimal cumPayment) {
		this.cumPayment = cumPayment;
	}
	public BigDecimal getBalance() {
		return balance;
	}
	public void setBalance(BigDecimal balance) {
		this.balance = balance;
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
		return "InwpolOffset [tranId=" + tranId + ", itemNo=" + itemNo + ", policyId=" + policyId + ", instNo=" + instNo
				+ ", currCd=" + currCd + ", currRate=" + currRate + ", premAmt=" + premAmt + ", riComm=" + riComm
				+ ", riCommVat=" + riCommVat + ", charges=" + charges + ", netDue=" + netDue + ", paytAmt=" + paytAmt
				+ ", localAmt=" + localAmt + ", overdueInt=" + overdueInt + ", remarks=" + remarks + ", cumPayment="
				+ cumPayment + ", balance=" + balance + ", totalPayt=" + totalPayt + ", remainingBal=" + remainingBal
				+ ", createUser=" + createUser + ", createDate=" + createDate + ", updateUser=" + updateUser
				+ ", updateDate=" + updateDate + "]";
	}
	
}

@Alias ("ACITClaimOffset")
class ClmOffset{
	private Integer tranId;
	private Integer itemNo;
	private Integer claimId;
	private Integer projId;
	private Integer histNo;
	private Integer policyId;
	private Integer instNo;
	private BigDecimal premAmt;
	private BigDecimal riComm;
	private BigDecimal riCommVat;
	private BigDecimal charges;
	private BigDecimal paytAmt;
	private String paymentFor;
	private String histCategory;
	private String histType;
	private String exGratia;
	private BigDecimal reserveAmt;
	private String currCd;
	private BigDecimal currRate;
	private BigDecimal clmPaytAmt;
	private BigDecimal localAmt;
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
	public Integer getItemNo() {
		return itemNo;
	}
	public void setItemNo(Integer itemNo) {
		this.itemNo = itemNo;
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
	public String getPaymentFor() {
		return paymentFor;
	}
	public void setPaymentFor(String paymentFor) {
		this.paymentFor = paymentFor;
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
	public BigDecimal getClmPaytAmt() {
		return clmPaytAmt;
	}
	public void setClmPaytAmt(BigDecimal clmPaytAmt) {
		this.clmPaytAmt = clmPaytAmt;
	}
	
	public String getHistCategory() {
		return histCategory;
	}
	public void setHistCategory(String histCategory) {
		this.histCategory = histCategory;
	}
	public String getHistType() {
		return histType;
	}
	public void setHistType(String histType) {
		this.histType = histType;
	}
	public String getExGratia() {
		return exGratia;
	}
	public void setExGratia(String exGratia) {
		this.exGratia = exGratia;
	}
	public BigDecimal getReserveAmt() {
		return reserveAmt;
	}
	public void setReserveAmt(BigDecimal reserveAmt) {
		this.reserveAmt = reserveAmt;
	}
	public BigDecimal getLocalAmt() {
		return localAmt;
	}
	public void setLocalAmt(BigDecimal localAmt) {
		this.localAmt = localAmt;
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
		return "ClmOffset [tranId=" + tranId + ", itemNo=" + itemNo + ", claimId=" + claimId + ", projId=" + projId
				+ ", histNo=" + histNo + ", policyId=" + policyId + ", instNo=" + instNo + ", premAmt=" + premAmt
				+ ", riComm=" + riComm + ", riCommVat=" + riCommVat + ", charges=" + charges + ", paytAmt=" + paytAmt
				+ ", paymentFor=" + paymentFor + ", histCategory=" + histCategory + ", histType=" + histType
				+ ", exGratia=" + exGratia + ", reserveAmt=" + reserveAmt + ", currCd=" + currCd + ", currRate="
				+ currRate + ", clmPaytAmt=" + clmPaytAmt + ", localAmt=" + localAmt + ", remarks=" + remarks
				+ ", createUser=" + createUser + ", createDate=" + createDate + ", updateUser=" + updateUser
				+ ", updateDate=" + updateDate + "]";
	}
}