package ph.cpi.rest.api.model.request;

import ph.cpi.rest.api.model.PaginationRequest;
import ph.cpi.rest.api.model.SortRequest;

public class RetrieveAcseRefNoLOVRequest {

	private String orTag;
	private String cvTag;
	private String jvTag;
	private String groupTag;
	private String tranStat;
	private String orStatus;
	private String cvStatus;
	private String jvStatus;
	private PaginationRequest paginationRequest;
	private SortRequest sortRequest;
	
	public String getOrTag() {
		return orTag;
	}
	public void setOrTag(String orTag) {
		this.orTag = orTag;
	}
	public String getCvTag() {
		return cvTag;
	}
	public void setCvTag(String cvTag) {
		this.cvTag = cvTag;
	}
	public String getJvTag() {
		return jvTag;
	}
	public void setJvTag(String jvTag) {
		this.jvTag = jvTag;
	}
	public String getGroupTag() {
		return groupTag;
	}
	public void setGroupTag(String groupTag) {
		this.groupTag = groupTag;
	}
	public String getTranStat() {
		return tranStat;
	}
	public void setTranStat(String tranStat) {
		this.tranStat = tranStat;
	}
	public String getOrStatus() {
		return orStatus;
	}
	public void setOrStatus(String orStatus) {
		this.orStatus = orStatus;
	}
	public String getCvStatus() {
		return cvStatus;
	}
	public void setCvStatus(String cvStatus) {
		this.cvStatus = cvStatus;
	}
	public String getJvStatus() {
		return jvStatus;
	}
	public void setJvStatus(String jvStatus) {
		this.jvStatus = jvStatus;
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
		return "RetrieveAcseRefNoLOVRequest [orTag=" + orTag + ", cvTag=" + cvTag + ", jvTag=" + jvTag + ", groupTag="
				+ groupTag + ", tranStat=" + tranStat + ", orStatus=" + orStatus + ", cvStatus=" + cvStatus
				+ ", jvStatus=" + jvStatus + ", paginationRequest=" + paginationRequest + ", sortRequest=" + sortRequest
				+ "]";
	}
}
