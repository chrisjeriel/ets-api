package ph.cpi.rest.api.model.response;

import java.util.List;

import ph.cpi.rest.api.model.PaginationResponse;
import ph.cpi.rest.api.model.SortResponse;
import ph.cpi.rest.api.model.maintenance.Currency;

public class RetrieveMtnCurrencyResponse {
	
	private List<Currency> currency;
	private PaginationResponse paginationResponse;
	private SortResponse sortResponse;
	
	public List<Currency> getCurrency() {
		return currency;
	}
	public void setCurrency(List<Currency> currency) {
		this.currency = currency;
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
		return "RetrieveMtnCurrencyResponse [currency=" + currency +", paginationResponse="
				+ paginationResponse + ", sortResponse=" + sortResponse + "]";
	}
	
}
