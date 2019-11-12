package ph.cpi.rest.api.model.request;

public class RetrieveAcseBatchInvoiceRequest {
	
	private String jvDateFrom;
	private String jvDateTo;
	private String jvNo;
	private String jvTypeCd;
	
	public String getJvDateFrom() {
		return jvDateFrom;
	}
	public void setJvDateFrom(String jvDateFrom) {
		this.jvDateFrom = jvDateFrom;
	}
	public String getJvDateTo() {
		return jvDateTo;
	}
	public void setJvDateTo(String jvDateTo) {
		this.jvDateTo = jvDateTo;
	}
	public String getJvNo() {
		return jvNo;
	}
	public void setJvNo(String jvNo) {
		this.jvNo = jvNo;
	}
	public String getJvTypeCd() {
		return jvTypeCd;
	}
	public void setJvTypeCd(String jvTypeCd) {
		this.jvTypeCd = jvTypeCd;
	}
	
	@Override
	public String toString() {
		return "RetrieveAcseBatchInvoiceRequest [jvDateFrom=" + jvDateFrom
				+ ", jvDateTo=" + jvDateTo + ", jvNo=" + jvNo + ", jvTypeCd="
				+ jvTypeCd + "]";
	}

}
