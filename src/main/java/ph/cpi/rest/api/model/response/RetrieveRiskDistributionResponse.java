package ph.cpi.rest.api.model.response;

import java.util.List;

import ph.cpi.rest.api.model.PaginationResponse;
import ph.cpi.rest.api.model.SortResponse;
import ph.cpi.rest.api.model.underwriting.DistCoIns;
import ph.cpi.rest.api.model.underwriting.DistRiskWparam;
import ph.cpi.rest.api.model.underwriting.DistWrisk;
import ph.cpi.rest.api.model.underwriting.WriskLimit;

public class RetrieveRiskDistributionResponse {
	private DistWrisk distWrisk;
	private List<WriskLimit> wriskLimit;
	private List<DistRiskWparam> distRiskWparam;
	private List<DistCoIns> undistAlt;
	private List<DistCoIns> distAlt;
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
	public List<DistCoIns> getUndistAlt() {
		return undistAlt;
	}
	public void setUndistAlt(List<DistCoIns> undistAlt) {
		this.undistAlt = undistAlt;
	}
	public List<DistCoIns> getDistAlt() {
		return distAlt;
	}
	public void setDistAlt(List<DistCoIns> distAlt) {
		this.distAlt = distAlt;
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
				+ ", distRiskWparam=" + distRiskWparam + ", undistAlt=" + undistAlt + ", distAlt=" + distAlt
				+ ", paginationResponse=" + paginationResponse + ", sortReponse=" + sortReponse + "]";
	}
}
