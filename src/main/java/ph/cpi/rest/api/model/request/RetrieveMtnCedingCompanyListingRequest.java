package ph.cpi.rest.api.model.request;

import org.joda.time.LocalDateTime;

import ph.cpi.rest.api.model.PaginationRequest;
import ph.cpi.rest.api.model.SortRequest;

public class RetrieveMtnCedingCompanyListingRequest {
	private Integer cedingId;
	private String cedingName;
	private String cedingAbbr;
	private String address;
	private LocalDateTime membershipDate;
	private LocalDateTime terminationDate;
	private LocalDateTime inactiveDate;
	private String activeTag;
	private String govtTag;
	private String membershipTag;
	private PaginationRequest paginationRequest;
	private SortRequest sortRequest;
	
	public Integer getCedingId() {
		return cedingId;
	}
	public void setCedingId(Integer cedingId) {
		this.cedingId = cedingId;
	}
	public String getCedingName() {
		return cedingName;
	}
	public void setCedingName(String cedingName) {
		this.cedingName = cedingName;
	}
	public String getCedingAbbr() {
		return cedingAbbr;
	}
	public void setCedingAbbr(String cedingAbbr) {
		this.cedingAbbr = cedingAbbr;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public LocalDateTime getMembershipDate() {
		return membershipDate;
	}
	public void setMembershipDate(LocalDateTime membershipDate) {
		this.membershipDate = membershipDate;
	}
	public LocalDateTime getTerminationDate() {
		return terminationDate;
	}
	public void setTerminationDate(LocalDateTime terminationDate) {
		this.terminationDate = terminationDate;
	}
	public LocalDateTime getInactiveDate() {
		return inactiveDate;
	}
	public void setInactiveDate(LocalDateTime inactiveDate) {
		this.inactiveDate = inactiveDate;
	}
	public String getActiveTag() {
		return activeTag;
	}
	public void setActiveTag(String activeTag) {
		this.activeTag = activeTag;
	}
	public String getGovtTag() {
		return govtTag;
	}
	public void setGovtTag(String govtTag) {
		this.govtTag = govtTag;
	}
	public String getMembershipTag() {
		return membershipTag;
	}
	public void setMembershipTag(String membershipTag) {
		this.membershipTag = membershipTag;
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
		return "RetrieveMtnCedingCompanyListingRequest [cedingId=" + cedingId + ", cedingName=" + cedingName
				+ ", cedingAbbr=" + cedingAbbr + ", address=" + address + ", membershipDate=" + membershipDate
				+ ", terminationDate=" + terminationDate + ", inactiveDate=" + inactiveDate + ", activeTag=" + activeTag
				+ ", govtTag=" + govtTag + ", membershipTag=" + membershipTag + ", paginationRequest="
				+ paginationRequest + ", sortRequest=" + sortRequest + "]";
	}
	
	
	
	
}
