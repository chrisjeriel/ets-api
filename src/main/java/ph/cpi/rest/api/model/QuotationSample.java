package ph.cpi.rest.api.model;

public class QuotationSample {

	private Integer quoteId; 
	private String quotationNo;
	private Alop alop;
	
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
	public Alop getAlop() {
		return alop;
	}
	public void setAlop(Alop alop) {
		this.alop = alop;
	}
	@Override
	public String toString() {
		return "Quotation [quoteId=" + quoteId + ", quotationNo=" + quotationNo + ", alop=" + alop + "]";
	}
	
}
