package ph.cpi.rest.api.model.request;

import ph.cpi.rest.api.model.PaginationRequest;
import ph.cpi.rest.api.model.SortRequest;

public class RetrieveMtnObjectRequest {
	private String lineCd;
	private String objectId;
	private PaginationRequest paginationRequest;
	private SortRequest sortRequest;
	public String getLineCd() {
		return lineCd;
	}
	public void setLineCd(String lineCd) {
		this.lineCd = lineCd;
	}
	public String getObjectId() {
		return objectId;
	}
	public void setObjectId(String objectId) {
		this.objectId = objectId;
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
		StringBuilder builder = new StringBuilder();
		builder.append("RetrieveMtnObjectRequest [lineCd=");
		builder.append(lineCd);
		builder.append(", objectId=");
		builder.append(objectId);
		builder.append(", paginationRequest=");
		builder.append(paginationRequest);
		builder.append(", sortRequest=");
		builder.append(sortRequest);
		builder.append("]");
		return builder.toString();
	}
	
}
