package ph.cpi.rest.api.model.response;

import java.util.List;

import ph.cpi.rest.api.model.PaginationRequest;
import ph.cpi.rest.api.model.SortRequest;
import ph.cpi.rest.api.model.accountingintrust.AcitJVClmNegativeTreaty;

public class RetrieveAcitJVClmNegTrtyResponse {
	private List<AcitJVClmNegativeTreaty> negativeTrty;
	private PaginationRequest paginationRequest;
	private SortRequest sortRequest;
	
	public List<AcitJVClmNegativeTreaty> getNegativeTrty() {
		return negativeTrty;
	}

	public void setNegativeTrty(List<AcitJVClmNegativeTreaty> negativeTrty) {
		this.negativeTrty = negativeTrty;
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

	
}
