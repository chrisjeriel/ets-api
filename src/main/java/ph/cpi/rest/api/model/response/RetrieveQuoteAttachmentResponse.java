package ph.cpi.rest.api.model.response;


import ph.cpi.rest.api.model.PaginationResponse;
import ph.cpi.rest.api.model.Quotation;
import ph.cpi.rest.api.model.SortResponse;
import ph.cpi.rest.api.model.quote.Attachment;

public class RetrieveQuoteAttachmentResponse {
	
	private Quotation quotation;
	private Attachment attachment;
	private PaginationResponse paginationResponse;
	private SortResponse sortResponse;
	
	public Quotation getQuotation() {
		if (quotation == null) {
			quotation = new Quotation();
		}
		return quotation;
	}
	public void setQuotation(Quotation quotation) {
		this.quotation = quotation;
	}
	public Attachment getAttachment() {
		if (attachment == null) {
			attachment = new Attachment();
		}
		return attachment;
	}
	public void setAttachment(Attachment attachment) {
		this.attachment = attachment;
	}
	public PaginationResponse getPaginationResponse() {
		return paginationResponse;
	}
	public void setPaginationResponse(PaginationResponse paginationResponse) {
		this.paginationResponse = paginationResponse;
	}
	public SortResponse getSortResponse() {
		return sortResponse;
	}
	public void setSortResponse(SortResponse sortResponse) {
		this.sortResponse = sortResponse;
	}
	
	@Override
	public String toString() {
		return "RetrieveQuoteAttachmentResponse [quotation=" + quotation + ", attachment=" + attachment
				+ ", paginationResponse=" + paginationResponse + ", sortResponse=" + sortResponse + "]";
	}
	
	
}
