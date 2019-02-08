package ph.cpi.rest.api.model.response;
import ph.cpi.rest.api.model.PaginationResponse;
import ph.cpi.rest.api.model.SortResponse;
import ph.cpi.rest.api.model.maintenance.Intermediary;
import ph.cpi.rest.api.model.quote.Project;
import ph.cpi.rest.api.model.quote.QuotationGeneralInfo;

public class RetrieveQuoteGeneralInfoResponse {

	private QuotationGeneralInfo quotationGeneralInfo;
	private Project project;
	private PaginationResponse paginationResponse;
	private SortResponse sortResponse;
	
	public QuotationGeneralInfo getQuotationGeneralInfo() {
		return quotationGeneralInfo;
	}
	public void setQuotationGeneralInfo(QuotationGeneralInfo quotationGeneralInfo) {
		this.quotationGeneralInfo = quotationGeneralInfo;
	}
	public Project getProject() {
		return project;
	}
	public void setProject(Project project) {
		this.project = project;
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
		return "RetrieveQuoteGeneralInfoResponse [quotationGeneralInfo=" + quotationGeneralInfo + ", project=" + project
				+ ", paginationResponse=" + paginationResponse + ", sortResponse=" + sortResponse + "]";
	}
	

}
