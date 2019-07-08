package ph.cpi.rest.api.model.request;

import ph.cpi.rest.api.model.PaginationRequest;
import ph.cpi.rest.api.model.SortRequest;

public class RetrieveMtnClmCashCallRequest {
	
	private String treatyId;
	private String treatyCedId;
	private String currCd;
	private PaginationRequest paginationRequest;
	private SortRequest sortRequest;
	
	public String getTreatyId() {
		return treatyId;
	}
	public void setTreatyId(String treatyId) {
		this.treatyId = treatyId;
	}
	public String getTreatyCedId() {
		return treatyCedId;
	}
	public void setTreatyCedId(String treatyCedId) {
		this.treatyCedId = treatyCedId;
	}
	public String getCurrCd() {
		return currCd;
	}
	public void setCurrCd(String currCd) {
		this.currCd = currCd;
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
		return "RetrieveMtnClmCashCallRequest [treatyId=" + treatyId + ", treatyCedId=" + treatyCedId + ", currCd="
				+ currCd + ", paginationRequest=" + paginationRequest + ", sortRequest=" + sortRequest + "]";
	}
	
}
