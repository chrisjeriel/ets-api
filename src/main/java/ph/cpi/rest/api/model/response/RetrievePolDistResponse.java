package ph.cpi.rest.api.model.response;

import java.util.List;

import ph.cpi.rest.api.model.PaginationResponse;
import ph.cpi.rest.api.model.SortResponse;
import ph.cpi.rest.api.model.underwriting.DistCoIns;
import ph.cpi.rest.api.model.underwriting.PolDistribution;

public class RetrievePolDistResponse {
	private PolDistribution polDistribution;
	private List<DistCoIns> inProgCoins;
	private List<DistCoIns> missingCoins;
	private PaginationResponse paginationResponse;
	private SortResponse sortResponse;
	public PolDistribution getPolDistribution() {
		return polDistribution;
	}
	public void setPolDistribution(PolDistribution polDistribution) {
		this.polDistribution = polDistribution;
	}
	public List<DistCoIns> getInProgCoins() {
		return inProgCoins;
	}
	public void setInProgCoins(List<DistCoIns> inProgCoins) {
		this.inProgCoins = inProgCoins;
	}
	public List<DistCoIns> getMissingCoins() {
		return missingCoins;
	}
	public void setMissingCoins(List<DistCoIns> missingCoins) {
		this.missingCoins = missingCoins;
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
		return "RetrievePolDistResponse [polDistribution=" + polDistribution + ", inProgCoins=" + inProgCoins
				+ ", missingCoins=" + missingCoins + ", paginationResponse=" + paginationResponse + ", sortResponse="
				+ sortResponse + "]";
	}
	
	
}

