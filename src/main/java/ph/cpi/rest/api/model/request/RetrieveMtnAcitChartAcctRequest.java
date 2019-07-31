package ph.cpi.rest.api.model.request;


import ph.cpi.rest.api.model.PaginationRequest;
import ph.cpi.rest.api.model.SortRequest;

public class RetrieveMtnAcitChartAcctRequest {
	private String glAcctId;
	private String glAcctCategory;
	private String glAcctControl;
	private String glAcctSub1;
	private String glAcctSub2;
	private String glAcctSub3;
	private String slTypeCd;
	private String drCrTag;
	private String postTag;
	private String activeTag;
	private PaginationRequest paginationRequest;
	private SortRequest sortRequest;
	public String getGlAcctId() {
		return glAcctId;
	}
	public void setGlAcctId(String glAcctId) {
		this.glAcctId = glAcctId;
	}
	public String getGlAcctCategory() {
		return glAcctCategory;
	}
	public void setGlAcctCategory(String glAcctCategory) {
		this.glAcctCategory = glAcctCategory;
	}
	public String getGlAcctControl() {
		return glAcctControl;
	}
	public void setGlAcctControl(String glAcctControl) {
		this.glAcctControl = glAcctControl;
	}
	public String getGlAcctSub1() {
		return glAcctSub1;
	}
	public void setGlAcctSub1(String glAcctSub1) {
		this.glAcctSub1 = glAcctSub1;
	}
	public String getGlAcctSub2() {
		return glAcctSub2;
	}
	public void setGlAcctSub2(String glAcctSub2) {
		this.glAcctSub2 = glAcctSub2;
	}
	public String getGlAcctSub3() {
		return glAcctSub3;
	}
	public void setGlAcctSub3(String glAcctSub3) {
		this.glAcctSub3 = glAcctSub3;
	}
	public String getSlTypeCd() {
		return slTypeCd;
	}
	public void setSlTypeCd(String slTypeCd) {
		this.slTypeCd = slTypeCd;
	}
	public String getDrCrTag() {
		return drCrTag;
	}
	public void setDrCrTag(String drCrTag) {
		this.drCrTag = drCrTag;
	}
	public String getPostTag() {
		return postTag;
	}
	public void setPostTag(String postTag) {
		this.postTag = postTag;
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
		return "RetrieveMtnAcitChartAcctResponse [glAcctId=" + glAcctId + ", glAcctCategory=" + glAcctCategory
				+ ", glAcctControl=" + glAcctControl + ", glAcctSub1=" + glAcctSub1 + ", glAcctSub2=" + glAcctSub2
				+ ", glAcctSub3=" + glAcctSub3 + ", slTypeCd=" + slTypeCd + ", drCrTag=" + drCrTag + ", postTag="
				+ postTag + ", activeTag=" + activeTag + ", paginationRequest=" + paginationRequest + ", sortRequest="
				+ sortRequest + "]";
	}
	
}
