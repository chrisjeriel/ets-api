package ph.cpi.rest.api.model.request;

public class GenerateAcseInvoiceSeriesRequest {
	
	private Integer invoiceFrom;
	private Integer invoiceTo;
	private String createUser;
	private String createDate;
	private String updateUser;
	private String updateDate;
	
	public Integer getInvoiceFrom() {
		return invoiceFrom;
	}
	public void setInvoiceFrom(Integer invoiceFrom) {
		this.invoiceFrom = invoiceFrom;
	}
	public Integer getInvoiceTo() {
		return invoiceTo;
	}
	public void setInvoiceTo(Integer invoiceTo) {
		this.invoiceTo = invoiceTo;
	}
	public String getCreateUser() {
		return createUser;
	}
	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}
	public String getCreateDate() {
		return createDate;
	}
	public void setCreateDate(String createDate) {
		this.createDate = createDate;
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
		return "GenerateAcseInvoiceSeriesRequest [invoiceFrom=" + invoiceFrom
				+ ", invoiceTo=" + invoiceTo + ", createUser=" + createUser
				+ ", createDate=" + createDate + ", updateUser=" + updateUser
				+ ", updateDate=" + updateDate + "]";
	}

}
