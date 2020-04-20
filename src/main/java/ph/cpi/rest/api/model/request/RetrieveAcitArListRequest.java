package ph.cpi.rest.api.model.request;

import ph.cpi.rest.api.model.PaginationRequest;
import ph.cpi.rest.api.model.SortRequest;

public class RetrieveAcitArListRequest {
	private String arNo;
	private String payor;
	private String arDateFrom;
	private String arDateTo;
	private String tranTypeName;
	private String arStatus;
	private String particulars;
	private String arAmtFrom;
	private String arAmtTo;
	private String tranStat;
	private String arStat;
	private PaginationRequest paginationRequest = new PaginationRequest();
	private SortRequest sortRequest = new SortRequest();
	
	public String getArNo() {
		return arNo;
	}
	public void setArNo(String arNo) {
		this.arNo = arNo;
	}
	public String getPayor() {
		return payor;
	}
	public void setPayor(String payor) {
		this.payor = payor;
	}
	public String getArDateFrom() {
		return arDateFrom;
	}
	public void setArDateFrom(String arDateFrom) {
		this.arDateFrom = arDateFrom;
	}
	public String getArDateTo() {
		return arDateTo;
	}
	public void setArDateTo(String arDateTo) {
		this.arDateTo = arDateTo;
	}
	public String getTranTypeName() {
		return tranTypeName;
	}
	public void setTranTypeName(String tranTypeName) {
		this.tranTypeName = tranTypeName;
	}
	public String getArStatus() {
		return arStatus;
	}
	public void setArStatus(String arStatus) {
		this.arStatus = arStatus;
	}
	public String getParticulars() {
		return particulars;
	}
	public void setParticulars(String particulars) {
		this.particulars = particulars;
	}
	public String getArAmtFrom() {
		return arAmtFrom;
	}
	public void setArAmtFrom(String arAmtFrom) {
		this.arAmtFrom = arAmtFrom;
	}
	public String getArAmtTo() {
		return arAmtTo;
	}
	public void setArAmtTo(String arAmtTo) {
		this.arAmtTo = arAmtTo;
	}
	public String getTranStat() {
		return tranStat;
	}
	public void setTranStat(String tranStat) {
		this.tranStat = tranStat;
	}
	public String getArStat() {
		return arStat;
	}
	public void setArStat(String arStat) {
		this.arStat = arStat;
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
		return "RetrieveAcitArListRequest [arNo=" + arNo + ", payor=" + payor + ", arDateFrom=" + arDateFrom
				+ ", arDateTo=" + arDateTo + ", tranTypeName=" + tranTypeName + ", arStatus=" + arStatus
				+ ", particulars=" + particulars + ", arAmtFrom=" + arAmtFrom + ", arAmtTo=" + arAmtTo + ", tranStat="
				+ tranStat + ", arStat=" + arStat + ", paginationRequest=" + paginationRequest + ", sortRequest="
				+ sortRequest + "]";
	}
}
