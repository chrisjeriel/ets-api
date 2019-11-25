package ph.cpi.rest.api.model.request;

import ph.cpi.rest.api.model.PaginationRequest;
import ph.cpi.rest.api.model.SortRequest;

public class RetrieveBankLovRequest {
	private String bankCd;
	private String officialName;
	private String activeTag;
	private String dcbTag;
	private String glDepFor;
	private PaginationRequest paginationRequest = new PaginationRequest();
	private SortRequest sortRequest = new SortRequest();
	public String getBankCd() {
		return bankCd;
	}
	public void setBankCd(String bankCd) {
		this.bankCd = bankCd;
	}
	public String getOfficialName() {
		return officialName;
	}
	public void setOfficialName(String officialName) {
		this.officialName = officialName;
	}
	public String getActiveTag() {
		return activeTag;
	}
	public void setActiveTag(String activeTag) {
		this.activeTag = activeTag;
	}
	public String getDcbTag() {
		return dcbTag;
	}
	public void setDcbTag(String dcbTag) {
		this.dcbTag = dcbTag;
	}
	public String getGlDepFor() {
		return glDepFor;
	}
	public void setGlDepFor(String glDepFor) {
		this.glDepFor = glDepFor;
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
		return "RetrieveBankLovRequest [bankCd=" + bankCd + ", officialName=" + officialName + ", activeTag="
				+ activeTag + ", dcbTag=" + dcbTag + ", glDepFor=" + glDepFor + ", paginationRequest="
				+ paginationRequest + ", sortRequest=" + sortRequest + "]";
	}
}
