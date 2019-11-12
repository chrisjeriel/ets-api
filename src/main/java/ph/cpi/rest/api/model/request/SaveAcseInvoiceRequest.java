package ph.cpi.rest.api.model.request;

public class SaveAcseInvoiceRequest {
	
	private String invoiceId;    
	private String invoiceNo;
	private String invoiceDate;
	private String autoTag;
	private String refNoTranId;
	private String refNoDate;
	private String tranTypeCd;
	private String invoiceStat;
	private String payee;
	private String payeeNo;
	private String particulars;
	private String currCd;
	private String currRate;
	private String invoiceAmt;
	private String localAmt;
	private String createUser;
	private String createDate;
	private String updateUser;
	private String updateDate;
	
	public String getInvoiceDate() {
		return invoiceDate;
	}
	public void setInvoiceDate(String invoiceDate) {
		this.invoiceDate = invoiceDate;
	}
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
	public String getAutoTag() {
		return autoTag;
	}
	public void setAutoTag(String autoTag) {
		this.autoTag = autoTag;
	}
	public String getRefNoTranId() {
		return refNoTranId;
	}
	public void setRefNoTranId(String refNoTranId) {
		this.refNoTranId = refNoTranId;
	}
	public String getRefNoDate() {
		return refNoDate;
	}
	public void setRefNoDate(String refNoDate) {
		this.refNoDate = refNoDate;
	}
	public String getTranTypeCd() {
		return tranTypeCd;
	}
	public void setTranTypeCd(String tranTypeCd) {
		this.tranTypeCd = tranTypeCd;
	}
	public String getInvoiceStat() {
		return invoiceStat;
	}
	public void setInvoiceStat(String invoiceStat) {
		this.invoiceStat = invoiceStat;
	}
	public String getPayee() {
		return payee;
	}
	public void setPayee(String payee) {
		this.payee = payee;
	}
	public String getPayeeNo() {
		return payeeNo;
	}
	public void setPayeeNo(String payeeNo) {
		this.payeeNo = payeeNo;
	}
	public String getParticulars() {
		return particulars;
	}
	public void setParticulars(String particulars) {
		this.particulars = particulars;
	}
	public String getCurrCd() {
		return currCd;
	}
	public void setCurrCd(String currCd) {
		this.currCd = currCd;
	}
	public String getCurrRate() {
		return currRate;
	}
	public void setCurrRate(String currRate) {
		this.currRate = currRate;
	}
	public String getInvoiceAmt() {
		return invoiceAmt;
	}
	public void setInvoiceAmt(String invoiceAmt) {
		this.invoiceAmt = invoiceAmt;
	}
	public String getLocalAmt() {
		return localAmt;
	}
	public void setLocalAmt(String localAmt) {
		this.localAmt = localAmt;
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
		return "SaveAcseInvoiceRequest [invoiceId=" + invoiceId
				+ ", invoiceNo=" + invoiceNo + ", invoiceDate=" + invoiceDate
				+ ", autoTag=" + autoTag + ", refNoTranId=" + refNoTranId
				+ ", refNoDate=" + refNoDate + ", tranTypeCd=" + tranTypeCd
				+ ", invoiceStat=" + invoiceStat + ", payee=" + payee
				+ ", payeeNo=" + payeeNo + ", particulars=" + particulars
				+ ", currCd=" + currCd + ", currRate=" + currRate
				+ ", invoiceAmt=" + invoiceAmt + ", localAmt=" + localAmt
				+ ", createUser=" + createUser + ", createDate=" + createDate
				+ ", updateUser=" + updateUser + ", updateDate=" + updateDate
				+ "]";
	}
}
