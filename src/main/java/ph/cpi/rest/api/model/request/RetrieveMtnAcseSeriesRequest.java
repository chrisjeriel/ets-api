package ph.cpi.rest.api.model.request;

import ph.cpi.rest.api.model.PaginationRequest;
import ph.cpi.rest.api.model.SortRequest;

public class RetrieveMtnAcseSeriesRequest {
	private String tranClass;
	private Integer tranFrom;
	private Integer tranTo;
	private Integer tranYear;
	private String orType;
	private PaginationRequest paginationRequest = new PaginationRequest();
	private SortRequest sortRequest = new SortRequest();
	public String getTranClass() {
		return tranClass;
	}
	public void setTranClass(String tranClass) {
		this.tranClass = tranClass;
	}
	public Integer getTranFrom() {
		return tranFrom;
	}
	public void setTranFrom(Integer tranFrom) {
		this.tranFrom = tranFrom;
	}
	public Integer getTranTo() {
		return tranTo;
	}
	public void setTranTo(Integer tranTo) {
		this.tranTo = tranTo;
	}
	public Integer getTranYear() {
		return tranYear;
	}
	public void setTranYear(Integer tranYear) {
		this.tranYear = tranYear;
	}
	public String getOrType() {
		return orType;
	}
	public void setOrType(String orType) {
		this.orType = orType;
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
		return "RetrieveMtnAcseSeriesRequest [tranClass=" + tranClass + ", tranFrom=" + tranFrom + ", tranTo=" + tranTo
				+ ", tranYear=" + tranYear + ", orType=" + orType + ", paginationRequest=" + paginationRequest
				+ ", sortRequest=" + sortRequest + "]";
	}
	
}
