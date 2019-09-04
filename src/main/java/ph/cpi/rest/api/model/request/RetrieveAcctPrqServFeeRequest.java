package ph.cpi.rest.api.model.request;

import java.math.BigDecimal;

import ph.cpi.rest.api.model.PaginationRequest;
import ph.cpi.rest.api.model.SortRequest;

public class RetrieveAcctPrqServFeeRequest {

	private String retType;
	private Integer reqId;
	private Integer quarter;
	private Integer year;
	private Integer groupId;
	private BigDecimal servFeeAmt;
	private String currCd;
	private Double currRt;
	private PaginationRequest paginationRequest;
	private SortRequest sortRequest;
	
	public String getRetType() {
		return retType;
	}
	public void setRetType(String retType) {
		this.retType = retType;
	}
	public Integer getReqId() {
		return reqId;
	}
	public void setReqId(Integer reqId) {
		this.reqId = reqId;
	}
	public Integer getQuarter() {
		return quarter;
	}
	public void setQuarter(Integer quarter) {
		this.quarter = quarter;
	}
	public Integer getYear() {
		return year;
	}
	public void setYear(Integer year) {
		this.year = year;
	}
	public Integer getGroupId() {
		return groupId;
	}
	public void setGroupId(Integer groupId) {
		this.groupId = groupId;
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
		return "RetrieveAcctPrqServFeeRequest [retType=" + retType + ", reqId=" + reqId + ", quarter=" + quarter
				+ ", year=" + year + ", groupId=" + groupId + ", servFeeAmt=" + servFeeAmt + ", currCd=" + currCd
				+ ", currRt=" + currRt + ", paginationRequest=" + paginationRequest + ", sortRequest=" + sortRequest
				+ "]";
	}
}
