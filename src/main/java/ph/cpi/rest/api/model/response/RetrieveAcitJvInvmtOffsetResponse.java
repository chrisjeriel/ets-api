package ph.cpi.rest.api.model.response;

import java.util.List;

import ph.cpi.rest.api.model.PaginationRequest;
import ph.cpi.rest.api.model.SortRequest;
import ph.cpi.rest.api.model.accountingintrust.AcitJVAcctTrtyBal;

public class RetrieveAcitJvInvmtOffsetResponse {
	private List <AcitJVAcctTrtyBal> acctTreatyBal;
	private PaginationRequest paginationRequest;
	private SortRequest sortRequest;
	public List<AcitJVAcctTrtyBal> getAcctTreatyBal() {
		return acctTreatyBal;
	}
	public void setAcctTreatyBal(List<AcitJVAcctTrtyBal> acctTreatyBal) {
		this.acctTreatyBal = acctTreatyBal;
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
	@Override
	public String toString() {
		return "RetrieveAcitJvInvmtOffsetResponse [acctTreatyBal=" + acctTreatyBal + ", paginationRequest="
				+ paginationRequest + ", sortRequest=" + sortRequest + "]";
	}
	
}
