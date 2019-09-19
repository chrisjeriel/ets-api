package ph.cpi.rest.api.model.accountingintrust;

import java.math.BigDecimal;

import org.joda.time.DateTime;

public class AcitInvestments {
	
	private Integer 	invtId;
	private String 		invtCd;
	private String  	bank;
	private String  	certNo;
	private String		invtType;
	private String  	invtTypeDesc;
	private String  	invtSecDesc;
	private String  	invtSecCd;
	private String      amortized;
	private String  	securityDesc;
	private String  	invtStatus;
	private Integer 	matPeriod;
	private String 		durUnit;
	private BigDecimal 	intRt;
	private DateTime 	purDate;
	private DateTime 	matDate;
	private String 		currCd;
	private Integer 	currRate;
	private BigDecimal 	invtAmt;
	private BigDecimal 	incomeAmt;
	private BigDecimal  bankCharge;     
	private BigDecimal  whtaxAmt;
	private BigDecimal  matVal;
	private String 		createUser;
	private DateTime 	createDate;
	private String 		updateUser;
	private DateTime 	updateDate;
	private String		okDelete;
	private String 		slCd;
	private String		preTerminatedTag;
	private DateTime	termDate;
	private BigDecimal  amortEff;
	private BigDecimal  priceCost;
	private String 		processing;
	
	public BigDecimal getAmortEff() {
		return amortEff;
	}
	public void setAmortEff(BigDecimal amortEff) {
		this.amortEff = amortEff;
	}
	public BigDecimal getPriceCost() {
		return priceCost;
	}
	public void setPriceCost(BigDecimal priceCost) {
		this.priceCost = priceCost;
	}
	public BigDecimal getIntRt() {
		return intRt;
	}
	public void setIntRt(BigDecimal intRt) {
		this.intRt = intRt;
	}
	
	public DateTime getTermDate() {
		return termDate;
	}
	public void setTermDate(DateTime termDate) {
		this.termDate = termDate;
	}
	public String getPreTerminatedTag() {
		return preTerminatedTag;
	}
	public void setPreTerminatedTag(String preTerminatedTag) {
		this.preTerminatedTag = preTerminatedTag;
	}
	public String getAmortized() {
		return amortized;
	}
	public void setAmortized(String amortized) {
		this.amortized = amortized;
	}
	
	public Integer getInvtId() {
		return invtId;
	}
	public void setInvtId(Integer invtId) {
		this.invtId = invtId;
	}
	public String getInvtCd() {
		return invtCd;
	}
	public void setInvtCd(String invtCd) {
		this.invtCd = invtCd;
	}
	public String getBank() {
		return bank;
	}
	public void setBank(String bank) {
		this.bank = bank;
	}
	public String getCertNo() {
		return certNo;
	}
	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}
	public String getInvtType() {
		return invtType;
	}
	public void setInvtType(String invtType) {
		this.invtType = invtType;
	}
	public String getInvtTypeDesc() {
		return invtTypeDesc;
	}
	public void setInvtTypeDesc(String invtTypeDesc) {
		this.invtTypeDesc = invtTypeDesc;
	}
	public String getInvtSecDesc() {
		return invtSecDesc;
	}
	public void setInvtSecDesc(String invtSecDesc) {
		this.invtSecDesc = invtSecDesc;
	}
	public String getInvtSecCd() {
		return invtSecCd;
	}
	public void setInvtSecCd(String invtSecCd) {
		this.invtSecCd = invtSecCd;
	}
	public String getSecurityDesc() {
		return securityDesc;
	}
	public void setSecurityDesc(String securityDesc) {
		this.securityDesc = securityDesc;
	}
	public String getInvtStatus() {
		return invtStatus;
	}
	public void setInvtStatus(String invtStatus) {
		this.invtStatus = invtStatus;
	}
	public Integer getMatPeriod() {
		return matPeriod;
	}
	public void setMatPeriod(Integer matPeriod) {
		this.matPeriod = matPeriod;
	}
	public String getDurUnit() {
		return durUnit;
	}
	public void setDurUnit(String durUnit) {
		this.durUnit = durUnit;
	}
	public DateTime getPurDate() {
		return purDate;
	}
	public void setPurDate(DateTime purDate) {
		this.purDate = purDate;
	}
	public DateTime getMatDate() {
		return matDate;
	}
	public void setMatDate(DateTime matDate) {
		this.matDate = matDate;
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
	public BigDecimal getInvtAmt() {
		return invtAmt;
	}
	public void setInvtAmt(BigDecimal invtAmt) {
		this.invtAmt = invtAmt;
	}
	public BigDecimal getIncomeAmt() {
		return incomeAmt;
	}
	public void setIncomeAmt(BigDecimal incomeAmt) {
		this.incomeAmt = incomeAmt;
	}
	public BigDecimal getBankCharge() {
		return bankCharge;
	}
	public void setBankCharge(BigDecimal bankCharge) {
		this.bankCharge = bankCharge;
	}
	public BigDecimal getWhtaxAmt() {
		return whtaxAmt;
	}
	public void setWhtaxAmt(BigDecimal whtaxAmt) {
		this.whtaxAmt = whtaxAmt;
	}
	public BigDecimal getMatVal() {
		return matVal;
	}
	public void setMatVal(BigDecimal matVal) {
		this.matVal = matVal;
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
	public String getOkDelete() {
		return okDelete;
	}
	public void setOkDelete(String okDelete) {
		this.okDelete = okDelete;
	}
	public String getSlCd() {
		return slCd;
	}
	public void setSlCd(String slCd) {
		this.slCd = slCd;
	}
	public String getProcessing() {
		return processing;
	}
	public void setProcessing(String processing) {
		this.processing = processing;
	}
	@Override
	public String toString() {
		return "AcitInvestments [invtId=" + invtId + ", invtCd=" + invtCd + ", bank=" + bank + ", certNo=" + certNo
				+ ", invtType=" + invtType + ", invtTypeDesc=" + invtTypeDesc + ", invtSecDesc=" + invtSecDesc
				+ ", invtSecCd=" + invtSecCd + ", amortized=" + amortized + ", securityDesc=" + securityDesc
				+ ", invtStatus=" + invtStatus + ", matPeriod=" + matPeriod + ", durUnit=" + durUnit + ", intRt="
				+ intRt + ", purDate=" + purDate + ", matDate=" + matDate + ", currCd=" + currCd + ", currRate="
				+ currRate + ", invtAmt=" + invtAmt + ", incomeAmt=" + incomeAmt + ", bankCharge=" + bankCharge
				+ ", whtaxAmt=" + whtaxAmt + ", matVal=" + matVal + ", createUser=" + createUser + ", createDate="
				+ createDate + ", updateUser=" + updateUser + ", updateDate=" + updateDate + ", okDelete=" + okDelete
				+ ", slCd=" + slCd + ", preTerminatedTag=" + preTerminatedTag + ", termDate=" + termDate + ", amortEff="
				+ amortEff + ", priceCost=" + priceCost + ", processing=" + processing + "]";
	}	
}
