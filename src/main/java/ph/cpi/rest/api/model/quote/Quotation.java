package ph.cpi.rest.api.model.quote;

import org.joda.time.LocalDateTime;

public class Quotation {

	private Integer quoteId;
	private String quotationNo;
	private String cessionDesc;
	private String lineClassCdDesc;
	private String status;
	private String cedingName;
	private String principalName;
	private String contractorName;
	private String insuredDesc;
//	private String policyNo;
	private String currencyCd;
	private LocalDateTime issueDate;
	private LocalDateTime expiryDate;
	private String reqBy;
	private String createUser;
	private Project project;
	private Options options;
	private OtherRates otherRates;
	
	public Integer getQuoteId() {
		return quoteId;
	}
	public void setQuoteId(Integer quoteId) {
		this.quoteId = quoteId;
	}
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
	public Project getProject() {
		return project;
	}
	public void setProject(Project project) {
		this.project = project;
	}
	public Options getOptions() {
		return options;
	}
	public void setOptions(Options options) {
		this.options = options;
	}
	public OtherRates getOtherRates() {
		return otherRates;
	}
	public void setOtherRates(OtherRates otherRates) {
		this.otherRates = otherRates;
	}
	@Override
	public String toString() {
		return "Quotation [quotationNo=" + quotationNo + ", cessionDesc=" + cessionDesc + ", lineClassCdDesc="
				+ lineClassCdDesc + ", status=" + status + ", cedingName=" + cedingName + ", principalName="
				+ principalName + ", contractorName=" + contractorName + ", insuredDesc=" + insuredDesc
				+ ", currencyCd=" + currencyCd + ", issueDate=" + issueDate + ", expiryDate=" + expiryDate + ", reqBy="
				+ reqBy + ", createUser=" + createUser + ", project=" + project + ", options=" + options
				+ ", otherRates=" + otherRates + "]";
	}
}
