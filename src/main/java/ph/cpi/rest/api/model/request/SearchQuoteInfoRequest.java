package ph.cpi.rest.api.model.request;

public class SearchQuoteInfoRequest {
	private String lineCd;
	private Integer quoteYear;
	private Integer quoteSeqNo;
	private Integer quoteRevNo;
	private String quoteCedingId;
	public String getLineCd() {
		return lineCd;
	}
	public void setLineCd(String lineCd) {
		this.lineCd = lineCd;
	}
	public Integer getQuoteYear() {
		return quoteYear;
	}
	public void setQuoteYear(Integer quoteYear) {
		this.quoteYear = quoteYear;
	}
	public Integer getQuoteSeqNo() {
		return quoteSeqNo;
	}
	public void setQuoteSeqNo(Integer quoteSeqNo) {
		this.quoteSeqNo = quoteSeqNo;
	}
	public Integer getQuoteRevNo() {
		return quoteRevNo;
	}
	public void setQuoteRevNo(Integer quoteRevNo) {
		this.quoteRevNo = quoteRevNo;
	}
	public String getQuoteCedingId() {
		return quoteCedingId;
	}
	public void setQuoteCedingId(String quoteCedingId) {
		this.quoteCedingId = quoteCedingId;
	}
	@Override
	public String toString() {
		return "SearchQuoteInfoRequest [lineCd=" + lineCd + ", quoteYear=" + quoteYear + ", quoteSeqNo=" + quoteSeqNo
				+ ", quoteRevNo=" + quoteRevNo + ", quoteCedingId=" + quoteCedingId + "]";
	}
	
}
