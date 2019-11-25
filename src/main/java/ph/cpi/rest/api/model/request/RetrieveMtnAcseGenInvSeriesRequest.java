package ph.cpi.rest.api.model.request;

import ph.cpi.rest.api.model.PaginationRequest;
import ph.cpi.rest.api.model.SortRequest;

public class RetrieveMtnAcseGenInvSeriesRequest {

	private Integer invTo;
	private Integer invFrom;
	private String usedTag;
	private Integer rowNum;
	private PaginationRequest paginationRequest = new PaginationRequest();
	private SortRequest sortRequest = new SortRequest();
	
	public Integer getInvTo() {
		return invTo;
	}
	public void setInvTo(Integer invTo) {
		this.invTo = invTo;
	}
	public Integer getInvFrom() {
		return invFrom;
	}
	public void setInvFrom(Integer invFrom) {
		this.invFrom = invFrom;
	}
	public String getUsedTag() {
		return usedTag;
	}
	public void setUsedTag(String usedTag) {
		this.usedTag = usedTag;
	}
	public Integer getRowNum() {
		return rowNum;
	}
	public void setRowNum(Integer rowNum) {
		this.rowNum = rowNum;
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
		return "RetrieveMtnAcseGenInvSeriesRequest [invTo=" + invTo
				+ ", invFrom=" + invFrom + ", usedTag=" + usedTag + ", rowNum="
				+ rowNum + ", paginationRequest=" + paginationRequest
				+ ", sortRequest=" + sortRequest + "]";
	}
	
}
