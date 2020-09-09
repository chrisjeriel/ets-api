package ph.cpi.rest.api.model.request;

import ph.cpi.rest.api.model.PaginationRequest;
import ph.cpi.rest.api.model.SortRequest;

public class RetrieveAcitAllInvestmentIncomeRequest {
	
	private String 		tranDateFrom;
	private String 		tranDateTo;
	private String  	tranMonth;
	private String 		tranYear;
	private String		tranDate;
	private String currCd;
	private PaginationRequest paginationRequest = new PaginationRequest();
	private SortRequest sortRequest = new SortRequest();

	
	public String getTranDateFrom() {
		return tranDateFrom;
	}
	public void setTranDateFrom(String tranDateFrom) {
		this.tranDateFrom = tranDateFrom;
	}
	public String getTranDateTo() {
		return tranDateTo;
	}
	public void setTranDateTo(String tranDateTo) {
		this.tranDateTo = tranDateTo;
	}
	public String getTranMonth() {
		return tranMonth;
	}
	public void setTranMonth(String tranMonth) {
		this.tranMonth = tranMonth;
	}
	public String getTranYear() {
		return tranYear;
	}
	public void setTranYear(String tranYear) {
		this.tranYear = tranYear;
	}
	public String getTranDate() {
		return tranDate;
	}
	public void setTranDate(String tranDate) {
		this.tranDate = tranDate;
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
	public String getCurrCd() {
		return currCd;
	}
	public void setCurrCd(String currCd) {
		this.currCd = currCd;
	}
	@Override
	public String toString() {
		return "RetrieveAcitAllInvestmentIncomeRequest [tranDateFrom=" + tranDateFrom + ", tranDateTo=" + tranDateTo
				+ ", tranMonth=" + tranMonth + ", tranYear=" + tranYear + ", tranDate=" + tranDate + ", currCd="
				+ currCd + ", paginationRequest=" + paginationRequest + ", sortRequest=" + sortRequest + "]";
	}
	

	
}
