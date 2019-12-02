package ph.cpi.rest.api.model.response;

import java.util.List;

import ph.cpi.rest.api.model.PaginationResponse;
import ph.cpi.rest.api.model.SortResponse;
import ph.cpi.rest.api.model.accountingintrust.AcitDcbBankDetails;

public class RetrieveAcitDcbBankDetailsResponse {
	private List<AcitDcbBankDetails> bankDetails;
	private PaginationResponse paginationResponse = new PaginationResponse();
	private SortResponse sortResponse = new SortResponse();
	public List<AcitDcbBankDetails> getBankDetails() {
		return bankDetails;
	}
	public void setBankDetails(List<AcitDcbBankDetails> bankDetails) {
		this.bankDetails = bankDetails;
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
		return "RetrieveAcitDcbBankDetailsResponse [bankDetails=" + bankDetails + ", paginationResponse="
				+ paginationResponse + ", sortResponse=" + sortResponse + "]";
	}
	
}
