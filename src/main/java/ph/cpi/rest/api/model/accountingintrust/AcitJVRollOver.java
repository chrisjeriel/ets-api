package ph.cpi.rest.api.model.accountingintrust;

import java.math.BigDecimal;

import org.joda.time.DateTime;

public class AcitJVRollOver {
	private Integer srcInvtId;
	private String srcInvtCode;
	private String srcCertNo;
	private Integer srcInvtType;
	private String srcInvtTypeDesc;
	private Integer srcInvtSecCd;
	private String srcSecurityDesc;
	private Integer srcMaturityPeriod;
	private String srcDurationUnit;
	private Integer srcInterestRate;
	private DateTime srcPurchasedDate;
	private DateTime srcMaturityDate;
	private String srcCurrCd;
	private BigDecimal srcCurrencyRt;
	private BigDecimal srcInvtAmt;
	private BigDecimal srcIncomeAmt;
	private BigDecimal srcBankCharge;
	private BigDecimal srcWhtaxAmt;
	private BigDecimal srcMaturityValue;
	private Integer tranId;
	private Integer itemNo;
	private Integer invtId;
	private Integer destInvtId;
	private String invtCode;
	private String certNo;
	private Integer invtType;
	private String invtTypeDesc;
	private Integer invtSecCd;
	private String securityDesc;
	private Integer maturityPeriod;
	private String durationUnit;
	private Integer interestRate;
	private DateTime purchasedDate;
	private DateTime maturityDate;
	private String pulloutType;
	private String currCd;
	private BigDecimal currRate;
	private BigDecimal invtAmt;
	private BigDecimal incomeAmt;
	private BigDecimal bankCharge;
	private BigDecimal whtaxAmt;
	private BigDecimal maturityValue;
	private BigDecimal localAmt;
	private String createUser;
	private DateTime createDate;
	private String updateUser;
	private DateTime updateDate;
	public Integer getSrcInvtId() {
		return srcInvtId;
	}
	public void setSrcInvtId(Integer srcInvtId) {
		this.srcInvtId = srcInvtId;
	}
	public String getSrcInvtCode() {
		return srcInvtCode;
	}
	public void setSrcInvtCode(String srcInvtCode) {
		this.srcInvtCode = srcInvtCode;
	}
	public String getSrcCertNo() {
		return srcCertNo;
	}
	public void setSrcCertNo(String srcCertNo) {
		this.srcCertNo = srcCertNo;
	}
	public Integer getSrcInvtType() {
		return srcInvtType;
	}
	public void setSrcInvtType(Integer srcInvtType) {
		this.srcInvtType = srcInvtType;
	}
	public String getSrcInvtTypeDesc() {
		return srcInvtTypeDesc;
	}
	public void setSrcInvtTypeDesc(String srcInvtTypeDesc) {
		this.srcInvtTypeDesc = srcInvtTypeDesc;
	}
	public Integer getSrcInvtSecCd() {
		return srcInvtSecCd;
	}
	public void setSrcInvtSecCd(Integer srcInvtSecCd) {
		this.srcInvtSecCd = srcInvtSecCd;
	}
	public String getSrcSecurityDesc() {
		return srcSecurityDesc;
	}
	public void setSrcSecurityDesc(String srcSecurityDesc) {
		this.srcSecurityDesc = srcSecurityDesc;
	}
	public Integer getSrcMaturityPeriod() {
		return srcMaturityPeriod;
	}
	public void setSrcMaturityPeriod(Integer srcMaturityPeriod) {
		this.srcMaturityPeriod = srcMaturityPeriod;
	}
	public String getSrcDurationUnit() {
		return srcDurationUnit;
	}
	public void setSrcDurationUnit(String srcDurationUnit) {
		this.srcDurationUnit = srcDurationUnit;
	}
	public Integer getSrcInterestRate() {
		return srcInterestRate;
	}
	public void setSrcInterestRate(Integer srcInterestRate) {
		this.srcInterestRate = srcInterestRate;
	}
	public DateTime getSrcPurchasedDate() {
		return srcPurchasedDate;
	}
	public void setSrcPurchasedDate(DateTime srcPurchasedDate) {
		this.srcPurchasedDate = srcPurchasedDate;
	}
	public DateTime getSrcMaturityDate() {
		return srcMaturityDate;
	}
	public void setSrcMaturityDate(DateTime srcMaturityDate) {
		this.srcMaturityDate = srcMaturityDate;
	}
	public String getSrcCurrCd() {
		return srcCurrCd;
	}
	public void setSrcCurrCd(String srcCurrCd) {
		this.srcCurrCd = srcCurrCd;
	}
	public BigDecimal getSrcCurrencyRt() {
		return srcCurrencyRt;
	}
	public void setSrcCurrencyRt(BigDecimal srcCurrencyRt) {
		this.srcCurrencyRt = srcCurrencyRt;
	}
	public BigDecimal getSrcInvtAmt() {
		return srcInvtAmt;
	}
	public void setSrcInvtAmt(BigDecimal srcInvtAmt) {
		this.srcInvtAmt = srcInvtAmt;
	}
	public BigDecimal getSrcIncomeAmt() {
		return srcIncomeAmt;
	}
	public void setSrcIncomeAmt(BigDecimal srcIncomeAmt) {
		this.srcIncomeAmt = srcIncomeAmt;
	}
	public BigDecimal getSrcBankCharge() {
		return srcBankCharge;
	}
	public void setSrcBankCharge(BigDecimal srcBankCharge) {
		this.srcBankCharge = srcBankCharge;
	}
	public BigDecimal getSrcWhtaxAmt() {
		return srcWhtaxAmt;
	}
	public void setSrcWhtaxAmt(BigDecimal srcWhtaxAmt) {
		this.srcWhtaxAmt = srcWhtaxAmt;
	}
	public BigDecimal getSrcMaturityValue() {
		return srcMaturityValue;
	}
	public void setSrcMaturityValue(BigDecimal srcMaturityValue) {
		this.srcMaturityValue = srcMaturityValue;
	}
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
	public Integer getInvtId() {
		return invtId;
	}
	public void setInvtId(Integer invtId) {
		this.invtId = invtId;
	}
	public Integer getDestInvtId() {
		return destInvtId;
	}
	public void setDestInvtId(Integer destInvtId) {
		this.destInvtId = destInvtId;
	}
	public String getInvtCode() {
		return invtCode;
	}
	public void setInvtCode(String invtCode) {
		this.invtCode = invtCode;
	}
	public String getCertNo() {
		return certNo;
	}
	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}
	public Integer getInvtType() {
		return invtType;
	}
	public void setInvtType(Integer invtType) {
		this.invtType = invtType;
	}
	public String getInvtTypeDesc() {
		return invtTypeDesc;
	}
	public void setInvtTypeDesc(String invtTypeDesc) {
		this.invtTypeDesc = invtTypeDesc;
	}
	public Integer getInvtSecCd() {
		return invtSecCd;
	}
	public void setInvtSecCd(Integer invtSecCd) {
		this.invtSecCd = invtSecCd;
	}
	public String getSecurityDesc() {
		return securityDesc;
	}
	public void setSecurityDesc(String securityDesc) {
		this.securityDesc = securityDesc;
	}
	public Integer getMaturityPeriod() {
		return maturityPeriod;
	}
	public void setMaturityPeriod(Integer maturityPeriod) {
		this.maturityPeriod = maturityPeriod;
	}
	public String getDurationUnit() {
		return durationUnit;
	}
	public void setDurationUnit(String durationUnit) {
		this.durationUnit = durationUnit;
	}
	public Integer getInterestRate() {
		return interestRate;
	}
	public void setInterestRate(Integer interestRate) {
		this.interestRate = interestRate;
	}
	public DateTime getPurchasedDate() {
		return purchasedDate;
	}
	public void setPurchasedDate(DateTime purchasedDate) {
		this.purchasedDate = purchasedDate;
	}
	public DateTime getMaturityDate() {
		return maturityDate;
	}
	public void setMaturityDate(DateTime maturityDate) {
		this.maturityDate = maturityDate;
	}
	public String getPulloutType() {
		return pulloutType;
	}
	public void setPulloutType(String pulloutType) {
		this.pulloutType = pulloutType;
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
	public BigDecimal getMaturityValue() {
		return maturityValue;
	}
	public void setMaturityValue(BigDecimal maturityValue) {
		this.maturityValue = maturityValue;
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
		return "AcitJVRollOver [srcInvtId=" + srcInvtId + ", srcInvtCode=" + srcInvtCode + ", srcCertNo=" + srcCertNo
				+ ", srcInvtType=" + srcInvtType + ", srcInvtTypeDesc=" + srcInvtTypeDesc + ", srcInvtSecCd="
				+ srcInvtSecCd + ", srcSecurityDesc=" + srcSecurityDesc + ", srcMaturityPeriod=" + srcMaturityPeriod
				+ ", srcDurationUnit=" + srcDurationUnit + ", srcInterestRate=" + srcInterestRate + ", srcPurchasedDate=" + srcPurchasedDate
				+ ", srcMaturityDate=" + srcMaturityDate + ", srcCurrCd=" + srcCurrCd + ", srcCurrencyRt="
				+ srcCurrencyRt + ", srcInvtAmt=" + srcInvtAmt + ", srcIncomeAmt=" + srcIncomeAmt + ", srcBankCharge="
				+ srcBankCharge + ", srcWhtaxAmt=" + srcWhtaxAmt + ", srcMaturityValue=" + srcMaturityValue
				+ ", tranId=" + tranId + ", itemNo=" + itemNo + ", invtId=" + invtId + ", destInvtId=" + destInvtId
				+ ", invtCode=" + invtCode + ", certNo=" + certNo + ", invtType=" + invtType + ", invtTypeDesc="
				+ invtTypeDesc + ", invtSecCd=" + invtSecCd + ", securityDesc=" + securityDesc + ", maturityPeriod="
				+ maturityPeriod + ", durationUnit=" + durationUnit + ", interestRate=" + interestRate
				+ ", purchasedDate=" + purchasedDate + ", maturityDate=" + maturityDate + ", pulloutType=" + pulloutType
				+ ", currCd=" + currCd + ", currRate=" + currRate + ", invtAmt=" + invtAmt + ", incomeAmt=" + incomeAmt
				+ ", bankCharge=" + bankCharge + ", whtaxAmt=" + whtaxAmt + ", maturityValue=" + maturityValue
				+ ", localAmt=" + localAmt + ", createUser=" + createUser + ", createDate=" + createDate
				+ ", updateUser=" + updateUser + ", updateDate=" + updateDate + "]";
	}
}
