package ph.cpi.rest.api.model.request;

import ph.cpi.rest.api.model.PaginationRequest;
import ph.cpi.rest.api.model.SortRequest;

public class RetrieveMtnAcseDefAcctEntRequest {
	private String tranClass;
	private Integer tranTypeCd;
	private Integer entryNo;
	private PaginationRequest paginationRequest = new PaginationRequest();
	private SortRequest sortRequest = new SortRequest();
	public String getTranClass() {
		return tranClass;
	}
	public void setTranClass(String tranClass) {
		this.tranClass = tranClass;
	}
	public Integer getTranTypeCd() {
		return tranTypeCd;
	}
	public void setTranTypeCd(Integer tranTypeCd) {
		this.tranTypeCd = tranTypeCd;
	}
	public Integer getEntryNo() {
		return entryNo;
	}
	public void setEntryNo(Integer entryNo) {
		this.entryNo = entryNo;
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
		return "RetrieveMtnAcseDefAcctEntRequest [tranClass=" + tranClass + ", tranTypeCd=" + tranTypeCd + ", entryNo="
				+ entryNo + ", paginationRequest=" + paginationRequest + ", sortRequest=" + sortRequest + "]";
	}
	
}
