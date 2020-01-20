package ph.cpi.rest.api.model.request;

import ph.cpi.rest.api.model.PaginationRequest;
import ph.cpi.rest.api.model.SortRequest;

public class RetrieveMtnAcseCheckSeriesRequest {
	private String bank;
	private String bankAcct;
	private String checkNo;
	private String srchFrom;
	private String srchTo;
	private String from;
	private PaginationRequest paginationRequest;
	private SortRequest sortRequest;
	public String getBank() {
		return bank;
	}
	public void setBank(String bank) {
		this.bank = bank;
	}
	public String getBankAcct() {
		return bankAcct;
	}
	public void setBankAcct(String bankAcct) {
		this.bankAcct = bankAcct;
	}
	public String getCheckNo() {
		return checkNo;
	}
	public void setCheckNo(String checkNo) {
		this.checkNo = checkNo;
	}
	public String getSrchFrom() {
		return srchFrom;
	}
	public void setSrchFrom(String srchFrom) {
		this.srchFrom = srchFrom;
	}
	public String getSrchTo() {
		return srchTo;
	}
	public void setSrchTo(String srchTo) {
		this.srchTo = srchTo;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
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
		return "RetrieveMtnAcseCheckSeriesRequest [bank=" + bank + ", bankAcct=" + bankAcct + ", checkNo=" + checkNo
				+ ", from=" + from + ", paginationRequest=" + paginationRequest + ", sortRequest=" + sortRequest + "]";
	}
}
