package ph.cpi.rest.api.model.response;

import java.util.List;

import ph.cpi.rest.api.model.PaginationResponse;
import ph.cpi.rest.api.model.SortResponse;
import ph.cpi.rest.api.model.accountingservice.AcseInsuranceExp;

public class RetrieveAcseInsuranceExpResponse {
	private List<AcseInsuranceExp> acseInsuranceExp;
	private PaginationResponse paginationResponse;
	private SortResponse sortResponse;
	public List<AcseInsuranceExp> getAcseInsuranceExp() {
		return acseInsuranceExp;
	}
	public void setAcseInsuranceExp(List<AcseInsuranceExp> acseInsuranceExp) {
		this.acseInsuranceExp = acseInsuranceExp;
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
		return "RetrieveAcseInsuranceExpResponse [acseInsuranceExp=" + acseInsuranceExp + ", paginationResponse="
				+ paginationResponse + ", sortResponse=" + sortResponse + "]";
	}
}
