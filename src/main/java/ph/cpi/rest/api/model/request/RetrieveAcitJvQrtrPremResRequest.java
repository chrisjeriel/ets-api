package ph.cpi.rest.api.model.request;

import ph.cpi.rest.api.model.PaginationRequest;
import ph.cpi.rest.api.model.SortRequest;

public class RetrieveAcitJvQrtrPremResRequest {
	private String cedingId;
	private String quarterEnd;
	private String currCd;
	private PaginationRequest paginationRequest;
	private SortRequest sortRequest;
	public String getCedingId() {
		return cedingId;
	}
	public void setCedingId(String cedingId) {
		this.cedingId = cedingId;
	}
	public String getQuarterEnd() {
		return quarterEnd;
	}
	public void setQuarterEnd(String quarterEnd) {
		this.quarterEnd = quarterEnd;
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
		return "RetrieveAcitJvQrtrPremResRequest [cedingId=" + cedingId + ", quarterEnd=" + quarterEnd + ", currCd="
				+ currCd + ", paginationRequest=" + paginationRequest + ", sortRequest=" + sortRequest + "]";
	}
	
}
