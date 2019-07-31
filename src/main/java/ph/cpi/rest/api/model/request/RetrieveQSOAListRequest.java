package ph.cpi.rest.api.model.request;

import ph.cpi.rest.api.model.PaginationRequest;
import ph.cpi.rest.api.model.SortRequest;

public class RetrieveQSOAListRequest {
	
	private Integer qsoaId;
	private String cedingId;
	private Integer fromQtr;
	private Integer fromYear;
	private Integer toQtr;
	private Integer toYear;
	private PaginationRequest paginationRequest;
	private SortRequest sortRequest;
	
	public Integer getQsoaId() {
		return qsoaId;
	}
	public void setQsoaId(Integer qsoaId) {
		this.qsoaId = qsoaId;
	}
	public String getCedingId() {
		return cedingId;
	}
	public void setCedingId(String cedingId) {
		this.cedingId = cedingId;
	}
	public Integer getFromQtr() {
		return fromQtr;
	}
	public void setFromQtr(Integer fromQtr) {
		this.fromQtr = fromQtr;
	}
	public Integer getFromYear() {
		return fromYear;
	}
	public void setFromYear(Integer fromYear) {
		this.fromYear = fromYear;
	}
	public Integer getToQtr() {
		return toQtr;
	}
	public void setToQtr(Integer toQtr) {
		this.toQtr = toQtr;
	}
	public Integer getToYear() {
		return toYear;
	}
	public void setToYear(Integer toYear) {
		this.toYear = toYear;
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
		return "RetrieveQSOAListRequest [qsoaId=" + qsoaId + ", cedingId=" + cedingId + ", fromQtr=" + fromQtr
				+ ", fromYear=" + fromYear + ", toQtr=" + toQtr + ", toYear=" + toYear + ", paginationRequest="
				+ paginationRequest + ", sortRequest=" + sortRequest + "]";
	}
}
