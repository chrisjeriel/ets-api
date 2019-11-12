package ph.cpi.rest.api.model.accountingservice;

import java.math.BigDecimal;

import org.joda.time.DateTime;

public class AcseBatchInvoice {
	
	private Integer invoiceId;
	private String invoiceNo;
	private DateTime invoiceDate;
	private String invoiceStat;
	private String invoiceStatDesc;
	private Integer refNoTranId;
	private DateTime refNoDate;
	private String jvNo;
	private DateTime jvDate;
	private String jvYear;
	private String payee;
	private String payeeNo;
	private String particulars;
	private String tranTypeCd;
	private String currCd;
	private BigDecimal currRate;
	private BigDecimal invoiceAmt;
	private BigDecimal localAmt;
	private String createUser;
	private DateTime createDate;
	private String updateUser;
	private DateTime updateDate;
	private String autoTag;
	
	public String getAutoTag() {
		return autoTag;
	}
	public void setAutoTag(String autoTag) {
		this.autoTag = autoTag;
	}
	public String getJvYear() {
		return jvYear;
	}
	public void setJvYear(String jvYear) {
		this.jvYear = jvYear;
	}

	public String getCurrCd() {
		return currCd;
	}
	public void setCurrCd(String currCd) {
		this.currCd = currCd;
	}
	
	public Integer getInvoiceId() {
		return invoiceId;
	}
	public void setInvoiceId(Integer invoiceId) {
		this.invoiceId = invoiceId;
	}
	public String getInvoiceNo() {
		return invoiceNo;
	}
	public void setInvoiceNo(String invoiceNo) {
		this.invoiceNo = invoiceNo;
	}
	public DateTime getInvoiceDate() {
		return invoiceDate;
	}
	public void setInvoiceDate(DateTime invoiceDate) {
		this.invoiceDate = invoiceDate;
	}
	public String getInvoiceStat() {
		return invoiceStat;
	}
	public void setInvoiceStat(String invoiceStat) {
		this.invoiceStat = invoiceStat;
	}
	public String getInvoiceStatDesc() {
		return invoiceStatDesc;
	}
	public void setInvoiceStatDesc(String invoiceStatDesc) {
		this.invoiceStatDesc = invoiceStatDesc;
	}
	public Integer getRefNoTranId() {
		return refNoTranId;
	}
	public void setRefNoTranId(Integer refNoTranId) {
		this.refNoTranId = refNoTranId;
	}
	public DateTime getRefNoDate() {
		return refNoDate;
	}
	public void setRefNoDate(DateTime refNoDate) {
		this.refNoDate = refNoDate;
	}
	public String getJvNo() {
		return jvNo;
	}
	public void setJvNo(String jvNo) {
		this.jvNo = jvNo;
	}
	public DateTime getJvDate() {
		return jvDate;
	}
	public void setJvDate(DateTime jvDate) {
		this.jvDate = jvDate;
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
	public String getTranTypeCd() {
		return tranTypeCd;
	}
	public void setTranTypeCd(String tranTypeCd) {
		this.tranTypeCd = tranTypeCd;
	}
	public BigDecimal getCurrRate() {
		return currRate;
	}
	public void setCurrRate(BigDecimal currRate) {
		this.currRate = currRate;
	}
	public BigDecimal getInvoiceAmt() {
		return invoiceAmt;
	}
	public void setInvoiceAmt(BigDecimal invoiceAmt) {
		this.invoiceAmt = invoiceAmt;
	}
	public BigDecimal getLocalAmt() {
		return localAmt;
	}
	public void setLocalAmt(BigDecimal localAmt) {
		this.localAmt = localAmt;
	}
	public String getCreateUser() {
		return createUser;
	}
	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}
	public DateTime getCreateDate() {
		return createDate;
	}
	public void setCreateDate(DateTime createDate) {
		this.createDate = createDate;
	}
	public String getUpdateUser() {
		return updateUser;
	}
	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}
	public DateTime getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(DateTime updateDate) {
		this.updateDate = updateDate;
	}
	
	@Override
	public String toString() {
		return "AcseBatchInvoice [invoiceId=" + invoiceId + ", invoiceNo="
				+ invoiceNo + ", invoiceDate=" + invoiceDate + ", invoiceStat="
				+ invoiceStat + ", invoiceStatDesc=" + invoiceStatDesc
				+ ", refNoTranId=" + refNoTranId + ", refNoDate=" + refNoDate
				+ ", jvNo=" + jvNo + ", jvDate=" + jvDate + ", jvYear="
				+ jvYear + ", payee=" + payee + ", payeeNo=" + payeeNo
				+ ", particulars=" + particulars + ", tranTypeCd=" + tranTypeCd
				+ ", currCd=" + currCd + ", currRate=" + currRate
				+ ", invoiceAmt=" + invoiceAmt + ", localAmt=" + localAmt
				+ ", createUser=" + createUser + ", createDate=" + createDate
				+ ", updateUser=" + updateUser + ", updateDate=" + updateDate
				+ ", autoTag=" + autoTag + "]";
	}

}
