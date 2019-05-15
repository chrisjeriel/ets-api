package ph.cpi.rest.api.model.request;

import org.joda.time.LocalDateTime;

import ph.cpi.rest.api.model.PaginationRequest;
import ph.cpi.rest.api.model.SortRequest;

public class RetrieveQuoteListingRequest {

	private String quotationNo;
	private Integer quoteId;
	private String cessionDesc;
	private String lineClassCdDesc;
	private String line;
	private String lineClassCd;
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
//	private LocalDateTime issueDate;
//	private LocalDateTime expiryDate;
	private String issueDateFrom;
	private String issueDateTo;
	private String expiryDate;
	private String reqBy;
	private String createUser;
	private PaginationRequest paginationRequest;
	private SortRequest sortRequest;
	
	public String getQuotationNo() {
		return quotationNo;
	}
	public void setQuotationNo(String quotationNo) {
		this.quotationNo = quotationNo;
	}
	
	public Integer getQuoteId() {
		return quoteId;
	}
	public void setQuoteId(Integer quoteId) {
		this.quoteId = quoteId;
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
	public String getLineClassCd() {
		return lineClassCd;
	}
	public void setLineClassCd(String lineClassCd) {
		this.lineClassCd = lineClassCd;
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
	public String getIssueDateFrom() {
		return issueDateFrom;
	}
	public void setIssueDateFrom(String issueDateFrom) {
		this.issueDateFrom = issueDateFrom;
	}
	public String getIssueDateTo() {
		return issueDateTo;
	}
	public void setIssueDateTo(String issueDateTo) {
		this.issueDateTo = issueDateTo;
	}
	public String getExpiryDate() {
		return expiryDate;
	}
	public void setExpiryDate(String expiryDate) {
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
	public PaginationRequest getPaginationRequest() {
		return paginationRequest;
	}
	public void setPaginationRequest(PaginationRequest paginationRequest) {
		this.paginationRequest = paginationRequest;
	}
	public SortRequest getSortRequest() {
		return sortRequest;
	}
	public void setSortRequest(SortRequest sortRequest) {
		this.sortRequest = sortRequest;
	}
	public String getLine() {
		return line;
	}
	public void setLine(String line) {
		this.line = line;
	}
	@Override
	public String toString() {
		return "RetrieveQuoteListingRequest [quotationNo=" + quotationNo + ", quoteId=" + quoteId + ", cessionDesc="
				+ cessionDesc + ", lineClassCdDesc=" + lineClassCdDesc + ", line=" + line + ", lineClassCd="
				+ lineClassCd + ", status=" + status + ", cedingName=" + cedingName + ", principalName=" + principalName
				+ ", contractorName=" + contractorName + ", insuredDesc=" + insuredDesc + ", riskName=" + riskName
				+ ", objectDesc=" + objectDesc + ", site=" + site + ", currencyCd=" + currencyCd + ", issueDateFrom="
				+ issueDateFrom + ", issueDateTo=" + issueDateTo + ", expiryDate=" + expiryDate + ", reqBy=" + reqBy
				+ ", createUser=" + createUser + ", paginationRequest=" + paginationRequest + ", sortRequest="
				+ sortRequest + "]";
	}
	
}
