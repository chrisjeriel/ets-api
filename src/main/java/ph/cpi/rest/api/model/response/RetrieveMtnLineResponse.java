package ph.cpi.rest.api.model.response;


import java.util.List;

import ph.cpi.rest.api.model.PaginationResponse;
import ph.cpi.rest.api.model.SortResponse;
import ph.cpi.rest.api.model.maintenance.Line;

public class RetrieveMtnLineResponse {
	
	private List<Line> line;
	private PaginationResponse paginationResponse;
	private SortResponse sortResponse;
	
	public List<Line> getLine() {
		return line;
	}
	public void setLine(List<Line> line) {
		this.line = line;
	}
	/*public Line getLine() {
		if (line == null) {
			line = new Line();
		}
		return line;
	}
	public void setLine(Line line) {
		this.line = line;
	}*/
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
		return "RetrieveMtnLineResponse [line=" + line + ", paginationResponse=" + paginationResponse
				+ ", sortResponse=" + sortResponse + "]";
	}

}
