package ph.cpi.rest.api.model.request;

import java.util.List;

import ph.cpi.rest.api.model.PaginationRequest;
import ph.cpi.rest.api.model.SortRequest;

public class RetrievePolDistListRequest {
	private Integer distId;
	private Integer riskDistId;
	private String status;
	private String policyNo;
	private String cedingName;
	private String insuredDesc;
	private String riskName;
	private String currencyCd;
	private String distDateFrom;
	private String distDateTo;
	private String acctDateFrom;
	private String acctDateTo;
	private PaginationRequest paginationRequest = new PaginationRequest();
	private SortRequest sortRequest = new SortRequest();
	
	private List<String> statusArr;
	public List<String> getStatusArr() {
		return statusArr;
	}
	public void setStatusArr(List<String> statusArr) {
		this.statusArr = statusArr;
	}
	public Integer getDistId() {
		return distId;
	}
	public void setDistId(Integer distId) {
		this.distId = distId;
	}
	public Integer getRiskDistId() {
		return riskDistId;
	}
	public void setRiskDistId(Integer riskDistId) {
		this.riskDistId = riskDistId;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getPolicyNo() {
		return policyNo;
	}
	public void setPolicyNo(String policyNo) {
		this.policyNo = policyNo;
	}
	public String getCedingName() {
		return cedingName;
	}
	public void setCedingName(String cedingName) {
		this.cedingName = cedingName;
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
	public String getCurrencyCd() {
		return currencyCd;
	}
	public void setCurrencyCd(String currencyCd) {
		this.currencyCd = currencyCd;
	}
	public String getDistDateFrom() {
		return distDateFrom;
	}
	public void setDistDateFrom(String distDateFrom) {
		this.distDateFrom = distDateFrom;
	}
	public String getDistDateTo() {
		return distDateTo;
	}
	public void setDistDateTo(String distDateTo) {
		this.distDateTo = distDateTo;
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
		return "RetrievePolDistListRequest [distId=" + distId + ", riskDistId=" + riskDistId + ", status=" + status
				+ ", policyNo=" + policyNo + ", cedingName=" + cedingName + ", insuredDesc=" + insuredDesc
				+ ", riskName=" + riskName + ", currencyCd=" + currencyCd + ", distDateFrom=" + distDateFrom
				+ ", distDateTo=" + distDateTo + ", acctDateFrom=" + acctDateFrom + ", acctDateTo=" + acctDateTo
				+ ", paginationRequest=" + paginationRequest + ", sortRequest=" + sortRequest + ", statusArr="
				+ statusArr + "]";
	}
}
