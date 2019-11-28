package ph.cpi.rest.api.model.request;

import java.util.List;

public class PrintInvoiceBatchRequest {
	
	private List<PrintBatchInvoice> printInvoiceList;
	
	public List<PrintBatchInvoice> getPrintInvoiceList() {
		return printInvoiceList;
	}

	public void setPrintInvoiceList(List<PrintBatchInvoice> printInvoiceList) {
		this.printInvoiceList = printInvoiceList;
	}
	
	@Override
	public String toString() {
		return "PrintInvoiceBatchRequest [printInvoiceList=" + printInvoiceList
				+ "]";
	}
}

class PrintBatchInvoice{
	
	private String invoiceId;
	private String updateUser;
	private String updateDate;
	
	public String getInvoiceId() {
		return invoiceId;
	}
	public void setInvoiceId(String invoiceId) {
		this.invoiceId = invoiceId;
	}
	public String getUpdateUser() {
		return updateUser;
	}
	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}
	public String getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(String updateDate) {
		this.updateDate = updateDate;
	}
	
	@Override
	public String toString() {
		return "PrintBatchInvoice [invoiceId=" + invoiceId + ", updateUser="
				+ updateUser + ", updateDate=" + updateDate + "]";
	}
	
}
