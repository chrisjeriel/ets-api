package ph.cpi.rest.api.model.request;

import ph.cpi.rest.api.model.PaginationRequest;
import ph.cpi.rest.api.model.SortRequest;

public class RetrieveMtnGenARSeriesRequest {
	private Integer arFrom;
	private Integer arTo;
	private Integer usedTag;
	private PaginationRequest paginationRequest;
	private SortRequest sortRequest;
	public Integer getArFrom() {
		return arFrom;
	}
	public void setArFrom(Integer arFrom) {
		this.arFrom = arFrom;
	}
	public Integer getArTo() {
		return arTo;
	}
	public void setArTo(Integer arTo) {
		this.arTo = arTo;
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
		return "RetrieveMtnGenARSeriesRequest [arFrom=" + arFrom + ", arTo=" + arTo + ", usedTag=" + usedTag
				+ ", paginationRequest=" + paginationRequest + ", sortRequest=" + sortRequest + "]";
	}
	
}
