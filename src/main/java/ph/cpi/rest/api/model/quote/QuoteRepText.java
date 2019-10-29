package ph.cpi.rest.api.model.quote;

public class QuoteRepText {
	private String quoteId;
	private String reportId;
	private String repText01;
	private String repText02;
	private String repText03;
	private String repText04;
	private String repText05;
	public String getQuoteId() {
		return quoteId;
	}
	public void setQuoteId(String quoteId) {
		this.quoteId = quoteId;
	}
	public String getReportId() {
		return reportId;
	}
	public void setReportId(String reportId) {
		this.reportId = reportId;
	}
	public String getRepText01() {
		return repText01;
	}
	public void setRepText01(String repText01) {
		this.repText01 = repText01;
	}
	public String getRepText02() {
		return repText02;
	}
	public void setRepText02(String repText02) {
		this.repText02 = repText02;
	}
	public String getRepText03() {
		return repText03;
	}
	public void setRepText03(String repText03) {
		this.repText03 = repText03;
	}
	public String getRepText04() {
		return repText04;
	}
	public void setRepText04(String repText04) {
		this.repText04 = repText04;
	}
	public String getRepText05() {
		return repText05;
	}
	public void setRepText05(String repText05) {
		this.repText05 = repText05;
	}
	@Override
	public String toString() {
		return "QuoteRepText [quoteId=" + quoteId + ", reportId=" + reportId + ", repText01=" + repText01
				+ ", repText02=" + repText02 + ", repText03=" + repText03 + ", repText04=" + repText04 + ", repText05="
				+ repText05 + "]";
	}
	
	
	
}
