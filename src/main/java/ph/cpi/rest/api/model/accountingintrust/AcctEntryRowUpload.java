package ph.cpi.rest.api.model.accountingintrust;

import java.math.BigDecimal;

public class AcctEntryRowUpload {
	
	private String acctType;
	private String tranClass;
	private String tranId;
	private String acctCode;
	private String acctName;
	private String slTypeCd;
	private String slTypeName;
	private String slCode;
	private String slName;
	private BigDecimal debitAmt;
	private BigDecimal creditAmt;
	private String procBy;
	
	public String getAcctType() {
		return acctType;
	}
	public void setAcctType(String acctType) {
		this.acctType = acctType;
	}
	public String getTranClass() {
		return tranClass;
	}
	public void setTranClass(String tranClass) {
		this.tranClass = tranClass;
	}
	public String getTranId() {
		return tranId;
	}
	public void setTranId(String tranId) {
		this.tranId = tranId;
	}
	public String getAcctCode() {
		return acctCode;
	}
	public void setAcctCode(String acctCode) {
		this.acctCode = acctCode;
	}
	public String getAcctName() {
		return acctName;
	}
	public void setAcctName(String acctName) {
		this.acctName = acctName;
	}
	public String getSlTypeCd() {
		return slTypeCd;
	}
	public void setSlTypeCd(String slTypeCd) {
		this.slTypeCd = slTypeCd;
	}
	public String getSlTypeName() {
		return slTypeName;
	}
	public void setSlTypeName(String slTypeName) {
		this.slTypeName = slTypeName;
	}
	public String getSlCode() {
		return slCode;
	}
	public void setSlCode(String slCode) {
		this.slCode = slCode;
	}
	public String getSlName() {
		return slName;
	}
	public void setSlName(String slName) {
		this.slName = slName;
	}
	public BigDecimal getDebitAmt() {
		return debitAmt;
	}
	public void setDebitAmt(BigDecimal debitAmt) {
		this.debitAmt = debitAmt;
	}
	public BigDecimal getCreditAmt() {
		return creditAmt;
	}
	public void setCreditAmt(BigDecimal creditAmt) {
		this.creditAmt = creditAmt;
	}
	public String getProcBy() {
		return procBy;
	}
	public void setProcBy(String procBy) {
		this.procBy = procBy;
	}
	@Override
	public String toString() {
		return "AcctEntryRowUpload [acctType=" + acctType + ", tranClass=" + tranClass + ", tranId=" + tranId
				+ ", acctCode=" + acctCode + ", acctName=" + acctName + ", slTypeCd=" + slTypeCd + ", slTypeName="
				+ slTypeName + ", slCode=" + slCode + ", slName=" + slName + ", debitAmt=" + debitAmt + ", creditAmt="
				+ creditAmt + ", procBy=" + procBy + "]";
	}
	
}
