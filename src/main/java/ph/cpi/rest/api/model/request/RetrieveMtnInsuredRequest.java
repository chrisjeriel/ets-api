package ph.cpi.rest.api.model.request;

import ph.cpi.rest.api.model.PaginationRequest;
import ph.cpi.rest.api.model.SortRequest;

public class RetrieveMtnInsuredRequest {
	
	private String insuredId;
	private String insuredName;
	private String insuredAbbr;
	private String activeTag;
	private String insuredType;
	private String corpTag;
	private String vatTag;
	private String address;
	private PaginationRequest paginationRequest;
	private SortRequest sortRequest;
	public String getInsuredId() {
		return insuredId;
	}
	public void setInsuredId(String insuredId) {
		this.insuredId = insuredId;
	}
	public String getInsuredName() {
		return insuredName;
	}
	public void setInsuredName(String insuredName) {
		this.insuredName = insuredName;
	}
	public String getInsuredAbbr() {
		return insuredAbbr;
	}
	public void setInsuredAbbr(String insuredAbbr) {
		this.insuredAbbr = insuredAbbr;
	}
	public String getActiveTag() {
		return activeTag;
	}
	public void setActiveTag(String activeTag) {
		this.activeTag = activeTag;
	}
	public String getInsuredType() {
		return insuredType;
	}
	public void setInsuredType(String insuredType) {
		this.insuredType = insuredType;
	}
	public String getCorpTag() {
		return corpTag;
	}
	public void setCorpTag(String corpTag) {
		this.corpTag = corpTag;
	}
	public String getVatTag() {
		return vatTag;
	}
	public void setVatTag(String vatTag) {
		this.vatTag = vatTag;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
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
		return "RetrieveMtnInsuredRequest [insuredId=" + insuredId + ", insuredName=" + insuredName + ", insuredAbbr="
				+ insuredAbbr + ", activeTag=" + activeTag + ", insuredType=" + insuredType + ", corpTag=" + corpTag
				+ ", vatTag=" + vatTag + ", address=" + address + ", paginationRequest=" + paginationRequest
				+ ", sortRequest=" + sortRequest + "]";
	}
	
}
