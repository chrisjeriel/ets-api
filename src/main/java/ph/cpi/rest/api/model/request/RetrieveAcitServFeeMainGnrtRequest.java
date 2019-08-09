package ph.cpi.rest.api.model.request;

import java.math.BigDecimal;

import ph.cpi.rest.api.model.PaginationRequest;
import ph.cpi.rest.api.model.SortRequest;

public class RetrieveAcitServFeeMainGnrtRequest {

	private String prdAsOf;
	private Integer year;
	private BigDecimal servFeeAmt;
	private String currCd;
	private Double currRt;
	private PaginationRequest paginationRequest;
	private SortRequest sortRequest;
	
	public String getPrdAsOf() {
		return prdAsOf;
	}
	public void setPrdAsOf(String prdAsOf) {
		this.prdAsOf = prdAsOf;
	}
	public Integer getYear() {
		return year;
	}
	public void setYear(Integer year) {
		this.year = year;
	}
	public BigDecimal getServFeeAmt() {
		return servFeeAmt;
	}
	public void setServFeeAmt(BigDecimal servFeeAmt) {
		this.servFeeAmt = servFeeAmt;
	}
	public String getCurrCd() {
		return currCd;
	}
	public void setCurrCd(String currCd) {
		this.currCd = currCd;
	}
	public Double getCurrRt() {
		return currRt;
	}
	public void setCurrRt(Double currRt) {
		this.currRt = currRt;
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
		return "RetrieveAcitServFeeMainGnrtRequest [prdAsOf=" + prdAsOf + ", year=" + year + ", servFeeAmt="
				+ servFeeAmt + ", currCd=" + currCd + ", currRt=" + currRt + ", paginationRequest=" + paginationRequest
				+ ", sortRequest=" + sortRequest + "]";
	}
}
