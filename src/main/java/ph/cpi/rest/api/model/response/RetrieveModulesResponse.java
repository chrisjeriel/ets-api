package ph.cpi.rest.api.model.response;

import java.util.ArrayList;
import java.util.List;

import ph.cpi.rest.api.model.PaginationResponse;
import ph.cpi.rest.api.model.SortResponse;
import ph.cpi.rest.api.model.maintenance.UserWithGrpModule;

public class RetrieveModulesResponse {
	
	private List<UserWithGrpModule> modules;
	private PaginationResponse paginationResponse;
	private SortResponse sortResponse;
	
	public List<UserWithGrpModule> getModules() {
		if (modules == null) {
			modules = new ArrayList<UserWithGrpModule>();
		}
		
		return modules;
	}
	public void setModules(List<UserWithGrpModule> modules) {
		this.modules = modules;
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
		return "RetrieveMtnModulesResponse [modules=" + modules + ", paginationResponse=" + paginationResponse
				+ ", sortResponse=" + sortResponse + "]";
	}
	
	
}
