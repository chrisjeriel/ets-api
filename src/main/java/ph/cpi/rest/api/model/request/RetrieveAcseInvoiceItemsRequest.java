package ph.cpi.rest.api.model.request;

public class RetrieveAcseInvoiceItemsRequest {
	
	private String invoiceId;

	public String getInvoiceId() {
		return invoiceId;
	}

	public void setInvoiceId(String invoiceId) {
		this.invoiceId = invoiceId;
	}
	
	@Override
	public String toString() {
		return "AcseInvoiceItemsRequest [invoiceId=" + invoiceId + "]";
	}
	
}
