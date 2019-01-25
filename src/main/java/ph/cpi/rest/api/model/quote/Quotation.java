package ph.cpi.rest.api.model.quote;

public class Quotation {
	private Integer quoteId;
	private String quotationNo;
	private Competition competition;
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
	public Competition getCompetition() {
		return competition;
	}
	public void setCompetition(Competition competition) {
		this.competition = competition;
	}
	@Override
	public String toString() {
		return "Quotation [quoteId=" + quoteId + ", quotationNo=" + quotationNo + ", competition="
				+ competition + "]";
	}
}
