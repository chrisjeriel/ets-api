package ph.cpi.rest.api.model.request;

import ph.cpi.rest.api.model.PaginationRequest;
import ph.cpi.rest.api.model.SortRequest;

public class RetrieveMtnGenCVSeriesRequest {
	private Integer cvYear;
	private Integer cvFrom;
	private Integer cvTo;
	private Integer usedTag;
	private PaginationRequest paginationRequest;
	private SortRequest sortRequest;
	public Integer getCvYear() {
		return cvYear;
	}
	public void setCvYear(Integer cvYear) {
		this.cvYear = cvYear;
	}
	public Integer getCvFrom() {
		return cvFrom;
	}
	public void setCvFrom(Integer cvFrom) {
		this.cvFrom = cvFrom;
	}
	public Integer getCvTo() {
		return cvTo;
	}
	public void setCvTo(Integer cvTo) {
		this.cvTo = cvTo;
	}
	public Integer getUsedTag() {
		return usedTag;
	}
	public void setUsedTag(Integer usedTag) {
		this.usedTag = usedTag;
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
		return "RetrieveMtnGenCVSeriesRequest [cvYear=" + cvYear + ", cvFrom=" + cvFrom + ", cvTo=" + cvTo
				+ ", usedTag=" + usedTag + ", paginationRequest=" + paginationRequest + ", sortRequest=" + sortRequest
				+ "]";
	}
	
}
