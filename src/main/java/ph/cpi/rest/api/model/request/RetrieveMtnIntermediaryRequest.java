package ph.cpi.rest.api.model.request;

import ph.cpi.rest.api.model.PaginationRequest;
import ph.cpi.rest.api.model.SortRequest;

public class RetrieveMtnIntermediaryRequest {

	private Integer intmId;
	private String  intmName;
	private String  address;
	private String  contactNo;
	private String  activeTag;
	private String  corpTag;
	private String  vatTag;
	private String  oldIntmId;
	private PaginationRequest paginationRequest;
	private SortRequest sortRequest;
	public Integer getIntmId() {
		return intmId;
	}
	public void setIntmId(Integer intmId) {
		this.intmId = intmId;
	}
	public String getIntmName() {
		return intmName;
	}
	public void setIntmName(String intmName) {
		this.intmName = intmName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getContactNo() {
		return contactNo;
	}
	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}
	public String getActiveTag() {
		return activeTag;
	}
	public void setActiveTag(String activeTag) {
		this.activeTag = activeTag;
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
	public String getOldIntmId() {
		return oldIntmId;
	}
	public void setOldIntmId(String oldIntmId) {
		this.oldIntmId = oldIntmId;
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
		return "RetrieveMtnIntermediaryRequest [intmId=" + intmId + ", intmName=" + intmName + ", address=" + address
				+ ", contactNo=" + contactNo + ", activeTag=" + activeTag + ", corpTag=" + corpTag + ", vatTag="
				+ vatTag + ", oldIntmId=" + oldIntmId + ", paginationRequest=" + paginationRequest + ", sortRequest="
				+ sortRequest + "]";
	}

}
