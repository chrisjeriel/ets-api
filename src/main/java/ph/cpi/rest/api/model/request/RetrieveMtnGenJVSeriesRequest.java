package ph.cpi.rest.api.model.request;

import ph.cpi.rest.api.model.PaginationRequest;
import ph.cpi.rest.api.model.SortRequest;

public class RetrieveMtnGenJVSeriesRequest {
	private Integer jvYear;
	private Integer jvFrom;
	private Integer jvTo;
	private Integer usedTag;
	private PaginationRequest paginationRequest;
	private SortRequest sortRequest;
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
		return "RetrieveMtnGenJVSeriesRequest [jvYear=" + jvYear + ", jvFrom=" + jvFrom + ", jvTo=" + jvTo
				+ ", usedTag=" + usedTag + ", paginationRequest=" + paginationRequest + ", sortRequest=" + sortRequest
				+ "]";
	}
	
}
