package ph.cpi.rest.api.model.response;

import java.util.List;

import ph.cpi.rest.api.model.PaginationResponse;
import ph.cpi.rest.api.model.SortResponse;
import ph.cpi.rest.api.model.maintenance.Line;
import ph.cpi.rest.api.model.maintenance.LineClass;

public class RetrieveMtnLineClassResponse {

	private List<LineClass> lineClass;
	private PaginationResponse paginationResponse;
	private SortResponse sortResponse;
	
	/*public LineClass getLineClass() {
		if (lineClass == null) {
			lineClass = new LineClass();
		}
		return lineClass;
	}*/
/*	public void setLineClass(LineClass lineClass) {
		this.lineClass = lineClass;
	}*/
	
	public List<LineClass> getLineClass() {
		return lineClass;
	}
	public void setLineClass(List<LineClass> lineClass) {
		this.lineClass = lineClass;
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
		return "RetrieveMtnLineClassResponse [lineClass=" + lineClass + ", paginationResponse=" + paginationResponse
				+ ", sortResponse=" + sortResponse + "]";
	}
	
	
	
	
}
