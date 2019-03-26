package ph.cpi.rest.api.model.response;

import java.util.List;

import ph.cpi.rest.api.model.PaginationResponse;
import ph.cpi.rest.api.model.SortResponse;
import ph.cpi.rest.api.model.maintenance.MtnCharges;

public class RetrieveMtnChargesResponse {
	private List<MtnCharges> mtnChargesList;
	private PaginationResponse paginationResponse;
	private SortResponse sortResponse;
	
	public List<MtnCharges> getMtnChargesList() {
		return mtnChargesList;
	}
	public void setMtnChargesList(List<MtnCharges> mtnChargesList) {
		this.mtnChargesList = mtnChargesList;
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
		return "RetrieveMtnChargesResponse [mtnChargesList=" + mtnChargesList + ", paginationResponse="
				+ paginationResponse + ", sortResponse=" + sortResponse + "]";
	}
}
