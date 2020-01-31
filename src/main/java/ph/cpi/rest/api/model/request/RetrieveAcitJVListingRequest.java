package ph.cpi.rest.api.model.request;

import java.math.BigDecimal;

import ph.cpi.rest.api.model.PaginationRequest;
import ph.cpi.rest.api.model.SortRequest;

public class RetrieveAcitJVListingRequest {
	private Integer tranId;
	private String jvNo;
	private String jvDateFrom;
	private String jvDateTo;
	private String particulars;
	private String tranTypeName;
	private String refNo;
	private String preparedBy;
	private BigDecimal jvAmtFrom;
	private BigDecimal jvAmtTo;
	private String tranStat;
	private String jvStat;
	private PaginationRequest paginationRequest;
	private SortRequest sortRequest;
	public Integer getTranId() {
		return tranId;
	}
	public void setTranId(Integer tranId) {
		this.tranId = tranId;
	}
	public String getJvNo() {
		return jvNo;
	}
	public void setJvNo(String jvNo) {
		this.jvNo = jvNo;
	}
	public String getJvDateFrom() {
		return jvDateFrom;
	}
	public void setJvDateFrom(String jvDateFrom) {
		this.jvDateFrom = jvDateFrom;
	}
	public String getJvDateTo() {
		return jvDateTo;
	}
	public void setJvDateTo(String jvDateTo) {
		this.jvDateTo = jvDateTo;
	}
	public String getParticulars() {
		return particulars;
	}
	public void setParticulars(String particulars) {
		this.particulars = particulars;
	}
	public String getTranTypeName() {
		return tranTypeName;
	}
	public void setTranTypeName(String tranTypeName) {
		this.tranTypeName = tranTypeName;
	}
	public String getRefNo() {
		return refNo;
	}
	public void setRefNo(String refNo) {
		this.refNo = refNo;
	}
	public String getPreparedBy() {
		return preparedBy;
	}
	public void setPreparedBy(String preparedBy) {
		this.preparedBy = preparedBy;
	}
	public BigDecimal getJvAmtFrom() {
		return jvAmtFrom;
	}
	public void setJvAmtFrom(BigDecimal jvAmtFrom) {
		this.jvAmtFrom = jvAmtFrom;
	}
	public BigDecimal getJvAmtTo() {
		return jvAmtTo;
	}
	public void setJvAmtTo(BigDecimal jvAmtTo) {
		this.jvAmtTo = jvAmtTo;
	}
	public String getTranStat() {
		return tranStat;
	}
	public void setTranStat(String tranStat) {
		this.tranStat = tranStat;
	}
	public String getJvStat() {
		return jvStat;
	}
	public void setJvStat(String jvStat) {
		this.jvStat = jvStat;
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
		return "RetrieveAcitJVListingRequest [tranId=" + tranId + ", jvNo=" + jvNo + ", jvDateFrom=" + jvDateFrom
				+ ", jvDateTo=" + jvDateTo + ", particulars=" + particulars + ", tranTypeName=" + tranTypeName
				+ ", refNo=" + refNo + ", preparedBy=" + preparedBy + ", jvAmtFrom=" + jvAmtFrom + ", jvAmtTo="
				+ jvAmtTo + ", tranStat=" + tranStat + ", jvStat=" + jvStat + ", paginationRequest=" + paginationRequest
				+ ", sortRequest=" + sortRequest + "]";
	}
}
