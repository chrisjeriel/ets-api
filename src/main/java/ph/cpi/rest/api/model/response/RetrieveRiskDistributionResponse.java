package ph.cpi.rest.api.model.response;

import java.util.List;

import ph.cpi.rest.api.model.PaginationResponse;
import ph.cpi.rest.api.model.SortResponse;
import ph.cpi.rest.api.model.underwriting.DistRiskWparam;
import ph.cpi.rest.api.model.underwriting.DistWrisk;
import ph.cpi.rest.api.model.underwriting.WriskLimit;

public class RetrieveRiskDistributionResponse {
	private DistWrisk distWrisk;
	private List<WriskLimit> wriskLimit;
	private List<DistRiskWparam> distRiskWparam;
	private PaginationResponse paginationResponse = new PaginationResponse();
	private SortResponse sortReponse = new SortResponse();
	
	public DistWrisk getDistWrisk() {
		return distWrisk;
	}
	public void setDistWrisk(DistWrisk distWrisk) {
		this.distWrisk = distWrisk;
	}
	public List<WriskLimit> getWriskLimit() {
		return wriskLimit;
	}
	public void setWriskLimit(List<WriskLimit> wriskLimit) {
		this.wriskLimit = wriskLimit;
	}
	public List<DistRiskWparam> getDistRiskWparam() {
		return distRiskWparam;
	}
	public void setDistRiskWparam(List<DistRiskWparam> distRiskWparam) {
		this.distRiskWparam = distRiskWparam;
	}
	public PaginationResponse getPaginationResponse() {
		return paginationResponse;
	}
	public void setPaginationResponse(PaginationResponse paginationResponse) {
		this.paginationResponse = paginationResponse;
	}
	public SortResponse getSortReponse() {
		return sortReponse;
	}
	public void setSortReponse(SortResponse sortReponse) {
		this.sortReponse = sortReponse;
	}
	
	@Override
	public String toString() {
		return "RetrieveRiskDistributionResponse [distWrisk=" + distWrisk + ", wriskLimit=" + wriskLimit
				+ ", distRiskWparam=" + distRiskWparam + ", paginationResponse=" + paginationResponse + ", sortReponse="
				+ sortReponse + "]";
	}
}