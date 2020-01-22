package ph.cpi.rest.api.model.request;

import ph.cpi.rest.api.model.PaginationRequest;
import ph.cpi.rest.api.model.SortRequest;

public class RetrieveMtnPayeeCedingRequest {
	private Integer payeeClassCd;
	private String treatyTag;
	private PaginationRequest paginationRequest;
	private SortRequest sortRequest;
	public Integer getPayeeClassCd() {
		return payeeClassCd;
	}
	public void setPayeeClassCd(Integer payeeClassCd) {
		this.payeeClassCd = payeeClassCd;
	}
	public String getTreatyTag() {
		return treatyTag;
	}
	public void setTreatyTag(String treatyTag) {
		this.treatyTag = treatyTag;
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
		return "RetrieveMtnPayeeCedingRequest [payeeClassCd=" + payeeClassCd + ", treatyTag=" + treatyTag
				+ ", paginationRequest=" + paginationRequest + ", sortRequest=" + sortRequest + "]";
	}
	
}
