package ph.cpi.rest.api.model.response;

import ph.cpi.rest.api.model.PaginationResponse;
import ph.cpi.rest.api.model.SortResponse;
import ph.cpi.rest.api.model.quote.ProjectOc;
import ph.cpi.rest.api.model.quote.QuotationGeneralInfoOc;

public class RetrieveQuoteGeneralInfoOcResponse {
	private QuotationGeneralInfoOc quotationOc;
	private ProjectOc projectOc;
	private PaginationResponse paginationResponse;
	private SortResponse sortResponse;
	
	public QuotationGeneralInfoOc getQuotationOc() {
		return quotationOc;
	}
	public void setQuotationOc(QuotationGeneralInfoOc quotationOc) {
		this.quotationOc = quotationOc;
	}
	public ProjectOc getProjectOc() {
		return projectOc;
	}
	public void setProjectOc(ProjectOc projectOc) {
		this.projectOc = projectOc;
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
		return "RetrieveQuoteGeneralInfoOcResponse [quotationOc=" + quotationOc + ", projectOc=" + projectOc
				+ ", paginationResponse=" + paginationResponse + ", sortResponse=" + sortResponse + "]";
	}
}
