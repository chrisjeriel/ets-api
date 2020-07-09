package ph.cpi.rest.api.model.request;

import java.math.BigDecimal;

import ph.cpi.rest.api.model.PaginationRequest;
import ph.cpi.rest.api.model.SearchRequest;
import ph.cpi.rest.api.model.SortRequest;

public class RetrieveClmPaytReqInqRequest {
	private String claimNo;
	private Integer histNo;
	private String policyNo;
	private String paytReqNo;
	private String payee;
	private String paytType;
	private String currCd;
	private BigDecimal resAmt;
	private String particulars;
	private String reqDate;
	private String reqBy;
	private String acctRef;
	private String tranDate;
	private String insuredDesc;
	private String riskName;
	private String lossDate;
	private String bookingMonth;
	private String bookingYear;
	private SearchRequest search;

	private PaginationRequest paginationRequest = new PaginationRequest();
	private SortRequest sortRequest = new SortRequest();
	
	public String getBookingYear() {
		return bookingYear;
	}
	public void setBookingYear(String bookingYear) {
		this.bookingYear = bookingYear;
	}
	public SearchRequest getSearch() {
		return search;
	}
	public void setSearch(SearchRequest search) {
		this.search = search;
	}
	public String getBookingMonth() {
		return bookingMonth;
	}
	public void setBookingMonth(String bookingMonth) {
		this.bookingMonth = bookingMonth;
	}
	public String getClaimNo() {
		return claimNo;
	}
	public void setClaimNo(String claimNo) {
		this.claimNo = claimNo;
	}
	public Integer getHistNo() {
		return histNo;
	}
	public void setHistNo(Integer histNo) {
		this.histNo = histNo;
	}
	public String getPolicyNo() {
		return policyNo;
	}
	public void setPolicyNo(String policyNo) {
		this.policyNo = policyNo;
	}
	public String getPaytReqNo() {
		return paytReqNo;
	}
	public void setPaytReqNo(String paytReqNo) {
		this.paytReqNo = paytReqNo;
	}
	public String getPayee() {
		return payee;
	}
	public void setPayee(String payee) {
		this.payee = payee;
	}
	public String getPaytType() {
		return paytType;
	}
	public void setPaytType(String paytType) {
		this.paytType = paytType;
	}
	public String getCurrCd() {
		return currCd;
	}
	public void setCurrCd(String currCd) {
		this.currCd = currCd;
	}
	public BigDecimal getResAmt() {
		return resAmt;
	}
	public void setResAmt(BigDecimal resAmt) {
		this.resAmt = resAmt;
	}
	public String getParticulars() {
		return particulars;
	}
	public void setParticulars(String particulars) {
		this.particulars = particulars;
	}
	public String getReqDate() {
		return reqDate;
	}
	public void setReqDate(String reqDate) {
		this.reqDate = reqDate;
	}
	public String getReqBy() {
		return reqBy;
	}
	public void setReqBy(String reqBy) {
		this.reqBy = reqBy;
	}
	public String getAcctRef() {
		return acctRef;
	}
	public void setAcctRef(String acctRef) {
		this.acctRef = acctRef;
	}
	public String getTranDate() {
		return tranDate;
	}
	public void setTranDate(String tranDate) {
		this.tranDate = tranDate;
	}
	public String getInsuredDesc() {
		return insuredDesc;
	}
	public void setInsuredDesc(String insuredDesc) {
		this.insuredDesc = insuredDesc;
	}
	public String getRiskName() {
		return riskName;
	}
	public void setRiskName(String riskName) {
		this.riskName = riskName;
	}
	public String getLossDate() {
		return lossDate;
	}
	public void setLossDate(String lossDate) {
		this.lossDate = lossDate;
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
		return "RetrieveClmPaytReqInqRequest [claimNo=" + claimNo + ", histNo=" + histNo + ", policyNo=" + policyNo
				+ ", paytReqNo=" + paytReqNo + ", payee=" + payee + ", paytType=" + paytType + ", currCd=" + currCd
				+ ", resAmt=" + resAmt + ", particulars=" + particulars + ", reqDate=" + reqDate + ", reqBy=" + reqBy
				+ ", acctRef=" + acctRef + ", tranDate=" + tranDate + ", insuredDesc=" + insuredDesc + ", riskName="
				+ riskName + ", lossDate=" + lossDate + ", bookingMonth=" + bookingMonth + ", bookingYear="
				+ bookingYear + ", search=" + search + ", paginationRequest=" + paginationRequest + ", sortRequest="
				+ sortRequest + "]";
	}
}
