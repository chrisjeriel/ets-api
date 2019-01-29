package ph.cpi.rest.api.model.response;


import java.util.List;

import ph.cpi.rest.api.model.PaginationResponse;
import ph.cpi.rest.api.model.SortResponse;
import ph.cpi.rest.api.model.quote.Attachment;
import ph.cpi.rest.api.model.quote.Quotation;

public class RetrieveQuoteAttachmentResponse {
	
	private List<Quotation> quotation;
	private Attachment attachment;
	private PaginationResponse paginationResponse;
	private SortResponse sortResponse;
	
	public List<Quotation> getQuotation() {
		return quotation;
	}
	public void setQuotation(List<Quotation> quotation) {
		this.quotation = quotation;
	}
	public Attachment getAttachment() {
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
