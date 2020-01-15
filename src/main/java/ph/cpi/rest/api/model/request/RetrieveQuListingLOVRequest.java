package ph.cpi.rest.api.model.request;

public class RetrieveQuListingLOVRequest {
	private String mode;
	private String cedingName;
	private String insuredDesc;
	private String riskName;
	private String quotationNo;
	public String getMode() {
		return mode;
	}
	public void setMode(String mode) {
		this.mode = mode;
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
	public String getQuotationNo() {
		return quotationNo;
	}
	public void setQuotationNo(String quotationNo) {
		this.quotationNo = quotationNo;
	}
	@Override
	public String toString() {
		return "RetrieveQuListingLOVRequest [mode=" + mode + ", cedingName=" + cedingName + ", insuredDesc="
				+ insuredDesc + ", riskName=" + riskName + ", quotationNo=" + quotationNo + "]";
	}
	
	
}
