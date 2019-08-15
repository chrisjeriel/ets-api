package ph.cpi.rest.api.model.request;

import ph.cpi.rest.api.model.PaginationRequest;
import ph.cpi.rest.api.model.SortRequest;

public class RetrieveAcitSOATreatyDetailsRequest {
	private String policyId;
	private String instNo;
	private String cedingId;
	private String payeeNo;
	private Integer zeroBal;
	private PaginationRequest paginationRequest;
	private SortRequest sortRequest;
	public String getPolicyId() {
		return policyId;
	}
	public void setPolicyId(String policyId) {
		this.policyId = policyId;
	}
	public String getInstNo() {
		return instNo;
	}
	public void setInstNo(String instNo) {
		this.instNo = instNo;
	}
	public String getCedingId() {
		return cedingId;
	}
	public void setCedingId(String cedingId) {
		this.cedingId = cedingId;
	}
	public String getPayeeNo() {
		return payeeNo;
	}
	public void setPayeeNo(String payeeNo) {
		this.payeeNo = payeeNo;
	}
	public Integer getZeroBal() {
		return zeroBal;
	}
	public void setZeroBal(Integer zeroBal) {
		this.zeroBal = zeroBal;
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
		return "RetrieveAcitSOATreatyDetailsRequest [policyId=" + policyId + ", instNo=" + instNo + ", cedingId="
				+ cedingId + ", payeeNo=" + payeeNo + ", zeroBal=" + zeroBal + ", paginationRequest="
				+ paginationRequest + ", sortRequest=" + sortRequest + "]";
	}
	
}
