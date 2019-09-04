package ph.cpi.rest.api.model.accountingintrust;

import java.math.BigDecimal;

import org.joda.time.DateTime;

public class AcitJvAllInvtIncome {
	
	private Integer 	tranId;
	private String 		jvYear;
	private String		jvNo;	
	private DateTime  	jvDate;
	private String 		tranTypeCd;
	private String		tranTypeName;
	private BigDecimal	jvAmt;
	
	public Integer getTranId() {
		return tranId;
	}
	public void setTranId(Integer tranId) {
		this.tranId = tranId;
	}
	public String getJvYear() {
		return jvYear;
	}
	public void setJvYear(String jvYear) {
		this.jvYear = jvYear;
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
	public String getTranTypeCd() {
		return tranTypeCd;
	}
	public void setTranTypeCd(String tranTypeCd) {
		this.tranTypeCd = tranTypeCd;
	}
	public String getTranTypeName() {
		return tranTypeName;
	}
	public void setTranTypeName(String tranTypeName) {
		this.tranTypeName = tranTypeName;
	}
	public BigDecimal getJvAmt() {
		return jvAmt;
	}
	public void setJvAmt(BigDecimal jvAmt) {
		this.jvAmt = jvAmt;
	}
	
	@Override
	public String toString() {
		return "AcitJvAllInvtIncome [tranId=" + tranId + ", jvYear=" + jvYear + ", jvNo=" + jvNo + ", jvDate=" + jvDate
				+ ", tranTypeCd=" + tranTypeCd + ", tranTypeName=" + tranTypeName + ", jvAmt=" + jvAmt + "]";
	}

}
