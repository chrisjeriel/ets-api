package ph.cpi.rest.api.model.request;

import ph.cpi.rest.api.model.PaginationRequest;
import ph.cpi.rest.api.model.SortRequest;

public class RetMtnPolWordingsRequest {
    private String lineCd;
    private String wordingCd;
    private String wordType;
    private String activeTag;
    private String defaultTag;
    private String ocTag;
	private PaginationRequest paginationRequest;
	private SortRequest sortRequest;
	
	public String getLineCd() {
		return lineCd;
	}
	public void setLineCd(String lineCd) {
		this.lineCd = lineCd;
	}
	public String getWordingCd() {
		return wordingCd;
	}
	public void setWordingCd(String wordingCd) {
		this.wordingCd = wordingCd;
	}
	public String getWordType() {
		return wordType;
	}
	public void setWordType(String wordType) {
		this.wordType = wordType;
	}
	public String getActiveTag() {
		return activeTag;
	}
	public void setActiveTag(String activeTag) {
		this.activeTag = activeTag;
	}
	public String getDefaultTag() {
		return defaultTag;
	}
	public void setDefaultTag(String defaultTag) {
		this.defaultTag = defaultTag;
	}
	public String getOcTag() {
		return ocTag;
	}
	public void setOcTag(String ocTag) {
		this.ocTag = ocTag;
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
		return "RetMtnPolWordingsRequest [lineCd=" + lineCd + ", wordingCd=" + wordingCd + ", wordType=" + wordType
				+ ", activeTag=" + activeTag + ", defaultTag=" + defaultTag + ", ocTag=" + ocTag
				+ ", paginationRequest=" + paginationRequest + ", sortRequest=" + sortRequest + "]";
	}
}
