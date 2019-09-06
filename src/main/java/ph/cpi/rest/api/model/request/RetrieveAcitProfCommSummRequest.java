package ph.cpi.rest.api.model.request;

import ph.cpi.rest.api.model.PaginationRequest;
import ph.cpi.rest.api.model.SortRequest;

public class RetrieveAcitProfCommSummRequest {
	
	private String profcommId;
	private String cedingId;
	private String dateTo;
	private String dateFrom;
	private PaginationRequest paginationRequest;
	private SortRequest sortRequest;
	
	public String getProfcommId() {
		return profcommId;
	}
	public void setProfcommId(String profcommId) {
		this.profcommId = profcommId;
	}
	public String getCedingId() {
		return cedingId;
	}
	public void setCedingId(String cedingId) {
		this.cedingId = cedingId;
	}
	public String getDateTo() {
		return dateTo;
	}
	public void setDateTo(String dateTo) {
		this.dateTo = dateTo;
	}
	public String getDateFrom() {
		return dateFrom;
	}
	public void setDateFrom(String dateFrom) {
		this.dateFrom = dateFrom;
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
		return "RetrieveAcitProfCommSummRequest [profcommId=" + profcommId + ", cedingId=" + cedingId + ", dateTo="
				+ dateTo + ", dateFrom=" + dateFrom + ", paginationRequest=" + paginationRequest + ", sortRequest="
				+ sortRequest + "]";
	}

}
