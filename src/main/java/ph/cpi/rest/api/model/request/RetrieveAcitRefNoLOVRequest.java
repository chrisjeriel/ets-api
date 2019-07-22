package ph.cpi.rest.api.model.request;

import ph.cpi.rest.api.model.PaginationRequest;
import ph.cpi.rest.api.model.SortRequest;

public class RetrieveAcitRefNoLOVRequest {
	private String arTag;
	private String cvTag;
	private String jvTag;
	private String cmTag;
	private String dmTag;
	private String tranStat;
	private String arStatus;
	private String cvStatus;
	private String jvStatus;
	private String memoStatus;
	private PaginationRequest paginationRequest;
	private SortRequest sortRequest;
	public String getArTag() {
		return arTag;
	}
	public void setArTag(String arTag) {
		this.arTag = arTag;
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
	public String getCmTag() {
		return cmTag;
	}
	public void setCmTag(String cmTag) {
		this.cmTag = cmTag;
	}
	public String getDmTag() {
		return dmTag;
	}
	public void setDmTag(String dmTag) {
		this.dmTag = dmTag;
	}
	public String getTranStat() {
		return tranStat;
	}
	public void setTranStat(String tranStat) {
		this.tranStat = tranStat;
	}
	public String getArStatus() {
		return arStatus;
	}
	public void setArStatus(String arStatus) {
		this.arStatus = arStatus;
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
	public String getMemoStatus() {
		return memoStatus;
	}
	public void setMemoStatus(String memoStatus) {
		this.memoStatus = memoStatus;
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
		return "RetrieveAcitRefNoLOVRequest [arTag=" + arTag + ", cvTag=" + cvTag + ", jvTag=" + jvTag + ", cmTag="
				+ cmTag + ", dmTag=" + dmTag + ", tranStat=" + tranStat + ", arStatus=" + arStatus + ", cvStatus="
				+ cvStatus + ", jvStatus=" + jvStatus + ", memoStatus=" + memoStatus + ", paginationRequest="
				+ paginationRequest + ", sortRequest=" + sortRequest + "]";
	}
	
}
