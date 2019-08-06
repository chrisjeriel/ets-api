package ph.cpi.rest.api.model.accountingintrust;

import java.math.BigDecimal;

import org.joda.time.DateTime;

public class AcitPrqInwPol {
	private BigDecimal reqId;
	private BigDecimal itemNo;
	private BigDecimal premAmt;
	private BigDecimal riComm;
	private BigDecimal riCommVat;
	private BigDecimal prevPaytAmt;
	private BigDecimal netDue;
	private BigDecimal charges;
	private BigDecimal returnAmt;
	private String createUser;
	private DateTime createDate;
	private String updateUser;
	private DateTime updateDate;
	public BigDecimal getReqId() {
		return reqId;
	}
	public void setReqId(BigDecimal reqId) {
		this.reqId = reqId;
	}
	public BigDecimal getItemNo() {
		return itemNo;
	}
	public void setItemNo(BigDecimal itemNo) {
		this.itemNo = itemNo;
	}
	public BigDecimal getPremAmt() {
		return premAmt;
	}
	public void setPremAmt(BigDecimal premAmt) {
		this.premAmt = premAmt;
	}
	public BigDecimal getRiComm() {
		return riComm;
	}
	public void setRiComm(BigDecimal riComm) {
		this.riComm = riComm;
	}
	public BigDecimal getRiCommVat() {
		return riCommVat;
	}
	public void setRiCommVat(BigDecimal riCommVat) {
		this.riCommVat = riCommVat;
	}
	public BigDecimal getPrevPaytAmt() {
		return prevPaytAmt;
	}
	public void setPrevPaytAmt(BigDecimal prevPaytAmt) {
		this.prevPaytAmt = prevPaytAmt;
	}
	public BigDecimal getNetDue() {
		return netDue;
	}
	public void setNetDue(BigDecimal netDue) {
		this.netDue = netDue;
	}
	public BigDecimal getCharges() {
		return charges;
	}
	public void setCharges(BigDecimal charges) {
		this.charges = charges;
	}
	public BigDecimal getReturnAmt() {
		return returnAmt;
	}
	public void setReturnAmt(BigDecimal returnAmt) {
		this.returnAmt = returnAmt;
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
		return "AcitPrqInwPol [reqId=" + reqId + ", itemNo=" + itemNo + ", premAmt=" + premAmt + ", riComm=" + riComm
				+ ", riCommVat=" + riCommVat + ", prevPaytAmt=" + prevPaytAmt + ", netDue=" + netDue + ", charges="
				+ charges + ", returnAmt=" + returnAmt + ", createUser=" + createUser + ", createDate=" + createDate
				+ ", updateUser=" + updateUser + ", updateDate=" + updateDate + "]";
	}
}
