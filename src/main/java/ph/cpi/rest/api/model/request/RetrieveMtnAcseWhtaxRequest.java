package ph.cpi.rest.api.model.request;
import ph.cpi.rest.api.model.PaginationRequest;
import ph.cpi.rest.api.model.SortRequest;

public class RetrieveMtnAcseWhtaxRequest {
	private Integer whtaxId;
	private String taxCd;
	private String taxType;
	private String creditableTag;
	private String fixedTag;
	private String activeTag;
	private PaginationRequest paginationRequest = new PaginationRequest();
	private SortRequest sortRequest = new SortRequest();
	
	
	public Integer getWhtaxId() {
		return whtaxId;
	}
	public void setWhtaxId(Integer whtaxId) {
		this.whtaxId = whtaxId;
	}
	public String getTaxCd() {
		return taxCd;
	}
	public void setTaxCd(String taxCd) {
		this.taxCd = taxCd;
	}
	public String getTaxType() {
		return taxType;
	}
	public void setTaxType(String taxType) {
		this.taxType = taxType;
	}
	public String getCreditableTag() {
		return creditableTag;
	}
	public void setCreditableTag(String creditableTag) {
		this.creditableTag = creditableTag;
	}
	public String getFixedTag() {
		return fixedTag;
	}
	public void setFixedTag(String fixedTag) {
		this.fixedTag = fixedTag;
	}
	public String getActiveTag() {
		return activeTag;
	}
	public void setActiveTag(String activeTag) {
		this.activeTag = activeTag;
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
		return "RetrieveMtnAcseWhtaxRequest [whtaxId=" + whtaxId + ", taxCd=" + taxCd + ", taxType=" + taxType
				+ ", creditableTag=" + creditableTag + ", fixedTag=" + fixedTag + ", activeTag=" + activeTag
				+ ", paginationRequest=" + paginationRequest + ", sortRequest=" + sortRequest + "]";
	}
	
}
