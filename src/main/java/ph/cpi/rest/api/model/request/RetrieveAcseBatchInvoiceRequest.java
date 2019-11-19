package ph.cpi.rest.api.model.request;

public class RetrieveAcseBatchInvoiceRequest {
	
	private String tranDateFrom;
	private String tranDateTo;
	private String tranNo;
	private String tranTypeCd;
	private String tranClass;
	private String invoiceId;
	
	public String getInvoiceId() {
		return invoiceId;
	}
	public void setInvoiceId(String invoiceId) {
		this.invoiceId = invoiceId;
	}
	public String getTranDateFrom() {
		return tranDateFrom;
	}
	public void setTranDateFrom(String tranDateFrom) {
		this.tranDateFrom = tranDateFrom;
	}
	public String getTranDateTo() {
		return tranDateTo;
	}
	public void setTranDateTo(String tranDateTo) {
		this.tranDateTo = tranDateTo;
	}
	public String getTranNo() {
		return tranNo;
	}
	public void setTranNo(String tranNo) {
		this.tranNo = tranNo;
	}
	public String getTranTypeCd() {
		return tranTypeCd;
	}
	public void setTranTypeCd(String tranTypeCd) {
		this.tranTypeCd = tranTypeCd;
	}
	public String getTranClass() {
		return tranClass;
	}
	public void setTranClass(String tranClass) {
		this.tranClass = tranClass;
	}
	
	@Override
	public String toString() {
		return "RetrieveAcseBatchInvoiceRequest [tranDateFrom=" + tranDateFrom
				+ ", tranDateTo=" + tranDateTo + ", tranNo=" + tranNo
				+ ", tranTypeCd=" + tranTypeCd + ", tranClass=" + tranClass
				+ ", invoiceId=" + invoiceId + "]";
	}
	
}
