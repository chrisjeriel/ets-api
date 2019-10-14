package ph.cpi.rest.api.model.request;

import ph.cpi.rest.api.model.PaginationRequest;
import ph.cpi.rest.api.model.SortRequest;

public class RetrieveMtnAcseGenORSeriesRequest {
	private String orType;
	private Integer orTo;
	private Integer orFrom;
	private String usedTag;
	private PaginationRequest paginationRequest = new PaginationRequest();
	private SortRequest sortRequest = new SortRequest();
	public String getOrType() {
		return orType;
	}
	public void setOrType(String orType) {
		this.orType = orType;
	}
	public Integer getOrTo() {
		return orTo;
	}
	public void setOrTo(Integer orTo) {
		this.orTo = orTo;
	}
	public Integer getOrFrom() {
		return orFrom;
	}
	public void setOrFrom(Integer orFrom) {
		this.orFrom = orFrom;
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
		return "RetrieveMtnAcseGenORSeriesRequest [orType=" + orType + ", orTo=" + orTo + ", orFrom=" + orFrom
				+ ", usedTag=" + usedTag + ", paginationRequest=" + paginationRequest + ", sortRequest=" + sortRequest
				+ "]";
	}
}
