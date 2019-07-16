package ph.cpi.rest.api.model.request;

import org.joda.time.DateTime;

import ph.cpi.rest.api.model.PaginationRequest;
import ph.cpi.rest.api.model.SortRequest;

public class RetrieveClaimListingRequest {
	private String claimNo;
	private String cedingName;
	private String clmStatus;
	private String policyNo;
	private String insuredDesc;
	private String riskName;
	private String lossDateFrom;
	private String lossDateTo;
	private String totalResFrom;
	private String totalResTo;
	private String totalPaytFrom;
	private String totalPaytTo;
	private String adjName;
	private String currencyCd;
	private String processedBy;
	private PaginationRequest paginationRequest = new PaginationRequest();
	private SortRequest sortRequest = new SortRequest();
	
	public String getClaimNo() {
		return claimNo;
	}
	public void setClaimNo(String claimNo) {
		this.claimNo = claimNo;
	}
	public String getCedingName() {
		return cedingName;
	}
	public void setCedingName(String cedingName) {
		this.cedingName = cedingName;
	}
	public String getClmStatus() {
		return clmStatus;
	}
	public void setClmStatus(String clmStatus) {
		this.clmStatus = clmStatus;
	}
	public String getPolicyNo() {
		return policyNo;
	}
	public void setPolicyNo(String policyNo) {
		this.policyNo = policyNo;
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
	public String getLossDateFrom() {
		return lossDateFrom;
	}
	public void setLossDateFrom(String lossDateFrom) {
		this.lossDateFrom = lossDateFrom;
	}
	public String getLossDateTo() {
		return lossDateTo;
	}
	public void setLossDateTo(String lossDateTo) {
		this.lossDateTo = lossDateTo;
	}
	public String getTotalResFrom() {
		return totalResFrom;
	}
	public void setTotalResFrom(String totalResFrom) {
		this.totalResFrom = totalResFrom;
	}
	public String getTotalResTo() {
		return totalResTo;
	}
	public void setTotalResTo(String totalResTo) {
		this.totalResTo = totalResTo;
	}
	public String getTotalPaytFrom() {
		return totalPaytFrom;
	}
	public void setTotalPaytFrom(String totalPaytFrom) {
		this.totalPaytFrom = totalPaytFrom;
	}
	public String getTotalPaytTo() {
		return totalPaytTo;
	}
	public void setTotalPaytTo(String totalPaytTo) {
		this.totalPaytTo = totalPaytTo;
	}
	public String getAdjName() {
		return adjName;
	}
	public void setAdjName(String adjName) {
		this.adjName = adjName;
	}
	public String getCurrencyCd() {
		return currencyCd;
	}
	public void setCurrencyCd(String currencyCd) {
		this.currencyCd = currencyCd;
	}
	public String getProcessedBy() {
		return processedBy;
	}
	public void setProcessedBy(String processedBy) {
		this.processedBy = processedBy;
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
		return "RetrieveClaimListingRequest [claimNo=" + claimNo + ", cedingName=" + cedingName + ", clmStatus="
				+ clmStatus + ", policyNo=" + policyNo + ", insuredDesc=" + insuredDesc + ", riskName=" + riskName
				+ ", lossDateFrom=" + lossDateFrom + ", lossDateTo=" + lossDateTo + ", totalResFrom=" + totalResFrom
				+ ", totalResTo=" + totalResTo + ", totalPaytFrom=" + totalPaytFrom + ", totalPaytTo=" + totalPaytTo
				+ ", adjName=" + adjName + ", currencyCd=" + currencyCd + ", processedBy=" + processedBy
				+ ", paginationRequest=" + paginationRequest + ", sortRequest=" + sortRequest + "]";
	}
}
