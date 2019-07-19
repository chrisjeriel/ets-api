package ph.cpi.rest.api.model.response;

import java.util.List;

import ph.cpi.rest.api.model.PaginationResponse;
import ph.cpi.rest.api.model.SortResponse;
import ph.cpi.rest.api.model.accountingintrust.AcitCMDM;

public class RetrieveAcitCMDMListResponse {
	private List<AcitCMDM> cmdmList;
	private PaginationResponse paginationResponse;
	private SortResponse sortResponse;
	public List<AcitCMDM> getCmdmList() {
		return cmdmList;
	}
	public void setCmdmList(List<AcitCMDM> cmdmList) {
		this.cmdmList = cmdmList;
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
		return "RetrieveAcitCMDMListResponse [cmdmList=" + cmdmList + ", paginationResponse=" + paginationResponse + ", sortResponse=" + sortResponse + "]";
	}
	
}
