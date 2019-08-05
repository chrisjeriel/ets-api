package ph.cpi.rest.api.model.response;

import java.util.List;

import ph.cpi.rest.api.model.PaginationResponse;
import ph.cpi.rest.api.model.SortResponse;
import ph.cpi.rest.api.model.maintenance.PrintableNames;

public class RetrieveMtnPrintableNamesResponse {
	private List<PrintableNames> printableNames;
	private PaginationResponse paginationResponse;
	private SortResponse sortResponse;
	public List<PrintableNames> getPrintableNames() {
		return printableNames;
	}
	public void setPrintableNames(List<PrintableNames> printableNames) {
		this.printableNames = printableNames;
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
		return "RetrieveMtnPrintableNamesResponse [printableNames=" + printableNames + ", paginationResponse="
				+ paginationResponse + ", sortResponse=" + sortResponse + "]";
	}
	
}
