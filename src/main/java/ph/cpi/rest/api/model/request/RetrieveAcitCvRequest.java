package ph.cpi.rest.api.model.request;

import ph.cpi.rest.api.model.PaginationRequest;
import ph.cpi.rest.api.model.SortRequest;

public class RetrieveAcitCvRequest {
	private Integer tranId;
	private String  cvGenNo;
    private String  cvDateFrom;
    private String  cvDateTo;
    private String  cvStatusDesc;
    private String  payee;
    private String  particulars;
    private String  cvAmtFrom;
    private String  cvAmtTo;
    private String  tranStat;
    private String  cvStat;
	private PaginationRequest paginationRequest;
	private SortRequest sortRequest;
	
	public Integer getTranId() {
		return tranId;
	}
	public void setTranId(Integer tranId) {
		this.tranId = tranId;
	}
	public String getCvGenNo() {
		return cvGenNo;
	}
	public void setCvGenNo(String cvGenNo) {
		this.cvGenNo = cvGenNo;
	}
	public String getCvDateFrom() {
		return cvDateFrom;
	}
	public void setCvDateFrom(String cvDateFrom) {
		this.cvDateFrom = cvDateFrom;
	}
	public String getCvDateTo() {
		return cvDateTo;
	}
	public void setCvDateTo(String cvDateTo) {
		this.cvDateTo = cvDateTo;
	}
	public String getCvStatusDesc() {
		return cvStatusDesc;
	}
	public void setCvStatusDesc(String cvStatusDesc) {
		this.cvStatusDesc = cvStatusDesc;
	}
	public String getPayee() {
		return payee;
	}
	public void setPayee(String payee) {
		this.payee = payee;
	}
	public String getParticulars() {
		return particulars;
	}
	public void setParticulars(String particulars) {
		this.particulars = particulars;
	}
	public String getCvAmtFrom() {
		return cvAmtFrom;
	}
	public void setCvAmtFrom(String cvAmtFrom) {
		this.cvAmtFrom = cvAmtFrom;
	}
	public String getCvAmtTo() {
		return cvAmtTo;
	}
	public void setCvAmtTo(String cvAmtTo) {
		this.cvAmtTo = cvAmtTo;
	}
	public String getTranStat() {
		return tranStat;
	}
	public void setTranStat(String tranStat) {
		this.tranStat = tranStat;
	}
	public String getCvStat() {
		return cvStat;
	}
	public void setCvStat(String cvStat) {
		this.cvStat = cvStat;
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
		return "RetrieveAcitCvRequest [tranId=" + tranId + ", cvGenNo=" + cvGenNo + ", cvDateFrom=" + cvDateFrom
				+ ", cvDateTo=" + cvDateTo + ", cvStatusDesc=" + cvStatusDesc + ", payee=" + payee + ", particulars="
				+ particulars + ", cvAmtFrom=" + cvAmtFrom + ", cvAmtTo=" + cvAmtTo + ", tranStat=" + tranStat
				+ ", cvStat=" + cvStat + ", paginationRequest=" + paginationRequest + ", sortRequest=" + sortRequest
				+ "]";
	}
}
