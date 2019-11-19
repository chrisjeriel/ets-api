package ph.cpi.rest.api.model.request;

import ph.cpi.rest.api.model.PaginationRequest;
import ph.cpi.rest.api.model.SortRequest;

public class RetrieveMtnAcitTranTypeLovRequest {

	private String searchStr;
	private String tranClass;
	private String tranTypeCd;
	private String typePrefix;
	private String autoTag;
	private String baeTag;
	private String activeTag;
	private PaginationRequest paginationRequest;
	private SortRequest sortRequest;
	
	public String getSearchStr() {
		return searchStr;
	}
	public void setSearchStr(String searchStr) {
		this.searchStr = searchStr;
	}
	public String getTranClass() {
		return tranClass;
	}
	public void setTranClass(String tranClass) {
		this.tranClass = tranClass;
	}
	public String getTranTypeCd() {
		return tranTypeCd;
	}
	public void setTranTypeCd(String tranTypeCd) {
		this.tranTypeCd = tranTypeCd;
	}
	public String getTypePrefix() {
		return typePrefix;
	}
	public void setTypePrefix(String typePrefix) {
		this.typePrefix = typePrefix;
	}
	public String getAutoTag() {
		return autoTag;
	}
	public void setAutoTag(String autoTag) {
		this.autoTag = autoTag;
	}
	public String getBaeTag() {
		return baeTag;
	}
	public void setBaeTag(String baeTag) {
		this.baeTag = baeTag;
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
		return "RetrieveMtnAcitTranTypeLovRequest [searchStr=" + searchStr + ", tranClass=" + tranClass
				+ ", tranTypeCd=" + tranTypeCd + ", typePrefix=" + typePrefix + ", autoTag=" + autoTag + ", baeTag="
				+ baeTag + ", activeTag=" + activeTag + ", paginationRequest=" + paginationRequest + ", sortRequest="
				+ sortRequest + "]";
	}
}
