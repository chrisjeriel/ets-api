package ph.cpi.rest.api.model.request;

import ph.cpi.rest.api.model.PaginationRequest;
import ph.cpi.rest.api.model.SortRequest;

public class RetrieveMtnAcseGenCVSeriesRequest {
	private Integer cvYear;
	private Integer cvTo;
	private Integer cvFrom;
	private String usedTag;
	private PaginationRequest paginationRequest = new PaginationRequest();
	private SortRequest sortRequest = new SortRequest();
	public Integer getCvYear() {
		return cvYear;
	}
	public void setCvYear(Integer cvYear) {
		this.cvYear = cvYear;
	}
	public Integer getCvTo() {
		return cvTo;
	}
	public void setCvTo(Integer cvTo) {
		this.cvTo = cvTo;
	}
	public Integer getCvFrom() {
		return cvFrom;
	}
	public void setCvFrom(Integer cvFrom) {
		this.cvFrom = cvFrom;
	}
	public String getUsedTag() {
		return usedTag;
	}
	public void setUsedTag(String usedTag) {
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
		return "RetrieveMtnAcseGenCVSeriesRequest [cvYear=" + cvYear + ", cvTo=" + cvTo + ", cvFrom=" + cvFrom
				+ ", usedTag=" + usedTag + ", paginationRequest=" + paginationRequest + ", sortRequest=" + sortRequest
				+ "]";
	}
	
}
