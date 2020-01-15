package ph.cpi.rest.api.model.response;

import java.util.List;

import ph.cpi.rest.api.model.quote.QuoteLOV;

public class RetrieveQuListingLOVResponse {
	private List<QuoteLOV> quotationList;

	public List<QuoteLOV> getQuotationList() {
		return quotationList;
	}

	public void setQuotationList(List<QuoteLOV> quotationList) {
		this.quotationList = quotationList;
	}

	@Override
	public String toString() {
		return "RetrieveQuListingLOVResponse [quotationList=" + quotationList + "]";
	}
	
	
}
