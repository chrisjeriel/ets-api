package ph.cpi.rest.api.model.request;

import ph.cpi.rest.api.model.PaginationRequest;
import ph.cpi.rest.api.model.SortRequest;

public class RetrieveMtnAcitDCBNoRequest {
	private String dcbYear;
	private String dcbNo;
	private String dcbDate;
	private String dcbStatus;
	private PaginationRequest paginationRequest = new PaginationRequest();
	private SortRequest sortRequest = new SortRequest();
	
	public String getDcbYear() {
		return dcbYear;
	}
	public void setDcbYear(String dcbYear) {
		this.dcbYear = dcbYear;
	}
	public String getDcbNo() {
		return dcbNo;
	}
	public void setDcbNo(String dcbNo) {
		this.dcbNo = dcbNo;
	}
	public String getDcbDate() {
		return dcbDate;
	}
	public void setDcbDate(String dcbDate) {
		this.dcbDate = dcbDate;
	}
	public String getDcbStatus() {
		return dcbStatus;
	}
	public void setDcbStatus(String dcbStatus) {
		this.dcbStatus = dcbStatus;
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
		return "RetrieveMtnAcitDCBNoRequest [dcbYear=" + dcbYear + ", dcbNo=" + dcbNo + ", dcbDate=" + dcbDate
				+ ", dcbStatus=" + dcbStatus + ", paginationRequest=" + paginationRequest + ", sortRequest="
				+ sortRequest + "]";
	}
}
