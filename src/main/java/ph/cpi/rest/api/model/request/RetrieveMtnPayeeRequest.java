package ph.cpi.rest.api.model.request;

import ph.cpi.rest.api.model.PaginationRequest;
import ph.cpi.rest.api.model.SortRequest;

public class RetrieveMtnPayeeRequest {
	private Integer payeeNo;
	private Integer payeeClassCd;
	private PaginationRequest paginationRequest;
	private SortRequest sortRequest;
	public Integer getPayeeNo() {
		return payeeNo;
	}
	public void setPayeeNo(Integer payeeNo) {
		this.payeeNo = payeeNo;
	}
	public Integer getPayeeClassCd() {
		return payeeClassCd;
	}
	public void setPayeeClassCd(Integer payeeClassCd) {
		this.payeeClassCd = payeeClassCd;
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
		return "RetrieveMtnPayeeRequest [payeeNo=" + payeeNo + ", payeeClassCd=" + payeeClassCd + ", paginationRequest="
				+ paginationRequest + ", sortRequest=" + sortRequest + "]";
	}
	
	
}
