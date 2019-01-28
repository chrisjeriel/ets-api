package ph.cpi.rest.api.model.quote;

import java.util.List;

public class QuotationOc {
	private Integer quoteIdOc;
	private String openQuotationNo;
	private List<Attachment> attachment;
	private ProjectOc projectOc;
	
	public ProjectOc getProjectOc() {
		return projectOc;
	}
	public void setProjectOc(ProjectOc projectOc) {
		this.projectOc = projectOc;
	}
	public Integer getQuoteIdOc() {
		return quoteIdOc;
	}
	public void setQuoteIdOc(Integer quoteIdOc) {
		this.quoteIdOc = quoteIdOc;
	}
	public String getOpenQuotationNo() {
		return openQuotationNo;
	}
	public void setOpenQuotationNo(String openQuotationNo) {
		this.openQuotationNo = openQuotationNo;
	}
	public List<Attachment> getAttachment() {
		return attachment;
	}
	public void setAttachment(List<Attachment> list) {
		this.attachment = list;
	}
	@Override
	public String toString() {
		return "QuotationOc [quoteIdOc=" + quoteIdOc 
				+ ", openQuotationNo=" + openQuotationNo + ", attachment=" 
				+ attachment + ", projectOc="+ projectOc +"]";
	}
}
