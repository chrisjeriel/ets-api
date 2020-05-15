package ph.cpi.rest.api.model.accountingintrust;

import java.math.BigDecimal;

import org.joda.time.DateTime;

public class AcitMonthEndJV {

	private Integer tranId;
	private String tranNo;
	private Integer tranTypeCd;
	private String tranTypeName;
	private DateTime acctEntDate;
	private String currCd;
	private BigDecimal jvAmt;
	
	public Integer getTranId() {
		return tranId;
	}
	public void setTranId(Integer tranId) {
		this.tranId = tranId;
	}
	public String getTranNo() {
		return tranNo;
	}
	public void setTranNo(String tranNo) {
		this.tranNo = tranNo;
	}
	public Integer getTranTypeCd() {
		return tranTypeCd;
	}
	public void setTranTypeCd(Integer tranTypeCd) {
		this.tranTypeCd = tranTypeCd;
	}
	public String getTranTypeName() {
		return tranTypeName;
	}
	public void setTranTypeName(String tranTypeName) {
		this.tranTypeName = tranTypeName;
	}
	public DateTime getAcctEntDate() {
		return acctEntDate;
	}
	public void setAcctEntDate(DateTime acctEntDate) {
		this.acctEntDate = acctEntDate;
	}
	public String getCurrCd() {
		return currCd;
	}
	public void setCurrCd(String currCd) {
		this.currCd = currCd;
	}
	public BigDecimal getJvAmt() {
		return jvAmt;
	}
	public void setJvAmt(BigDecimal jvAmt) {
		this.jvAmt = jvAmt;
	}
	@Override
	public String toString() {
		return "AcitMonthEndJV [tranId=" + tranId + ", tranNo=" + tranNo + ", tranTypeCd=" + tranTypeCd
				+ ", tranTypeName=" + tranTypeName + ", acctEntDate=" + acctEntDate + ", currCd=" + currCd + ", jvAmt="
				+ jvAmt + "]";
	}
}
