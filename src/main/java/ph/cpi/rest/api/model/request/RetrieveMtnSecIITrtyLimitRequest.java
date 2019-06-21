package ph.cpi.rest.api.model.request;

import ph.cpi.rest.api.model.PaginationRequest;
import ph.cpi.rest.api.model.SortRequest;

public class RetrieveMtnSecIITrtyLimitRequest {

	private String lineCd;
	private String lineClassCd;
	private String currencyCd;
	private Integer seciiTrtyLimId;
	private PaginationRequest paginationRequest;
	private SortRequest sortRequest;
	
	public String getLineCd() {
		return lineCd;
	}
	public void setLineCd(String lineCd) {
		this.lineCd = lineCd;
	}
	public String getLineClassCd() {
		return lineClassCd;
	}
	public void setLineClassCd(String lineClassCd) {
		this.lineClassCd = lineClassCd;
	}
	public String getCurrencyCd() {
		return currencyCd;
	}
	public void setCurrencyCd(String currencyCd) {
		this.currencyCd = currencyCd;
	}
	public Integer getSeciiTrtyLimId() {
		return seciiTrtyLimId;
	}
	public void setSeciiTrtyLimId(Integer seciiTrtyLimId) {
		this.seciiTrtyLimId = seciiTrtyLimId;
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
		return "RetrieveMtnSecIITrtyLimitRequest [lineCd=" + lineCd + ", lineClassCd=" + lineClassCd + ", currencyCd="
				+ currencyCd + ", seciiTrtyLimId=" + seciiTrtyLimId + ", paginationRequest=" + paginationRequest
				+ ", sortRequest=" + sortRequest + "]";
	}
}
