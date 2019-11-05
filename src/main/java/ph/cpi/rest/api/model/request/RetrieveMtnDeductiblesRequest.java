package ph.cpi.rest.api.model.request;

import ph.cpi.rest.api.model.PaginationRequest;
import ph.cpi.rest.api.model.SortRequest;

public class RetrieveMtnDeductiblesRequest {
	
	private String lineCd ;
	private String deductibleCd;
	private String coverCd;
	private String endtCd;
	private String activeTag;
	private String defaultTag;
	
	private String deductibleTitle;
	private String deductibleType;
	private String rateFrom;
	private String rateTo;
	private String amtFrom;
	private String amtTo;
	private String deductibleText;
	
	private PaginationRequest paginationRequest;
	private SortRequest sortRequest;
	public String getLineCd() {
		return lineCd;
	}
	public void setLineCd(String lineCd) {
		this.lineCd = lineCd;
	}
	public String getDeductibleCd() {
		return deductibleCd;
	}
	public void setDeductibleCd(String deductibleCd) {
		this.deductibleCd = deductibleCd;
	}
	public String getCoverCd() {
		return coverCd;
	}
	public void setCoverCd(String coverCd) {
		this.coverCd = coverCd;
	}
	public String getEndtCd() {
		return endtCd;
	}
	public void setEndtCd(String endtCd) {
		this.endtCd = endtCd;
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
	public String getDeductibleTitle() {
		return deductibleTitle;
	}
	public void setDeductibleTitle(String deductibleTitle) {
		this.deductibleTitle = deductibleTitle;
	}
	public String getDeductibleType() {
		return deductibleType;
	}
	public void setDeductibleType(String deductibleType) {
		this.deductibleType = deductibleType;
	}
	public String getRateFrom() {
		return rateFrom;
	}
	public void setRateFrom(String rateFrom) {
		this.rateFrom = rateFrom;
	}
	public String getRateTo() {
		return rateTo;
	}
	public void setRateTo(String rateTo) {
		this.rateTo = rateTo;
	}
	public String getAmtFrom() {
		return amtFrom;
	}
	public void setAmtFrom(String amtFrom) {
		this.amtFrom = amtFrom;
	}
	public String getAmtTo() {
		return amtTo;
	}
	public void setAmtTo(String amtTo) {
		this.amtTo = amtTo;
	}
	public String getDeductibleText() {
		return deductibleText;
	}
	public void setDeductibleText(String deductibleText) {
		this.deductibleText = deductibleText;
	}
	@Override
	public String toString() {
		return "RetrieveMtnDeductiblesRequest [lineCd=" + lineCd + ", deductibleCd=" + deductibleCd + ", coverCd="
				+ coverCd + ", endtCd=" + endtCd + ", activeTag=" + activeTag + ", defaultTag=" + defaultTag
				+ ", deductibleTitle=" + deductibleTitle + ", deductibleType=" + deductibleType + ", rateFrom="
				+ rateFrom + ", rateTo=" + rateTo + ", amtFrom=" + amtFrom + ", amtTo=" + amtTo + ", deductibleText="
				+ deductibleText + ", paginationRequest=" + paginationRequest + ", sortRequest=" + sortRequest + "]";
	}
}
