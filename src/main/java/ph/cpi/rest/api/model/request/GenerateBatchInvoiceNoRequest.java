package ph.cpi.rest.api.model.request;

import java.util.List;

public class GenerateBatchInvoiceNoRequest {
	private List<GenerateInvoiceNo> invoiceNoList;
	
	public List<GenerateInvoiceNo> getInvoiceNoList() {
		return invoiceNoList;
	}

	public void setInvoiceNoList(List<GenerateInvoiceNo> invoiceNoList) {
		this.invoiceNoList = invoiceNoList;
	}
	
	@Override
	public String toString() {
		return "GenerateBatchInvoiceNoRequest [invoiceNoList=" + invoiceNoList
				+ "]";
	}
}

class GenerateInvoiceNo {
	
	private String invoiceId;
	private String invoiceNo;
	private String updateUser;
	private String updateDate;
	
	public String getInvoiceId() {
		return invoiceId;
	}
	public void setInvoiceId(String invoiceId) {
		this.invoiceId = invoiceId;
	}
	public String getInvoiceNo() {
		return invoiceNo;
	}
	public void setInvoiceNo(String invoiceNo) {
		this.invoiceNo = invoiceNo;
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
		return "GenerateInvoiceNo [invoiceId=" + invoiceId + ", invoiceNo="
				+ invoiceNo + ", updateUser=" + updateUser + ", updateDate="
				+ updateDate + "]";
	}
}
