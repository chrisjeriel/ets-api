package ph.cpi.rest.api.model.request;

import ph.cpi.rest.api.model.PaginationRequest;
import ph.cpi.rest.api.model.SortRequest;

public class RetrieveAcseDcbBankDetailsRequest {
	private Integer dcbYear;
	private Integer dcbNo;
	private PaginationRequest paginationRequest = new PaginationRequest();
	private SortRequest sortRequest = new SortRequest();
	public Integer getDcbYear() {
		return dcbYear;
	}
	public void setDcbYear(Integer dcbYear) {
		this.dcbYear = dcbYear;
	}
	public Integer getDcbNo() {
		return dcbNo;
	}
	public void setDcbNo(Integer dcbNo) {
		this.dcbNo = dcbNo;
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
		return "RetrieveAcseDcbBankDetailsRequest [dcbYear=" + dcbYear + ", dcbNo=" + dcbNo + ", paginationRequest="
				+ paginationRequest + ", sortRequest=" + sortRequest + "]";
	}
	
}
