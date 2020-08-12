package ph.cpi.rest.api.model.accountingintrust;

import java.math.BigDecimal;

import org.joda.time.DateTime;

public class AcitClmResHistPayts {
	private Integer claimId;
	private String claimNo;
	private Integer projId;
	private Integer policyId;
	private String policyNo;
	private Integer histNo;
	private String histCategory;
	private String histCategoryDesc;
	private Integer histType;
	private String histTypeDesc;
	private String exGratia;
	private String insuredDesc;
	private String currencyCd;
	private BigDecimal currencyRt;
	private BigDecimal reserveAmt;
	private BigDecimal cumulativeAmt;
	private String createUser;
	private DateTime createDate;
	private String updateUser;
	private DateTime updateDate;
	private String processing;
	private String clmStatCd;
	private String cedingId;
	private String cedingName;
	private String cedingAbbr;
	
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
	public Integer getPolicyId() {
		return policyId;
	}
	public void setPolicyId(Integer policyId) {
		this.policyId = policyId;
	}
	public String getPolicyNo() {
		return policyNo;
	}
	public void setPolicyNo(String policyNo) {
		this.policyNo = policyNo;
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
	public String getHistCategoryDesc() {
		return histCategoryDesc;
	}
	public void setHistCategoryDesc(String histCategoryDesc) {
		this.histCategoryDesc = histCategoryDesc;
	}
	public Integer getHistType() {
		return histType;
	}
	public void setHistType(Integer histType) {
		this.histType = histType;
	}
	public String getHistTypeDesc() {
		return histTypeDesc;
	}
	public void setHistTypeDesc(String histTypeDesc) {
		this.histTypeDesc = histTypeDesc;
	}
	public String getInsuredDesc() {
		return insuredDesc;
	}
	public String getExGratia() {
		return exGratia;
	}
	public void setExGratia(String exGratia) {
		this.exGratia = exGratia;
	}
	public void setInsuredDesc(String insuredDesc) {
		this.insuredDesc = insuredDesc;
	}
	public String getCurrencyCd() {
		return currencyCd;
	}
	public void setCurrencyCd(String currencyCd) {
		this.currencyCd = currencyCd;
	}
	public BigDecimal getCurrencyRt() {
		return currencyRt;
	}
	public void setCurrencyRt(BigDecimal currencyRt) {
		this.currencyRt = currencyRt;
	}
	public BigDecimal getReserveAmt() {
		return reserveAmt;
	}
	public void setReserveAmt(BigDecimal reserveAmt) {
		this.reserveAmt = reserveAmt;
	}
	public BigDecimal getCumulativeAmt() {
		return cumulativeAmt;
	}
	public void setCumulativeAmt(BigDecimal cumulativeAmt) {
		this.cumulativeAmt = cumulativeAmt;
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
	public String getProcessing() {
		return processing;
	}
	public void setProcessing(String processing) {
		this.processing = processing;
	}
	public String getClmStatCd() {
		return clmStatCd;
	}
	public void setClmStatCd(String clmStatCd) {
		this.clmStatCd = clmStatCd;
	}
	public String getCedingId() {
		return cedingId;
	}
	public void setCedingId(String cedingId) {
		this.cedingId = cedingId;
	}
	public String getCedingName() {
		return cedingName;
	}
	public void setCedingName(String cedingName) {
		this.cedingName = cedingName;
	}
	public String getCedingAbbr() {
		return cedingAbbr;
	}
	public void setCedingAbbr(String cedingAbbr) {
		this.cedingAbbr = cedingAbbr;
	}
	@Override
	public String toString() {
		return "AcitClmResHistPayts [claimId=" + claimId + ", claimNo=" + claimNo + ", projId=" + projId + ", policyId="
				+ policyId + ", policyNo=" + policyNo + ", histNo=" + histNo + ", histCategory=" + histCategory
				+ ", histCategoryDesc=" + histCategoryDesc + ", histType=" + histType + ", histTypeDesc=" + histTypeDesc
				+ ", exGratia=" + exGratia + ", insuredDesc=" + insuredDesc + ", currencyCd=" + currencyCd
				+ ", currencyRt=" + currencyRt + ", reserveAmt=" + reserveAmt + ", cumulativeAmt=" + cumulativeAmt
				+ ", createUser=" + createUser + ", createDate=" + createDate + ", updateUser=" + updateUser
				+ ", updateDate=" + updateDate + ", processing=" + processing + ", clmStatCd=" + clmStatCd
				+ ", cedingId=" + cedingId + ", cedingName=" + cedingName + ", cedingAbbr=" + cedingAbbr + "]";
	}
	
}
