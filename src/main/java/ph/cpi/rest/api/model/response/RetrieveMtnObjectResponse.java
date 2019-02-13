package ph.cpi.rest.api.model.response;

import java.util.List;

import ph.cpi.rest.api.model.PaginationResponse;
import ph.cpi.rest.api.model.SortResponse;
import ph.cpi.rest.api.model.maintenance.Object_;

public class RetrieveMtnObjectResponse {
	private List<Object_> object;
	private PaginationResponse paginationResponse;
	private SortResponse sortResponse;
	public List<Object_> getObject() {
		return object;
	}
	public void setObject(List<Object_> object) {
		this.object = object;
	}
	public PaginationResponse getPaginationResponse() {
		return paginationResponse;
	}
	public void setPaginationResponse(PaginationResponse paginationResponse) {
		this.paginationResponse = paginationResponse;
	}
	public SortResponse getSortResponse() {
		return sortResponse;
	}
	public void setSortResponse(SortResponse sortResponse) {
		this.sortResponse = sortResponse;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("RetrieveMtnObjectResponse [object=");
		builder.append(object);
		builder.append(", paginationResponse=");
		builder.append(paginationResponse);
		builder.append(", sortResponse=");
		builder.append(sortResponse);
		builder.append("]");
		return builder.toString();
	}
	
}
