package ph.cpi.rest.api.model.request;

import ph.cpi.rest.api.model.PaginationRequest;
import ph.cpi.rest.api.model.SortRequest;

public class RetrievePolicyListingRequest {
	
	private String policyNo;
	private String cessionDesc;
	private String cedingName;
	private String lineClassDesc;
	private String insuredDesc;
	private String riskName;
	private String objectDesc;
	private String site;
	private String currencyCd;
	private String totalSi;
	private String totalPrem;
	private String issueDate;
	private String expiryDate;
	private String inceptDate;
	private String acctDate;
	private String statusDesc;
	private PaginationRequest paginationRequest = new PaginationRequest();
	private SortRequest sortRequest = new SortRequest();
	
	public String getPolicyNo() {
		return policyNo;
	}
	public void setPolicyNo(String policyNo) {
		this.policyNo = policyNo;
	}
	public String getCessionDesc() {
		return cessionDesc;
	}
	public void setCessionDesc(String cessionDesc) {
		this.cessionDesc = cessionDesc;
	}
	public String getCedingName() {
		return cedingName;
	}
	public void setCedingName(String cedingName) {
		this.cedingName = cedingName;
	}
	public String getLineClassDesc() {
		return lineClassDesc;
	}
	public void setLineClassDesc(String lineClassDesc) {
		this.lineClassDesc = lineClassDesc;
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
	public String getTotalSi() {
		return totalSi;
	}
	public void setTotalSi(String totalSi) {
		this.totalSi = totalSi;
	}
	public String getTotalPrem() {
		return totalPrem;
	}
	public void setTotalPrem(String totalPrem) {
		this.totalPrem = totalPrem;
	}
	public String getIssueDate() {
		return issueDate;
	}
	public void setIssueDate(String issueDate) {
		this.issueDate = issueDate;
	}
	public String getExpiryDate() {
		return expiryDate;
	}
	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}
	public String getInceptDate() {
		return inceptDate;
	}
	public void setInceptDate(String inceptDate) {
		this.inceptDate = inceptDate;
	}
	public String getAcctDate() {
		return acctDate;
	}
	public void setAcctDate(String acctDate) {
		this.acctDate = acctDate;
	}
	public String getStatusDesc() {
		return statusDesc;
	}
	public void setStatusDesc(String statusDesc) {
		this.statusDesc = statusDesc;
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
	@Override
	public String toString() {
		return "RetrievePolicyListingRequest [policyNo=" + policyNo + ", cessionDesc=" + cessionDesc + ", cedingName="
				+ cedingName + ", lineClassDesc=" + lineClassDesc + ", insuredDesc=" + insuredDesc + ", riskName="
				+ riskName + ", objectDesc=" + objectDesc + ", site=" + site + ", currencyCd=" + currencyCd
				+ ", totalSi=" + totalSi + ", totalPrem=" + totalPrem + ", issueDate=" + issueDate + ", expiryDate="
				+ expiryDate + ", inceptDate=" + inceptDate + ", acctDate=" + acctDate + ", statusDesc=" + statusDesc
				+ ", paginationRequest=" + paginationRequest + ", sortRequest=" + sortRequest + "]";
	}
}
