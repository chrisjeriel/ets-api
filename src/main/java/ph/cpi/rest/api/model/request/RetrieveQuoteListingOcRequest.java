package ph.cpi.rest.api.model.request;

import org.joda.time.LocalDateTime;

public class RetrieveQuoteListingOcRequest {

	private String quotationNo;
	private String cessionDesc;
	private String lineClassCdDesc;
	private String status;
	private String cedingName;
	private String principalName;
	private String contractorName;
	private String insuredDesc;
	private String riskName;
	private String objectDesc;
	private String site;
//	private Quotation().policyNo;
	private String currencyCd;
	private LocalDateTime issueDate;
	private LocalDateTime expiryDate;
	private String reqBy;
	private String createUser;
	
	public String getQuotationNo() {
		return quotationNo;
	}
	public void setQuotationNo(String quotationNo) {
		this.quotationNo = quotationNo;
	}
	public String getCessionDesc() {
		return cessionDesc;
	}
	public void setCessionDesc(String cessionDesc) {
		this.cessionDesc = cessionDesc;
	}
	public String getLineClassCdDesc() {
		return lineClassCdDesc;
	}
	public void setLineClassCdDesc(String lineClassCdDesc) {
		this.lineClassCdDesc = lineClassCdDesc;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getCedingName() {
		return cedingName;
	}
	public void setCedingName(String cedingName) {
		this.cedingName = cedingName;
	}
	public String getPrincipalName() {
		return principalName;
	}
	public void setPrincipalName(String principalName) {
		this.principalName = principalName;
	}
	public String getContractorName() {
		return contractorName;
	}
	public void setContractorName(String contractorName) {
		this.contractorName = contractorName;
	}
	public String getInsuredDesc() {
		return insuredDesc;
	}
	public void setInsuredDesc(String insuredDesc) {
		this.insuredDesc = insuredDesc;
	}
	public String getRiskName() {
		return riskName;
	}
	public void setRiskName(String riskName) {
		this.riskName = riskName;
	}
	public String getObjectDesc() {
		return objectDesc;
	}
	public void setObjectDesc(String objectDesc) {
		this.objectDesc = objectDesc;
	}
	public String getSite() {
		return site;
	}
	public void setSite(String site) {
		this.site = site;
	}
	public String getCurrencyCd() {
		return currencyCd;
	}
	public void setCurrencyCd(String currencyCd) {
		this.currencyCd = currencyCd;
	}
	public LocalDateTime getIssueDate() {
		return issueDate;
	}
	public void setIssueDate(LocalDateTime issueDate) {
		this.issueDate = issueDate;
	}
	public LocalDateTime getExpiryDate() {
		return expiryDate;
	}
	public void setExpiryDate(LocalDateTime expiryDate) {
		this.expiryDate = expiryDate;
	}
	public String getReqBy() {
		return reqBy;
	}
	public void setReqBy(String reqBy) {
		this.reqBy = reqBy;
	}
	public String getCreateUser() {
		return createUser;
	}
	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}
	@Override
	public String toString() {
		return "RetrieveQuoteListingOcRequest [quotationNo=" + quotationNo + ", cessionDesc=" + cessionDesc
				+ ", lineClassCdDesc=" + lineClassCdDesc + ", status=" + status + ", cedingName=" + cedingName
				+ ", principalName=" + principalName + ", contractorName=" + contractorName + ", insuredDesc="
				+ insuredDesc + ", riskName=" + riskName + ", objectDesc=" + objectDesc + ", site=" + site
				+ ", currencyCd=" + currencyCd + ", issueDate=" + issueDate + ", expiryDate=" + expiryDate + ", reqBy="
				+ reqBy + ", createUser=" + createUser + "]";
	}
}