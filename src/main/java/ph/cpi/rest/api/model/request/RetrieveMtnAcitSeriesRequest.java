package ph.cpi.rest.api.model.request;

import ph.cpi.rest.api.model.PaginationRequest;
import ph.cpi.rest.api.model.SortRequest;

public class RetrieveMtnAcitSeriesRequest {
	private String tranClass;
	private Integer tranFrom;
	private Integer tranTo;
	private Integer year;
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
	public Integer getYear() {
		return year;
	}
	public void setYear(Integer year) {
		this.year = year;
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
		return "RetrieveMtnAcitSeriesRequest [tranClass=" + tranClass + ", tranFrom=" + tranFrom + ", tranTo=" + tranTo
				+ ", year=" + year + ", paginationRequest=" + paginationRequest + ", sortRequest=" + sortRequest + "]";
	}
	
	
}
