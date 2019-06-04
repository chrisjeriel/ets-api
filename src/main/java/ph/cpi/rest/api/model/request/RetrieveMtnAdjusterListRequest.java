package ph.cpi.rest.api.model.request;

import ph.cpi.rest.api.model.PaginationRequest;
import ph.cpi.rest.api.model.SortRequest;

public class RetrieveMtnAdjusterListRequest {
	private String adjName;
	private String adjRefNo;
	private String fullAddress;
	private String zipCd;
	private String contactNo;
	private String emailAdd;
	private String createUser;
	private String createDateFrom;
	private String createDateTo;
	private String updateUser;
	private String updateDateFrom;
	private String updateDateTo;
	private PaginationRequest paginationRequest = new PaginationRequest();
	private SortRequest sortRequest = new SortRequest();
	
	public String getAdjName() {
		return adjName;
	}
	public void setAdjName(String adjName) {
		this.adjName = adjName;
	}
	public String getAdjRefNo() {
		return adjRefNo;
	}
	public void setAdjRefNo(String adjRefNo) {
		this.adjRefNo = adjRefNo;
	}
	public String getFullAddress() {
		return fullAddress;
	}
	public void setFullAddress(String fullAddress) {
		this.fullAddress = fullAddress;
	}
	public String getZipCd() {
		return zipCd;
	}
	public void setZipCd(String zipCd) {
		this.zipCd = zipCd;
	}
	public String getContactNo() {
		return contactNo;
	}
	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}
	public String getEmailAdd() {
		return emailAdd;
	}
	public void setEmailAdd(String emailAdd) {
		this.emailAdd = emailAdd;
	}
	public String getCreateUser() {
		return createUser;
	}
	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}
	public String getCreateDateFrom() {
		return createDateFrom;
	}
	public void setCreateDateFrom(String createDateFrom) {
		this.createDateFrom = createDateFrom;
	}
	public String getCreateDateTo() {
		return createDateTo;
	}
	public void setCreateDateTo(String createDateTo) {
		this.createDateTo = createDateTo;
	}
	public String getUpdateUser() {
		return updateUser;
	}
	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}
	public String getUpdateDateFrom() {
		return updateDateFrom;
	}
	public void setUpdateDateFrom(String updateDateFrom) {
		this.updateDateFrom = updateDateFrom;
	}
	public String getUpdateDateTo() {
		return updateDateTo;
	}
	public void setUpdateDateTo(String updateDateTo) {
		this.updateDateTo = updateDateTo;
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
		return "RetrieveMtnAdjusterListRequest [adjName=" + adjName + ", adjRefNo=" + adjRefNo + ", fullAddress="
				+ fullAddress + ", zipCd=" + zipCd + ", contactNo=" + contactNo + ", emailAdd=" + emailAdd
				+ ", createUser=" + createUser + ", createDateFrom=" + createDateFrom + ", createDateTo=" + createDateTo
				+ ", updateUser=" + updateUser + ", updateDateFrom=" + updateDateFrom + ", updateDateTo=" + updateDateTo
				+ ", paginationRequest=" + paginationRequest + ", sortRequest=" + sortRequest + "]";
	}
}
