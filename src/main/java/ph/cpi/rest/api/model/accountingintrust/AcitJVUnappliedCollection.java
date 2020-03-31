package ph.cpi.rest.api.model.accountingintrust;

import java.math.BigDecimal;

import org.joda.time.DateTime;

public class AcitJVUnappliedCollection {
	private Integer tranId;
	private String cedingId;
	private String cedingName;
	private Integer refTranId;
	private Integer refBillId;
	private Integer refItemNo;
	private String transDtlType;
	private String transDtlName;
	private String itemName;
	private String currCd;
	private BigDecimal currRate;
	private BigDecimal prevPaytAmt;
	private BigDecimal prevBalance;
	private BigDecimal actualBalPaid;
	private BigDecimal unappliedAmt;
	private BigDecimal localAmt;
	private BigDecimal newPaytAmt;
	private BigDecimal newBalance;
	private String refNo;
	private String remarks;
	private String createUser;
	private DateTime createDate;
	private String updateUser;
	private DateTime updateDate;
	private Integer unappliedId;
	public Integer getTranId() {
		return tranId;
	}
	public void setTranId(Integer tranId) {
		this.tranId = tranId;
	}
	public Integer getRefTranId() {
		return refTranId;
	}
	public void setRefTranId(Integer refTranId) {
		this.refTranId = refTranId;
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
	public Integer getRefBillId() {
		return refBillId;
	}
	public void setRefBillId(Integer refBillId) {
		this.refBillId = refBillId;
	}
	
	public BigDecimal getActualBalPaid() {
		return actualBalPaid;
	}
	public void setActualBalPaid(BigDecimal actualBalPaid) {
		this.actualBalPaid = actualBalPaid;
	}
	public String getTransDtlName() {
		return transDtlName;
	}
	public void setTransDtlName(String transDtlName) {
		this.transDtlName = transDtlName;
	}
	public Integer getRefItemNo() {
		return refItemNo;
	}
	public void setRefItemNo(Integer refItemNo) {
		this.refItemNo = refItemNo;
	}
	public String getTransDtlType() {
		return transDtlType;
	}
	public void setTransDtlType(String transDtlType) {
		this.transDtlType = transDtlType;
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
	public Integer getUnappliedId() {
		return unappliedId;
	}
	public void setUnappliedId(Integer unappliedId) {
		this.unappliedId = unappliedId;
	}
	@Override
	public String toString() {
		return "AcitJVUnappliedCollection [tranId=" + tranId + ", cedingId=" + cedingId + ", cedingName=" + cedingName
				+ ", refTranId=" + refTranId + ", refBillId=" + refBillId + ", refItemNo=" + refItemNo
				+ ", transDtlType=" + transDtlType + ", transDtlName=" + transDtlName + ", itemName=" + itemName
				+ ", currCd=" + currCd + ", currRate=" + currRate + ", prevPaytAmt=" + prevPaytAmt + ", prevBalance="
				+ prevBalance + ", actualBalPaid=" + actualBalPaid + ", unappliedAmt=" + unappliedAmt + ", localAmt="
				+ localAmt + ", newPaytAmt=" + newPaytAmt + ", newBalance=" + newBalance + ", refNo=" + refNo
				+ ", remarks=" + remarks + ", createUser=" + createUser + ", createDate=" + createDate + ", updateUser="
				+ updateUser + ", updateDate=" + updateDate + ", unappliedId=" + unappliedId + "]";
	}
	
}
