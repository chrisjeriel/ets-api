package ph.cpi.rest.api.model.response;

import java.util.List;

import ph.cpi.rest.api.model.PaginationResponse;
import ph.cpi.rest.api.model.SortResponse;
import ph.cpi.rest.api.model.underwriting.DistCoIns;

public class RetrieveDistCoInsResponse {
	private List<DistCoIns> distCoInsList;
	private List<DistCoIns>	postedDist;
	private PaginationResponse paginationResponse = new PaginationResponse();
	private SortResponse sortResponse = new SortResponse();
	
	public List<DistCoIns> getDistCoInsList() {
		return distCoInsList;
	}
	public void setDistCoInsList(List<DistCoIns> distCoInsList) {
		this.distCoInsList = distCoInsList;
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
	public List<DistCoIns> getPostedDist() {
		return postedDist;
	}
	public void setPostedDist(List<DistCoIns> postedDist) {
		this.postedDist = postedDist;
	}
	@Override
	public String toString() {
		return "RetrieveDistCoInsResponse [distCoInsList=" + distCoInsList + ", postedDist=" + postedDist
				+ ", paginationResponse=" + paginationResponse + ", sortResponse=" + sortResponse + "]";
	}
}
