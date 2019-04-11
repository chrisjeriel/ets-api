package ph.cpi.rest.api.model.response;

import java.util.List;

import ph.cpi.rest.api.model.PaginationResponse;
import ph.cpi.rest.api.model.SortResponse;
import ph.cpi.rest.api.model.workflow.Notes;

public class RetrieveNotesResponse {
	private List<Notes> notesList;
	private PaginationResponse paginationResponse;
	private SortResponse sortResponse;
	
	public List<Notes> getNotesList() {
		return notesList;
	}
	public void setNotesList(List<Notes> notesList) {
		this.notesList = notesList;
	}
	public PaginationResponse getPaginationResponse() {
		if(paginationResponse == null){
			paginationResponse = new PaginationResponse();
		}
		return paginationResponse;
	}
	public void setPaginationResponse(PaginationResponse paginationResponse) {
		this.paginationResponse = paginationResponse;
	}
	public SortResponse getSortResponse() {
		if(sortResponse == null){
			sortResponse = new SortResponse();
		}
		return sortResponse;
	}
	public void setSortResponse(SortResponse sortResponse) {
		this.sortResponse = sortResponse;
	}
	@Override
	public String toString() {
		return "RetrieveNotesResponse [notesList=" + notesList + ", paginationResponse=" + paginationResponse
				+ ", sortResponse=" + sortResponse + "]";
	}
}
