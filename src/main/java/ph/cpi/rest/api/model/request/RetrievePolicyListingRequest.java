package ph.cpi.rest.api.model.request;

import java.util.List;

import ph.cpi.rest.api.model.PaginationRequest;
import ph.cpi.rest.api.model.SearchRequest;
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
	private String totalSiLess;
	private String totalSiGrt;
	private String totalPremLess;
	private String totalPremGrt;
	private String issueDateFrom;
	private String issueDateTo;
	private String expiryDateFrom;
	private String expiryDateTo;
	private String inceptDateFrom;
	private String inceptDateTo;
	private String acctDateFrom;
	private String acctDateTo;
	private String statusDesc;
	private PaginationRequest paginationRequest = new PaginationRequest();
	private SortRequest sortRequest;
	private String recount = "Y";
	
	private List<String> statusArr;
	private SearchRequest search;
	private Integer altNo;
	private String lineCd;
	private String length;
	private String mode = "";
	private String renTag;
	
	public String getRenTag() {
		return renTag;
	}
	public void setRenTag(String renTag) {
		this.renTag = renTag;
	}
	public String getLength() {
		return length;
	}
	public String getMode() {
		return mode;
	}
	public void setMode(String mode) {
		this.mode = mode;
	}
	public void setLength(String length) {
		this.length = length;
	}
	public String getRecount() {
		return recount;
	}
	public void setRecount(String recount) {
		this.recount = recount;
	}
	public String getLineCd() {
		return lineCd;
	}
	public void setLineCd(String lineCd) {
		this.lineCd = lineCd;
	}
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
	public String getTotalSiLess() {
		return totalSiLess;
	}
	public void setTotalSiLess(String totalSiLess) {
		this.totalSiLess = totalSiLess;
	}
	public String getTotalSiGrt() {
		return totalSiGrt;
	}
	public void setTotalSiGrt(String totalSiGrt) {
		this.totalSiGrt = totalSiGrt;
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
	public String getInceptDateFrom() {
		return inceptDateFrom;
	}
	public void setInceptDateFrom(String inceptDateFrom) {
		this.inceptDateFrom = inceptDateFrom;
	}
	public String getInceptDateTo() {
		return inceptDateTo;
	}
	public void setInceptDateTo(String inceptDateTo) {
		this.inceptDateTo = inceptDateTo;
	}
	public String getExpiryDateFrom() {
		return expiryDateFrom;
	}
	public void setExpiryDateFrom(String expiryDateFrom) {
		this.expiryDateFrom = expiryDateFrom;
	}
	public String getExpiryDateTo() {
		return expiryDateTo;
	}
	public void setExpiryDateTo(String expiryDateTo) {
		this.expiryDateTo = expiryDateTo;
	}
	public String getAcctDateFrom() {
		return acctDateFrom;
	}
	public void setAcctDateFrom(String acctDateFrom) {
		this.acctDateFrom = acctDateFrom;
	}
	public String getAcctDateTo() {
		return acctDateTo;
	}
	public void setAcctDateTo(String acctDateTo) {
		this.acctDateTo = acctDateTo;
	}
	public String getTotalPremLess() {
		return totalPremLess;
	}
	public void setTotalPremLess(String totalPremLess) {
		this.totalPremLess = totalPremLess;
	}
	public String getTotalPremGrt() {
		return totalPremGrt;
	}
	public void setTotalPremGrt(String totalPremGrt) {
		this.totalPremGrt = totalPremGrt;
	}
	public List<String> getStatusArr() {
		return statusArr;
	}
	public void setStatusArr(List<String> statusArr) {
		this.statusArr = statusArr;
	}
	public SearchRequest getSearch() {
		return search;
	}
	public void setSearch(SearchRequest search) {
		this.search = search;
	}
	public Integer getAltNo() {
		return altNo;
	}
	public void setAltNo(Integer altNo) {
		this.altNo = altNo;
	}
	@Override
	public String toString() {
		return "RetrievePolicyListingRequest [policyNo=" + policyNo + ", cessionDesc=" + cessionDesc + ", cedingName="
				+ cedingName + ", lineClassDesc=" + lineClassDesc + ", insuredDesc=" + insuredDesc + ", riskName="
				+ riskName + ", objectDesc=" + objectDesc + ", site=" + site + ", currencyCd=" + currencyCd
				+ ", totalSiLess=" + totalSiLess + ", totalSiGrt=" + totalSiGrt + ", totalPremLess=" + totalPremLess
				+ ", totalPremGrt=" + totalPremGrt + ", issueDateFrom=" + issueDateFrom + ", issueDateTo=" + issueDateTo
				+ ", expiryDateFrom=" + expiryDateFrom + ", expiryDateTo=" + expiryDateTo + ", inceptDateFrom="
				+ inceptDateFrom + ", inceptDateTo=" + inceptDateTo + ", acctDateFrom=" + acctDateFrom + ", acctDateTo="
				+ acctDateTo + ", statusDesc=" + statusDesc + ", paginationRequest=" + paginationRequest
				+ ", sortRequest=" + sortRequest + ", recount=" + recount + ", statusArr=" + statusArr + ", search="
				+ search + ", altNo=" + altNo + ", lineCd=" + lineCd + ", length=" + length + ", mode=" + mode + "]";
	}
}
