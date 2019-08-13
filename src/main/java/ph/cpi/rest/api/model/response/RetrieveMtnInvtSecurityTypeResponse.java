package ph.cpi.rest.api.model.response;

import java.util.List;

import ph.cpi.rest.api.model.PaginationResponse;
import ph.cpi.rest.api.model.SortResponse;
import ph.cpi.rest.api.model.maintenance.InvtSecurityType;

public class RetrieveMtnInvtSecurityTypeResponse {
	
	private List<InvtSecurityType> invSecTypeList;
	private PaginationResponse paginationResponse = new PaginationResponse();
	private SortResponse sortResponse = new SortResponse();
	
	public List<InvtSecurityType> getInvSecTypeList() {
		return invSecTypeList;
	}
	public void setInvSecTypeList(List<InvtSecurityType> invSecTypeList) {
		this.invSecTypeList = invSecTypeList;
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
		return "RetrieveMtnInvtSecurityTypeResponse [invSecTypeList=" + invSecTypeList + ", paginationResponse="
				+ paginationResponse + ", sortResponse=" + sortResponse + "]";
	}
	

}
