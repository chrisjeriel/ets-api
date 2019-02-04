package ph.cpi.rest.api.model;

public class QuotationSample {

	private Integer quoteId; 
	private String quotationNo;
	private AlopSample alopSample;
	
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
		return alopSample;
	}
	public void setAlop(AlopSample alopSample) {
		this.alopSample = alopSample;
	}
	@Override
	public String toString() {
		return "Quotation [quoteId=" + quoteId + ", quotationNo=" + quotationNo + ", alop=" + alopSample + "]";
	}
	
}
