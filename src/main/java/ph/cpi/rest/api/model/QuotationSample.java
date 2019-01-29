package ph.cpi.rest.api.model;

import ph.cpi.rest.api.model.quote.AlopItem;
import ph.cpi.rest.api.model.quote.Attachment;

public class QuotationSample {

	private Integer quoteId; 
	private String quotationNo;
	private AlopSample alop;
	private Attachment attachment;
	private AlopItem alopItem;
	
	public Integer getQuoteId() {
		return quoteId;
	}
	public void setQuoteId(Integer quoteId) {
		this.quoteId = quoteId;
	}
	public String getQuotationNo() {
		return quotationNo;
	}
	public void setQuotationNo(String quotationNo) {
		this.quotationNo = quotationNo;
	}
	public AlopSample getAlop() {
		return alop;
	}
	public void setAlop(AlopSample alop) {
		this.alop = alop;
	}
	public Attachment getAttachment() {
		return attachment;
	}
	public void setAttachment(Attachment attachment) {
		this.attachment = attachment;
	}
	
	
	public AlopItem getAlopItem() {
		return alopItem;
	}
	public void setAlopItem(AlopItem alopItem) {
		this.alopItem = alopItem;
	}
	@Override
	public String toString() {
		return "Quotation [quoteId=" + quoteId + ", quotationNo=" + quotationNo + ", alop=" + alop + ", attachment="
				+ attachment + ", alopItem=" + alopItem + "]";
	}
	
}
