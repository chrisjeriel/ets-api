package ph.cpi.rest.api.model.response;

import java.util.List;

import ph.cpi.rest.api.model.PaginationResponse;
import ph.cpi.rest.api.model.SortResponse;
import ph.cpi.rest.api.model.accountingservice.AcsePerDiem;

public class RetrieveAcsePerDiemResponse {
	private List<AcsePerDiem> acsePerDiem;
	private PaginationResponse paginationResponse;
	private SortResponse sortResponse;
	public List<AcsePerDiem> getAcsePerDiem() {
		return acsePerDiem;
	}
	public void setAcsePerDiem(List<AcsePerDiem> acsePerDiem) {
		this.acsePerDiem = acsePerDiem;
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
		return "RetrieveAcsePerDiemResponse [acsePerDiem=" + acsePerDiem + ", paginationResponse=" + paginationResponse
				+ ", sortResponse=" + sortResponse + "]";
	}
}
