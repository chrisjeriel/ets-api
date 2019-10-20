package ph.cpi.rest.api.model.request;

import ph.cpi.rest.api.model.PaginationRequest;
import ph.cpi.rest.api.model.SortRequest;

public class RetrieveMtnAcseGenJVSeriesRequest {
	private Integer jvYear;
	private Integer jvFrom;
	private Integer jvTo;
	private String usedTag;
	private PaginationRequest paginationRequest = new PaginationRequest();
	private SortRequest sortRequest = new SortRequest();
	public Integer getJvYear() {
		return jvYear;
	}
	public void setJvYear(Integer jvYear) {
		this.jvYear = jvYear;
	}
	public Integer getJvFrom() {
		return jvFrom;
	}
	public void setJvFrom(Integer jvFrom) {
		this.jvFrom = jvFrom;
	}
	public Integer getJvTo() {
		return jvTo;
	}
	public void setJvTo(Integer jvTo) {
		this.jvTo = jvTo;
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
		return "RetrieveMtnAcseGenJVSeriesRequest [jvYear=" + jvYear + ", jvFrom=" + jvFrom + ", jvTo=" + jvTo
				+ ", usedTag=" + usedTag + ", paginationRequest=" + paginationRequest + ", sortRequest=" + sortRequest
				+ "]";
	}
	
}
