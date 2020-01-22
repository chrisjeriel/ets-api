package ph.cpi.rest.api.model.quote;

public class QuoteLOV {
	private String quoteId;
	private String quotationNo;
	private String cedingName;
	private String insuredDesc;
	private String riskName;
	public String getQuoteId() {
		return quoteId;
	}
	public void setQuoteId(String quoteId) {
		this.quoteId = quoteId;
	}
	public String getQuotationNo() {
		return quotationNo;
	}
	public void setQuotationNo(String quotationNo) {
		this.quotationNo = quotationNo;
	}
	public String getCedingName() {
		return cedingName;
	}
	public void setCedingName(String cedingName) {
		this.cedingName = cedingName;
	}
	public String getInsuredDesc() {
		return insuredDesc;
	}
	public void setInsuredDesc(String insuredDesc) {
		this.insuredDesc = insuredDesc;
	}
	public String getRiskName() {
		return riskName;
	}
	public void setRiskName(String riskName) {
		this.riskName = riskName;
	}
	@Override
	public String toString() {
		return "QuooteLOV [quoteId=" + quoteId + ", quotationNo=" + quotationNo + ", cedingName=" + cedingName
				+ ", insuredDesc=" + insuredDesc + ", riskName=" + riskName + "]";
	}
	
}
