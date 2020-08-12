package ph.cpi.rest.api.model.accountingintrust;

import java.math.BigDecimal;

import org.joda.time.DateTime;

public class MultiOffsetUnapp {

	private Integer tranId;
	private String cedingId;
	private String cedingName;
	private Integer unappliedId;
	private String transdtlType;
	private String transdtlName;
	private String itemName;
	private String currCd;
	private BigDecimal currRate;
	private BigDecimal prevPaytAmt;
	private BigDecimal prevBalance;
	private BigDecimal unappliedAmt;
	private BigDecimal actualBalPaid;
	private BigDecimal localAmt;
	private BigDecimal newPaytAmt;
	private BigDecimal newBalance;
	private String refNo;
	private String remarks;
	private String returnTag;
	private String createUser;
	private DateTime createDate;
	private String updateUser;
	private DateTime updateDate;
	private String cedingAbbr;
	
	public Integer getTranId() {
		return tranId;
	}
	public void setTranId(Integer tranId) {
		this.tranId = tranId;
	}
	public String getCedingId() {
		return cedingId;
	}
	public void setCedingId(String cedingId) {
		this.cedingId = cedingId;
	}
	public String getCedingName() {
		return cedingName;
	}
	public void setCedingName(String cedingName) {
		this.cedingName = cedingName;
	}
	public Integer getUnappliedId() {
		return unappliedId;
	}
	public void setUnappliedId(Integer unappliedId) {
		this.unappliedId = unappliedId;
	}
	public String getTransdtlType() {
		return transdtlType;
	}
	public void setTransdtlType(String transdtlType) {
		this.transdtlType = transdtlType;
	}
	public String getTransdtlName() {
		return transdtlName;
	}
	public void setTransdtlName(String transdtlName) {
		this.transdtlName = transdtlName;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public String getCurrCd() {
		return currCd;
	}
	public void setCurrCd(String currCd) {
		this.currCd = currCd;
	}
	public BigDecimal getCurrRate() {
		return currRate;
	}
	public void setCurrRate(BigDecimal currRate) {
		this.currRate = currRate;
	}
	public BigDecimal getPrevPaytAmt() {
		return prevPaytAmt;
	}
	public void setPrevPaytAmt(BigDecimal prevPaytAmt) {
		this.prevPaytAmt = prevPaytAmt;
	}
	public BigDecimal getPrevBalance() {
		return prevBalance;
	}
	public void setPrevBalance(BigDecimal prevBalance) {
		this.prevBalance = prevBalance;
	}
	public BigDecimal getUnappliedAmt() {
		return unappliedAmt;
	}
	public void setUnappliedAmt(BigDecimal unappliedAmt) {
		this.unappliedAmt = unappliedAmt;
	}
	public BigDecimal getActualBalPaid() {
		return actualBalPaid;
	}
	public void setActualBalPaid(BigDecimal actualBalPaid) {
		this.actualBalPaid = actualBalPaid;
	}
	public BigDecimal getLocalAmt() {
		return localAmt;
	}
	public void setLocalAmt(BigDecimal localAmt) {
		this.localAmt = localAmt;
	}
	public BigDecimal getNewPaytAmt() {
		return newPaytAmt;
	}
	public void setNewPaytAmt(BigDecimal newPaytAmt) {
		this.newPaytAmt = newPaytAmt;
	}
	public BigDecimal getNewBalance() {
		return newBalance;
	}
	public void setNewBalance(BigDecimal newBalance) {
		this.newBalance = newBalance;
	}
	public String getRefNo() {
		return refNo;
	}
	public void setRefNo(String refNo) {
		this.refNo = refNo;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public String getReturnTag() {
		return returnTag;
	}
	public void setReturnTag(String returnTag) {
		this.returnTag = returnTag;
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
	public String getCedingAbbr() {
		return cedingAbbr;
	}
	public void setCedingAbbr(String cedingAbbr) {
		this.cedingAbbr = cedingAbbr;
	}
	@Override
	public String toString() {
		return "MultiOffsetUnapp [tranId=" + tranId + ", cedingId=" + cedingId + ", cedingName=" + cedingName
				+ ", unappliedId=" + unappliedId + ", transdtlType=" + transdtlType + ", transdtlName=" + transdtlName
				+ ", itemName=" + itemName + ", currCd=" + currCd + ", currRate=" + currRate + ", prevPaytAmt="
				+ prevPaytAmt + ", prevBalance=" + prevBalance + ", unappliedAmt=" + unappliedAmt + ", actualBalPaid="
				+ actualBalPaid + ", localAmt=" + localAmt + ", newPaytAmt=" + newPaytAmt + ", newBalance=" + newBalance
				+ ", refNo=" + refNo + ", remarks=" + remarks + ", returnTag=" + returnTag + ", createUser="
				+ createUser + ", createDate=" + createDate + ", updateUser=" + updateUser + ", updateDate="
				+ updateDate + ", cedingAbbr=" + cedingAbbr + "]";
	}
}
