package ph.cpi.rest.api.model.request;

import ph.cpi.rest.api.model.PaginationRequest;
import ph.cpi.rest.api.model.SortRequest;

public class RetrieveMtnCedingRetentionRequest {

	private Integer treatyYear;
	private Integer treatyId;
	private String trtyCedId;
	private PaginationRequest paginationRequest;
	private SortRequest sortRequest;
	
	public Integer getTreatyYear() {
		return treatyYear;
	}
	public void setTreatyYear(Integer treatyYear) {
		this.treatyYear = treatyYear;
	}
	public Integer getTreatyId() {
		return treatyId;
	}
	public void setTreatyId(Integer treatyId) {
		this.treatyId = treatyId;
	}
	public String getTrtyCedId() {
		return trtyCedId;
	}
	public void setTrtyCedId(String trtyCedId) {
		this.trtyCedId = trtyCedId;
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
		return "RetrieveMtnCedingRetentionRequest [treatyYear=" + treatyYear + ", treatyId=" + treatyId + ", trtyCedId="
				+ trtyCedId + ", paginationRequest=" + paginationRequest + ", sortRequest=" + sortRequest + "]";
	}
}
